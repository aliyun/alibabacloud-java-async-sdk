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
 * {@link SubmitCheckResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitCheckResponseBody</p>
 */
public class SubmitCheckResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private SubmitCheckResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitCheckResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(SubmitCheckResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The data returned if the call is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>CE8369A6-A843-5E1B-A613-78E6920D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the configuration assessment task.</p>
         * 
         * <strong>example:</strong>
         * <p>5fe3f65d-4012-455d-8232-2a98a858****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public SubmitCheckResponseBody build() {
            return new SubmitCheckResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SubmitCheckResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitCheckResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperateCode")
        private String operateCode;

        @com.aliyun.core.annotation.NameInMap("ThrottlingTimeSecond")
        private Integer throttlingTimeSecond;

        private Data(Builder builder) {
            this.operateCode = builder.operateCode;
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
         * @return throttlingTimeSecond
         */
        public Integer getThrottlingTimeSecond() {
            return this.throttlingTimeSecond;
        }

        public static final class Builder {
            private String operateCode; 
            private Integer throttlingTimeSecond; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.operateCode = model.operateCode;
                this.throttlingTimeSecond = model.throttlingTimeSecond;
            } 

            /**
             * <p>The operation code of the configuration assessment task.</p>
             * <ul>
             * <li><strong>Throttling</strong>: frequency limit</li>
             * <li><strong>AuthorizationExhaust</strong>: insufficient quota</li>
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
             * <p>The throttling duration. Unit: seconds.</p>
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
