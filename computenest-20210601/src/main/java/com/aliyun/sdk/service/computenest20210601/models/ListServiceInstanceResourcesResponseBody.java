// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceInstanceResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceInstanceResourcesResponseBody</p>
 */
public class ListServiceInstanceResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List < Resources> resources;

    private ListServiceInstanceResourcesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceInstanceResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public java.util.List < Resources> getResources() {
        return this.resources;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < Resources> resources; 

        /**
         * The number of entries per page. Valid values: 1 to 100. Default value: 20.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * A pagination token.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The resources.
         */
        public Builder resources(java.util.List < Resources> resources) {
            this.resources = resources;
            return this;
        }

        public ListServiceInstanceResourcesResponseBody build() {
            return new ListServiceInstanceResourcesResponseBody(this);
        } 

    } 

    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("RenewStatus")
        private String renewStatus;

        @com.aliyun.core.annotation.NameInMap("RenewalPeriod")
        private Integer renewalPeriod;

        @com.aliyun.core.annotation.NameInMap("RenewalPeriodUnit")
        private String renewalPeriodUnit;

        @com.aliyun.core.annotation.NameInMap("ResourceARN")
        private String resourceARN;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Resources(Builder builder) {
            this.createTime = builder.createTime;
            this.expireTime = builder.expireTime;
            this.payType = builder.payType;
            this.productCode = builder.productCode;
            this.productType = builder.productType;
            this.renewStatus = builder.renewStatus;
            this.renewalPeriod = builder.renewalPeriod;
            this.renewalPeriodUnit = builder.renewalPeriodUnit;
            this.resourceARN = builder.resourceARN;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
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
         * @return renewStatus
         */
        public String getRenewStatus() {
            return this.renewStatus;
        }

        /**
         * @return renewalPeriod
         */
        public Integer getRenewalPeriod() {
            return this.renewalPeriod;
        }

        /**
         * @return renewalPeriodUnit
         */
        public String getRenewalPeriodUnit() {
            return this.renewalPeriodUnit;
        }

        /**
         * @return resourceARN
         */
        public String getResourceARN() {
            return this.resourceARN;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String expireTime; 
            private String payType; 
            private String productCode; 
            private String productType; 
            private String renewStatus; 
            private Integer renewalPeriod; 
            private String renewalPeriodUnit; 
            private String resourceARN; 
            private String status; 

            /**
             * The time when the resource was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the resource expires.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The billing method. Valid values:
             * <p>
             * 
             * *   Subscription
             * *   PayAsYouGo
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The code of the cloud service.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The type of the cloud service.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * The renewal state. Valid values:
             * <p>
             * 
             * *   AutoRenewal
             * *   ManualRenewal
             * *   NotRenewal
             */
            public Builder renewStatus(String renewStatus) {
                this.renewStatus = renewStatus;
                return this;
            }

            /**
             * The renewal period.
             */
            public Builder renewalPeriod(Integer renewalPeriod) {
                this.renewalPeriod = renewalPeriod;
                return this;
            }

            /**
             * The unit of the renewal period. Valid values:
             * <p>
             * 
             * *   Month
             * *   Year
             */
            public Builder renewalPeriodUnit(String renewalPeriodUnit) {
                this.renewalPeriodUnit = renewalPeriodUnit;
                return this;
            }

            /**
             * The ARN of the resource.
             */
            public Builder resourceARN(String resourceARN) {
                this.resourceARN = resourceARN;
                return this;
            }

            /**
             * The state of the resource. Valid values:
             * <p>
             * 
             * *   running
             * *   waiting
             * *   terminated
             * 
             * >  This parameter is returned only for containers.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
