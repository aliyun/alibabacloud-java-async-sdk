// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetRunningJobsResponseBody} extends {@link TeaModel}
 *
 * <p>GetRunningJobsResponseBody</p>
 */
public class GetRunningJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetRunningJobsResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRunningJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpCode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetRunningJobsResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <ul>
         * <li>If the value of success was false, an error code was returned.</li>
         * <li>If the value of success was true, a null value was returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>0A3B1FD2006A24C8D8BE65CDAC028298</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. If this parameter was not empty and the value of this parameter was not 200, the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc3b4ab16684833172127321e2c25</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRunningJobsResponseBody build() {
            return new GetRunningJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRunningJobsResponseBody} extends {@link TeaModel}
     *
     * <p>GetRunningJobsResponseBody</p>
     */
    public static class RunningJobInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cuSnapshot")
        private Double cuSnapshot;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("jobOwner")
        private String jobOwner;

        @com.aliyun.core.annotation.NameInMap("memorySnapshot")
        private Double memorySnapshot;

        @com.aliyun.core.annotation.NameInMap("progress")
        private Double progress;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("quotaNickname")
        private String quotaNickname;

        @com.aliyun.core.annotation.NameInMap("runningAtTime")
        private Long runningAtTime;

        @com.aliyun.core.annotation.NameInMap("submittedAtTime")
        private Long submittedAtTime;

        private RunningJobInfoList(Builder builder) {
            this.cuSnapshot = builder.cuSnapshot;
            this.instanceId = builder.instanceId;
            this.jobOwner = builder.jobOwner;
            this.memorySnapshot = builder.memorySnapshot;
            this.progress = builder.progress;
            this.project = builder.project;
            this.quotaNickname = builder.quotaNickname;
            this.runningAtTime = builder.runningAtTime;
            this.submittedAtTime = builder.submittedAtTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunningJobInfoList create() {
            return builder().build();
        }

        /**
         * @return cuSnapshot
         */
        public Double getCuSnapshot() {
            return this.cuSnapshot;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobOwner
         */
        public String getJobOwner() {
            return this.jobOwner;
        }

        /**
         * @return memorySnapshot
         */
        public Double getMemorySnapshot() {
            return this.memorySnapshot;
        }

        /**
         * @return progress
         */
        public Double getProgress() {
            return this.progress;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return quotaNickname
         */
        public String getQuotaNickname() {
            return this.quotaNickname;
        }

        /**
         * @return runningAtTime
         */
        public Long getRunningAtTime() {
            return this.runningAtTime;
        }

        /**
         * @return submittedAtTime
         */
        public Long getSubmittedAtTime() {
            return this.submittedAtTime;
        }

        public static final class Builder {
            private Double cuSnapshot; 
            private String instanceId; 
            private String jobOwner; 
            private Double memorySnapshot; 
            private Double progress; 
            private String project; 
            private String quotaNickname; 
            private Long runningAtTime; 
            private Long submittedAtTime; 

            private Builder() {
            } 

            private Builder(RunningJobInfoList model) {
                this.cuSnapshot = model.cuSnapshot;
                this.instanceId = model.instanceId;
                this.jobOwner = model.jobOwner;
                this.memorySnapshot = model.memorySnapshot;
                this.progress = model.progress;
                this.project = model.project;
                this.quotaNickname = model.quotaNickname;
                this.runningAtTime = model.runningAtTime;
                this.submittedAtTime = model.submittedAtTime;
            } 

            /**
             * <p>The compute unit (CU) snapshot proportion of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>0.45</p>
             */
            public Builder cuSnapshot(Double cuSnapshot) {
                this.cuSnapshot = cuSnapshot;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2023050206371544gomgtp3ljcr4</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The account that submits the job.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN$<a href="mailto:xxx@test.aliyunid.com">xxx@test.aliyunid.com</a></p>
             */
            public Builder jobOwner(String jobOwner) {
                this.jobOwner = jobOwner;
                return this;
            }

            /**
             * <p>The memory snapshot proportion of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>0.45</p>
             */
            public Builder memorySnapshot(Double memorySnapshot) {
                this.memorySnapshot = memorySnapshot;
                return this;
            }

            /**
             * <p>The progress of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder progress(Double progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The name of the MaxCompute project.</p>
             * 
             * <strong>example:</strong>
             * <p>project_20221021123044_981b</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The nickname of the quota that is used by the job.</p>
             * 
             * <strong>example:</strong>
             * <p>my_quota</p>
             */
            public Builder quotaNickname(String quotaNickname) {
                this.quotaNickname = quotaNickname;
                return this;
            }

            /**
             * <p>The time when the job starts to run.</p>
             * 
             * <strong>example:</strong>
             * <p>1689746864</p>
             */
            public Builder runningAtTime(Long runningAtTime) {
                this.runningAtTime = runningAtTime;
                return this;
            }

            /**
             * <p>The time when the job is submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>1689746864</p>
             */
            public Builder submittedAtTime(Long submittedAtTime) {
                this.submittedAtTime = submittedAtTime;
                return this;
            }

            public RunningJobInfoList build() {
                return new RunningJobInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRunningJobsResponseBody} extends {@link TeaModel}
     *
     * <p>GetRunningJobsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("runningJobInfoList")
        private java.util.List<RunningJobInfoList> runningJobInfoList;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.runningJobInfoList = builder.runningJobInfoList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return runningJobInfoList
         */
        public java.util.List<RunningJobInfoList> getRunningJobInfoList() {
            return this.runningJobInfoList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long pageNumber; 
            private Long pageSize; 
            private java.util.List<RunningJobInfoList> runningJobInfoList; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.runningJobInfoList = model.runningJobInfoList;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The list of jobs in the running state.</p>
             */
            public Builder runningJobInfoList(java.util.List<RunningJobInfoList> runningJobInfoList) {
                this.runningJobInfoList = runningJobInfoList;
                return this;
            }

            /**
             * <p>The total number of returned entries.</p>
             * 
             * <strong>example:</strong>
             * <p>64</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
