// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryAvailableInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAvailableInstancesResponseBody</p>
 */
public class QueryAvailableInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C7C15585-8349-4C62-BEE4-5A391841B9BE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAvailableInstancesResponseBody build() {
            return new QueryAvailableInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAvailableInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAvailableInstancesResponseBody</p>
     */
    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ExpectedReleaseTime")
        private String expectedReleaseTime;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private String releaseTime;

        @com.aliyun.core.annotation.NameInMap("RenewStatus")
        private String renewStatus;

        @com.aliyun.core.annotation.NameInMap("RenewalDuration")
        private Integer renewalDuration;

        @com.aliyun.core.annotation.NameInMap("RenewalDurationUnit")
        private String renewalDurationUnit;

        @com.aliyun.core.annotation.NameInMap("Seller")
        private String seller;

        @com.aliyun.core.annotation.NameInMap("SellerId")
        private Long sellerId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StopTime")
        private String stopTime;

        @com.aliyun.core.annotation.NameInMap("SubStatus")
        private String subStatus;

        @com.aliyun.core.annotation.NameInMap("SubscriptionType")
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
             * <p>The time when the specified instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-08T16:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the instance was expired.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-08T16:00:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The time when the specified instance was expected to be released.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-08T16:00:00Z</p>
             */
            public Builder expectedReleaseTime(String expectedReleaseTime) {
                this.expectedReleaseTime = expectedReleaseTime;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1049056</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The ID of the instance owner.</p>
             * 
             * <strong>example:</strong>
             * <p>325352345</p>
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The code of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The type of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The ID of the region in which the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The time when the instance was released.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-08T16:00:00Z</p>
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * <p>The renewal status of the specified instance. Valid values:</p>
             * <ul>
             * <li>AutoRenewal: The instance is automatically renewed.</li>
             * <li>ManualRenewal: The instance is manually renewed.</li>
             * <li>NotRenewal: The instance is not renewed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ManualRenewal</p>
             */
            public Builder renewStatus(String renewStatus) {
                this.renewStatus = renewStatus;
                return this;
            }

            /**
             * <p>The number of auto-renewal cycles.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder renewalDuration(Integer renewalDuration) {
                this.renewalDuration = renewalDuration;
                return this;
            }

            /**
             * <p>The unit of the auto-renewal cycle. Valid values:</p>
             * <ul>
             * <li>M: month</li>
             * <li>Y: year</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>M</p>
             */
            public Builder renewalDurationUnit(String renewalDurationUnit) {
                this.renewalDurationUnit = renewalDurationUnit;
                return this;
            }

            /**
             * <p>The seller.</p>
             * 
             * <strong>example:</strong>
             * <p>123123123</p>
             */
            public Builder seller(String seller) {
                this.seller = seller;
                return this;
            }

            /**
             * <p>The ID of the seller.</p>
             * 
             * <strong>example:</strong>
             * <p>123123123</p>
             */
            public Builder sellerId(Long sellerId) {
                this.sellerId = sellerId;
                return this;
            }

            /**
             * <p>The status of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Creating: The instance is being created. WaitForExpire: The instance is about to expire. Normal: The instance can properly run. Expired: The instance is expired.</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the specified instance was suspended.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-08T16:00:00Z</p>
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            /**
             * <p>The sub-status of the specified instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal: The pay-as-you-go module can properly run. WaitForLimit: The pay-as-you-go module is about to be limited due to overdue payments. BandwidthLimited: The pay-as-you-go module is limited due to overdue payments.</p>
             */
            public Builder subStatus(String subStatus) {
                this.subStatus = subStatus;
                return this;
            }

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li>Subscription: subscription</li>
             * <li>PayAsYouGo: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Subscription</p>
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
    /**
     * 
     * {@link QueryAvailableInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAvailableInstancesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceList")
        private java.util.List<InstanceList> instanceList;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        public java.util.List<InstanceList> getInstanceList() {
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
            private java.util.List<InstanceList> instanceList; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The instances returned.</p>
             */
            public Builder instanceList(java.util.List<InstanceList> instanceList) {
                this.instanceList = instanceList;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of returned entries.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
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
