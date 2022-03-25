// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceOpsRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceOpsRecordsResponseBody</p>
 */
public class DescribeInstanceOpsRecordsResponseBody extends TeaModel {
    @NameInMap("Records")
    private java.util.List < Records> records;

    @NameInMap("RequestId")
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
         * Records.
         */
        public Builder records(java.util.List < Records> records) {
            this.records = records;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("OpsStatus")
        private String opsStatus;

        @NameInMap("OpsType")
        private String opsType;

        @NameInMap("ResultContent")
        private String resultContent;

        @NameInMap("ResultType")
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
             * OpsStatus.
             */
            public Builder opsStatus(String opsStatus) {
                this.opsStatus = opsStatus;
                return this;
            }

            /**
             * OpsType.
             */
            public Builder opsType(String opsType) {
                this.opsType = opsType;
                return this;
            }

            /**
             * ResultContent.
             */
            public Builder resultContent(String resultContent) {
                this.resultContent = resultContent;
                return this;
            }

            /**
             * ResultType.
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
