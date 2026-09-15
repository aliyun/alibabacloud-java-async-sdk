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
 * {@link ListFileProtectClientEventResponseBody} extends {@link TeaModel}
 *
 * <p>ListFileProtectClientEventResponseBody</p>
 */
public class ListFileProtectClientEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventList")
    private java.util.List<EventList> eventList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFileProtectClientEventResponseBody(Builder builder) {
        this.eventList = builder.eventList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFileProtectClientEventResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventList
     */
    public java.util.List<EventList> getEventList() {
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
        private java.util.List<EventList> eventList; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListFileProtectClientEventResponseBody model) {
            this.eventList = model.eventList;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The file monitoring events.</p>
         */
        public Builder eventList(java.util.List<EventList> eventList) {
            this.eventList = eventList;
            return this;
        }

        /**
         * <p>The pagination information of the query result.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>ACF97412-FD09-4D1F-994F-34DF12B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFileProtectClientEventResponseBody build() {
            return new ListFileProtectClientEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFileProtectClientEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListFileProtectClientEventResponseBody</p>
     */
    public static class EventList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertLevel")
        private Integer alertLevel;

        @com.aliyun.core.annotation.NameInMap("CmdLine")
        private String cmdLine;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("FirstTime")
        private Long firstTime;

        @com.aliyun.core.annotation.NameInMap("HandleTime")
        private Long handleTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("LatestTime")
        private Long latestTime;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ProcPath")
        private String procPath;

        @com.aliyun.core.annotation.NameInMap("ProcPermission")
        private String procPermission;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("RuleAction")
        private String ruleAction;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private EventList(Builder builder) {
            this.alertLevel = builder.alertLevel;
            this.cmdLine = builder.cmdLine;
            this.count = builder.count;
            this.filePath = builder.filePath;
            this.firstTime = builder.firstTime;
            this.handleTime = builder.handleTime;
            this.id = builder.id;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.latestTime = builder.latestTime;
            this.operation = builder.operation;
            this.platform = builder.platform;
            this.procPath = builder.procPath;
            this.procPermission = builder.procPermission;
            this.processId = builder.processId;
            this.remark = builder.remark;
            this.ruleAction = builder.ruleAction;
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
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return firstTime
         */
        public Long getFirstTime() {
            return this.firstTime;
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
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
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
         * @return ruleAction
         */
        public String getRuleAction() {
            return this.ruleAction;
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
            private Integer count; 
            private String filePath; 
            private Long firstTime; 
            private Long handleTime; 
            private Long id; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Long latestTime; 
            private String operation; 
            private String platform; 
            private String procPath; 
            private String procPermission; 
            private String processId; 
            private String remark; 
            private String ruleAction; 
            private String ruleName; 
            private Integer status; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(EventList model) {
                this.alertLevel = model.alertLevel;
                this.cmdLine = model.cmdLine;
                this.count = model.count;
                this.filePath = model.filePath;
                this.firstTime = model.firstTime;
                this.handleTime = model.handleTime;
                this.id = model.id;
                this.instanceName = model.instanceName;
                this.internetIp = model.internetIp;
                this.intranetIp = model.intranetIp;
                this.latestTime = model.latestTime;
                this.operation = model.operation;
                this.platform = model.platform;
                this.procPath = model.procPath;
                this.procPermission = model.procPermission;
                this.processId = model.processId;
                this.remark = model.remark;
                this.ruleAction = model.ruleAction;
                this.ruleName = model.ruleName;
                this.status = model.status;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The alert notification level. Valid values:</p>
             * <ul>
             * <li><p>0: no alert</p>
             * </li>
             * <li><p>1: reminder</p>
             * </li>
             * <li><p>2: suspicious</p>
             * </li>
             * <li><p>3: high-risk</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder alertLevel(Integer alertLevel) {
                this.alertLevel = alertLevel;
                return this;
            }

            /**
             * <p>The command line of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;touch&quot;,&quot;/test/aaaa&quot;]</p>
             */
            public Builder cmdLine(String cmdLine) {
                this.cmdLine = cmdLine;
                return this;
            }

            /**
             * <p>The number of times the event occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The file path.</p>
             * 
             * <strong>example:</strong>
             * <p>/data/*</p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>The timestamp when the event was first detected. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1694576692000</p>
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * <p>The time when the event was handled. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1694576692000</p>
             */
            public Builder handleTime(Long handleTime) {
                this.handleTime = handleTime;
                return this;
            }

            /**
             * <p>The event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3719</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the server instance.</p>
             * 
             * <strong>example:</strong>
             * <p>kyy-admin-01</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>121.40.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.22.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The most recent time when the event occurred. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1694576692000</p>
             */
            public Builder latestTime(Long latestTime) {
                this.latestTime = latestTime;
                return this;
            }

            /**
             * <p>The type of operation performed on the file. Valid values:</p>
             * <ul>
             * <li><strong>DELETE</strong>: File deletion.</li>
             * <li><strong>WRITE</strong>: File write.</li>
             * <li><strong>READ</strong>: File read.</li>
             * <li><strong>RENAME</strong>: File rename.</li>
             * <li><strong>CHOWN</strong>: Setting the file owner and file group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DELETE</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * <p>The operating system type. Valid values:</p>
             * <ul>
             * <li><strong>windows</strong>: Windows.</li>
             * <li><strong>linux</strong>: Linux.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The process path.</p>
             * 
             * <strong>example:</strong>
             * <p>c:/<em>Unity</em></p>
             */
            public Builder procPath(String procPath) {
                this.procPath = procPath;
                return this;
            }

            /**
             * <p>The process permission.</p>
             * 
             * <strong>example:</strong>
             * <p>rwxr-xr-x</p>
             */
            public Builder procPermission(String procPermission) {
                this.procPermission = procPermission;
                return this;
            }

            /**
             * <p>The process ID of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>52636</p>
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The rule action. Valid values:</p>
             * <ul>
             * <li><p><strong>block</strong>: Block.</p>
             * </li>
             * <li><p><strong>monitor</strong>: Monitor.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder ruleAction(String ruleAction) {
                this.ruleAction = ruleAction;
                return this;
            }

            /**
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-rule-1</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The event status. Valid values:</p>
             * <ul>
             * <li>0: Unhandled. </li>
             * <li>1: Handled.</li>
             * <li>2: Whitelisted.</li>
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
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>94b44720-d982-4d20-a4e1-80a1a57b****</p>
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
    /**
     * 
     * {@link ListFileProtectClientEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListFileProtectClientEventResponseBody</p>
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of the page to return in a paged query.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The maximum number of entries to return on each page in a paged query.</p>
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
             * <p>263</p>
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
