// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListWaitingRoomEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListWaitingRoomEventsResponseBody</p>
 */
public class ListWaitingRoomEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WaitingRoomEvents")
    private java.util.List<WaitingRoomEvents> waitingRoomEvents;

    private ListWaitingRoomEventsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.waitingRoomEvents = builder.waitingRoomEvents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWaitingRoomEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return waitingRoomEvents
     */
    public java.util.List<WaitingRoomEvents> getWaitingRoomEvents() {
        return this.waitingRoomEvents;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<WaitingRoomEvents> waitingRoomEvents; 

        /**
         * <p>The request ID, which is used to trace a call.</p>
         * 
         * <strong>example:</strong>
         * <p>f3c3700a-4c0f-4a24-b576-fd7dbf9e7c55</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the waiting room events.</p>
         */
        public Builder waitingRoomEvents(java.util.List<WaitingRoomEvents> waitingRoomEvents) {
            this.waitingRoomEvents = waitingRoomEvents;
            return this;
        }

        public ListWaitingRoomEventsResponseBody build() {
            return new ListWaitingRoomEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWaitingRoomEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWaitingRoomEventsResponseBody</p>
     */
    public static class WaitingRoomEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomPageHtml")
        private String customPageHtml;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisableSessionRenewalEnable")
        private String disableSessionRenewalEnable;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("JsonResponseEnable")
        private String jsonResponseEnable;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NewUsersPerMinute")
        private String newUsersPerMinute;

        @com.aliyun.core.annotation.NameInMap("PreQueueEnable")
        private String preQueueEnable;

        @com.aliyun.core.annotation.NameInMap("PreQueueStartTime")
        private String preQueueStartTime;

        @com.aliyun.core.annotation.NameInMap("QueuingMethod")
        private String queuingMethod;

        @com.aliyun.core.annotation.NameInMap("QueuingStatusCode")
        private String queuingStatusCode;

        @com.aliyun.core.annotation.NameInMap("RandomPreQueueEnable")
        private String randomPreQueueEnable;

        @com.aliyun.core.annotation.NameInMap("SessionDuration")
        private String sessionDuration;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TotalActiveUsers")
        private String totalActiveUsers;

        @com.aliyun.core.annotation.NameInMap("WaitingRoomEventId")
        private Long waitingRoomEventId;

        @com.aliyun.core.annotation.NameInMap("WaitingRoomId")
        private String waitingRoomId;

        @com.aliyun.core.annotation.NameInMap("WaitingRoomType")
        private String waitingRoomType;

        private WaitingRoomEvents(Builder builder) {
            this.customPageHtml = builder.customPageHtml;
            this.description = builder.description;
            this.disableSessionRenewalEnable = builder.disableSessionRenewalEnable;
            this.enable = builder.enable;
            this.endTime = builder.endTime;
            this.jsonResponseEnable = builder.jsonResponseEnable;
            this.language = builder.language;
            this.name = builder.name;
            this.newUsersPerMinute = builder.newUsersPerMinute;
            this.preQueueEnable = builder.preQueueEnable;
            this.preQueueStartTime = builder.preQueueStartTime;
            this.queuingMethod = builder.queuingMethod;
            this.queuingStatusCode = builder.queuingStatusCode;
            this.randomPreQueueEnable = builder.randomPreQueueEnable;
            this.sessionDuration = builder.sessionDuration;
            this.startTime = builder.startTime;
            this.totalActiveUsers = builder.totalActiveUsers;
            this.waitingRoomEventId = builder.waitingRoomEventId;
            this.waitingRoomId = builder.waitingRoomId;
            this.waitingRoomType = builder.waitingRoomType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WaitingRoomEvents create() {
            return builder().build();
        }

        /**
         * @return customPageHtml
         */
        public String getCustomPageHtml() {
            return this.customPageHtml;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return disableSessionRenewalEnable
         */
        public String getDisableSessionRenewalEnable() {
            return this.disableSessionRenewalEnable;
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return jsonResponseEnable
         */
        public String getJsonResponseEnable() {
            return this.jsonResponseEnable;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return newUsersPerMinute
         */
        public String getNewUsersPerMinute() {
            return this.newUsersPerMinute;
        }

        /**
         * @return preQueueEnable
         */
        public String getPreQueueEnable() {
            return this.preQueueEnable;
        }

        /**
         * @return preQueueStartTime
         */
        public String getPreQueueStartTime() {
            return this.preQueueStartTime;
        }

        /**
         * @return queuingMethod
         */
        public String getQueuingMethod() {
            return this.queuingMethod;
        }

        /**
         * @return queuingStatusCode
         */
        public String getQueuingStatusCode() {
            return this.queuingStatusCode;
        }

        /**
         * @return randomPreQueueEnable
         */
        public String getRandomPreQueueEnable() {
            return this.randomPreQueueEnable;
        }

        /**
         * @return sessionDuration
         */
        public String getSessionDuration() {
            return this.sessionDuration;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return totalActiveUsers
         */
        public String getTotalActiveUsers() {
            return this.totalActiveUsers;
        }

        /**
         * @return waitingRoomEventId
         */
        public Long getWaitingRoomEventId() {
            return this.waitingRoomEventId;
        }

        /**
         * @return waitingRoomId
         */
        public String getWaitingRoomId() {
            return this.waitingRoomId;
        }

        /**
         * @return waitingRoomType
         */
        public String getWaitingRoomType() {
            return this.waitingRoomType;
        }

        public static final class Builder {
            private String customPageHtml; 
            private String description; 
            private String disableSessionRenewalEnable; 
            private String enable; 
            private String endTime; 
            private String jsonResponseEnable; 
            private String language; 
            private String name; 
            private String newUsersPerMinute; 
            private String preQueueEnable; 
            private String preQueueStartTime; 
            private String queuingMethod; 
            private String queuingStatusCode; 
            private String randomPreQueueEnable; 
            private String sessionDuration; 
            private String startTime; 
            private String totalActiveUsers; 
            private Long waitingRoomEventId; 
            private String waitingRoomId; 
            private String waitingRoomType; 

            /**
             * <p>The content of the custom waiting room page. This parameter is returned when the waiting room type is set to custom. The content is URL-encoded.</p>
             * 
             * <strong>example:</strong>
             * <p>html-yets-maqi1111</p>
             */
            public Builder customPageHtml(String customPageHtml) {
                this.customPageHtml = customPageHtml;
                return this;
            }

            /**
             * <p>The event description.</p>
             * 
             * <strong>example:</strong>
             * <p>terraform-example</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether session renewal is disabled. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder disableSessionRenewalEnable(String disableSessionRenewalEnable) {
                this.disableSessionRenewalEnable = disableSessionRenewalEnable;
                return this;
            }

            /**
             * <p>The event status. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The end time of the event. This value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1719814497</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Indicates whether JOSN response is enabled. If JSON response is enabled, a JSON body is returned for requests to the waiting room with the header Accept: application/json. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder jsonResponseEnable(String jsonResponseEnable) {
                this.jsonResponseEnable = jsonResponseEnable;
                return this;
            }

            /**
             * <p>The language of the waiting room page. This parameter is returned when the waiting room type is set to default. Valid values:</p>
             * <ul>
             * <li>enus: English.</li>
             * <li>zhcn: Simplified Chinese.</li>
             * <li>zhhk: Traditional Chinese.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zhcn</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The custom event name.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The maximum number of new users per minute.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder newUsersPerMinute(String newUsersPerMinute) {
                this.newUsersPerMinute = newUsersPerMinute;
                return this;
            }

            /**
             * <p>Indicates whether pre-queuing is enabled. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder preQueueEnable(String preQueueEnable) {
                this.preQueueEnable = preQueueEnable;
                return this;
            }

            /**
             * <p>The start time for pre-queuing. This value is a UNIX timestamp. This parameter is valid only when pre-queuing is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1719814097</p>
             */
            public Builder preQueueStartTime(String preQueueStartTime) {
                this.preQueueStartTime = preQueueStartTime;
                return this;
            }

            /**
             * <p>The queuing method. Valid values:</p>
             * <ul>
             * <li>random: Users gain access to the origin randomly, regardless of the arrival time.</li>
             * <li>fifo: Users gain access to the origin in order of arrival.</li>
             * <li>passthrough: Users pass through the waiting room and go straight to the origin.</li>
             * <li>reject-all: Users are blocked from reaching the origin.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>fifo</p>
             */
            public Builder queuingMethod(String queuingMethod) {
                this.queuingMethod = queuingMethod;
                return this;
            }

            /**
             * <p>The HTTP status code to return while a user is in the queue. Valid values:</p>
             * <ul>
             * <li>200</li>
             * <li>202</li>
             * <li>429</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder queuingStatusCode(String queuingStatusCode) {
                this.queuingStatusCode = queuingStatusCode;
                return this;
            }

            /**
             * <p>Indicates whether random queuing is enabled. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder randomPreQueueEnable(String randomPreQueueEnable) {
                this.randomPreQueueEnable = randomPreQueueEnable;
                return this;
            }

            /**
             * <p>The maximum duration for which a session remains valid after a user leaves the origin. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder sessionDuration(String sessionDuration) {
                this.sessionDuration = sessionDuration;
                return this;
            }

            /**
             * <p>The start time of the event. This value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1719814398</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The maximum number of active users.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder totalActiveUsers(String totalActiveUsers) {
                this.totalActiveUsers = totalActiveUsers;
                return this;
            }

            /**
             * <p>The unique ID of the waiting room event.</p>
             * 
             * <strong>example:</strong>
             * <p>89677721098****</p>
             */
            public Builder waitingRoomEventId(Long waitingRoomEventId) {
                this.waitingRoomEventId = waitingRoomEventId;
                return this;
            }

            /**
             * <p>The ID of the waiting room associated with the event.</p>
             * 
             * <strong>example:</strong>
             * <p>5c938a045c9ca46607163d34966****</p>
             */
            public Builder waitingRoomId(String waitingRoomId) {
                this.waitingRoomId = waitingRoomId;
                return this;
            }

            /**
             * <p>The type of the waiting room. Valid values:</p>
             * <ul>
             * <li>default</li>
             * <li>custom</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder waitingRoomType(String waitingRoomType) {
                this.waitingRoomType = waitingRoomType;
                return this;
            }

            public WaitingRoomEvents build() {
                return new WaitingRoomEvents(this);
            } 

        } 

    }
}
