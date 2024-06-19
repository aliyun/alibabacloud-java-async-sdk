// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceOpsRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceOpsRecordsResponseBody</p>
 */
public class DescribeInstanceOpsRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Records")
    private java.util.List < Records> records;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceOpsRecordsResponseBody(Builder builder) {
        this.records = builder.records;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceOpsRecordsResponseBody create() {
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
         * The details of the O\&M tasks.
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

        public DescribeInstanceOpsRecordsResponseBody build() {
            return new DescribeInstanceOpsRecordsResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("OpsStatus")
        private String opsStatus;

        @com.aliyun.core.annotation.NameInMap("OpsType")
        private String opsType;

        @com.aliyun.core.annotation.NameInMap("ResultContent")
        private String resultContent;

        @com.aliyun.core.annotation.NameInMap("ResultType")
        private String resultType;

        private Records(Builder builder) {
            this.createTime = builder.createTime;
            this.expireTime = builder.expireTime;
            this.opsStatus = builder.opsStatus;
            this.opsType = builder.opsType;
            this.resultContent = builder.resultContent;
            this.resultType = builder.resultType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
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
         * @return opsStatus
         */
        public String getOpsStatus() {
            return this.opsStatus;
        }

        /**
         * @return opsType
         */
        public String getOpsType() {
            return this.opsType;
        }

        /**
         * @return resultContent
         */
        public String getResultContent() {
            return this.resultContent;
        }

        /**
         * @return resultType
         */
        public String getResultType() {
            return this.resultType;
        }

        public static final class Builder {
            private String createTime; 
            private String expireTime; 
            private String opsStatus; 
            private String opsType; 
            private String resultContent; 
            private String resultType; 

            /**
             * The time when the O\&M task was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the O\&M task expires.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The status of the O\&M task.
             * <p>
             * - Ready
             * - Failed
             * - Expired
             * - Closed
             * - Success
             */
            public Builder opsStatus(String opsStatus) {
                this.opsStatus = opsStatus;
                return this;
            }

            /**
             * The type of the O\&M task.
             */
            public Builder opsType(String opsType) {
                this.opsType = opsType;
                return this;
            }

            /**
             * The content of the O\&M result. The content is the download URL of the files that are generated for the O\&M task.
             */
            public Builder resultContent(String resultContent) {
                this.resultContent = resultContent;
                return this;
            }

            /**
             * The type of the O\&M result. Valid value: OSS. This value indicates that the files generated for the O\&M task are saved to Object Storage Service (OSS) buckets.
             */
            public Builder resultType(String resultType) {
                this.resultType = resultType;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
