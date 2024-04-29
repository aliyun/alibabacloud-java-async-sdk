// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudProductFieldStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudProductFieldStatisticsResponseBody</p>
 */
public class DescribeCloudProductFieldStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupedFields")
    private GroupedFields groupedFields;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCloudProductFieldStatisticsResponseBody(Builder builder) {
        this.groupedFields = builder.groupedFields;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudProductFieldStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupedFields
     */
    public GroupedFields getGroupedFields() {
        return this.groupedFields;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private GroupedFields groupedFields; 
        private String requestId; 

        /**
         * The statistics of cloud services that are protected by Security Center.
         */
        public Builder groupedFields(GroupedFields groupedFields) {
            this.groupedFields = groupedFields;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCloudProductFieldStatisticsResponseBody build() {
            return new DescribeCloudProductFieldStatisticsResponseBody(this);
        } 

    } 

    public static class GroupedFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryCount")
        private String categoryCount;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Integer instanceCount;

        @com.aliyun.core.annotation.NameInMap("RiskInstanceCount")
        private Integer riskInstanceCount;

        private GroupedFields(Builder builder) {
            this.categoryCount = builder.categoryCount;
            this.instanceCount = builder.instanceCount;
            this.riskInstanceCount = builder.riskInstanceCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupedFields create() {
            return builder().build();
        }

        /**
         * @return categoryCount
         */
        public String getCategoryCount() {
            return this.categoryCount;
        }

        /**
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return riskInstanceCount
         */
        public Integer getRiskInstanceCount() {
            return this.riskInstanceCount;
        }

        public static final class Builder {
            private String categoryCount; 
            private Integer instanceCount; 
            private Integer riskInstanceCount; 

            /**
             * The statistics of different types of assets. **MachineType** indicates the type of the asset. **Count** indicates the number of assets of a specific type.
             * <p>
             * 
             * Valid values of **MachineType**:
             * 
             * *   **1**: Server Load Balancer (SLB) instance
             * *   **2**: NAT gateway instance
             * *   **3**: ApsaraDB RDS instance
             * *   **4**: ApsaraDB for MongoDB instance
             */
            public Builder categoryCount(String categoryCount) {
                this.categoryCount = categoryCount;
                return this;
            }

            /**
             * The total number of cloud services that are protected by Security Center.
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * The number of cloud services that are at risk.
             */
            public Builder riskInstanceCount(Integer riskInstanceCount) {
                this.riskInstanceCount = riskInstanceCount;
                return this;
            }

            public GroupedFields build() {
                return new GroupedFields(this);
            } 

        } 

    }
}
