// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSimilarSecurityEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSimilarSecurityEventsResponseBody</p>
 */
public class DescribeSimilarSecurityEventsResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityEventsResponse")
    private java.util.List < SecurityEventsResponse> securityEventsResponse;

    private DescribeSimilarSecurityEventsResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.securityEventsResponse = builder.securityEventsResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSimilarSecurityEventsResponseBody create() {
        return builder().build();
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

    /**
     * @return securityEventsResponse
     */
    public java.util.List < SecurityEventsResponse> getSecurityEventsResponse() {
        return this.securityEventsResponse;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List < SecurityEventsResponse> securityEventsResponse; 

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
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
         * An array consisting of the alert events that are triggered by the same rule or of the same alert type.
         */
        public Builder securityEventsResponse(java.util.List < SecurityEventsResponse> securityEventsResponse) {
            this.securityEventsResponse = securityEventsResponse;
            return this;
        }

        public DescribeSimilarSecurityEventsResponseBody build() {
            return new DescribeSimilarSecurityEventsResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
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
         * @return count
         */
        public Integer getCount() {
            return this.count;
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
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: **20**.
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
    public static class SecurityEventsResponse extends TeaModel {
        @NameInMap("EventName")
        private String eventName;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("LastTime")
        private Long lastTime;

        @NameInMap("OccurrenceTime")
        private Long occurrenceTime;

        @NameInMap("SecurityEventId")
        private Long securityEventId;

        @NameInMap("Uuid")
        private String uuid;

        private SecurityEventsResponse(Builder builder) {
            this.eventName = builder.eventName;
            this.eventType = builder.eventType;
            this.lastTime = builder.lastTime;
            this.occurrenceTime = builder.occurrenceTime;
            this.securityEventId = builder.securityEventId;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityEventsResponse create() {
            return builder().build();
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return lastTime
         */
        public Long getLastTime() {
            return this.lastTime;
        }

        /**
         * @return occurrenceTime
         */
        public Long getOccurrenceTime() {
            return this.occurrenceTime;
        }

        /**
         * @return securityEventId
         */
        public Long getSecurityEventId() {
            return this.securityEventId;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String eventName; 
            private String eventType; 
            private Long lastTime; 
            private Long occurrenceTime; 
            private Long securityEventId; 
            private String uuid; 

            /**
             * The name of the alert event.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * The alert type of the alert event. Valid values:
             * <p>
             * 
             * *   Suspicious process
             * *   Webshell
             * *   Unusual logon
             * *   Exception
             * *   Sensitive file tampering
             * *   Malicious process (cloud threat detection)
             * *   Suspicious network connection
             * *   Other
             * *   Abnormal account
             * *   Application intrusion event
             * *   Cloud threat detection
             * *   Precise defense
             * *   Application whitelist
             * *   Persistent webshell
             * *   Web application threat detection
             * *   Malicious script
             * *   Threat intelligence
             * *   Malicious network activity
             * *   Cluster exception
             * *   Webshell (on-premises threat detection)
             * *   Vulnerability exploitation
             * *   Malicious process (on-premises threat detection)
             * *   Trusted exception
             * 
             * For more information about alert types, see [Alerts](https://www.alibabacloud.com/help/en/security-center/latest/events-overview).
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * The timestamp when the alert event was last detected. Unit: milliseconds.
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * The timestamp when the alert event was first detected. Unit: milliseconds.
             */
            public Builder occurrenceTime(Long occurrenceTime) {
                this.occurrenceTime = occurrenceTime;
                return this;
            }

            /**
             * The ID of the alert event.
             */
            public Builder securityEventId(Long securityEventId) {
                this.securityEventId = securityEventId;
                return this;
            }

            /**
             * The UUID of the server that is affected by the alert event.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public SecurityEventsResponse build() {
                return new SecurityEventsResponse(this);
            } 

        } 

    }
}
