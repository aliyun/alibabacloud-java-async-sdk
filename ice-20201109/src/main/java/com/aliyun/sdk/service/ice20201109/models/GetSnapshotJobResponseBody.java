// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSnapshotJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetSnapshotJobResponseBody</p>
 */
public class GetSnapshotJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapshotJob")
    private SnapshotJob snapshotJob;

    private GetSnapshotJobResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.snapshotJob = builder.snapshotJob;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSnapshotJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshotJob
     */
    public SnapshotJob getSnapshotJob() {
        return this.snapshotJob;
    }

    public static final class Builder {
        private String requestId; 
        private SnapshotJob snapshotJob; 

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
         * <p>The information about the snapshot job.</p>
         */
        public Builder snapshotJob(SnapshotJob snapshotJob) {
            this.snapshotJob = snapshotJob;
            return this;
        }

        public GetSnapshotJobResponseBody build() {
            return new GetSnapshotJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSnapshotJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetSnapshotJobResponseBody</p>
     */
    public static class OssFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        private OssFile(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssFile create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 

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
             * <p>The OSS location.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-shanghai</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The OSS object.</p>
             * 
             * <strong>example:</strong>
             * <p>object.mp4</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            public OssFile build() {
                return new OssFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSnapshotJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetSnapshotJobResponseBody</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("OssFile")
        private OssFile ossFile;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Input(Builder builder) {
            this.media = builder.media;
            this.ossFile = builder.ossFile;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return ossFile
         */
        public OssFile getOssFile() {
            return this.ossFile;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private OssFile ossFile; 
            private String type; 

            /**
             * <p>The input file. If Type is set to OSS, the URL of an OSS object is returned. If Type is set to Media, the ID of a media asset is returned. The URL of an OSS object can be in one of the following formats:</p>
             * <ol>
             * <li>oss://bucket/object</li>
             * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object In the URL, bucket specifies an OSS bucket that resides in the same region as the job, and object specifies the object URL in OSS.</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket/object.mp4</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The three key elements of OSS.</p>
             */
            public Builder ossFile(OssFile ossFile) {
                this.ossFile = ossFile;
                return this;
            }

            /**
             * <p>The type of the input file. Valid values:</p>
             * <ol>
             * <li>OSS: an Object Storage Service (OSS) object.</li>
             * <li>Media: a media asset.</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSnapshotJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetSnapshotJobResponseBody</p>
     */
    public static class OutputOssFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        private OutputOssFile(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputOssFile create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 

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
             * <p>The OSS location.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-shanghai</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The OSS object.</p>
             * 
             * <strong>example:</strong>
             * <p>output-{Count}.jpg</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            public OutputOssFile build() {
                return new OutputOssFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSnapshotJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetSnapshotJobResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("OssFile")
        private OutputOssFile ossFile;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Output(Builder builder) {
            this.media = builder.media;
            this.ossFile = builder.ossFile;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return ossFile
         */
        public OutputOssFile getOssFile() {
            return this.ossFile;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private OutputOssFile ossFile; 
            private String type; 

            /**
             * <p>The output file. If Type is set to OSS, the URL of an OSS object is returned. If Type is set to Media, the ID of a media asset is returned. The URL of an OSS object can be in one of the following formats:</p>
             * <ol>
             * <li>oss://bucket/object</li>
             * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object</li>
             * </ol>
             * <p>In the URL, bucket specifies an OSS bucket that resides in the same region as the job, and object specifies the object URL in OSS. If multiple static snapshots were captured, the object must contain the &quot;{Count}&quot; placeholder. In the case of a sprite, the object must contain the &quot;{TileCount}&quot; placeholder. The suffix of the WebVTT snapshot objects must be &quot;.vtt&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://test-bucket.oss-cn-shanghai.aliyuncs.com/output-%7BCount%7D.jpg">http://test-bucket.oss-cn-shanghai.aliyuncs.com/output-{Count}.jpg</a></p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The three key elements of OSS.</p>
             */
            public Builder ossFile(OutputOssFile ossFile) {
                this.ossFile = ossFile;
                return this;
            }

            /**
             * <p>The type of the output file. Valid values:</p>
             * <ol>
             * <li>OSS: an OSS object.</li>
             * <li>Media: a media asset.</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSnapshotJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetSnapshotJobResponseBody</p>
     */
    public static class SnapshotJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Async")
        private Boolean async;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Input")
        private Input input;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Output")
        private Output output;

        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubmitTime")
        private String submitTime;

        @com.aliyun.core.annotation.NameInMap("TemplateConfig")
        private String templateConfig;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TriggerSource")
        private String triggerSource;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private SnapshotJob(Builder builder) {
            this.async = builder.async;
            this.code = builder.code;
            this.count = builder.count;
            this.createTime = builder.createTime;
            this.finishTime = builder.finishTime;
            this.input = builder.input;
            this.jobId = builder.jobId;
            this.message = builder.message;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.output = builder.output;
            this.pipelineId = builder.pipelineId;
            this.status = builder.status;
            this.submitTime = builder.submitTime;
            this.templateConfig = builder.templateConfig;
            this.templateId = builder.templateId;
            this.triggerSource = builder.triggerSource;
            this.type = builder.type;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotJob create() {
            return builder().build();
        }

        /**
         * @return async
         */
        public Boolean getAsync() {
            return this.async;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return input
         */
        public Input getInput() {
            return this.input;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return output
         */
        public Output getOutput() {
            return this.output;
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        /**
         * @return templateConfig
         */
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return triggerSource
         */
        public String getTriggerSource() {
            return this.triggerSource;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private Boolean async; 
            private String code; 
            private Integer count; 
            private String createTime; 
            private String finishTime; 
            private Input input; 
            private String jobId; 
            private String message; 
            private String modifiedTime; 
            private String name; 
            private Output output; 
            private String pipelineId; 
            private String status; 
            private String submitTime; 
            private String templateConfig; 
            private String templateId; 
            private String triggerSource; 
            private String type; 
            private String userData; 

            /**
             * <p>Indicates whether the snapshots were captured in asynchronous mode. Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder async(Boolean async) {
                this.async = async;
                return this;
            }

            /**
             * <p>Error codes</p>
             * 
             * <strong>example:</strong>
             * <p>ResourceNotFound</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The number of snapshots.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The time when the job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-12T16:17:54Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the job was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-12T16:30:54Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The input of the job.</p>
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>d80e4e4044975745c14b</strong></strong></p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The error message that is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>The specified resource for &quot;Pipeline&quot; could not be found.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The time when the job was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-12T16:30:54Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The name of the job.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The output of the job.</p>
             */
            public Builder output(Output output) {
                this.output = output;
                return this;
            }

            /**
             * <p>The ID of the MPS queue to which the job was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>d80e4e4044975745c14b</strong></strong></p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The state of the job.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Init: The job is submitted.</li>
             * <li>Success: The job is successful.</li>
             * <li>Fail: The job failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the job was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-12T16:17:54Z</p>
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * <p>The snapshot template configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Type&quot;:&quot;Normal&quot;,&quot;FrameType&quot;:&quot;normal&quot;,&quot;Time&quot;:0,&quot;Count&quot;:10}</p>
             */
            public Builder templateConfig(String templateConfig) {
                this.templateConfig = templateConfig;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>d80e4e4044975745c14b</strong></strong></p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The request trigger source.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Console</li>
             * <li>Workflow</li>
             * <li>API</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>API</p>
             */
            public Builder triggerSource(String triggerSource) {
                this.triggerSource = triggerSource;
                return this;
            }

            /**
             * <p>Snapshot types</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>WebVtt</li>
             * <li>Sprite</li>
             * <li>Normal</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Sprite</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The user-defined parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;test parameter&quot;: &quot;test value&quot;}</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public SnapshotJob build() {
                return new SnapshotJob(this);
            } 

        } 

    }
}
