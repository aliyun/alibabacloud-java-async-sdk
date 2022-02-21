// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInventoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetInventoryResponseBody</p>
 */
public class GetInventoryResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("Success")
    private Boolean success;

    private GetInventoryResponseBody(Builder builder) {
        this.data = builder.data;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInventoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetInventoryResponseBody build() {
            return new GetInventoryResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @NameInMap("BuyerId")
        private String buyerId;

        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("CurrentInventory")
        private String currentInventory;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InventoryId")
        private String inventoryId;

        @NameInMap("ValidEndTime")
        private String validEndTime;

        @NameInMap("ValidStartTime")
        private String validStartTime;

        private ResultObject(Builder builder) {
            this.buyerId = builder.buyerId;
            this.commodityCode = builder.commodityCode;
            this.currentInventory = builder.currentInventory;
            this.instanceId = builder.instanceId;
            this.inventoryId = builder.inventoryId;
            this.validEndTime = builder.validEndTime;
            this.validStartTime = builder.validStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return buyerId
         */
        public String getBuyerId() {
            return this.buyerId;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return currentInventory
         */
        public String getCurrentInventory() {
            return this.currentInventory;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return inventoryId
         */
        public String getInventoryId() {
            return this.inventoryId;
        }

        /**
         * @return validEndTime
         */
        public String getValidEndTime() {
            return this.validEndTime;
        }

        /**
         * @return validStartTime
         */
        public String getValidStartTime() {
            return this.validStartTime;
        }

        public static final class Builder {
            private String buyerId; 
            private String commodityCode; 
            private String currentInventory; 
            private String instanceId; 
            private String inventoryId; 
            private String validEndTime; 
            private String validStartTime; 

            /**
             * BuyerId.
             */
            public Builder buyerId(String buyerId) {
                this.buyerId = buyerId;
                return this;
            }

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * CurrentInventory.
             */
            public Builder currentInventory(String currentInventory) {
                this.currentInventory = currentInventory;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InventoryId.
             */
            public Builder inventoryId(String inventoryId) {
                this.inventoryId = inventoryId;
                return this;
            }

            /**
             * ValidEndTime.
             */
            public Builder validEndTime(String validEndTime) {
                this.validEndTime = validEndTime;
                return this;
            }

            /**
             * ValidStartTime.
             */
            public Builder validStartTime(String validStartTime) {
                this.validStartTime = validStartTime;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ResultObject")
        private java.util.List < ResultObject> resultObject;

        private Data(Builder builder) {
            this.resultObject = builder.resultObject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return resultObject
         */
        public java.util.List < ResultObject> getResultObject() {
            return this.resultObject;
        }

        public static final class Builder {
            private java.util.List < ResultObject> resultObject; 

            /**
             * ResultObject.
             */
            public Builder resultObject(java.util.List < ResultObject> resultObject) {
                this.resultObject = resultObject;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
