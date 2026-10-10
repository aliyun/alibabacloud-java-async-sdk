// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link PersonalizedTextToImageAddInferenceJobResponseBody} extends {@link TeaModel}
 *
 * <p>PersonalizedTextToImageAddInferenceJobResponseBody</p>
 */
public class PersonalizedTextToImageAddInferenceJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private PersonalizedTextToImageAddInferenceJobResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PersonalizedTextToImageAddInferenceJobResponseBody create() {
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
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(PersonalizedTextToImageAddInferenceJobResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The object containing the details of the model inference job.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned when success is false.</p>
         * 
         * <strong>example:</strong>
         * <p>UNKNOWN_ERROR</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned when success is false.</p>
         * 
         * <strong>example:</strong>
         * <p>未知错误</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PersonalizedTextToImageAddInferenceJobResponseBody build() {
            return new PersonalizedTextToImageAddInferenceJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PersonalizedTextToImageAddInferenceJobResponseBody} extends {@link TeaModel}
     *
     * <p>PersonalizedTextToImageAddInferenceJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("jobStatus")
        private String jobStatus;

        @com.aliyun.core.annotation.NameInMap("jobTrainProgress")
        private Double jobTrainProgress;

        @com.aliyun.core.annotation.NameInMap("modelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("promptId")
        private String promptId;

        @com.aliyun.core.annotation.NameInMap("resultImageUrl")
        private java.util.List<String> resultImageUrl;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.jobStatus = builder.jobStatus;
            this.jobTrainProgress = builder.jobTrainProgress;
            this.modelId = builder.modelId;
            this.promptId = builder.promptId;
            this.resultImageUrl = builder.resultImageUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return jobStatus
         */
        public String getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return jobTrainProgress
         */
        public Double getJobTrainProgress() {
            return this.jobTrainProgress;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return promptId
         */
        public String getPromptId() {
            return this.promptId;
        }

        /**
         * @return resultImageUrl
         */
        public java.util.List<String> getResultImageUrl() {
            return this.resultImageUrl;
        }

        public static final class Builder {
            private String createTime; 
            private String id; 
            private String jobStatus; 
            private Double jobTrainProgress; 
            private String modelId; 
            private String promptId; 
            private java.util.List<String> resultImageUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.id = model.id;
                this.jobStatus = model.jobStatus;
                this.jobTrainProgress = model.jobTrainProgress;
                this.modelId = model.modelId;
                this.promptId = model.promptId;
                this.resultImageUrl = model.resultImageUrl;
            } 

            /**
             * <p>The creation time of the model inference job.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-12-25T12:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the model inference job.</p>
             * 
             * <strong>example:</strong>
             * <p>3220</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The status of the model inference job.</p>
             * 
             * <strong>example:</strong>
             * <p>FINISHED</p>
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * <p>The training progress of the model inference job.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder jobTrainProgress(Double jobTrainProgress) {
                this.jobTrainProgress = jobTrainProgress;
                return this;
            }

            /**
             * <p>The model ID.</p>
             * 
             * <strong>example:</strong>
             * <p>modelId-xxxx-xxxx-xxxx</p>
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * <p>The prompt ID.</p>
             * 
             * <strong>example:</strong>
             * <p>promptId-xxxx-xxxx-xxxx</p>
             */
            public Builder promptId(String promptId) {
                this.promptId = promptId;
                return this;
            }

            /**
             * <p>A list of URLs for the images generated by the job.</p>
             * 
             * <strong>example:</strong>
             * <p>0000.png</p>
             */
            public Builder resultImageUrl(java.util.List<String> resultImageUrl) {
                this.resultImageUrl = resultImageUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
