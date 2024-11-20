// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSmartJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSmartJobsResponseBody</p>
 */
public class ListSmartJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SmartJobList")
    private java.util.List < SmartJobList> smartJobList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListSmartJobsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.smartJobList = builder.smartJobList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSmartJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return smartJobList
     */
    public java.util.List < SmartJobList> getSmartJobList() {
        return this.smartJobList;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < SmartJobList> smartJobList; 
        private String totalCount; 

        /**
         * <p>The maximum number of entries returned on a single page. The value is set to the maximum number of entries returned on each page except for the last page. Valid example: 10,10,5. Invalid example: 10,5,10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>CBB6BC61D08</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>9262E3DA-07FA-4862-FCBB6BC61D08</strong></strong>*</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried intelligent jobs.</p>
         */
        public Builder smartJobList(java.util.List < SmartJobList> smartJobList) {
            this.smartJobList = smartJobList;
            return this;
        }

        /**
         * <p>Optional. The total number of entries returned. By default, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>110</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSmartJobsResponseBody build() {
            return new ListSmartJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSmartJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSmartJobsResponseBody</p>
     */
    public static class InputConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputFile")
        private String inputFile;

        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        private InputConfig(Builder builder) {
            this.inputFile = builder.inputFile;
            this.keyword = builder.keyword;
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

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
        }

        public static final class Builder {
            private String inputFile; 
            private String keyword; 

            /**
             * <p>The information about the input file.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</p>
             */
            public Builder inputFile(String inputFile) {
                this.inputFile = inputFile;
                return this;
            }

            /**
             * <p>The keyword information.</p>
             * 
             * <strong>example:</strong>
             * <p>测试关键词</p>
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            public InputConfig build() {
                return new InputConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSmartJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSmartJobsResponseBody</p>
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

            /**
             * <p>The Object Storage Service (OSS) bucket.</p>
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
     * {@link ListSmartJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSmartJobsResponseBody</p>
     */
    public static class SmartJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EditingConfig")
        private String editingConfig;

        @com.aliyun.core.annotation.NameInMap("InputConfig")
        private InputConfig inputConfig;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobState")
        private String jobState;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("OutputConfig")
        private OutputConfig outputConfig;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private SmartJobList(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.editingConfig = builder.editingConfig;
            this.inputConfig = builder.inputConfig;
            this.jobId = builder.jobId;
            this.jobState = builder.jobState;
            this.jobType = builder.jobType;
            this.modifiedTime = builder.modifiedTime;
            this.outputConfig = builder.outputConfig;
            this.title = builder.title;
            this.userData = builder.userData;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmartJobList create() {
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
         * @return editingConfig
         */
        public String getEditingConfig() {
            return this.editingConfig;
        }

        /**
         * @return inputConfig
         */
        public InputConfig getInputConfig() {
            return this.inputConfig;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobState
         */
        public String getJobState() {
            return this.jobState;
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
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String editingConfig; 
            private InputConfig inputConfig; 
            private String jobId; 
            private String jobState; 
            private String jobType; 
            private String modifiedTime; 
            private OutputConfig outputConfig; 
            private String title; 
            private String userData; 
            private Long userId; 

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
             * <p>The editing configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;AudioConfig&quot;:{},&quot;InputConfig&quot;:&quot;&quot;}</p>
             */
            public Builder editingConfig(String editingConfig) {
                this.editingConfig = editingConfig;
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
             * <p>The job state.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Finished: The job is complete.</li>
             * <li>Failed: The job failed.</li>
             * <li>Executing: The job is in progress.</li>
             * <li>Created: The job is created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder jobState(String jobState) {
                this.jobState = jobState;
                return this;
            }

            /**
             * <p>The job type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>ASR: ASR job.</li>
             * <li>DynamicChart: dynamic chart job.</li>
             * <li>TextToSpeech: intelligent audio production job.</li>
             * </ul>
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
             * <p>The user-defined data.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;user&quot;:&quot;data&quot;}</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1084506228******</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public SmartJobList build() {
                return new SmartJobList(this);
            } 

        } 

    }
}
