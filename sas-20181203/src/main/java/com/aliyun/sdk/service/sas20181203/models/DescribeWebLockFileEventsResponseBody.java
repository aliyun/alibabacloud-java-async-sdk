// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeWebLockFileEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebLockFileEventsResponseBody</p>
 */
public class DescribeWebLockFileEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List < List> list;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeWebLockFileEventsResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.list = builder.list;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebLockFileEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List < List> list; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>An array that consists of events on web tamper proofing returned.</p>
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>79CFF74D-E967-5407-8A78-EE03B925FDAA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of events on web tamper proofing returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWebLockFileEventsResponseBody build() {
            return new DescribeWebLockFileEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWebLockFileEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebLockFileEventsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Ds")
        private Long ds;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("EventStatus")
        private String eventStatus;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("GmtEvent")
        private Long gmtEvent;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("ProcessName")
        private String processName;

        @com.aliyun.core.annotation.NameInMap("ProcessPath")
        private String processPath;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private List(Builder builder) {
            this.count = builder.count;
            this.ds = builder.ds;
            this.eventName = builder.eventName;
            this.eventStatus = builder.eventStatus;
            this.eventType = builder.eventType;
            this.gmtEvent = builder.gmtEvent;
            this.id = builder.id;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.ip = builder.ip;
            this.level = builder.level;
            this.path = builder.path;
            this.processName = builder.processName;
            this.processPath = builder.processPath;
            this.status = builder.status;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return ds
         */
        public Long getDs() {
            return this.ds;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventStatus
         */
        public String getEventStatus() {
            return this.eventStatus;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return gmtEvent
         */
        public Long getGmtEvent() {
            return this.gmtEvent;
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
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return processName
         */
        public String getProcessName() {
            return this.processName;
        }

        /**
         * @return processPath
         */
        public String getProcessPath() {
            return this.processPath;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Long count; 
            private Long ds; 
            private String eventName; 
            private String eventStatus; 
            private String eventType; 
            private Long gmtEvent; 
            private Long id; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String ip; 
            private String level; 
            private String path; 
            private String processName; 
            private String processPath; 
            private String status; 
            private String uuid; 

            /**
             * <p>The number of attempts.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The timestamp at which the event on web tamper proofing was first detected.</p>
             * 
             * <strong>example:</strong>
             * <p>1657178400000</p>
             */
            public Builder ds(Long ds) {
                this.ds = ds;
                return this;
            }

            /**
             * <p>The name of the event on web tamper proofing.</p>
             * 
             * <strong>example:</strong>
             * <p>modify</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The status of the event on web tamper proofing. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: unhandled</li>
             * <li><strong>2</strong>: ignored</li>
             * <li><strong>4</strong>: deprecated</li>
             * <li><strong>8</strong>: marked as false positive</li>
             * <li><strong>10</strong>: added to the whitelist</li>
             * <li><strong>16</strong>: handling</li>
             * <li><strong>32</strong>: defended</li>
             * <li><strong>64</strong>: invalid</li>
             * <li><strong>128</strong>: deleted</li>
             * <li><strong>512</strong>: automatically handled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder eventStatus(String eventStatus) {
                this.eventStatus = eventStatus;
                return this;
            }

            /**
             * <p>The prevention mode. Valid values:</p>
             * <ul>
             * <li><strong>audit</strong>: Interception Mode</li>
             * <li><strong>web_lock</strong>: Alert Mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>audit</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The timestamp at which the event on web tamper proofing was last detected.</p>
             * 
             * <strong>example:</strong>
             * <p>1657178400000</p>
             */
            public Builder gmtEvent(Long gmtEvent) {
                this.gmtEvent = gmtEvent;
                return this;
            }

            /**
             * <p>The ID of the event on web tamper proofing.</p>
             * 
             * <strong>example:</strong>
             * <p>3555953980</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>sql-test-001</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the affected asset.</p>
             * 
             * <strong>example:</strong>
             * <p>8.210.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>172.25.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The IP address of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>8.210.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The severity of the event on web tamper proofing. Valid values: <strong>medium</strong></p>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The file path.</p>
             * 
             * <strong>example:</strong>
             * <p>D:\test-tamper-proofing\123.html</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The name of the process.</p>
             * 
             * <strong>example:</strong>
             * <p>python3.7</p>
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * <p>The path to the process.</p>
             * 
             * <strong>example:</strong>
             * <p>C:\Windows\explorer.exe</p>
             */
            public Builder processPath(String processPath) {
                this.processPath = processPath;
                return this;
            }

            /**
             * <p>The status of the event on web tamper proofing. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: unhandled</li>
             * <li><strong>2</strong>: ignored</li>
             * <li><strong>4</strong>: deprecated</li>
             * <li><strong>8</strong>: marked as false positive</li>
             * <li><strong>10</strong>: added to the whitelist</li>
             * <li><strong>16</strong>: handling</li>
             * <li><strong>32</strong>: defended</li>
             * <li><strong>64</strong>: invalid</li>
             * <li><strong>128</strong>: deleted</li>
             * <li><strong>512</strong>: automatically handled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The UUID of the asset.</p>
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
}
