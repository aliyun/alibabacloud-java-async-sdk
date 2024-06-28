// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDistinctReleasesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDistinctReleasesResponseBody</p>
 */
public class DescribeDistinctReleasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Records")
    private java.util.List < Records> records;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDistinctReleasesResponseBody(Builder builder) {
        this.records = builder.records;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDistinctReleasesResponseBody create() {
        return builder().build();
    }

    /**
     * @return records
     */
    public java.util.List < Records> getRecords() {
        return this.records;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Records> records; 
        private String requestId; 

        /**
         * The version information.
         */
        public Builder records(java.util.List < Records> records) {
            this.records = records;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDistinctReleasesResponseBody build() {
            return new DescribeDistinctReleasesResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("TaskflowMd5")
        private String taskflowMd5;

        @com.aliyun.core.annotation.NameInMap("TaskflowType")
        private String taskflowType;

        private Records(Builder builder) {
            this.description = builder.description;
            this.taskflowMd5 = builder.taskflowMd5;
            this.taskflowType = builder.taskflowType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return taskflowMd5
         */
        public String getTaskflowMd5() {
            return this.taskflowMd5;
        }

        /**
         * @return taskflowType
         */
        public String getTaskflowType() {
            return this.taskflowType;
        }

        public static final class Builder {
            private String description; 
            private String taskflowMd5; 
            private String taskflowType; 

            /**
             * The version description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The MD5 value of the playbook XML configuration.
             */
            public Builder taskflowMd5(String taskflowMd5) {
                this.taskflowMd5 = taskflowMd5;
                return this;
            }

            /**
             * TaskflowType.
             */
            public Builder taskflowType(String taskflowType) {
                this.taskflowType = taskflowType;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
