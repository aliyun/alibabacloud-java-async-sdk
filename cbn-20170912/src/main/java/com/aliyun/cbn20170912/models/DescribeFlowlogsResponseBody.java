// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeFlowlogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowlogsResponseBody</p>
 */
public class DescribeFlowlogsResponseBody extends TeaModel {
    @NameInMap("FlowLogs")
    private FlowLogs flowLogs;

    @NameInMap("PageNumber")
    private String pageNumber;

    @NameInMap("PageSize")
    private String pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    @NameInMap("TotalCount")
    private String totalCount;


    private DescribeFlowlogsResponseBody(Builder builder) {
        this.flowLogs = builder.flowLogs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowlogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return flowLogs
     */
    public FlowLogs getFlowLogs() {
        return this.flowLogs;
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
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private FlowLogs flowLogs; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String success; 
        private String totalCount; 

        /**
         * <p>FlowLogs.</p>
         */
        public Builder flowLogs(FlowLogs flowLogs) {
            this.flowLogs = flowLogs;
            return this;
        }

        /**
         * <p>PageNumber.</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>PageSize.</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Success.</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>TotalCount.</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeFlowlogsResponseBody build() {
            return new DescribeFlowlogsResponseBody(this);
        } 

    } 

    public static class FlowLog extends TeaModel {
        @NameInMap("CenId")
        private String cenId;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("FlowLogId")
        private String flowLogId;

        @NameInMap("FlowLogName")
        private String flowLogName;

        @NameInMap("LogStoreName")
        private String logStoreName;

        @NameInMap("ProjectName")
        private String projectName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;


        private FlowLog(Builder builder) {
            this.cenId = builder.cenId;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.flowLogId = builder.flowLogId;
            this.flowLogName = builder.flowLogName;
            this.logStoreName = builder.logStoreName;
            this.projectName = builder.projectName;
            this.regionId = builder.regionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowLog create() {
            return builder().build();
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return flowLogId
         */
        public String getFlowLogId() {
            return this.flowLogId;
        }

        /**
         * @return flowLogName
         */
        public String getFlowLogName() {
            return this.flowLogName;
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String cenId; 
            private String creationTime; 
            private String description; 
            private String flowLogId; 
            private String flowLogName; 
            private String logStoreName; 
            private String projectName; 
            private String regionId; 
            private String status; 

            /**
             * <p>CenId.</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>CreationTime.</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>FlowLogId.</p>
             */
            public Builder flowLogId(String flowLogId) {
                this.flowLogId = flowLogId;
                return this;
            }

            /**
             * <p>FlowLogName.</p>
             */
            public Builder flowLogName(String flowLogName) {
                this.flowLogName = flowLogName;
                return this;
            }

            /**
             * <p>LogStoreName.</p>
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * <p>ProjectName.</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>RegionId.</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Status.</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public FlowLog build() {
                return new FlowLog(this);
            } 

        } 

    }
    public static class FlowLogs extends TeaModel {
        @NameInMap("FlowLog")
        private java.util.List < FlowLog> flowLog;


        private FlowLogs(Builder builder) {
            this.flowLog = builder.flowLog;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowLogs create() {
            return builder().build();
        }

        /**
         * @return flowLog
         */
        public java.util.List < FlowLog> getFlowLog() {
            return this.flowLog;
        }

        public static final class Builder {
            private java.util.List < FlowLog> flowLog; 

            /**
             * <p>FlowLog.</p>
             */
            public Builder flowLog(java.util.List < FlowLog> flowLog) {
                this.flowLog = flowLog;
                return this;
            }

            public FlowLogs build() {
                return new FlowLogs(this);
            } 

        } 

    }
}
