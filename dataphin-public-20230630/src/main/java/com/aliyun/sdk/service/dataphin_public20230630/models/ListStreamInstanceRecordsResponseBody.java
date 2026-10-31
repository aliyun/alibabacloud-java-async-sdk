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
 * {@link ListStreamInstanceRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListStreamInstanceRecordsResponseBody</p>
 */
public class ListStreamInstanceRecordsResponseBody extends TeaModel {
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

    private ListStreamInstanceRecordsResponseBody(Builder builder) {
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

    public static ListStreamInstanceRecordsResponseBody create() {
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

        private Builder(ListStreamInstanceRecordsResponseBody model) {
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
         * <p>The historical running instance records of the real-time task. You can use the deploymentInstanceId to query the logs of a specific run.</p>
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

        public ListStreamInstanceRecordsResponseBody build() {
            return new ListStreamInstanceRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListStreamInstanceRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStreamInstanceRecordsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeploymentId")
        private String deploymentId;

        @com.aliyun.core.annotation.NameInMap("DeploymentInstanceId")
        private String deploymentInstanceId;

        @com.aliyun.core.annotation.NameInMap("ErrorDataPath")
        private String errorDataPath;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private Data(Builder builder) {
            this.deploymentId = builder.deploymentId;
            this.deploymentInstanceId = builder.deploymentInstanceId;
            this.errorDataPath = builder.errorDataPath;
            this.startTime = builder.startTime;
            this.state = builder.state;
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
         * @return errorDataPath
         */
        public String getErrorDataPath() {
            return this.errorDataPath;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String deploymentId; 
            private String deploymentInstanceId; 
            private String errorDataPath; 
            private String startTime; 
            private String state; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deploymentId = model.deploymentId;
                this.deploymentInstanceId = model.deploymentInstanceId;
                this.errorDataPath = model.errorDataPath;
                this.startTime = model.startTime;
                this.state = model.state;
            } 

            /**
             * <p>The deployment ID of the task. A single deployment can be associated with multiple running instances.</p>
             * 
             * <strong>example:</strong>
             * <p>ac6e5a34bbd44d7f8b7851ef28c90d12</p>
             */
            public Builder deploymentId(String deploymentId) {
                this.deploymentId = deploymentId;
                return this;
            }

            /**
             * <p>The instance ID of the deployment running instance. This value corresponds to the DeploymentInstanceId request parameter in the log and TaskManager query operations.</p>
             * 
             * <strong>example:</strong>
             * <p>7db678957dc449aab0086b931c9f8218</p>
             */
            public Builder deploymentInstanceId(String deploymentInstanceId) {
                this.deploymentInstanceId = deploymentInstanceId;
                return this;
            }

            /**
             * <p>The relative path for dirty data storage in this run, excluding the storage service domain name. A value of null indicates that no dirty data path exists.</p>
             * 
             * <strong>example:</strong>
             * <p>dirty-data/7333610201479808/7db678957dc449aab0086b931c9f8218/error.log</p>
             */
            public Builder errorDataPath(String errorDataPath) {
                this.errorDataPath = errorDataPath;
                return this;
            }

            /**
             * <p>The start time of this run. Format: yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-15 13:46:26</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The running instance status returned by the engine, such as RUNNING, FINISHED, and TRANSITIONING. This status uses a different enumeration from the TaskStatusEnum returned by the GetStreamTask operation.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
