// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link QueryStreamPushJobListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryStreamPushJobListResponseBody</p>
 */
public class QueryStreamPushJobListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryStreamPushJobListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryStreamPushJobListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryStreamPushJobListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. Valid values:</p>
         * <ul>
         * <li><strong>200</strong>: The call was successful.</li>
         * <li>Other values: error codes. For more information, see <a href="https://help.aliyun.com/document_detail/145071.html">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned if the call is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Request parameter error.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E55<em><strong>B7-4</strong></em>-4***-8***-D3******F565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryStreamPushJobListResponseBody build() {
            return new QueryStreamPushJobListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryStreamPushJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryStreamPushJobListResponseBody</p>
     */
    public static class JobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Integer createTime;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private Integer jobType;

        @com.aliyun.core.annotation.NameInMap("PushStatus")
        private Integer pushStatus;

        @com.aliyun.core.annotation.NameInMap("PushUrl")
        private String pushUrl;

        @com.aliyun.core.annotation.NameInMap("StreamType")
        private Integer streamType;

        private JobList(Builder builder) {
            this.createTime = builder.createTime;
            this.jobId = builder.jobId;
            this.jobType = builder.jobType;
            this.pushStatus = builder.pushStatus;
            this.pushUrl = builder.pushUrl;
            this.streamType = builder.streamType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Integer getCreateTime() {
            return this.createTime;
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
        public Integer getJobType() {
            return this.jobType;
        }

        /**
         * @return pushStatus
         */
        public Integer getPushStatus() {
            return this.pushStatus;
        }

        /**
         * @return pushUrl
         */
        public String getPushUrl() {
            return this.pushUrl;
        }

        /**
         * @return streamType
         */
        public Integer getStreamType() {
            return this.streamType;
        }

        public static final class Builder {
            private Integer createTime; 
            private String jobId; 
            private Integer jobType; 
            private Integer pushStatus; 
            private String pushUrl; 
            private Integer streamType; 

            private Builder() {
            } 

            private Builder(JobList model) {
                this.createTime = model.createTime;
                this.jobId = model.jobId;
                this.jobType = model.jobType;
                this.pushStatus = model.pushStatus;
                this.pushUrl = model.pushUrl;
                this.streamType = model.streamType;
            } 

            /**
             * <p>The time when the job was created. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1581595942</p>
             */
            public Builder createTime(Integer createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>23********</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The type of the stream push job. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: continuous job.</li>
             * <li><strong>2</strong>: triggered job. The job ends after it is interrupted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder jobType(Integer jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The current stream push status. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: pushing.</li>
             * <li><strong>2</strong>: waiting to push.</li>
             * <li><strong>3</strong>: push ended.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pushStatus(Integer pushStatus) {
                this.pushStatus = pushStatus;
                return this;
            }

            /**
             * <p>The stream push URL.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://****</p>
             */
            public Builder pushUrl(String pushUrl) {
                this.pushUrl = pushUrl;
                return this;
            }

            /**
             * <p>The stream type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: main stream.</li>
             * <li><strong>1</strong>: sub stream.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder streamType(Integer streamType) {
                this.streamType = streamType;
                return this;
            }

            public JobList build() {
                return new JobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryStreamPushJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryStreamPushJobListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobList")
        private java.util.List<JobList> jobList;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.jobList = builder.jobList;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return jobList
         */
        public java.util.List<JobList> getJobList() {
            return this.jobList;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<JobList> jobList; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.jobList = model.jobList;
                this.total = model.total;
            } 

            /**
             * <p>The job list information.</p>
             */
            public Builder jobList(java.util.List<JobList> jobList) {
                this.jobList = jobList;
                return this;
            }

            /**
             * <p>The total number of jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
