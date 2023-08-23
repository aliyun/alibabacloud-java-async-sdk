// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRunningJobsResponseBody} extends {@link TeaModel}
 *
 * <p>GetRunningJobsResponseBody</p>
 */
public class GetRunningJobsResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMsg")
    private String errorMsg;

    @NameInMap("httpCode")
    private Integer httpCode;

    @NameInMap("requestId")
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

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * httpCode.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRunningJobsResponseBody build() {
            return new GetRunningJobsResponseBody(this);
        } 

    } 

    public static class RunningJobInfoList extends TeaModel {
        @NameInMap("cuSnapshot")
        private Double cuSnapshot;

        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("jobOwner")
        private String jobOwner;

        @NameInMap("memorySnapshot")
        private Double memorySnapshot;

        @NameInMap("progress")
        private Double progress;

        @NameInMap("project")
        private String project;

        @NameInMap("quotaNickname")
        private String quotaNickname;

        @NameInMap("runningAtTime")
        private Long runningAtTime;

        @NameInMap("submittedAtTime")
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

            /**
             * cuSnapshot.
             */
            public Builder cuSnapshot(Double cuSnapshot) {
                this.cuSnapshot = cuSnapshot;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * jobOwner.
             */
            public Builder jobOwner(String jobOwner) {
                this.jobOwner = jobOwner;
                return this;
            }

            /**
             * memorySnapshot.
             */
            public Builder memorySnapshot(Double memorySnapshot) {
                this.memorySnapshot = memorySnapshot;
                return this;
            }

            /**
             * progress.
             */
            public Builder progress(Double progress) {
                this.progress = progress;
                return this;
            }

            /**
             * project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * quotaNickname.
             */
            public Builder quotaNickname(String quotaNickname) {
                this.quotaNickname = quotaNickname;
                return this;
            }

            /**
             * runningAtTime.
             */
            public Builder runningAtTime(Long runningAtTime) {
                this.runningAtTime = runningAtTime;
                return this;
            }

            /**
             * submittedAtTime.
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
    public static class Data extends TeaModel {
        @NameInMap("pageNumber")
        private Long pageNumber;

        @NameInMap("pageSize")
        private Long pageSize;

        @NameInMap("runningJobInfoList")
        private java.util.List < RunningJobInfoList> runningJobInfoList;

        @NameInMap("totalCount")
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
        public java.util.List < RunningJobInfoList> getRunningJobInfoList() {
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
            private java.util.List < RunningJobInfoList> runningJobInfoList; 
            private Long totalCount; 

            /**
             * pageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * runningJobInfoList.
             */
            public Builder runningJobInfoList(java.util.List < RunningJobInfoList> runningJobInfoList) {
                this.runningJobInfoList = runningJobInfoList;
                return this;
            }

            /**
             * totalCount.
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
