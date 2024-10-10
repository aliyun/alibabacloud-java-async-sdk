// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSimilarSecurityEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSimilarSecurityEventsResponseBody</p>
 */
public class DescribeSimilarSecurityEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityEventsResponse")
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
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9F4217C8-763F-51EF-84D4-5535E072B2D8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the alert events that are triggered by the same rule or of the same alert type.</p>
         */
        public Builder securityEventsResponse(java.util.List < SecurityEventsResponse> securityEventsResponse) {
            this.securityEventsResponse = securityEventsResponse;
            return this;
        }

        public DescribeSimilarSecurityEventsResponseBody build() {
            return new DescribeSimilarSecurityEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSimilarSecurityEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSimilarSecurityEventsResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
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
             * <p>5</p>
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
    /**
     * 
     * {@link DescribeSimilarSecurityEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSimilarSecurityEventsResponseBody</p>
     */
    public static class SecurityEventsResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("LastTime")
        private Long lastTime;

        @com.aliyun.core.annotation.NameInMap("OccurrenceTime")
        private Long occurrenceTime;

        @com.aliyun.core.annotation.NameInMap("SecurityEventId")
        private Long securityEventId;

        @com.aliyun.core.annotation.NameInMap("Uuid")
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
             * <p>The name of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>Trojan</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The type of the alert event. Valid values:</p>
             * <ul>
             * <li>Suspicious Process</li>
             * <li>Webshell</li>
             * <li>Unusual Logon</li>
             * <li>Malicious Software</li>
             * <li>Sensitive File Tampering</li>
             * <li>Unusual Network Connection</li>
             * <li>Other</li>
             * <li>Suspicious Account</li>
             * <li>Cloud threat detection</li>
             * <li>Precision defense</li>
             * <li>Application Whitelist</li>
             * <li>Persistence</li>
             * <li>Web Application Threat Detection</li>
             * <li>Malicious scripts</li>
             * <li>Malicious Network Activity</li>
             * <li>K8s Abnormal Behavior</li>
             * <li>Website backdoor (local engine)</li>
             * <li>Exploit</li>
             * <li>Image Scan</li>
             * <li>Trusted exception</li>
             * </ul>
             * <p>For more information about alert types, see <a href="https://help.aliyun.com/document_detail/68388.html">Overview</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Malicious Software</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The timestamp generated when the alert event was last detected. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1648544361480</p>
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * <p>The timestamp generated when the alert event was first detected. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1648457961000</p>
             */
            public Builder occurrenceTime(Long occurrenceTime) {
                this.occurrenceTime = occurrenceTime;
                return this;
            }

            /**
             * <p>The ID of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>158661</p>
             */
            public Builder securityEventId(Long securityEventId) {
                this.securityEventId = securityEventId;
                return this;
            }

            /**
             * <p>The UUID of the server that was affected by the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>qweeqq-13232-daweq-w****</p>
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
