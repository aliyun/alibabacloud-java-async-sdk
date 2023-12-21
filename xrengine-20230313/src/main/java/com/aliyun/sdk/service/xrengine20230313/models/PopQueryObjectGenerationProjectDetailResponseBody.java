// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopQueryObjectGenerationProjectDetailResponseBody} extends {@link TeaModel}
 *
 * <p>PopQueryObjectGenerationProjectDetailResponseBody</p>
 */
public class PopQueryObjectGenerationProjectDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private PopQueryObjectGenerationProjectDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopQueryObjectGenerationProjectDetailResponseBody create() {
        return builder().build();
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PopQueryObjectGenerationProjectDetailResponseBody build() {
            return new PopQueryObjectGenerationProjectDetailResponseBody(this);
        } 

    } 

    public static class BuildDetail extends TeaModel {
        @NameInMap("CompletedTime")
        private String completedTime;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("EstimatedDuration")
        private Long estimatedDuration;

        @NameInMap("RunningTime")
        private String runningTime;

        @NameInMap("SubmitTime")
        private String submitTime;

        private BuildDetail(Builder builder) {
            this.completedTime = builder.completedTime;
            this.errorMessage = builder.errorMessage;
            this.estimatedDuration = builder.estimatedDuration;
            this.runningTime = builder.runningTime;
            this.submitTime = builder.submitTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuildDetail create() {
            return builder().build();
        }

        /**
         * @return completedTime
         */
        public String getCompletedTime() {
            return this.completedTime;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return estimatedDuration
         */
        public Long getEstimatedDuration() {
            return this.estimatedDuration;
        }

        /**
         * @return runningTime
         */
        public String getRunningTime() {
            return this.runningTime;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        public static final class Builder {
            private String completedTime; 
            private String errorMessage; 
            private Long estimatedDuration; 
            private String runningTime; 
            private String submitTime; 

            /**
             * CompletedTime.
             */
            public Builder completedTime(String completedTime) {
                this.completedTime = completedTime;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * EstimatedDuration.
             */
            public Builder estimatedDuration(Long estimatedDuration) {
                this.estimatedDuration = estimatedDuration;
                return this;
            }

            /**
             * RunningTime.
             */
            public Builder runningTime(String runningTime) {
                this.runningTime = runningTime;
                return this;
            }

            /**
             * SubmitTime.
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            public BuildDetail build() {
                return new BuildDetail(this);
            } 

        } 

    }
    public static class Dataset extends TeaModel {
        @NameInMap("BuildResultUrl")
        private java.util.Map < String, ? > buildResultUrl;

        private Dataset(Builder builder) {
            this.buildResultUrl = builder.buildResultUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dataset create() {
            return builder().build();
        }

        /**
         * @return buildResultUrl
         */
        public java.util.Map < String, ? > getBuildResultUrl() {
            return this.buildResultUrl;
        }

        public static final class Builder {
            private java.util.Map < String, ? > buildResultUrl; 

            /**
             * BuildResultUrl.
             */
            public Builder buildResultUrl(java.util.Map < String, ? > buildResultUrl) {
                this.buildResultUrl = buildResultUrl;
                return this;
            }

            public Dataset build() {
                return new Dataset(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("BizUsage")
        private String bizUsage;

        @NameInMap("BuildDetail")
        private BuildDetail buildDetail;

        @NameInMap("Dataset")
        private Dataset dataset;

        @NameInMap("Ext")
        private String ext;

        @NameInMap("Id")
        private String id;

        @NameInMap("Intro")
        private String intro;

        @NameInMap("Status")
        private String status;

        @NameInMap("Title")
        private String title;

        private Data(Builder builder) {
            this.bizUsage = builder.bizUsage;
            this.buildDetail = builder.buildDetail;
            this.dataset = builder.dataset;
            this.ext = builder.ext;
            this.id = builder.id;
            this.intro = builder.intro;
            this.status = builder.status;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizUsage
         */
        public String getBizUsage() {
            return this.bizUsage;
        }

        /**
         * @return buildDetail
         */
        public BuildDetail getBuildDetail() {
            return this.buildDetail;
        }

        /**
         * @return dataset
         */
        public Dataset getDataset() {
            return this.dataset;
        }

        /**
         * @return ext
         */
        public String getExt() {
            return this.ext;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return intro
         */
        public String getIntro() {
            return this.intro;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String bizUsage; 
            private BuildDetail buildDetail; 
            private Dataset dataset; 
            private String ext; 
            private String id; 
            private String intro; 
            private String status; 
            private String title; 

            /**
             * BizUsage.
             */
            public Builder bizUsage(String bizUsage) {
                this.bizUsage = bizUsage;
                return this;
            }

            /**
             * BuildDetail.
             */
            public Builder buildDetail(BuildDetail buildDetail) {
                this.buildDetail = buildDetail;
                return this;
            }

            /**
             * Dataset.
             */
            public Builder dataset(Dataset dataset) {
                this.dataset = dataset;
                return this;
            }

            /**
             * Ext.
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Intro.
             */
            public Builder intro(String intro) {
                this.intro = intro;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
