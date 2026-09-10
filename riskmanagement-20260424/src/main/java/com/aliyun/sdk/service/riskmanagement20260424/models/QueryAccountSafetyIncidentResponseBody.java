// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link QueryAccountSafetyIncidentResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAccountSafetyIncidentResponseBody</p>
 */
public class QueryAccountSafetyIncidentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryAccountSafetyIncidentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccountSafetyIncidentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryAccountSafetyIncidentResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * <blockquote>
         * <p> 200: The request was successful. Other codes (500, 400, etc.): An error occurred.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The prompt message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful‌</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2FBDD713-00A5-5C98-B661-3FD31A349B6E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAccountSafetyIncidentResponseBody build() {
            return new QueryAccountSafetyIncidentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAccountSafetyIncidentResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountSafetyIncidentResponseBody</p>
     */
    public static class DateExtras extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertEndTime")
        private String alertEndTime;

        @com.aliyun.core.annotation.NameInMap("AlertStartTime")
        private String alertStartTime;

        @com.aliyun.core.annotation.NameInMap("LastCheckTime")
        private String lastCheckTime;

        private DateExtras(Builder builder) {
            this.alertEndTime = builder.alertEndTime;
            this.alertStartTime = builder.alertStartTime;
            this.lastCheckTime = builder.lastCheckTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DateExtras create() {
            return builder().build();
        }

        /**
         * @return alertEndTime
         */
        public String getAlertEndTime() {
            return this.alertEndTime;
        }

        /**
         * @return alertStartTime
         */
        public String getAlertStartTime() {
            return this.alertStartTime;
        }

        /**
         * @return lastCheckTime
         */
        public String getLastCheckTime() {
            return this.lastCheckTime;
        }

        public static final class Builder {
            private String alertEndTime; 
            private String alertStartTime; 
            private String lastCheckTime; 

            private Builder() {
            } 

            private Builder(DateExtras model) {
                this.alertEndTime = model.alertEndTime;
                this.alertStartTime = model.alertStartTime;
                this.lastCheckTime = model.lastCheckTime;
            } 

            /**
             * <p>The time when the alert ended.</p>
             * <blockquote>
             * <p>Format: yyyy-MM-dd HH:mm:ss</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder alertEndTime(String alertEndTime) {
                this.alertEndTime = alertEndTime;
                return this;
            }

            /**
             * <p>The time when the first alert was triggered.</p>
             * <blockquote>
             * <p>Format: yyyy-MM-dd HH:mm:ss</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder alertStartTime(String alertStartTime) {
                this.alertStartTime = alertStartTime;
                return this;
            }

            /**
             * <p>The time of the latest detection.</p>
             * <blockquote>
             * <p>Format: yyyy-MM-dd HH:mm:ss</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder lastCheckTime(String lastCheckTime) {
                this.lastCheckTime = lastCheckTime;
                return this;
            }

            public DateExtras build() {
                return new DateExtras(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAccountSafetyIncidentResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountSafetyIncidentResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionCode")
        private String actionCode;

        @com.aliyun.core.annotation.NameInMap("ActionName")
        private String actionName;

        @com.aliyun.core.annotation.NameInMap("AntiPunishTime")
        private String antiPunishTime;

        @com.aliyun.core.annotation.NameInMap("CallApi")
        private String callApi;

        @com.aliyun.core.annotation.NameInMap("DateExtras")
        private DateExtras dateExtras;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventImpact")
        private String eventImpact;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("EventReason")
        private String eventReason;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("ExceptionCallTime")
        private String exceptionCallTime;

        @com.aliyun.core.annotation.NameInMap("ExceptionIp")
        private String exceptionIp;

        @com.aliyun.core.annotation.NameInMap("PunishTime")
        private String punishTime;

        @com.aliyun.core.annotation.NameInMap("Reinforcement")
        private String reinforcement;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tip")
        private String tip;

        @com.aliyun.core.annotation.NameInMap("UserGuideName")
        private String userGuideName;

        @com.aliyun.core.annotation.NameInMap("UserGuideUrl")
        private String userGuideUrl;

        private List(Builder builder) {
            this.actionCode = builder.actionCode;
            this.actionName = builder.actionName;
            this.antiPunishTime = builder.antiPunishTime;
            this.callApi = builder.callApi;
            this.dateExtras = builder.dateExtras;
            this.eventId = builder.eventId;
            this.eventImpact = builder.eventImpact;
            this.eventName = builder.eventName;
            this.eventReason = builder.eventReason;
            this.eventType = builder.eventType;
            this.exceptionCallTime = builder.exceptionCallTime;
            this.exceptionIp = builder.exceptionIp;
            this.punishTime = builder.punishTime;
            this.reinforcement = builder.reinforcement;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
            this.tip = builder.tip;
            this.userGuideName = builder.userGuideName;
            this.userGuideUrl = builder.userGuideUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return actionCode
         */
        public String getActionCode() {
            return this.actionCode;
        }

        /**
         * @return actionName
         */
        public String getActionName() {
            return this.actionName;
        }

        /**
         * @return antiPunishTime
         */
        public String getAntiPunishTime() {
            return this.antiPunishTime;
        }

        /**
         * @return callApi
         */
        public String getCallApi() {
            return this.callApi;
        }

        /**
         * @return dateExtras
         */
        public DateExtras getDateExtras() {
            return this.dateExtras;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventImpact
         */
        public String getEventImpact() {
            return this.eventImpact;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventReason
         */
        public String getEventReason() {
            return this.eventReason;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return exceptionCallTime
         */
        public String getExceptionCallTime() {
            return this.exceptionCallTime;
        }

        /**
         * @return exceptionIp
         */
        public String getExceptionIp() {
            return this.exceptionIp;
        }

        /**
         * @return punishTime
         */
        public String getPunishTime() {
            return this.punishTime;
        }

        /**
         * @return reinforcement
         */
        public String getReinforcement() {
            return this.reinforcement;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tip
         */
        public String getTip() {
            return this.tip;
        }

        /**
         * @return userGuideName
         */
        public String getUserGuideName() {
            return this.userGuideName;
        }

        /**
         * @return userGuideUrl
         */
        public String getUserGuideUrl() {
            return this.userGuideUrl;
        }

        public static final class Builder {
            private String actionCode; 
            private String actionName; 
            private String antiPunishTime; 
            private String callApi; 
            private DateExtras dateExtras; 
            private String eventId; 
            private String eventImpact; 
            private String eventName; 
            private String eventReason; 
            private String eventType; 
            private String exceptionCallTime; 
            private String exceptionIp; 
            private String punishTime; 
            private String reinforcement; 
            private String resourceId; 
            private String resourceType; 
            private String status; 
            private String tip; 
            private String userGuideName; 
            private String userGuideUrl; 

            private Builder() {
            } 

            private Builder(List model) {
                this.actionCode = model.actionCode;
                this.actionName = model.actionName;
                this.antiPunishTime = model.antiPunishTime;
                this.callApi = model.callApi;
                this.dateExtras = model.dateExtras;
                this.eventId = model.eventId;
                this.eventImpact = model.eventImpact;
                this.eventName = model.eventName;
                this.eventReason = model.eventReason;
                this.eventType = model.eventType;
                this.exceptionCallTime = model.exceptionCallTime;
                this.exceptionIp = model.exceptionIp;
                this.punishTime = model.punishTime;
                this.reinforcement = model.reinforcement;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.status = model.status;
                this.tip = model.tip;
                this.userGuideName = model.userGuideName;
                this.userGuideUrl = model.userGuideUrl;
            } 

            /**
             * <p>The control action code.</p>
             * 
             * <strong>example:</strong>
             * <p>success_service</p>
             */
            public Builder actionCode(String actionCode) {
                this.actionCode = actionCode;
                return this;
            }

            /**
             * <p>The control action name.</p>
             * 
             * <strong>example:</strong>
             * <p>Penalty directly succeeded</p>
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * <p>The time when the control action was removed.</p>
             * <blockquote>
             * <p>Format: yyyy-MM-dd HH:mm:ss</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder antiPunishTime(String antiPunishTime) {
                this.antiPunishTime = antiPunishTime;
                return this;
            }

            /**
             * <p>The called API operation.</p>
             * 
             * <strong>example:</strong>
             * <p>AddDomainRecord</p>
             */
            public Builder callApi(String callApi) {
                this.callApi = callApi;
                return this;
            }

            /**
             * <p>The control time information.</p>
             */
            public Builder dateExtras(DateExtras dateExtras) {
                this.dateExtras = dateExtras;
                return this;
            }

            /**
             * <p>The event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4ba4065e0b2206c05f86d5eaa00ae520</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The event impact.</p>
             * 
             * <strong>example:</strong>
             * <p>ak leak.</p>
             */
            public Builder eventImpact(String eventImpact) {
                this.eventImpact = eventImpact;
                return this;
            }

            /**
             * <p>The control event name.</p>
             * 
             * <strong>example:</strong>
             * <p>ak leak.</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The event reason.</p>
             * 
             * <strong>example:</strong>
             * <p>ak leak.</p>
             */
            public Builder eventReason(String eventReason) {
                this.eventReason = eventReason;
                return this;
            }

            /**
             * <p>The event subtype name.</p>
             * 
             * <strong>example:</strong>
             * <p>Suspicious identity calling sensitive API</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The time of the abnormal call.</p>
             * <blockquote>
             * <p>Format: yyyy-MM-dd HH:mm:ss</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder exceptionCallTime(String exceptionCallTime) {
                this.exceptionCallTime = exceptionCallTime;
                return this;
            }

            /**
             * <p>The abnormal IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>39.1X4.63.XX9</p>
             */
            public Builder exceptionIp(String exceptionIp) {
                this.exceptionIp = exceptionIp;
                return this;
            }

            /**
             * <p>The start time of the control action.</p>
             * <blockquote>
             * <p>Format: yyyy-MM-dd HH:mm:ss</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder punishTime(String punishTime) {
                this.punishTime = punishTime;
                return this;
            }

            /**
             * <p>The hardening suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>suggestion</p>
             */
            public Builder reinforcement(String reinforcement) {
                this.reinforcement = reinforcement;
                return this;
            }

            /**
             * <p>The cloud resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2zeanc2b2vgfpbvp60cs</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The controlled object type.</p>
             * 
             * <strong>example:</strong>
             * <p>customer</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The event status. Valid values:</p>
             * <ul>
             * <li><strong>Executing</strong>: In progress.</li>
             * <li><strong>Removed</strong>: Removed.</li>
             * <li><strong>Alerting</strong>: Alerting.</li>
             * <li><strong>Ended</strong>: Ended.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Executing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The handling suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>suggestion</p>
             */
            public Builder tip(String tip) {
                this.tip = tip;
                return this;
            }

            /**
             * <p>The help topic name.</p>
             * 
             * <strong>example:</strong>
             * <p>help</p>
             */
            public Builder userGuideName(String userGuideName) {
                this.userGuideName = userGuideName;
                return this;
            }

            /**
             * <p>The help topic URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx.aliyun.com/">https://xxx.aliyun.com/</a></p>
             */
            public Builder userGuideUrl(String userGuideUrl) {
                this.userGuideUrl = userGuideUrl;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAccountSafetyIncidentResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountSafetyIncidentResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Current")
        private String current;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private String total;

        private PageInfo(Builder builder) {
            this.current = builder.current;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return current
         */
        public String getCurrent() {
            return this.current;
        }

        /**
         * @return pageSize
         */
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public String getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String current; 
            private String pageSize; 
            private String total; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.current = model.current;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder current(String current) {
                this.current = current;
                return this;
            }

            /**
             * <p>The number of assets displayed on each page in a paged query.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of events.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder total(String total) {
                this.total = total;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAccountSafetyIncidentResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountSafetyIncidentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageInfo")
        private PageInfo pageInfo;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageInfo = builder.pageInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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

        public static final class Builder {
            private java.util.List<List> list; 
            private PageInfo pageInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageInfo = model.pageInfo;
            } 

            /**
             * <p>The event data.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
