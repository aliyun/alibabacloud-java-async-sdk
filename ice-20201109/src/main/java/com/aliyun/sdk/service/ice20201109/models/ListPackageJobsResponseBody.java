// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPackageJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPackageJobsResponseBody</p>
 */
public class ListPackageJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PackageJobList")
    private PackageJobList packageJobList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPackageJobsResponseBody(Builder builder) {
        this.packageJobList = builder.packageJobList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPackageJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return packageJobList
     */
    public PackageJobList getPackageJobList() {
        return this.packageJobList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PackageJobList packageJobList; 
        private String requestId; 

        /**
         * <p>The list of packaging jobs.</p>
         */
        public Builder packageJobList(PackageJobList packageJobList) {
            this.packageJobList = packageJobList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31E30781-9495-5E2D-A84D-759B0A01E262</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPackageJobsResponseBody build() {
            return new ListPackageJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPackageJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPackageJobsResponseBody</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Input(Builder builder) {
            this.media = builder.media;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            /**
             * <p>The media object.</p>
             * <ul>
             * <li>If Type is set to OSS, the URL of an OSS object is returned. Both the OSS and HTTP protocols are supported.</li>
             * <li>If Type is set to Media, set this parameter to the ID of a media asset.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/path/to/video.mp4</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The type of the media object. Valid values:</p>
             * <ul>
             * <li>OSS: an Object Storage Service (OSS) object.</li>
             * <li>Media: a media asset.</li>
             * </ul>
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
     * {@link ListPackageJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPackageJobsResponseBody</p>
     */
    public static class Inputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Input")
        private Input input;

        private Inputs(Builder builder) {
            this.input = builder.input;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Inputs create() {
            return builder().build();
        }

        /**
         * @return input
         */
        public Input getInput() {
            return this.input;
        }

        public static final class Builder {
            private Input input; 

            /**
             * <p>The information about the input stream file.</p>
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            public Inputs build() {
                return new Inputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPackageJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPackageJobsResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Output(Builder builder) {
            this.media = builder.media;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            /**
             * <p>The media object.</p>
             * <ul>
             * <li>If Type is set to OSS, the URL of an OSS object is returned. Both the OSS and HTTP protocols are supported.</li>
             * <li>If Type is set to Media, set this parameter to the ID of a media asset.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/path/to/video.mp4</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The type of the media object. Valid values:</p>
             * <ul>
             * <li>OSS: an OSS object.</li>
             * <li>Media: a media asset.</li>
             * </ul>
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
     * {@link ListPackageJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPackageJobsResponseBody</p>
     */
    public static class PackageJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Inputs")
        private java.util.List < Inputs> inputs;

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

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubmitTime")
        private String submitTime;

        @com.aliyun.core.annotation.NameInMap("TriggerSource")
        private String triggerSource;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private PackageJobs(Builder builder) {
            this.code = builder.code;
            this.createTime = builder.createTime;
            this.finishTime = builder.finishTime;
            this.inputs = builder.inputs;
            this.jobId = builder.jobId;
            this.message = builder.message;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.output = builder.output;
            this.pipelineId = builder.pipelineId;
            this.priority = builder.priority;
            this.status = builder.status;
            this.submitTime = builder.submitTime;
            this.triggerSource = builder.triggerSource;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackageJobs create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
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
         * @return inputs
         */
        public java.util.List < Inputs> getInputs() {
            return this.inputs;
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
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
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
         * @return triggerSource
         */
        public String getTriggerSource() {
            return this.triggerSource;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String code; 
            private String createTime; 
            private String finishTime; 
            private java.util.List < Inputs> inputs; 
            private String jobId; 
            private String message; 
            private String modifiedTime; 
            private String name; 
            private Output output; 
            private String pipelineId; 
            private Integer priority; 
            private String status; 
            private String submitTime; 
            private String triggerSource; 
            private String userData; 

            /**
             * <p>The error code returned if the job fails.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The time when the job was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-07T14:00:32Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the job was complete. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-07T15:00:32Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The input of the job.</p>
             */
            public Builder inputs(java.util.List < Inputs> inputs) {
                this.inputs = inputs;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7b38a5d86f1e47838927b6e7ccb11cbe</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The error message that is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Resource content bad.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The time when the job was last modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-07T15:00:32Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The name of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>job-name</p>
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
             * <p>The ID of the ApsaraVideo Media Processing (MPS) queue that is used to run the job.</p>
             * 
             * <strong>example:</strong>
             * <p>5b40833e4c3e4d4e95a866abb9a42510</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The priority of the job. Valid values: 1 to 10. The greater the value, the higher the priority. Default value: 6.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The state of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the job was submitted. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-07T14:00:32Z</p>
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * <p>The source of the job. Valid values:</p>
             * <ul>
             * <li>API</li>
             * <li>WorkFlow</li>
             * <li>Console</li>
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
             * <p>The user-defined data.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;param&quot;: &quot;value&quot;}</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public PackageJobs build() {
                return new PackageJobs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPackageJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPackageJobsResponseBody</p>
     */
    public static class PackageJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NextPageToken")
        private String nextPageToken;

        @com.aliyun.core.annotation.NameInMap("PackageJobs")
        private java.util.List < PackageJobs> packageJobs;

        private PackageJobList(Builder builder) {
            this.nextPageToken = builder.nextPageToken;
            this.packageJobs = builder.packageJobs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackageJobList create() {
            return builder().build();
        }

        /**
         * @return nextPageToken
         */
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        /**
         * @return packageJobs
         */
        public java.util.List < PackageJobs> getPackageJobs() {
            return this.packageJobs;
        }

        public static final class Builder {
            private String nextPageToken; 
            private java.util.List < PackageJobs> packageJobs; 

            /**
             * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. The token of the next page is returned after you call this operation for the first time.</p>
             * 
             * <strong>example:</strong>
             * <p>019daf5780f74831b0e1a767c9f1c178</p>
             */
            public Builder nextPageToken(String nextPageToken) {
                this.nextPageToken = nextPageToken;
                return this;
            }

            /**
             * <p>The list of packaging jobs.</p>
             */
            public Builder packageJobs(java.util.List < PackageJobs> packageJobs) {
                this.packageJobs = packageJobs;
                return this;
            }

            public PackageJobList build() {
                return new PackageJobList(this);
            } 

        } 

    }
}
