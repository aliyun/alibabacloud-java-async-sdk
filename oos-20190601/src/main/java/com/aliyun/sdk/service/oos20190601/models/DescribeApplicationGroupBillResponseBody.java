// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeApplicationGroupBillResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationGroupBillResponseBody</p>
 */
public class DescribeApplicationGroupBillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationGroupConsume")
    private java.util.List < ApplicationGroupConsume> applicationGroupConsume;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeApplicationGroupBillResponseBody(Builder builder) {
        this.applicationGroupConsume = builder.applicationGroupConsume;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationGroupBillResponseBody create() {
        return builder().build();
    }

    /**
     * @return applicationGroupConsume
     */
    public java.util.List < ApplicationGroupConsume> getApplicationGroupConsume() {
        return this.applicationGroupConsume;
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

    public static final class Builder {
        private java.util.List < ApplicationGroupConsume> applicationGroupConsume; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        /**
         * <p>The consume of application group.</p>
         */
        public Builder applicationGroupConsume(java.util.List < ApplicationGroupConsume> applicationGroupConsume) {
            this.applicationGroupConsume = applicationGroupConsume;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E897A1AB-4701-5B71-93AD-38FD703763A3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApplicationGroupBillResponseBody build() {
            return new DescribeApplicationGroupBillResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationGroupBillResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationGroupBillResponseBody</p>
     */
    public static class ApplicationGroupConsume extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Float amount;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Optimization")
        private String optimization;

        @com.aliyun.core.annotation.NameInMap("PeakType")
        private String peakType;

        @com.aliyun.core.annotation.NameInMap("Performance")
        private String performance;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ApplicationGroupConsume(Builder builder) {
            this.amount = builder.amount;
            this.creationTime = builder.creationTime;
            this.currency = builder.currency;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceType = builder.instanceType;
            this.optimization = builder.optimization;
            this.peakType = builder.peakType;
            this.performance = builder.performance;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationGroupConsume create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Float getAmount() {
            return this.amount;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return optimization
         */
        public String getOptimization() {
            return this.optimization;
        }

        /**
         * @return peakType
         */
        public String getPeakType() {
            return this.peakType;
        }

        /**
         * @return performance
         */
        public String getPerformance() {
            return this.performance;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Float amount; 
            private String creationTime; 
            private String currency; 
            private String instanceId; 
            private String instanceName; 
            private String instanceType; 
            private String optimization; 
            private String peakType; 
            private String performance; 
            private String status; 

            /**
             * <p>The amount consumed by the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>18.88</p>
             */
            public Builder amount(Float amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-10T06:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The currency unit.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-0jl781czrhqey0s5zpsj</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test-</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::ECS::INSTANCE</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>Optimization suggestions.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder optimization(String optimization) {
                this.optimization = optimization;
                return this;
            }

            /**
             * <p>The peak type.</p>
             * 
             * <strong>example:</strong>
             * <p>WHITE</p>
             */
            public Builder peakType(String peakType) {
                this.peakType = peakType;
                return this;
            }

            /**
             * <p>The performance of the data synchronization instance.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{&quot;mem&quot;:&quot;6.82&quot;,&quot;cpu&quot;:&quot;0.55&quot;}&quot;</p>
             */
            public Builder performance(String performance) {
                this.performance = performance;
                return this;
            }

            /**
             * <p>The status of instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ApplicationGroupConsume build() {
                return new ApplicationGroupConsume(this);
            } 

        } 

    }
}
