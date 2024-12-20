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
 * {@link OpenApiMultiResponse} extends {@link TeaModel}
 *
 * <p>OpenApiMultiResponse</p>
 */
public class OpenApiMultiResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

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

    private OpenApiMultiResponse(BuilderImpl builder) {
        super(builder);
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static OpenApiMultiResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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

    public interface Builder extends Response.Builder<OpenApiMultiResponse, Builder> {

        Builder data(java.util.List<Data> data);

        Builder errCode(String errCode);

        Builder errMessage(String errMessage);

        Builder httpStatusCode(Integer httpStatusCode);

        Builder requestId(String requestId);

        Builder success(Boolean success);

        @Override
        OpenApiMultiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenApiMultiResponse, Builder>
            implements Builder {
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenApiMultiResponse response) {
            super(response);
            this.data = response.data;
            this.errCode = response.errCode;
            this.errMessage = response.errMessage;
            this.httpStatusCode = response.httpStatusCode;
            this.requestId = response.requestId;
            this.success = response.success;
        } 

        /**
         * data.
         */
        @Override
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * errCode.
         */
        @Override
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * errMessage.
         */
        @Override
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        @Override
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * requestId.
         */
        @Override
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        @Override
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        @Override
        public OpenApiMultiResponse build() {
            return new OpenApiMultiResponse(this);
        } 

    } 

    /**
     * 
     * {@link OpenApiMultiResponse} extends {@link TeaModel}
     *
     * <p>OpenApiMultiResponse</p>
     */
    public static class InferenceJobList extends TeaModel {
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

        private InferenceJobList(Builder builder) {
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

        public static InferenceJobList create() {
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
            public Builder resultImageUrl(java.util.List<String> resultImageUrl) {
                this.resultImageUrl = resultImageUrl;
                return this;
            }

            public InferenceJobList build() {
                return new InferenceJobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link OpenApiMultiResponse} extends {@link TeaModel}
     *
     * <p>OpenApiMultiResponse</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("imageUrl")
        private java.util.List<String> imageUrl;

        @com.aliyun.core.annotation.NameInMap("inferenceImageCount")
        private Integer inferenceImageCount;

        @com.aliyun.core.annotation.NameInMap("inferenceJobList")
        private java.util.List<InferenceJobList> inferenceJobList;

        @com.aliyun.core.annotation.NameInMap("jobStatus")
        private String jobStatus;

        @com.aliyun.core.annotation.NameInMap("jobTrainProgress")
        private Double jobTrainProgress;

        @com.aliyun.core.annotation.NameInMap("modelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("objectType")
        private String objectType;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.imageUrl = builder.imageUrl;
            this.inferenceImageCount = builder.inferenceImageCount;
            this.inferenceJobList = builder.inferenceJobList;
            this.jobStatus = builder.jobStatus;
            this.jobTrainProgress = builder.jobTrainProgress;
            this.modelId = builder.modelId;
            this.name = builder.name;
            this.objectType = builder.objectType;
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
         * @return imageUrl
         */
        public java.util.List<String> getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return inferenceImageCount
         */
        public Integer getInferenceImageCount() {
            return this.inferenceImageCount;
        }

        /**
         * @return inferenceJobList
         */
        public java.util.List<InferenceJobList> getInferenceJobList() {
            return this.inferenceJobList;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        public static final class Builder {
            private String createTime; 
            private String id; 
            private java.util.List<String> imageUrl; 
            private Integer inferenceImageCount; 
            private java.util.List<InferenceJobList> inferenceJobList; 
            private String jobStatus; 
            private Double jobTrainProgress; 
            private String modelId; 
            private String name; 
            private String objectType; 

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
             * imageUrl.
             */
            public Builder imageUrl(java.util.List<String> imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * inferenceImageCount.
             */
            public Builder inferenceImageCount(Integer inferenceImageCount) {
                this.inferenceImageCount = inferenceImageCount;
                return this;
            }

            /**
             * inferenceJobList.
             */
            public Builder inferenceJobList(java.util.List<InferenceJobList> inferenceJobList) {
                this.inferenceJobList = inferenceJobList;
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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * objectType.
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
