// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationGroupBillResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationGroupBillResponseBody</p>
 */
public class DescribeApplicationGroupBillResponseBody extends TeaModel {
    @NameInMap("ApplicationGroupConsume")
    private java.util.List < ApplicationGroupConsume> applicationGroupConsume;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
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
         * ApplicationGroupConsume.
         */
        public Builder applicationGroupConsume(java.util.List < ApplicationGroupConsume> applicationGroupConsume) {
            this.applicationGroupConsume = applicationGroupConsume;
            return this;
        }

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

        public DescribeApplicationGroupBillResponseBody build() {
            return new DescribeApplicationGroupBillResponseBody(this);
        } 

    } 

    public static class ApplicationGroupConsume extends TeaModel {
        @NameInMap("Amount")
        private Float amount;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Currency")
        private String currency;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Optimization")
        private String optimization;

        @NameInMap("PeakType")
        private String peakType;

        @NameInMap("Performance")
        private String performance;

        @NameInMap("Status")
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
             * Amount.
             */
            public Builder amount(Float amount) {
                this.amount = amount;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
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
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * Optimization.
             */
            public Builder optimization(String optimization) {
                this.optimization = optimization;
                return this;
            }

            /**
             * PeakType.
             */
            public Builder peakType(String peakType) {
                this.peakType = peakType;
                return this;
            }

            /**
             * Performance.
             */
            public Builder performance(String performance) {
                this.performance = performance;
                return this;
            }

            /**
             * Status.
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
