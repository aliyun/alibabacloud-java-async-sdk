// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The details of the queried O&amp;M tasks.</p>
         */
        public Builder records(java.util.List < Records> records) {
            this.records = records;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>89945DD3-9072-47D0-A318-353284CFC7B3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceOpsRecordsResponseBody build() {
            return new DescribeInstanceOpsRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceOpsRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceOpsRecordsResponseBody</p>
     */
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
             * <p>The time when the O&amp;M task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-29T15:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the O&amp;M task expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2099-12-29T15:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The status of the O&amp;M task.</p>
             * <ul>
             * <li>Ready</li>
             * <li>Failed</li>
             * <li>Expired</li>
             * <li>Closed</li>
             * <li>Success</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ready</p>
             */
            public Builder opsStatus(String opsStatus) {
                this.opsStatus = opsStatus;
                return this;
            }

            /**
             * <p>The type of the O&amp;M task.</p>
             * 
             * <strong>example:</strong>
             * <p>coredump</p>
             */
            public Builder opsType(String opsType) {
                this.opsType = opsType;
                return this;
            }

            /**
             * <p>The content of the O&amp;M result. The value is the download URL of the files that are generated for the O&amp;M task. This parameter is returned only when the value of the OpsStatus parameter is Success.</p>
             * 
             * <strong>example:</strong>
             * <p>https://******</p>
             */
            public Builder resultContent(String resultContent) {
                this.resultContent = resultContent;
                return this;
            }

            /**
             * <p>The type of the O&amp;M result. This parameter is returned only when the value of the OpsStatus parameter is Success.<br>The only value of the parameter is Oss. The value indicates that the files generated for the O&amp;M task are saved to Object Storage Service (OSS) buckets.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
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
