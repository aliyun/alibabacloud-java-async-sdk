// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The statistics of cloud services that are protected by Security Center.</p>
         */
        public Builder groupedFields(GroupedFields groupedFields) {
            this.groupedFields = groupedFields;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCloudProductFieldStatisticsResponseBody build() {
            return new DescribeCloudProductFieldStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudProductFieldStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudProductFieldStatisticsResponseBody</p>
     */
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
             * <p>The statistics of different types of assets. <strong>MachineType</strong> indicates the type of the asset. <strong>Count</strong> indicates the number of assets of a specific type.</p>
             * <p>Valid values of <strong>MachineType</strong>:</p>
             * <ul>
             * <li><strong>1</strong>: Server Load Balancer (SLB) instance</li>
             * <li><strong>2</strong>: NAT gateway instance</li>
             * <li><strong>3</strong>: ApsaraDB RDS instance</li>
             * <li><strong>4</strong>: ApsaraDB for MongoDB instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;MachineType&quot;:1,&quot;Count&quot;:11}]</p>
             */
            public Builder categoryCount(String categoryCount) {
                this.categoryCount = categoryCount;
                return this;
            }

            /**
             * <p>The total number of cloud services that are protected by Security Center.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The number of cloud services that are at risk.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
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
