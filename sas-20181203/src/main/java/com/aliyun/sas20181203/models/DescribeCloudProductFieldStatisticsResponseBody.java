// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeCloudProductFieldStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudProductFieldStatisticsResponseBody</p>
 */
public class DescribeCloudProductFieldStatisticsResponseBody extends TeaModel {
    @NameInMap("GroupedFields")
    private GroupedFields groupedFields;

    @NameInMap("RequestId")
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
         * <p>GroupedFields.</p>
         */
        public Builder groupedFields(GroupedFields groupedFields) {
            this.groupedFields = groupedFields;
            return this;
        }

        /**
         * <p>RequestId.</p>
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
        @NameInMap("CategoryCount")
        private String categoryCount;

        @NameInMap("InstanceCount")
        private Integer instanceCount;

        @NameInMap("RiskInstanceCount")
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
             * <p>CategoryCount.</p>
             */
            public Builder categoryCount(String categoryCount) {
                this.categoryCount = categoryCount;
                return this;
            }

            /**
             * <p>InstanceCount.</p>
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>RiskInstanceCount.</p>
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
