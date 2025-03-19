// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
    private java.util.List<Resources> resources;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Resources> getResources() {
        return this.resources;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Resources> resources; 

        private Builder() {
        } 

        private Builder(ListServiceInstanceResourcesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.resources = model.resources;
        } 

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAc3HCuYhJi/wvpk4xOr0VLbAx7BkQzyYC+ONO+WudHGKEdB0uWSY7AGnM3qCgm/Ynge7zU6NWdbj0Tegyajyqyc=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resources.</p>
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.resources = resources;
            return this;
        }

        public ListServiceInstanceResourcesResponseBody build() {
            return new ListServiceInstanceResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceInstanceResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceInstanceResourcesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Resources model) {
                this.createTime = model.createTime;
                this.expireTime = model.expireTime;
                this.payType = model.payType;
                this.productCode = model.productCode;
                this.productType = model.productType;
                this.renewStatus = model.renewStatus;
                this.renewalPeriod = model.renewalPeriod;
                this.renewalPeriodUnit = model.renewalPeriodUnit;
                this.resourceARN = model.resourceARN;
                this.status = model.status;
            } 

            /**
             * <p>The time when the resource was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-01T12:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the resource expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-01T12:00:00</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li>Subscription</li>
             * <li>PayAsYouGo</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Subscription</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The code of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The type of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The renewal state. Valid values:</p>
             * <ul>
             * <li>AutoRenewal</li>
             * <li>ManualRenewal</li>
             * <li>NotRenewal</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AutoRenewal</p>
             */
            public Builder renewStatus(String renewStatus) {
                this.renewStatus = renewStatus;
                return this;
            }

            /**
             * <p>The renewal period.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder renewalPeriod(Integer renewalPeriod) {
                this.renewalPeriod = renewalPeriod;
                return this;
            }

            /**
             * <p>The unit of the renewal period. Valid values:</p>
             * <ul>
             * <li>Month</li>
             * <li>Year</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder renewalPeriodUnit(String renewalPeriodUnit) {
                this.renewalPeriodUnit = renewalPeriodUnit;
                return this;
            }

            /**
             * <p>The ARN of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>arn:acs:sag:cn-hangzhou:130920852836****:ccn/ccn-b3qf0q439sq2de****</p>
             */
            public Builder resourceARN(String resourceARN) {
                this.resourceARN = resourceARN;
                return this;
            }

            /**
             * <p>The state of the resource. Valid values:</p>
             * <ul>
             * <li>running</li>
             * <li>waiting</li>
             * <li>terminated</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only for containers.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>running</p>
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
