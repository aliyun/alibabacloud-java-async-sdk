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
 * {@link ListWaitingRoomsResponseBody} extends {@link TeaModel}
 *
 * <p>ListWaitingRoomsResponseBody</p>
 */
public class ListWaitingRoomsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WaitingRooms")
    private java.util.List<WaitingRooms> waitingRooms;

    private ListWaitingRoomsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.waitingRooms = builder.waitingRooms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWaitingRoomsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return waitingRooms
     */
    public java.util.List<WaitingRooms> getWaitingRooms() {
        return this.waitingRooms;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<WaitingRooms> waitingRooms; 

        /**
         * <p>The request ID, which is used to trace a call.</p>
         * 
         * <strong>example:</strong>
         * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The waiting rooms.</p>
         */
        public Builder waitingRooms(java.util.List<WaitingRooms> waitingRooms) {
            this.waitingRooms = waitingRooms;
            return this;
        }

        public ListWaitingRoomsResponseBody build() {
            return new ListWaitingRoomsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWaitingRoomsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWaitingRoomsResponseBody</p>
     */
    public static class HostNameAndPath extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Subdomain")
        private String subdomain;

        private HostNameAndPath(Builder builder) {
            this.domain = builder.domain;
            this.path = builder.path;
            this.subdomain = builder.subdomain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostNameAndPath create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return subdomain
         */
        public String getSubdomain() {
            return this.subdomain;
        }

        public static final class Builder {
            private String domain; 
            private String path; 
            private String subdomain; 

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The path.</p>
             * 
             * <strong>example:</strong>
             * <p>/test</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The subdomain.</p>
             * 
             * <strong>example:</strong>
             * <p>test.</p>
             */
            public Builder subdomain(String subdomain) {
                this.subdomain = subdomain;
                return this;
            }

            public HostNameAndPath build() {
                return new HostNameAndPath(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWaitingRoomsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWaitingRoomsResponseBody</p>
     */
    public static class WaitingRooms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CookieName")
        private String cookieName;

        @com.aliyun.core.annotation.NameInMap("CustomPageHtml")
        private String customPageHtml;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisableSessionRenewalEnable")
        private String disableSessionRenewalEnable;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        @com.aliyun.core.annotation.NameInMap("HostNameAndPath")
        private java.util.List<HostNameAndPath> hostNameAndPath;

        @com.aliyun.core.annotation.NameInMap("JsonResponseEnable")
        private String jsonResponseEnable;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NewUsersPerMinute")
        private String newUsersPerMinute;

        @com.aliyun.core.annotation.NameInMap("QueueAllEnable")
        private String queueAllEnable;

        @com.aliyun.core.annotation.NameInMap("QueuingMethod")
        private String queuingMethod;

        @com.aliyun.core.annotation.NameInMap("QueuingStatusCode")
        private String queuingStatusCode;

        @com.aliyun.core.annotation.NameInMap("SessionDuration")
        private String sessionDuration;

        @com.aliyun.core.annotation.NameInMap("TotalActiveUsers")
        private String totalActiveUsers;

        @com.aliyun.core.annotation.NameInMap("WaitingRoomId")
        private String waitingRoomId;

        @com.aliyun.core.annotation.NameInMap("WaitingRoomType")
        private String waitingRoomType;

        private WaitingRooms(Builder builder) {
            this.cookieName = builder.cookieName;
            this.customPageHtml = builder.customPageHtml;
            this.description = builder.description;
            this.disableSessionRenewalEnable = builder.disableSessionRenewalEnable;
            this.enable = builder.enable;
            this.hostNameAndPath = builder.hostNameAndPath;
            this.jsonResponseEnable = builder.jsonResponseEnable;
            this.language = builder.language;
            this.name = builder.name;
            this.newUsersPerMinute = builder.newUsersPerMinute;
            this.queueAllEnable = builder.queueAllEnable;
            this.queuingMethod = builder.queuingMethod;
            this.queuingStatusCode = builder.queuingStatusCode;
            this.sessionDuration = builder.sessionDuration;
            this.totalActiveUsers = builder.totalActiveUsers;
            this.waitingRoomId = builder.waitingRoomId;
            this.waitingRoomType = builder.waitingRoomType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WaitingRooms create() {
            return builder().build();
        }

        /**
         * @return cookieName
         */
        public String getCookieName() {
            return this.cookieName;
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
         * @return hostNameAndPath
         */
        public java.util.List<HostNameAndPath> getHostNameAndPath() {
            return this.hostNameAndPath;
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
         * @return queueAllEnable
         */
        public String getQueueAllEnable() {
            return this.queueAllEnable;
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
         * @return sessionDuration
         */
        public String getSessionDuration() {
            return this.sessionDuration;
        }

        /**
         * @return totalActiveUsers
         */
        public String getTotalActiveUsers() {
            return this.totalActiveUsers;
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
            private String cookieName; 
            private String customPageHtml; 
            private String description; 
            private String disableSessionRenewalEnable; 
            private String enable; 
            private java.util.List<HostNameAndPath> hostNameAndPath; 
            private String jsonResponseEnable; 
            private String language; 
            private String name; 
            private String newUsersPerMinute; 
            private String queueAllEnable; 
            private String queuingMethod; 
            private String queuingStatusCode; 
            private String sessionDuration; 
            private String totalActiveUsers; 
            private String waitingRoomId; 
            private String waitingRoomType; 

            /**
             * <p>The name of the custom cookie.</p>
             * 
             * <strong>example:</strong>
             * <p>__aliwaitingroom_example</p>
             */
            public Builder cookieName(String cookieName) {
                this.cookieName = cookieName;
                return this;
            }

            /**
             * <p>The HTML content or identifier of the custom queuing page. This parameter is valid only when <code>WaitingRoomType</code> is set to <code>custom</code>. The content must be URL-encoded.</p>
             */
            public Builder customPageHtml(String customPageHtml) {
                this.customPageHtml = customPageHtml;
                return this;
            }

            /**
             * <p>The description of the waiting room.</p>
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
             * <p>on</p>
             */
            public Builder disableSessionRenewalEnable(String disableSessionRenewalEnable) {
                this.disableSessionRenewalEnable = disableSessionRenewalEnable;
                return this;
            }

            /**
             * <p>Indicates whether the waiting room is enabled. Valid values:</p>
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
             * <p>The hostname and path.</p>
             */
            public Builder hostNameAndPath(java.util.List<HostNameAndPath> hostNameAndPath) {
                this.hostNameAndPath = hostNameAndPath;
                return this;
            }

            /**
             * <p>Indicates whether JSON response is enabled. If you set this parameter to on, a JSON body is returned for requests to the waiting room with the header Accept: application/json. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
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
             * <p>The name of the waiting room.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The maximum number of new users per minute.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder newUsersPerMinute(String newUsersPerMinute) {
                this.newUsersPerMinute = newUsersPerMinute;
                return this;
            }

            /**
             * <p>Indicates whether all requests must be queued. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder queueAllEnable(String queueAllEnable) {
                this.queueAllEnable = queueAllEnable;
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
             * <p>random</p>
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
             * <p>The maximum duration for which a session remains valid after a user leaves the origin. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder sessionDuration(String sessionDuration) {
                this.sessionDuration = sessionDuration;
                return this;
            }

            /**
             * <p>The maximum number of active users.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder totalActiveUsers(String totalActiveUsers) {
                this.totalActiveUsers = totalActiveUsers;
                return this;
            }

            /**
             * <p>The unique ID of the waiting room.</p>
             * 
             * <strong>example:</strong>
             * <p>6a51d5bc6460887abd1291dc7d4d****</p>
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
             * <p>default</p>
             */
            public Builder waitingRoomType(String waitingRoomType) {
                this.waitingRoomType = waitingRoomType;
                return this;
            }

            public WaitingRooms build() {
                return new WaitingRooms(this);
            } 

        } 

    }
}
