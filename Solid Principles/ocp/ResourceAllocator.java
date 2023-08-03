package solid.live.ocp;
import  java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 1:14:09 PM
 * To change this template use File | Settings | File Templates.
 */



public class  main{

    interface Resource {
        public int findFreeSlot();
        public void markFreeSlotBusy(int resourceId);
        public int markSlotFree(int resourceId);
        public  int getResourceId();
    }

    static class SpaceAllocation implements Resource{
        private int resourceId;

        SpaceAllocation(int resourceId){
            this.resourceId = resourceId;
        }

        @Override
        public int findFreeSlot(){
            return 0;
        }

        @Override
        public void markFreeSlotBusy(int resourceId){

        }

        @Override
        public int markSlotFree(int resourceId) {
            return 0;
        }



        public int getResourceId() {
            return resourceId;
        }
    }

    class TimeAllocation implements Resource{
        private int resourceId;
        TimeAllocation(int resourceId){
            this.resourceId = resourceId;
        }

        @Override
        public int findFreeSlot(){
            return 0;
        }

        @Override
        public void markFreeSlotBusy(int resourceId){

        }

        @Override
        public int markSlotFree(int resourceId) {
            return 0;
        }


        public int getResourceId() {
            return resourceId;
        }
    }

   static public class ResourceAllocator {
        final static private int INVALID_RESOURCE_ID = -1;

        public int getInvalidResourceId(){
            return INVALID_RESOURCE_ID;
        }
        Resource resource;

        ResourceAllocator(Resource resource){
            this.resource = resource;
        }

        void allocate(){
            resource.findFreeSlot();
            resource.markFreeSlotBusy(resource.getResourceId());
        }

        void free(){
            resource.markSlotFree(resource.getResourceId());
        }

    }


    public  static  void main(String[] args){

        SpaceAllocation spaceAllocation = new SpaceAllocation(1);


        ResourceAllocator resourceAllocator = new ResourceAllocator(spaceAllocation);
        resourceAllocator.allocate();
        resourceAllocator.free();

    }
}

