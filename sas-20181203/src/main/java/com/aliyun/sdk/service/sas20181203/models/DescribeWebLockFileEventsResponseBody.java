// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebLockFileEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebLockFileEventsResponseBody</p>
 */
public class DescribeWebLockFileEventsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("List")
    private java.util.List < List> list;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * The page number of the returned page.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * An array that consists of events on web tamper proofing returned.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of events on web tamper proofing returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWebLockFileEventsResponseBody build() {
            return new DescribeWebLockFileEventsResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("Ds")
        private Long ds;

        @NameInMap("EventName")
        private String eventName;

        @NameInMap("EventStatus")
        private String eventStatus;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("GmtEvent")
        private Long gmtEvent;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Level")
        private String level;

        @NameInMap("Path")
        private String path;

        @NameInMap("ProcessName")
        private String processName;

        @NameInMap("ProcessPath")
        private String processPath;

        @NameInMap("Status")
        private String status;

        @NameInMap("Uuid")
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
             * The number of attempts.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The timestamp at which the event on web tamper proofing was first detected.
             */
            public Builder ds(Long ds) {
                this.ds = ds;
                return this;
            }

            /**
             * The name of the event on web tamper proofing.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * The status of the event on web tamper proofing. Valid values:
             * <p>
             * 
             * *   **1**: unhandled
             * *   **2**: ignored
             * *   **4**: deprecated
             * *   **8**: marked as false positive
             * *   **10**: added to the whitelist
             * *   **16**: handling
             * *   **32**: defended
             * *   **64**: invalid
             * *   **128**: deleted
             * *   **512**: automatically handled
             */
            public Builder eventStatus(String eventStatus) {
                this.eventStatus = eventStatus;
                return this;
            }

            /**
             * The prevention mode. Valid values:
             * <p>
             * 
             * *   **audit**: Interception Mode
             * *   **web_lock**: Alert Mode
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * The timestamp at which the event on web tamper proofing was last detected.
             */
            public Builder gmtEvent(Long gmtEvent) {
                this.gmtEvent = gmtEvent;
                return this;
            }

            /**
             * The ID of the event on web tamper proofing.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the asset.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address of the affected asset.
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
             * The IP address of the asset.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The severity of the event on web tamper proofing. Valid values: **medium**
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The file path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The name of the process.
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * The path to the process.
             */
            public Builder processPath(String processPath) {
                this.processPath = processPath;
                return this;
            }

            /**
             * The status of the event on web tamper proofing. Valid values:
             * <p>
             * 
             * *   **1**: unhandled
             * *   **2**: ignored
             * *   **4**: deprecated
             * *   **8**: marked as false positive
             * *   **10**: added to the whitelist
             * *   **16**: handling
             * *   **32**: defended
             * *   **64**: invalid
             * *   **128**: deleted
             * *   **512**: automatically handled
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The UUID of the asset.
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
