// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
    private java.util.List < WaitingRooms> waitingRooms;

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
    public java.util.List < WaitingRooms> getWaitingRooms() {
        return this.waitingRooms;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < WaitingRooms> waitingRooms; 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WaitingRooms.
         */
        public Builder waitingRooms(java.util.List < WaitingRooms> waitingRooms) {
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
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Subdomain.
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
        private java.util.List < HostNameAndPath> hostNameAndPath;

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
        public java.util.List < HostNameAndPath> getHostNameAndPath() {
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
            private java.util.List < HostNameAndPath> hostNameAndPath; 
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
             * CookieName.
             */
            public Builder cookieName(String cookieName) {
                this.cookieName = cookieName;
                return this;
            }

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
             * HostNameAndPath.
             */
            public Builder hostNameAndPath(java.util.List < HostNameAndPath> hostNameAndPath) {
                this.hostNameAndPath = hostNameAndPath;
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
             * QueueAllEnable.
             */
            public Builder queueAllEnable(String queueAllEnable) {
                this.queueAllEnable = queueAllEnable;
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
             * SessionDuration.
             */
            public Builder sessionDuration(String sessionDuration) {
                this.sessionDuration = sessionDuration;
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

            public WaitingRooms build() {
                return new WaitingRooms(this);
            } 

        } 

    }
}
