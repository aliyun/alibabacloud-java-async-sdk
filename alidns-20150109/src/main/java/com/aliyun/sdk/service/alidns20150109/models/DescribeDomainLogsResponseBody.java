// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainLogsResponseBody</p>
 */
public class DescribeDomainLogsResponseBody extends TeaModel {
    @NameInMap("DomainLogs")
    private DomainLogs domainLogs;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDomainLogsResponseBody(Builder builder) {
        this.domainLogs = builder.domainLogs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainLogs
     */
    public DomainLogs getDomainLogs() {
        return this.domainLogs;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private DomainLogs domainLogs; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The details about the operation logs that are queried.
         */
        public Builder domainLogs(DomainLogs domainLogs) {
            this.domainLogs = domainLogs;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of operation logs returned per page.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of operation logs returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDomainLogsResponseBody build() {
            return new DescribeDomainLogsResponseBody(this);
        } 

    } 

    public static class DomainLog extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("ActionTime")
        private String actionTime;

        @NameInMap("ActionTimestamp")
        private Long actionTimestamp;

        @NameInMap("ClientIp")
        private String clientIp;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("Message")
        private String message;

        @NameInMap("ZoneId")
        private String zoneId;

        private DomainLog(Builder builder) {
            this.action = builder.action;
            this.actionTime = builder.actionTime;
            this.actionTimestamp = builder.actionTimestamp;
            this.clientIp = builder.clientIp;
            this.domainName = builder.domainName;
            this.message = builder.message;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainLog create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return actionTime
         */
        public String getActionTime() {
            return this.actionTime;
        }

        /**
         * @return actionTimestamp
         */
        public Long getActionTimestamp() {
            return this.actionTimestamp;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String action; 
            private String actionTime; 
            private Long actionTimestamp; 
            private String clientIp; 
            private String domainName; 
            private String message; 
            private String zoneId; 

            /**
             * The operation performed.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The time when the operation was performed.
             */
            public Builder actionTime(String actionTime) {
                this.actionTime = actionTime;
                return this;
            }

            /**
             * The UNIX timestamp that indicates when the operation was performed.
             */
            public Builder actionTimestamp(Long actionTimestamp) {
                this.actionTimestamp = actionTimestamp;
                return this;
            }

            /**
             * The IP address from which the operation was performed.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The message for the operation.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The ID of the zone.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DomainLog build() {
                return new DomainLog(this);
            } 

        } 

    }
    public static class DomainLogs extends TeaModel {
        @NameInMap("DomainLog")
        private java.util.List < DomainLog> domainLog;

        private DomainLogs(Builder builder) {
            this.domainLog = builder.domainLog;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainLogs create() {
            return builder().build();
        }

        /**
         * @return domainLog
         */
        public java.util.List < DomainLog> getDomainLog() {
            return this.domainLog;
        }

        public static final class Builder {
            private java.util.List < DomainLog> domainLog; 

            /**
             * DomainLog.
             */
            public Builder domainLog(java.util.List < DomainLog> domainLog) {
                this.domainLog = domainLog;
                return this;
            }

            public DomainLogs build() {
                return new DomainLogs(this);
            } 

        } 

    }
}
