// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListStreamOpsRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListStreamOpsRecordsResponseBody</p>
 */
public class ListStreamOpsRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListStreamOpsRecordsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStreamOpsRecordsResponseBody create() {
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListStreamOpsRecordsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The start and stop operation records of real-time tasks.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The details of the backend response exception.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListStreamOpsRecordsResponseBody build() {
            return new ListStreamOpsRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListStreamOpsRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStreamOpsRecordsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeploymentId")
        private String deploymentId;

        @com.aliyun.core.annotation.NameInMap("DeploymentInstanceId")
        private String deploymentInstanceId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("LogContent")
        private String logContent;

        @com.aliyun.core.annotation.NameInMap("Operate")
        private String operate;

        @com.aliyun.core.annotation.NameInMap("OpsRecordId")
        private String opsRecordId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Data(Builder builder) {
            this.deploymentId = builder.deploymentId;
            this.deploymentInstanceId = builder.deploymentInstanceId;
            this.endTime = builder.endTime;
            this.logContent = builder.logContent;
            this.operate = builder.operate;
            this.opsRecordId = builder.opsRecordId;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deploymentId
         */
        public String getDeploymentId() {
            return this.deploymentId;
        }

        /**
         * @return deploymentInstanceId
         */
        public String getDeploymentInstanceId() {
            return this.deploymentInstanceId;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return logContent
         */
        public String getLogContent() {
            return this.logContent;
        }

        /**
         * @return operate
         */
        public String getOperate() {
            return this.operate;
        }

        /**
         * @return opsRecordId
         */
        public String getOpsRecordId() {
            return this.opsRecordId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String deploymentId; 
            private String deploymentInstanceId; 
            private String endTime; 
            private String logContent; 
            private String operate; 
            private String opsRecordId; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deploymentId = model.deploymentId;
                this.deploymentInstanceId = model.deploymentInstanceId;
                this.endTime = model.endTime;
                this.logContent = model.logContent;
                this.operate = model.operate;
                this.opsRecordId = model.opsRecordId;
                this.startTime = model.startTime;
            } 

            /**
             * <p>deploymentId</p>
             * 
             * <strong>example:</strong>
             * <p>ac6e5a34bbd44d7f8b7851ef28c90d12</p>
             */
            public Builder deploymentId(String deploymentId) {
                this.deploymentId = deploymentId;
                return this;
            }

            /**
             * <p>deploymentInstanceId</p>
             * 
             * <strong>example:</strong>
             * <p>7db678957dc449aab0086b931c9f8218</p>
             */
            public Builder deploymentInstanceId(String deploymentInstanceId) {
                this.deploymentInstanceId = deploymentInstanceId;
                return this;
            }

            /**
             * <p>The end time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-15 13:46:40</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The log content.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-15 13:46:26 INFO Starting Flink deployment</p>
             */
            public Builder logContent(String logContent) {
                this.logContent = logContent;
                return this;
            }

            /**
             * <p>The instance status. Valid values: START, PAUSE, RESUME, and STOP. Displayed as Start, Pause, Recover, or Stop.</p>
             * 
             * <strong>example:</strong>
             * <p>START</p>
             */
            public Builder operate(String operate) {
                this.operate = operate;
                return this;
            }

            /**
             * <p>opsRecordId</p>
             * 
             * <strong>example:</strong>
             * <p>646</p>
             */
            public Builder opsRecordId(String opsRecordId) {
                this.opsRecordId = opsRecordId;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-15 13:46:26</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
