// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceInstanceResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceInstanceResourcesResponseBody</p>
 */
public class ListServiceInstanceResourcesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Resources")
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * Resources.
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
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("ProductType")
        private String productType;

        @NameInMap("RenewStatus")
        private String renewStatus;

        @NameInMap("RenewalPeriod")
        private Integer renewalPeriod;

        @NameInMap("RenewalPeriodUnit")
        private String renewalPeriodUnit;

        @NameInMap("ResourceARN")
        private String resourceARN;

        @NameInMap("Status")
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
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
             * RenewStatus.
             */
            public Builder renewStatus(String renewStatus) {
                this.renewStatus = renewStatus;
                return this;
            }

            /**
             * RenewalPeriod.
             */
            public Builder renewalPeriod(Integer renewalPeriod) {
                this.renewalPeriod = renewalPeriod;
                return this;
            }

            /**
             * RenewalPeriodUnit.
             */
            public Builder renewalPeriodUnit(String renewalPeriodUnit) {
                this.renewalPeriodUnit = renewalPeriodUnit;
                return this;
            }

            /**
             * ResourceARN.
             */
            public Builder resourceARN(String resourceARN) {
                this.resourceARN = resourceARN;
                return this;
            }

            /**
             * Status.
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
