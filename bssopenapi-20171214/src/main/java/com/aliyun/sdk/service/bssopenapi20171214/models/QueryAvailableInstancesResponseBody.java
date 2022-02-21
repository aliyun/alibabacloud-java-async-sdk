// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAvailableInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAvailableInstancesResponseBody</p>
 */
public class QueryAvailableInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryAvailableInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAvailableInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

        public QueryAvailableInstancesResponseBody build() {
            return new QueryAvailableInstancesResponseBody(this);
        } 

    } 

    public static class InstanceList extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("ExpectedReleaseTime")
        private String expectedReleaseTime;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("OwnerId")
        private Long ownerId;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("ProductType")
        private String productType;

        @NameInMap("Region")
        private String region;

        @NameInMap("ReleaseTime")
        private String releaseTime;

        @NameInMap("RenewStatus")
        private String renewStatus;

        @NameInMap("RenewalDuration")
        private Integer renewalDuration;

        @NameInMap("RenewalDurationUnit")
        private String renewalDurationUnit;

        @NameInMap("Seller")
        private String seller;

        @NameInMap("SellerId")
        private Long sellerId;

        @NameInMap("Status")
        private String status;

        @NameInMap("StopTime")
        private String stopTime;

        @NameInMap("SubStatus")
        private String subStatus;

        @NameInMap("SubscriptionType")
        private String subscriptionType;

        private InstanceList(Builder builder) {
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.expectedReleaseTime = builder.expectedReleaseTime;
            this.instanceID = builder.instanceID;
            this.ownerId = builder.ownerId;
            this.productCode = builder.productCode;
            this.productType = builder.productType;
            this.region = builder.region;
            this.releaseTime = builder.releaseTime;
            this.renewStatus = builder.renewStatus;
            this.renewalDuration = builder.renewalDuration;
            this.renewalDurationUnit = builder.renewalDurationUnit;
            this.seller = builder.seller;
            this.sellerId = builder.sellerId;
            this.status = builder.status;
            this.stopTime = builder.stopTime;
            this.subStatus = builder.subStatus;
            this.subscriptionType = builder.subscriptionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return expectedReleaseTime
         */
        public String getExpectedReleaseTime() {
            return this.expectedReleaseTime;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return releaseTime
         */
        public String getReleaseTime() {
            return this.releaseTime;
        }

        /**
         * @return renewStatus
         */
        public String getRenewStatus() {
            return this.renewStatus;
        }

        /**
         * @return renewalDuration
         */
        public Integer getRenewalDuration() {
            return this.renewalDuration;
        }

        /**
         * @return renewalDurationUnit
         */
        public String getRenewalDurationUnit() {
            return this.renewalDurationUnit;
        }

        /**
         * @return seller
         */
        public String getSeller() {
            return this.seller;
        }

        /**
         * @return sellerId
         */
        public Long getSellerId() {
            return this.sellerId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stopTime
         */
        public String getStopTime() {
            return this.stopTime;
        }

        /**
         * @return subStatus
         */
        public String getSubStatus() {
            return this.subStatus;
        }

        /**
         * @return subscriptionType
         */
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public static final class Builder {
            private String createTime; 
            private String endTime; 
            private String expectedReleaseTime; 
            private String instanceID; 
            private Long ownerId; 
            private String productCode; 
            private String productType; 
            private String region; 
            private String releaseTime; 
            private String renewStatus; 
            private Integer renewalDuration; 
            private String renewalDurationUnit; 
            private String seller; 
            private Long sellerId; 
            private String status; 
            private String stopTime; 
            private String subStatus; 
            private String subscriptionType; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * ExpectedReleaseTime.
             */
            public Builder expectedReleaseTime(String expectedReleaseTime) {
                this.expectedReleaseTime = expectedReleaseTime;
                return this;
            }

            /**
             * InstanceID.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ReleaseTime.
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * RenewStatus.
             */
            public Builder renewStatus(String renewStatus) {
                this.renewStatus = renewStatus;
                return this;
            }

            /**
             * RenewalDuration.
             */
            public Builder renewalDuration(Integer renewalDuration) {
                this.renewalDuration = renewalDuration;
                return this;
            }

            /**
             * RenewalDurationUnit.
             */
            public Builder renewalDurationUnit(String renewalDurationUnit) {
                this.renewalDurationUnit = renewalDurationUnit;
                return this;
            }

            /**
             * Seller.
             */
            public Builder seller(String seller) {
                this.seller = seller;
                return this;
            }

            /**
             * SellerId.
             */
            public Builder sellerId(Long sellerId) {
                this.sellerId = sellerId;
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
             * StopTime.
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            /**
             * SubStatus.
             */
            public Builder subStatus(String subStatus) {
                this.subStatus = subStatus;
                return this;
            }

            /**
             * SubscriptionType.
             */
            public Builder subscriptionType(String subscriptionType) {
                this.subscriptionType = subscriptionType;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("InstanceList")
        private java.util.List < InstanceList> instanceList;

        @NameInMap("PageNum")
        private Integer pageNum;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.instanceList = builder.instanceList;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return instanceList
         */
        public java.util.List < InstanceList> getInstanceList() {
            return this.instanceList;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < InstanceList> instanceList; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * InstanceList.
             */
            public Builder instanceList(java.util.List < InstanceList> instanceList) {
                this.instanceList = instanceList;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
