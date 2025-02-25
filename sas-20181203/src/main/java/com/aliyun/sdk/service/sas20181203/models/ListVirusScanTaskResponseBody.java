// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListVirusScanTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListVirusScanTaskResponseBody</p>
 */
public class ListVirusScanTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListVirusScanTaskResponseBody(Builder builder) {
        this.list = builder.list;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirusScanTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<List> list; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>The returned virus scan tasks.</p>
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB3936FA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListVirusScanTaskResponseBody build() {
            return new ListVirusScanTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVirusScanTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusScanTaskResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("ScanPath")
        private java.util.List<String> scanPath;

        @com.aliyun.core.annotation.NameInMap("ScanType")
        private String scanType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private List(Builder builder) {
            this.endTime = builder.endTime;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.progress = builder.progress;
            this.scanPath = builder.scanPath;
            this.scanType = builder.scanType;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return scanPath
         */
        public java.util.List<String> getScanPath() {
            return this.scanPath;
        }

        /**
         * @return scanType
         */
        public String getScanType() {
            return this.scanType;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Long endTime; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Integer progress; 
            private java.util.List<String> scanPath; 
            private String scanType; 
            private Long startTime; 
            private Integer status; 
            private String taskId; 
            private String taskName; 
            private String uuid; 

            /**
             * <p>The timestamp when the virus scan task ended. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1662343860051</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The name of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>sql-test-0****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>8.210.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>172.25.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The progress of the task in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>62</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The information about the file that is scanned.</p>
             */
            public Builder scanPath(java.util.List<String> scanPath) {
                this.scanPath = scanPath;
                return this;
            }

            /**
             * <p>The type of the virus scan task. Valid values:</p>
             * <ul>
             * <li><strong>system</strong>: automatic scan task</li>
             * <li><strong>user</strong>: custom scan task</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder scanType(String scanType) {
                this.scanType = scanType;
                return this;
            }

            /**
             * <p>The timestamp when the virus scan task started. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1651290987000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the virus scan task. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: running</li>
             * <li><strong>2</strong>: complete</li>
             * <li><strong>3</strong>: failed</li>
             * <li><strong>4</strong>: timed out</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the virus scan task.</p>
             * 
             * <strong>example:</strong>
             * <p>2e75557bfa570381f5c516cad9b6xxxx</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The name of the virus scan task.</p>
             * <ul>
             * <li>The value is fixed as <strong>VIRUS_VUL_SCHEDULE_SCAN</strong>, which indicates a virus scan task.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VIRUS_VUL_SCHEDULE_SCAN</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>49e25e0f-bb51-4a5a-a1b3-13a4ddaa****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVirusScanTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusScanTaskResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>224</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
