// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListBatchMediaProducingJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBatchMediaProducingJobsResponseBody</p>
 */
public class ListBatchMediaProducingJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EditingBatchJobList")
    private java.util.List < EditingBatchJobList> editingBatchJobList;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListBatchMediaProducingJobsResponseBody(Builder builder) {
        this.editingBatchJobList = builder.editingBatchJobList;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBatchMediaProducingJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return editingBatchJobList
     */
    public java.util.List < EditingBatchJobList> getEditingBatchJobList() {
        return this.editingBatchJobList;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
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

    public static final class Builder {
        private java.util.List < EditingBatchJobList> editingBatchJobList; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        /**
         * <p>The queried quick video production jobs.</p>
         */
        public Builder editingBatchJobList(java.util.List < EditingBatchJobList> editingBatchJobList) {
            this.editingBatchJobList = editingBatchJobList;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>8EqYpQbZ6Eh7+Zz8DxVYoQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListBatchMediaProducingJobsResponseBody build() {
            return new ListBatchMediaProducingJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBatchMediaProducingJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBatchMediaProducingJobsResponseBody</p>
     */
    public static class EditingBatchJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EditingConfig")
        private String editingConfig;

        @com.aliyun.core.annotation.NameInMap("Extend")
        private String extend;

        @com.aliyun.core.annotation.NameInMap("InputConfig")
        private String inputConfig;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("OutputConfig")
        private String outputConfig;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private EditingBatchJobList(Builder builder) {
            this.completeTime = builder.completeTime;
            this.createTime = builder.createTime;
            this.editingConfig = builder.editingConfig;
            this.extend = builder.extend;
            this.inputConfig = builder.inputConfig;
            this.jobId = builder.jobId;
            this.jobType = builder.jobType;
            this.modifiedTime = builder.modifiedTime;
            this.outputConfig = builder.outputConfig;
            this.status = builder.status;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EditingBatchJobList create() {
            return builder().build();
        }

        /**
         * @return completeTime
         */
        public String getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return editingConfig
         */
        public String getEditingConfig() {
            return this.editingConfig;
        }

        /**
         * @return extend
         */
        public String getExtend() {
            return this.extend;
        }

        /**
         * @return inputConfig
         */
        public String getInputConfig() {
            return this.inputConfig;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
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
        public String getOutputConfig() {
            return this.outputConfig;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String completeTime; 
            private String createTime; 
            private String editingConfig; 
            private String extend; 
            private String inputConfig; 
            private String jobId; 
            private String jobType; 
            private String modifiedTime; 
            private String outputConfig; 
            private String status; 
            private String userData; 

            /**
             * <p>The time when the job was complete. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-09T06:38:09Z</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the job was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-09T06:36:48Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The editing configurations. For more information, see <a href="~~2692547#1be9bba03b7qu~~">EditingConfig</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;MediaConfig&quot;: {
             *       &quot;Volume&quot;: 0
             *   },
             *   &quot;SpeechConfig&quot;: {
             *       &quot;Volume&quot;: 1
             *   },
             *  &quot;BackgroundMusicConfig&quot;: {
             *       &quot;Volume&quot;: 0.3
             *   }
             * }</p>
             */
            public Builder editingConfig(String editingConfig) {
                this.editingConfig = editingConfig;
                return this;
            }

            /**
             * <p>The extended information of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * <p>The input configurations.</p>
             */
            public Builder inputConfig(String inputConfig) {
                this.inputConfig = inputConfig;
                return this;
            }

            /**
             * <p>The ID of the quick video production job.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong><strong>7ecbee4c6d9b8474498e</strong></strong></strong></p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The job type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Script: script-based editing job that mixes media assets.</li>
             * <li>Smart_Mix: intelligent editing job that mixes media assets.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Script</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The time when the job was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-09T06:37:58Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The output configurations. For more information, see <a href="~~2692547#447b928fcbuoa~~">OutputConfig</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;MediaURL&quot;: &quot;<a href="http://xxx.oss-cn-shanghai.aliyuncs.com/xxx_%7Bindex%7D.mp4">http://xxx.oss-cn-shanghai.aliyuncs.com/xxx_{index}.mp4</a>&quot;,
             *   &quot;Count&quot;: 20,
             *   &quot;MaxDuration&quot;: 15,
             *   &quot;Width&quot;: 1080,
             *   &quot;Height&quot;: 1920,
             *   &quot;Video&quot;: {&quot;Crf&quot;: 27}
             * }</p>
             */
            public Builder outputConfig(String outputConfig) {
                this.outputConfig = outputConfig;
                return this;
            }

            /**
             * <p>The job state.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Finished</li>
             * <li>Init</li>
             * <li>Failed</li>
             * <li>Processing</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The user-defined data in the JSON format, which can be up to 512 bytes in length. You can specify a custom callback URL. For more information, see <a href="https://help.aliyun.com/zh/ims/use-cases/to-configure-a-callback-when-a-clip-completes">Configure a callback upon editing completion</a>.</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public EditingBatchJobList build() {
                return new EditingBatchJobList(this);
            } 

        } 

    }
}
