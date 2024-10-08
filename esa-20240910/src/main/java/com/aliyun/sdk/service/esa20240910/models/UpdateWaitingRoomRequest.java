// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateWaitingRoomRequest} extends {@link RequestModel}
 *
 * <p>UpdateWaitingRoomRequest</p>
 */
public class UpdateWaitingRoomRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CookieName")
    private String cookieName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomPageHtml")
    private String customPageHtml;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisableSessionRenewalEnable")
    private String disableSessionRenewalEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private String enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostNameAndPath")
    private java.util.List < HostNameAndPath> hostNameAndPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JsonResponseEnable")
    private String jsonResponseEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewUsersPerMinute")
    private String newUsersPerMinute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueAllEnable")
    private String queueAllEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueuingMethod")
    private String queuingMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueuingStatusCode")
    private String queuingStatusCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionDuration")
    private String sessionDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalActiveUsers")
    private String totalActiveUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitingRoomId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String waitingRoomId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitingRoomType")
    private String waitingRoomType;

    private UpdateWaitingRoomRequest(Builder builder) {
        super(builder);
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
        this.siteId = builder.siteId;
        this.totalActiveUsers = builder.totalActiveUsers;
        this.waitingRoomId = builder.waitingRoomId;
        this.waitingRoomType = builder.waitingRoomType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWaitingRoomRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
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

    public static final class Builder extends Request.Builder<UpdateWaitingRoomRequest, Builder> {
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
        private Long siteId; 
        private String totalActiveUsers; 
        private String waitingRoomId; 
        private String waitingRoomType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWaitingRoomRequest request) {
            super(request);
            this.cookieName = request.cookieName;
            this.customPageHtml = request.customPageHtml;
            this.description = request.description;
            this.disableSessionRenewalEnable = request.disableSessionRenewalEnable;
            this.enable = request.enable;
            this.hostNameAndPath = request.hostNameAndPath;
            this.jsonResponseEnable = request.jsonResponseEnable;
            this.language = request.language;
            this.name = request.name;
            this.newUsersPerMinute = request.newUsersPerMinute;
            this.queueAllEnable = request.queueAllEnable;
            this.queuingMethod = request.queuingMethod;
            this.queuingStatusCode = request.queuingStatusCode;
            this.sessionDuration = request.sessionDuration;
            this.siteId = request.siteId;
            this.totalActiveUsers = request.totalActiveUsers;
            this.waitingRoomId = request.waitingRoomId;
            this.waitingRoomType = request.waitingRoomType;
        } 

        /**
         * CookieName.
         */
        public Builder cookieName(String cookieName) {
            this.putQueryParameter("CookieName", cookieName);
            this.cookieName = cookieName;
            return this;
        }

        /**
         * CustomPageHtml.
         */
        public Builder customPageHtml(String customPageHtml) {
            this.putQueryParameter("CustomPageHtml", customPageHtml);
            this.customPageHtml = customPageHtml;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DisableSessionRenewalEnable.
         */
        public Builder disableSessionRenewalEnable(String disableSessionRenewalEnable) {
            this.putQueryParameter("DisableSessionRenewalEnable", disableSessionRenewalEnable);
            this.disableSessionRenewalEnable = disableSessionRenewalEnable;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(String enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * HostNameAndPath.
         */
        public Builder hostNameAndPath(java.util.List < HostNameAndPath> hostNameAndPath) {
            String hostNameAndPathShrink = shrink(hostNameAndPath, "HostNameAndPath", "json");
            this.putQueryParameter("HostNameAndPath", hostNameAndPathShrink);
            this.hostNameAndPath = hostNameAndPath;
            return this;
        }

        /**
         * JsonResponseEnable.
         */
        public Builder jsonResponseEnable(String jsonResponseEnable) {
            this.putQueryParameter("JsonResponseEnable", jsonResponseEnable);
            this.jsonResponseEnable = jsonResponseEnable;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NewUsersPerMinute.
         */
        public Builder newUsersPerMinute(String newUsersPerMinute) {
            this.putQueryParameter("NewUsersPerMinute", newUsersPerMinute);
            this.newUsersPerMinute = newUsersPerMinute;
            return this;
        }

        /**
         * QueueAllEnable.
         */
        public Builder queueAllEnable(String queueAllEnable) {
            this.putQueryParameter("QueueAllEnable", queueAllEnable);
            this.queueAllEnable = queueAllEnable;
            return this;
        }

        /**
         * QueuingMethod.
         */
        public Builder queuingMethod(String queuingMethod) {
            this.putQueryParameter("QueuingMethod", queuingMethod);
            this.queuingMethod = queuingMethod;
            return this;
        }

        /**
         * QueuingStatusCode.
         */
        public Builder queuingStatusCode(String queuingStatusCode) {
            this.putQueryParameter("QueuingStatusCode", queuingStatusCode);
            this.queuingStatusCode = queuingStatusCode;
            return this;
        }

        /**
         * SessionDuration.
         */
        public Builder sessionDuration(String sessionDuration) {
            this.putQueryParameter("SessionDuration", sessionDuration);
            this.sessionDuration = sessionDuration;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * TotalActiveUsers.
         */
        public Builder totalActiveUsers(String totalActiveUsers) {
            this.putQueryParameter("TotalActiveUsers", totalActiveUsers);
            this.totalActiveUsers = totalActiveUsers;
            return this;
        }

        /**
         * WaitingRoomId.
         */
        public Builder waitingRoomId(String waitingRoomId) {
            this.putQueryParameter("WaitingRoomId", waitingRoomId);
            this.waitingRoomId = waitingRoomId;
            return this;
        }

        /**
         * WaitingRoomType.
         */
        public Builder waitingRoomType(String waitingRoomType) {
            this.putQueryParameter("WaitingRoomType", waitingRoomType);
            this.waitingRoomType = waitingRoomType;
            return this;
        }

        @Override
        public UpdateWaitingRoomRequest build() {
            return new UpdateWaitingRoomRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateWaitingRoomRequest} extends {@link TeaModel}
     *
     * <p>UpdateWaitingRoomRequest</p>
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
}
