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
 * {@link VerifyCheckInstanceResultResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyCheckInstanceResultResponseBody</p>
 */
public class VerifyCheckInstanceResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private VerifyCheckInstanceResultResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyCheckInstanceResultResponseBody create() {
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

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(VerifyCheckInstanceResultResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID. Alibaba Cloud generates a unique identifier for each request. You can use the request ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>B869E3A0-1147-539D-9920-47580700****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public VerifyCheckInstanceResultResponseBody build() {
            return new VerifyCheckInstanceResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VerifyCheckInstanceResultResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyCheckInstanceResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailInstances")
        private java.util.List<String> failInstances;

        @com.aliyun.core.annotation.NameInMap("OperateCode")
        private String operateCode;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Data(Builder builder) {
            this.failInstances = builder.failInstances;
            this.operateCode = builder.operateCode;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failInstances
         */
        public java.util.List<String> getFailInstances() {
            return this.failInstances;
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

        public static final class Builder {
            private java.util.List<String> failInstances; 
            private String operateCode; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.failInstances = model.failInstances;
                this.operateCode = model.operateCode;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The list of instances that failed the check.</p>
             */
            public Builder failInstances(java.util.List<String> failInstances) {
                this.failInstances = failInstances;
                return this;
            }

            /**
             * <p>The operation code of the cloud service configuration check task. Valid values:</p>
             * <ul>
             * <li><strong>Throttling</strong>: rate limit.</li>
             * <li><strong>ActionTrialUnauthorized</strong>: unauthorized error.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ActionTrialUnauthorized</p>
             */
            public Builder operateCode(String operateCode) {
                this.operateCode = operateCode;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>a410bb3-e68c217a-3368bc0-238c668***</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
