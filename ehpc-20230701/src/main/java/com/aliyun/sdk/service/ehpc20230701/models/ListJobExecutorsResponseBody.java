// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20230701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobExecutorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobExecutorsResponseBody</p>
 */
public class ListJobExecutorsResponseBody extends TeaModel {
    @NameInMap("Executors")
    private java.util.List < Executors> executors;

    @NameInMap("JobId")
    private String jobId;

    @NameInMap("PageNumber")
    private String pageNumber;

    @NameInMap("PageSize")
    private String pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskName")
    private String taskName;

    @NameInMap("TotalCount")
    private String totalCount;

    private ListJobExecutorsResponseBody(Builder builder) {
        this.executors = builder.executors;
        this.jobId = builder.jobId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.taskName = builder.taskName;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobExecutorsResponseBody create() {
        return builder().build();
    }

    /**
     * @return executors
     */
    public java.util.List < Executors> getExecutors() {
        return this.executors;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Executors> executors; 
        private String jobId; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String taskName; 
        private String totalCount; 

        /**
         * Executors.
         */
        public Builder executors(java.util.List < Executors> executors) {
            this.executors = executors;
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
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListJobExecutorsResponseBody build() {
            return new ListJobExecutorsResponseBody(this);
        } 

    } 

    public static class Executors extends TeaModel {
        @NameInMap("ArrayIndex")
        private Integer arrayIndex;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("HostName")
        private java.util.List < String > hostName;

        @NameInMap("IpAddress")
        private java.util.List < String > ipAddress;

        @NameInMap("Status")
        private String status;

        private Executors(Builder builder) {
            this.arrayIndex = builder.arrayIndex;
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.hostName = builder.hostName;
            this.ipAddress = builder.ipAddress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Executors create() {
            return builder().build();
        }

        /**
         * @return arrayIndex
         */
        public Integer getArrayIndex() {
            return this.arrayIndex;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return hostName
         */
        public java.util.List < String > getHostName() {
            return this.hostName;
        }

        /**
         * @return ipAddress
         */
        public java.util.List < String > getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer arrayIndex; 
            private String createTime; 
            private String endTime; 
            private java.util.List < String > hostName; 
            private java.util.List < String > ipAddress; 
            private String status; 

            /**
             * ArrayIndex.
             */
            public Builder arrayIndex(Integer arrayIndex) {
                this.arrayIndex = arrayIndex;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(java.util.List < String > hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * IpAddress.
             */
            public Builder ipAddress(java.util.List < String > ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Executors build() {
                return new Executors(this);
            } 

        } 

    }
}
