// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryActivityResponseBody} extends {@link TeaModel}
 *
 * <p>QueryActivityResponseBody</p>
 */
public class QueryActivityResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ContextMap")
    private java.util.Map < String, ? > contextMap;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryActivityResponseBody(Builder builder) {
        this.code = builder.code;
        this.contextMap = builder.contextMap;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryActivityResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return contextMap
     */
    public java.util.Map < String, ? > getContextMap() {
        return this.contextMap;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.Map < String, ? > contextMap; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ContextMap.
         */
        public Builder contextMap(java.util.Map < String, ? > contextMap) {
            this.contextMap = contextMap;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryActivityResponseBody build() {
            return new QueryActivityResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ActivityId")
        private Long activityId;

        @NameInMap("ActivityName")
        private String activityName;

        @NameInMap("BlackList")
        private java.util.List < Long > blackList;

        @NameInMap("CommodityCodeList")
        private java.util.List < String > commodityCodeList;

        @NameInMap("Description")
        private String description;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("ExtMap")
        private java.util.Map < String, String > extMap;

        @NameInMap("PromotionDescription")
        private String promotionDescription;

        @NameInMap("PromotionValue")
        private Double promotionValue;

        @NameInMap("RegionList")
        private java.util.List < String > regionList;

        @NameInMap("SellerIdList")
        private java.util.List < Long > sellerIdList;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TestAccountList")
        private java.util.List < Long > testAccountList;

        @NameInMap("WhiteList")
        private java.util.List < Long > whiteList;

        private Data(Builder builder) {
            this.activityId = builder.activityId;
            this.activityName = builder.activityName;
            this.blackList = builder.blackList;
            this.commodityCodeList = builder.commodityCodeList;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.extMap = builder.extMap;
            this.promotionDescription = builder.promotionDescription;
            this.promotionValue = builder.promotionValue;
            this.regionList = builder.regionList;
            this.sellerIdList = builder.sellerIdList;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.testAccountList = builder.testAccountList;
            this.whiteList = builder.whiteList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activityId
         */
        public Long getActivityId() {
            return this.activityId;
        }

        /**
         * @return activityName
         */
        public String getActivityName() {
            return this.activityName;
        }

        /**
         * @return blackList
         */
        public java.util.List < Long > getBlackList() {
            return this.blackList;
        }

        /**
         * @return commodityCodeList
         */
        public java.util.List < String > getCommodityCodeList() {
            return this.commodityCodeList;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return extMap
         */
        public java.util.Map < String, String > getExtMap() {
            return this.extMap;
        }

        /**
         * @return promotionDescription
         */
        public String getPromotionDescription() {
            return this.promotionDescription;
        }

        /**
         * @return promotionValue
         */
        public Double getPromotionValue() {
            return this.promotionValue;
        }

        /**
         * @return regionList
         */
        public java.util.List < String > getRegionList() {
            return this.regionList;
        }

        /**
         * @return sellerIdList
         */
        public java.util.List < Long > getSellerIdList() {
            return this.sellerIdList;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return testAccountList
         */
        public java.util.List < Long > getTestAccountList() {
            return this.testAccountList;
        }

        /**
         * @return whiteList
         */
        public java.util.List < Long > getWhiteList() {
            return this.whiteList;
        }

        public static final class Builder {
            private Long activityId; 
            private String activityName; 
            private java.util.List < Long > blackList; 
            private java.util.List < String > commodityCodeList; 
            private String description; 
            private String endTime; 
            private java.util.Map < String, String > extMap; 
            private String promotionDescription; 
            private Double promotionValue; 
            private java.util.List < String > regionList; 
            private java.util.List < Long > sellerIdList; 
            private String startTime; 
            private String status; 
            private java.util.List < Long > testAccountList; 
            private java.util.List < Long > whiteList; 

            /**
             * ActivityId.
             */
            public Builder activityId(Long activityId) {
                this.activityId = activityId;
                return this;
            }

            /**
             * ActivityName.
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * BlackList.
             */
            public Builder blackList(java.util.List < Long > blackList) {
                this.blackList = blackList;
                return this;
            }

            /**
             * CommodityCodeList.
             */
            public Builder commodityCodeList(java.util.List < String > commodityCodeList) {
                this.commodityCodeList = commodityCodeList;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ExtMap.
             */
            public Builder extMap(java.util.Map < String, String > extMap) {
                this.extMap = extMap;
                return this;
            }

            /**
             * PromotionDescription.
             */
            public Builder promotionDescription(String promotionDescription) {
                this.promotionDescription = promotionDescription;
                return this;
            }

            /**
             * PromotionValue.
             */
            public Builder promotionValue(Double promotionValue) {
                this.promotionValue = promotionValue;
                return this;
            }

            /**
             * RegionList.
             */
            public Builder regionList(java.util.List < String > regionList) {
                this.regionList = regionList;
                return this;
            }

            /**
             * SellerIdList.
             */
            public Builder sellerIdList(java.util.List < Long > sellerIdList) {
                this.sellerIdList = sellerIdList;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TestAccountList.
             */
            public Builder testAccountList(java.util.List < Long > testAccountList) {
                this.testAccountList = testAccountList;
                return this;
            }

            /**
             * WhiteList.
             */
            public Builder whiteList(java.util.List < Long > whiteList) {
                this.whiteList = whiteList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
