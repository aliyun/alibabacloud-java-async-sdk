// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFileProtectEventResponseBody} extends {@link TeaModel}
 *
 * <p>ListFileProtectEventResponseBody</p>
 */
public class ListFileProtectEventResponseBody extends TeaModel {
    @NameInMap("EventList")
    private java.util.List < EventList> eventList;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private ListFileProtectEventResponseBody(Builder builder) {
        this.eventList = builder.eventList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFileProtectEventResponseBody create() {
        return builder().build();
    }

    /**
     * @return eventList
     */
    public java.util.List < EventList> getEventList() {
        return this.eventList;
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
        private java.util.List < EventList> eventList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The events.
         */
        public Builder eventList(java.util.List < EventList> eventList) {
            this.eventList = eventList;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFileProtectEventResponseBody build() {
            return new ListFileProtectEventResponseBody(this);
        } 

    } 

    public static class EventList extends TeaModel {
        @NameInMap("AlertLevel")
        private Integer alertLevel;

        @NameInMap("CmdLine")
        private String cmdLine;

        @NameInMap("FilePath")
        private String filePath;

        @NameInMap("HandleTime")
        private Long handleTime;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("LatestTime")
        private Long latestTime;

        @NameInMap("Operation")
        private String operation;

        @NameInMap("ProcPath")
        private String procPath;

        @NameInMap("ProcPermission")
        private String procPermission;

        @NameInMap("ProcessId")
        private String processId;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Uuid")
        private String uuid;

        private EventList(Builder builder) {
            this.alertLevel = builder.alertLevel;
            this.cmdLine = builder.cmdLine;
            this.filePath = builder.filePath;
            this.handleTime = builder.handleTime;
            this.id = builder.id;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.latestTime = builder.latestTime;
            this.operation = builder.operation;
            this.procPath = builder.procPath;
            this.procPermission = builder.procPermission;
            this.processId = builder.processId;
            this.remark = builder.remark;
            this.ruleName = builder.ruleName;
            this.status = builder.status;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventList create() {
            return builder().build();
        }

        /**
         * @return alertLevel
         */
        public Integer getAlertLevel() {
            return this.alertLevel;
        }

        /**
         * @return cmdLine
         */
        public String getCmdLine() {
            return this.cmdLine;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return handleTime
         */
        public Long getHandleTime() {
            return this.handleTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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
         * @return latestTime
         */
        public Long getLatestTime() {
            return this.latestTime;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return procPath
         */
        public String getProcPath() {
            return this.procPath;
        }

        /**
         * @return procPermission
         */
        public String getProcPermission() {
            return this.procPermission;
        }

        /**
         * @return processId
         */
        public String getProcessId() {
            return this.processId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Integer alertLevel; 
            private String cmdLine; 
            private String filePath; 
            private Long handleTime; 
            private Long id; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Long latestTime; 
            private String operation; 
            private String procPath; 
            private String procPermission; 
            private String processId; 
            private String remark; 
            private String ruleName; 
            private Integer status; 
            private String uuid; 

            /**
             * The severity of the alert. Valid values:
             * <p>
             * 
             * *   0: does not generate alerts
             * *   1: sends notifications
             * *   2: suspicious
             * *   3: high-risk
             */
            public Builder alertLevel(Integer alertLevel) {
                this.alertLevel = alertLevel;
                return this;
            }

            /**
             * The command line of the event.
             */
            public Builder cmdLine(String cmdLine) {
                this.cmdLine = cmdLine;
                return this;
            }

            /**
             * The path to the file.
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * The time when the event was handled.
             */
            public Builder handleTime(Long handleTime) {
                this.handleTime = handleTime;
                return this;
            }

            /**
             * The ID of the event.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the server.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address of the server.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address of the asset.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The time when the event last occurred.
             */
            public Builder latestTime(Long latestTime) {
                this.latestTime = latestTime;
                return this;
            }

            /**
             * The operation performed by the process on the file.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * The path to the process.
             */
            public Builder procPath(String procPath) {
                this.procPath = procPath;
                return this;
            }

            /**
             * The permissions required to start the process.
             */
            public Builder procPermission(String procPermission) {
                this.procPermission = procPermission;
                return this;
            }

            /**
             * The process ID (PID) of the event process.
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * The remarks.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The name of the rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The status of the event. Valid values:
             * <p>
             * 
             * *   0: unhandled
             * *   1: handled
             * *   2: added to the whitelist
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The UUID of the server that is associated with the process.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public EventList build() {
                return new EventList(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
             * The page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
