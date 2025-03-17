// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetSmartHandleJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetSmartHandleJobResponseBody</p>
 */
public class GetSmartHandleJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("JobResult")
    private JobResult jobResult;

    @com.aliyun.core.annotation.NameInMap("Output")
    private String output;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SmartJobInfo")
    private SmartJobInfo smartJobInfo;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private GetSmartHandleJobResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.jobResult = builder.jobResult;
        this.output = builder.output;
        this.requestId = builder.requestId;
        this.smartJobInfo = builder.smartJobInfo;
        this.state = builder.state;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSmartHandleJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return jobResult
     */
    public JobResult getJobResult() {
        return this.jobResult;
    }

    /**
     * @return output
     */
    public String getOutput() {
        return this.output;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return smartJobInfo
     */
    public SmartJobInfo getSmartJobInfo() {
        return this.smartJobInfo;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder {
        private String jobId; 
        private JobResult jobResult; 
        private String output; 
        private String requestId; 
        private SmartJobInfo smartJobInfo; 
        private String state; 
        private String userData; 

        private Builder() {
        } 

        private Builder(GetSmartHandleJobResponseBody model) {
            this.jobId = model.jobId;
            this.jobResult = model.jobResult;
            this.output = model.output;
            this.requestId = model.requestId;
            this.smartJobInfo = model.smartJobInfo;
            this.state = model.state;
            this.userData = model.userData;
        } 

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The job results.</p>
         */
        public Builder jobResult(JobResult jobResult) {
            this.jobResult = jobResult;
            return this;
        }

        /**
         * <p>The job results.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder output(String output) {
            this.output = output;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the intelligent job.</p>
         */
        public Builder smartJobInfo(SmartJobInfo smartJobInfo) {
            this.smartJobInfo = smartJobInfo;
            return this;
        }

        /**
         * <p>The job state.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Finished</li>
         * <li>Failed</li>
         * <li>Executing</li>
         * <li>Created</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The user-defined data in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;user&quot;:&quot;data&quot;}</p>
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        public GetSmartHandleJobResponseBody build() {
            return new GetSmartHandleJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSmartHandleJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetSmartHandleJobResponseBody</p>
     */
    public static class JobResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiResult")
        private String aiResult;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaUrl")
        private String mediaUrl;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private String usage;

        private JobResult(Builder builder) {
            this.aiResult = builder.aiResult;
            this.mediaId = builder.mediaId;
            this.mediaUrl = builder.mediaUrl;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobResult create() {
            return builder().build();
        }

        /**
         * @return aiResult
         */
        public String getAiResult() {
            return this.aiResult;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return mediaUrl
         */
        public String getMediaUrl() {
            return this.mediaUrl;
        }

        /**
         * @return usage
         */
        public String getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String aiResult; 
            private String mediaId; 
            private String mediaUrl; 
            private String usage; 

            private Builder() {
            } 

            private Builder(JobResult model) {
                this.aiResult = model.aiResult;
                this.mediaId = model.mediaId;
                this.mediaUrl = model.mediaUrl;
                this.usage = model.usage;
            } 

            /**
             * <p>The AI analysis result.</p>
             * 
             * <strong>example:</strong>
             * <p>Intelligent segmentation or tagging information</p>
             */
            public Builder aiResult(String aiResult) {
                this.aiResult = aiResult;
                return this;
            }

            /**
             * <p>The ID of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * MediaUrl.
             */
            public Builder mediaUrl(String mediaUrl) {
                this.mediaUrl = mediaUrl;
                return this;
            }

            /**
             * <p>The token usage. This parameter is returned only for keyword-based text generation jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;total_tokens&quot;:100}</p>
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            public JobResult build() {
                return new JobResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSmartHandleJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetSmartHandleJobResponseBody</p>
     */
    public static class InputConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputFile")
        private String inputFile;

        private InputConfig(Builder builder) {
            this.inputFile = builder.inputFile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputConfig create() {
            return builder().build();
        }

        /**
         * @return inputFile
         */
        public String getInputFile() {
            return this.inputFile;
        }

        public static final class Builder {
            private String inputFile; 

            private Builder() {
            } 

            private Builder(InputConfig model) {
                this.inputFile = model.inputFile;
            } 

            /**
             * <p>The OSS URL or the ID of the material in the media asset library.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4 或 <strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
             */
            public Builder inputFile(String inputFile) {
                this.inputFile = inputFile;
                return this;
            }

            public InputConfig build() {
                return new InputConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSmartHandleJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetSmartHandleJobResponseBody</p>
     */
    public static class OutputConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        private OutputConfig(Builder builder) {
            this.bucket = builder.bucket;
            this.object = builder.object;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputConfig create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        public static final class Builder {
            private String bucket; 
            private String object; 

            private Builder() {
            } 

            private Builder(OutputConfig model) {
                this.bucket = model.bucket;
                this.object = model.object;
            } 

            /**
             * <p>The OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>test-bucket</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The OSS object.</p>
             * 
             * <strong>example:</strong>
             * <p>test-object</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            public OutputConfig build() {
                return new OutputConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSmartHandleJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetSmartHandleJobResponseBody</p>
     */
    public static class SmartJobInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InputConfig")
        private InputConfig inputConfig;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("OutputConfig")
        private OutputConfig outputConfig;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private SmartJobInfo(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.inputConfig = builder.inputConfig;
            this.jobType = builder.jobType;
            this.modifiedTime = builder.modifiedTime;
            this.outputConfig = builder.outputConfig;
            this.title = builder.title;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmartJobInfo create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return inputConfig
         */
        public InputConfig getInputConfig() {
            return this.inputConfig;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return outputConfig
         */
        public OutputConfig getOutputConfig() {
            return this.outputConfig;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private InputConfig inputConfig; 
            private String jobType; 
            private String modifiedTime; 
            private OutputConfig outputConfig; 
            private String title; 
            private String userId; 

            private Builder() {
            } 

            private Builder(SmartJobInfo model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.inputConfig = model.inputConfig;
                this.jobType = model.jobType;
                this.modifiedTime = model.modifiedTime;
                this.outputConfig = model.outputConfig;
                this.title = model.title;
                this.userId = model.userId;
            } 

            /**
             * <p>The time when the job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-26T04:11:10Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The job description.</p>
             * 
             * <strong>example:</strong>
             * <p>测试描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The input configurations.</p>
             */
            public Builder inputConfig(InputConfig inputConfig) {
                this.inputConfig = inputConfig;
                return this;
            }

            /**
             * <p>The job type.</p>
             * 
             * <strong>example:</strong>
             * <p>ASR</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The time when the job was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-26T04:11:10Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The output configurations.</p>
             */
            public Builder outputConfig(OutputConfig outputConfig) {
                this.outputConfig = outputConfig;
                return this;
            }

            /**
             * <p>The job title.</p>
             * 
             * <strong>example:</strong>
             * <p>测试标题</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1974526429******</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public SmartJobInfo build() {
                return new SmartJobInfo(this);
            } 

        } 

    }
}
