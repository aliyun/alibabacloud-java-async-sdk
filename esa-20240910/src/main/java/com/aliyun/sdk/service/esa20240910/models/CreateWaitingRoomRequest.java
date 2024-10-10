// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateWaitingRoomRequest} extends {@link RequestModel}
 *
 * <p>CreateWaitingRoomRequest</p>
 */
public class CreateWaitingRoomRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CookieName")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostNameAndPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < HostNameAndPath> hostNameAndPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JsonResponseEnable")
    private String jsonResponseEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewUsersPerMinute")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newUsersPerMinute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueAllEnable")
    private String queueAllEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueuingMethod")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queuingMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueuingStatusCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queuingStatusCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionDuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalActiveUsers")
    @com.aliyun.core.annotation.Validation(required = true)
    private String totalActiveUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitingRoomType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String waitingRoomType;

    private CreateWaitingRoomRequest(Builder builder) {
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
        this.waitingRoomType = builder.waitingRoomType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWaitingRoomRequest create() {
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
     * @return waitingRoomType
     */
    public String getWaitingRoomType() {
        return this.waitingRoomType;
    }

    public static final class Builder extends Request.Builder<CreateWaitingRoomRequest, Builder> {
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
        private String waitingRoomType; 

        private Builder() {
            super();
        } 

        private Builder(CreateWaitingRoomRequest request) {
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
            this.waitingRoomType = request.waitingRoomType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>__aliwaitingroom_example</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder enable(String enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waitingroom_example</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fifo</p>
         */
        public Builder queuingMethod(String queuingMethod) {
            this.putQueryParameter("QueuingMethod", queuingMethod);
            this.queuingMethod = queuingMethod;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder queuingStatusCode(String queuingStatusCode) {
            this.putQueryParameter("QueuingStatusCode", queuingStatusCode);
            this.queuingStatusCode = queuingStatusCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder sessionDuration(String sessionDuration) {
            this.putQueryParameter("SessionDuration", sessionDuration);
            this.sessionDuration = sessionDuration;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder totalActiveUsers(String totalActiveUsers) {
            this.putQueryParameter("TotalActiveUsers", totalActiveUsers);
            this.totalActiveUsers = totalActiveUsers;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder waitingRoomType(String waitingRoomType) {
            this.putQueryParameter("WaitingRoomType", waitingRoomType);
            this.waitingRoomType = waitingRoomType;
            return this;
        }

        @Override
        public CreateWaitingRoomRequest build() {
            return new CreateWaitingRoomRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateWaitingRoomRequest} extends {@link TeaModel}
     *
     * <p>CreateWaitingRoomRequest</p>
     */
    public static class HostNameAndPath extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        @com.aliyun.core.annotation.Validation(required = true)
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Path")
        @com.aliyun.core.annotation.Validation(required = true)
        private String path;

        @com.aliyun.core.annotation.NameInMap("Subdomain")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/test</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
}
