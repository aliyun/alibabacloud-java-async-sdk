// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Personalizedtxt2imgQueryInferenceJobInfoResponseBody} extends {@link TeaModel}
 *
 * <p>Personalizedtxt2imgQueryInferenceJobInfoResponseBody</p>
 */
public class Personalizedtxt2imgQueryInferenceJobInfoResponseBody extends TeaModel {
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

    private Personalizedtxt2imgQueryInferenceJobInfoResponseBody(Builder builder) {
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

    public static Personalizedtxt2imgQueryInferenceJobInfoResponseBody create() {
        return builder().build();
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

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * errMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public Personalizedtxt2imgQueryInferenceJobInfoResponseBody build() {
            return new Personalizedtxt2imgQueryInferenceJobInfoResponseBody(this);
        } 

    } 

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
        private java.util.List < String > resultImageUrl;

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
        public java.util.List < String > getResultImageUrl() {
            return this.resultImageUrl;
        }

        public static final class Builder {
            private String createTime; 
            private String id; 
            private String jobStatus; 
            private Double jobTrainProgress; 
            private String modelId; 
            private String promptId; 
            private java.util.List < String > resultImageUrl; 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * jobStatus.
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * jobTrainProgress.
             */
            public Builder jobTrainProgress(Double jobTrainProgress) {
                this.jobTrainProgress = jobTrainProgress;
                return this;
            }

            /**
             * modelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * promptId.
             */
            public Builder promptId(String promptId) {
                this.promptId = promptId;
                return this;
            }

            /**
             * resultImageUrl.
             */
            public Builder resultImageUrl(java.util.List < String > resultImageUrl) {
                this.resultImageUrl = resultImageUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
