// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetVmcoreDiagnosisTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetVmcoreDiagnosisTaskResponseBody</p>
 */
public class GetVmcoreDiagnosisTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetVmcoreDiagnosisTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVmcoreDiagnosisTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetVmcoreDiagnosisTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetVmcoreDiagnosisTaskResponseBody build() {
            return new GetVmcoreDiagnosisTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVmcoreDiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetVmcoreDiagnosisTaskResponseBody</p>
     */
    public static class Urls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("debuginfoCommonUrl")
        private String debuginfoCommonUrl;

        @com.aliyun.core.annotation.NameInMap("debuginfoUrl")
        private String debuginfoUrl;

        @com.aliyun.core.annotation.NameInMap("dmesgUrl")
        private String dmesgUrl;

        @com.aliyun.core.annotation.NameInMap("vmcoreUrl")
        private String vmcoreUrl;

        private Urls(Builder builder) {
            this.debuginfoCommonUrl = builder.debuginfoCommonUrl;
            this.debuginfoUrl = builder.debuginfoUrl;
            this.dmesgUrl = builder.dmesgUrl;
            this.vmcoreUrl = builder.vmcoreUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Urls create() {
            return builder().build();
        }

        /**
         * @return debuginfoCommonUrl
         */
        public String getDebuginfoCommonUrl() {
            return this.debuginfoCommonUrl;
        }

        /**
         * @return debuginfoUrl
         */
        public String getDebuginfoUrl() {
            return this.debuginfoUrl;
        }

        /**
         * @return dmesgUrl
         */
        public String getDmesgUrl() {
            return this.dmesgUrl;
        }

        /**
         * @return vmcoreUrl
         */
        public String getVmcoreUrl() {
            return this.vmcoreUrl;
        }

        public static final class Builder {
            private String debuginfoCommonUrl; 
            private String debuginfoUrl; 
            private String dmesgUrl; 
            private String vmcoreUrl; 

            private Builder() {
            } 

            private Builder(Urls model) {
                this.debuginfoCommonUrl = model.debuginfoCommonUrl;
                this.debuginfoUrl = model.debuginfoUrl;
                this.dmesgUrl = model.dmesgUrl;
                this.vmcoreUrl = model.vmcoreUrl;
            } 

            /**
             * debuginfoCommonUrl.
             */
            public Builder debuginfoCommonUrl(String debuginfoCommonUrl) {
                this.debuginfoCommonUrl = debuginfoCommonUrl;
                return this;
            }

            /**
             * debuginfoUrl.
             */
            public Builder debuginfoUrl(String debuginfoUrl) {
                this.debuginfoUrl = debuginfoUrl;
                return this;
            }

            /**
             * dmesgUrl.
             */
            public Builder dmesgUrl(String dmesgUrl) {
                this.dmesgUrl = dmesgUrl;
                return this;
            }

            /**
             * vmcoreUrl.
             */
            public Builder vmcoreUrl(String vmcoreUrl) {
                this.vmcoreUrl = vmcoreUrl;
                return this;
            }

            public Urls build() {
                return new Urls(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVmcoreDiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetVmcoreDiagnosisTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("diagnoseResult")
        private String diagnoseResult;

        @com.aliyun.core.annotation.NameInMap("errorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("taskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("taskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("urls")
        private Urls urls;

        private Data(Builder builder) {
            this.createdAt = builder.createdAt;
            this.diagnoseResult = builder.diagnoseResult;
            this.errorMsg = builder.errorMsg;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
            this.taskType = builder.taskType;
            this.urls = builder.urls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return diagnoseResult
         */
        public String getDiagnoseResult() {
            return this.diagnoseResult;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return urls
         */
        public Urls getUrls() {
            return this.urls;
        }

        public static final class Builder {
            private String createdAt; 
            private String diagnoseResult; 
            private String errorMsg; 
            private String taskId; 
            private String taskStatus; 
            private String taskType; 
            private Urls urls; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createdAt = model.createdAt;
                this.diagnoseResult = model.diagnoseResult;
                this.errorMsg = model.errorMsg;
                this.taskId = model.taskId;
                this.taskStatus = model.taskStatus;
                this.taskType = model.taskType;
                this.urls = model.urls;
            } 

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * diagnoseResult.
             */
            public Builder diagnoseResult(String diagnoseResult) {
                this.diagnoseResult = diagnoseResult;
                return this;
            }

            /**
             * errorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * taskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * taskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * urls.
             */
            public Builder urls(Urls urls) {
                this.urls = urls;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
