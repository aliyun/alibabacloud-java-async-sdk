// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
    private java.util.List < WaitingRoomEvents> waitingRoomEvents;

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
    public java.util.List < WaitingRoomEvents> getWaitingRoomEvents() {
        return this.waitingRoomEvents;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < WaitingRoomEvents> waitingRoomEvents; 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>f3c3700a-4c0f-4a24-b576-fd7dbf9e7c55</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WaitingRoomEvents.
         */
        public Builder waitingRoomEvents(java.util.List < WaitingRoomEvents> waitingRoomEvents) {
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
             * CustomPageHtml.
             */
            public Builder customPageHtml(String customPageHtml) {
                this.customPageHtml = customPageHtml;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisableSessionRenewalEnable.
             */
            public Builder disableSessionRenewalEnable(String disableSessionRenewalEnable) {
                this.disableSessionRenewalEnable = disableSessionRenewalEnable;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * JsonResponseEnable.
             */
            public Builder jsonResponseEnable(String jsonResponseEnable) {
                this.jsonResponseEnable = jsonResponseEnable;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NewUsersPerMinute.
             */
            public Builder newUsersPerMinute(String newUsersPerMinute) {
                this.newUsersPerMinute = newUsersPerMinute;
                return this;
            }

            /**
             * PreQueueEnable.
             */
            public Builder preQueueEnable(String preQueueEnable) {
                this.preQueueEnable = preQueueEnable;
                return this;
            }

            /**
             * PreQueueStartTime.
             */
            public Builder preQueueStartTime(String preQueueStartTime) {
                this.preQueueStartTime = preQueueStartTime;
                return this;
            }

            /**
             * QueuingMethod.
             */
            public Builder queuingMethod(String queuingMethod) {
                this.queuingMethod = queuingMethod;
                return this;
            }

            /**
             * QueuingStatusCode.
             */
            public Builder queuingStatusCode(String queuingStatusCode) {
                this.queuingStatusCode = queuingStatusCode;
                return this;
            }

            /**
             * RandomPreQueueEnable.
             */
            public Builder randomPreQueueEnable(String randomPreQueueEnable) {
                this.randomPreQueueEnable = randomPreQueueEnable;
                return this;
            }

            /**
             * SessionDuration.
             */
            public Builder sessionDuration(String sessionDuration) {
                this.sessionDuration = sessionDuration;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TotalActiveUsers.
             */
            public Builder totalActiveUsers(String totalActiveUsers) {
                this.totalActiveUsers = totalActiveUsers;
                return this;
            }

            /**
             * WaitingRoomEventId.
             */
            public Builder waitingRoomEventId(Long waitingRoomEventId) {
                this.waitingRoomEventId = waitingRoomEventId;
                return this;
            }

            /**
             * WaitingRoomId.
             */
            public Builder waitingRoomId(String waitingRoomId) {
                this.waitingRoomId = waitingRoomId;
                return this;
            }

            /**
             * WaitingRoomType.
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
