// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSmartJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSmartJobsResponseBody</p>
 */
public class ListSmartJobsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private String maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SmartJobList")
    private java.util.List < SmartJobList> smartJobList;

    @NameInMap("TotalCount")
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
         * MaxResults.
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * SmartJobList.
         */
        public Builder smartJobList(java.util.List < SmartJobList> smartJobList) {
            this.smartJobList = smartJobList;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSmartJobsResponseBody build() {
            return new ListSmartJobsResponseBody(this);
        } 

    } 

    public static class InputConfig extends TeaModel {
        @NameInMap("InputFile")
        private String inputFile;

        @NameInMap("Keyword")
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
             * InputFile.
             */
            public Builder inputFile(String inputFile) {
                this.inputFile = inputFile;
                return this;
            }

            /**
             * Keyword.
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
    public static class OutputConfig extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Object")
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
             * OSS Bucket
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * OSS Object
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
    public static class SmartJobList extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("EditingConfig")
        private String editingConfig;

        @NameInMap("InputConfig")
        private InputConfig inputConfig;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("JobState")
        private String jobState;

        @NameInMap("JobType")
        private String jobType;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("OutputConfig")
        private OutputConfig outputConfig;

        @NameInMap("Title")
        private String title;

        @NameInMap("UserData")
        private String userData;

        @NameInMap("UserId")
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EditingConfig.
             */
            public Builder editingConfig(String editingConfig) {
                this.editingConfig = editingConfig;
                return this;
            }

            /**
             * InputConfig.
             */
            public Builder inputConfig(InputConfig inputConfig) {
                this.inputConfig = inputConfig;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * JobState.
             */
            public Builder jobState(String jobState) {
                this.jobState = jobState;
                return this;
            }

            /**
             * JobType.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * OutputConfig.
             */
            public Builder outputConfig(OutputConfig outputConfig) {
                this.outputConfig = outputConfig;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * UserData.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * UserId.
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
