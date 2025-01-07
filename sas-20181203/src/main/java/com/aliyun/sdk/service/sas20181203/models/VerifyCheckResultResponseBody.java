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
 * {@link VerifyCheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyCheckResultResponseBody</p>
 */
public class VerifyCheckResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private VerifyCheckResultResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyCheckResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7C0A3FA0-AA32-5660-8989-85A5582F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public VerifyCheckResultResponseBody build() {
            return new VerifyCheckResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VerifyCheckResultResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyCheckResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperateCode")
        private String operateCode;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("ThrottlingTimeSecond")
        private Integer throttlingTimeSecond;

        private Data(Builder builder) {
            this.operateCode = builder.operateCode;
            this.taskId = builder.taskId;
            this.throttlingTimeSecond = builder.throttlingTimeSecond;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return operateCode
         */
        public String getOperateCode() {
            return this.operateCode;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return throttlingTimeSecond
         */
        public Integer getThrottlingTimeSecond() {
            return this.throttlingTimeSecond;
        }

        public static final class Builder {
            private String operateCode; 
            private String taskId; 
            private Integer throttlingTimeSecond; 

            /**
             * <p>The operation code of the cloud service configuration task. Valid values:</p>
             * <ul>
             * <li><strong>Throttling</strong>: frequency limit</li>
             * <li><strong>ActionTrialUnauthorized</strong>: an error that is related to unauthorized operations</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Throttling</p>
             */
            public Builder operateCode(String operateCode) {
                this.operateCode = operateCode;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The throttling duration. Unit: seconds</p>
             * 
             * <strong>example:</strong>
             * <p>1800</p>
             */
            public Builder throttlingTimeSecond(Integer throttlingTimeSecond) {
                this.throttlingTimeSecond = throttlingTimeSecond;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
