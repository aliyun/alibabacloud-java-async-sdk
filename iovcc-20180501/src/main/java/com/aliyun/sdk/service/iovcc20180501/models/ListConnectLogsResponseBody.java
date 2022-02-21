// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConnectLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConnectLogsResponseBody</p>
 */
public class ListConnectLogsResponseBody extends TeaModel {
    @NameInMap("Logs")
    private Logs logs;

    @NameInMap("RequestId")
    private String requestId;

    private ListConnectLogsResponseBody(Builder builder) {
        this.logs = builder.logs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConnectLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return logs
     */
    public Logs getLogs() {
        return this.logs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Logs logs; 
        private String requestId; 

        /**
         * Logs.
         */
        public Builder logs(Logs logs) {
            this.logs = logs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListConnectLogsResponseBody build() {
            return new ListConnectLogsResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("NetWorking")
        private String netWorking;

        @NameInMap("Sid")
        private String sid;

        @NameInMap("Status")
        private String status;

        @NameInMap("SystemVersion")
        private String systemVersion;

        @NameInMap("Terminal")
        private String terminal;

        @NameInMap("Time")
        private Long time;

        private List(Builder builder) {
            this.deviceId = builder.deviceId;
            this.ip = builder.ip;
            this.netWorking = builder.netWorking;
            this.sid = builder.sid;
            this.status = builder.status;
            this.systemVersion = builder.systemVersion;
            this.terminal = builder.terminal;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return netWorking
         */
        public String getNetWorking() {
            return this.netWorking;
        }

        /**
         * @return sid
         */
        public String getSid() {
            return this.sid;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return systemVersion
         */
        public String getSystemVersion() {
            return this.systemVersion;
        }

        /**
         * @return terminal
         */
        public String getTerminal() {
            return this.terminal;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private String deviceId; 
            private String ip; 
            private String netWorking; 
            private String sid; 
            private String status; 
            private String systemVersion; 
            private String terminal; 
            private Long time; 

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * NetWorking.
             */
            public Builder netWorking(String netWorking) {
                this.netWorking = netWorking;
                return this;
            }

            /**
             * Sid.
             */
            public Builder sid(String sid) {
                this.sid = sid;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SystemVersion.
             */
            public Builder systemVersion(String systemVersion) {
                this.systemVersion = systemVersion;
                return this;
            }

            /**
             * Terminal.
             */
            public Builder terminal(String terminal) {
                this.terminal = terminal;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Pagination extends TeaModel {
        @NameInMap("PageIndex")
        private Integer pageIndex;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("TotalPageCount")
        private Integer totalPageCount;

        private Pagination(Builder builder) {
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.totalPageCount = builder.totalPageCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pagination create() {
            return builder().build();
        }

        /**
         * @return pageIndex
         */
        public Integer getPageIndex() {
            return this.pageIndex;
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

        /**
         * @return totalPageCount
         */
        public Integer getTotalPageCount() {
            return this.totalPageCount;
        }

        public static final class Builder {
            private Integer pageIndex; 
            private Integer pageSize; 
            private Integer totalCount; 
            private Integer totalPageCount; 

            /**
             * PageIndex.
             */
            public Builder pageIndex(Integer pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalPageCount.
             */
            public Builder totalPageCount(Integer totalPageCount) {
                this.totalPageCount = totalPageCount;
                return this;
            }

            public Pagination build() {
                return new Pagination(this);
            } 

        } 

    }
    public static class Logs extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("Pagination")
        private Pagination pagination;

        private Logs(Builder builder) {
            this.list = builder.list;
            this.pagination = builder.pagination;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Pagination pagination; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * Pagination.
             */
            public Builder pagination(Pagination pagination) {
                this.pagination = pagination;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
}
