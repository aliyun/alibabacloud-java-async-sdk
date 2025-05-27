// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209.models;

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
 * {@link EnterpriseRegisterAccountRequest} extends {@link RequestModel}
 *
 * <p>EnterpriseRegisterAccountRequest</p>
 */
public class EnterpriseRegisterAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Alias")
    private String alias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptPassword")
    private String encryptPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptTicket")
    private String encryptTicket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginEmail")
    private String loginEmail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationId")
    private String organizationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedEcId")
    private String orientedEcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedLeId")
    private String orientedLeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedNbId")
    private String orientedNbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowCompleteInfo")
    private Boolean showCompleteInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteNick")
    private String siteNick;

    private EnterpriseRegisterAccountRequest(Builder builder) {
        super(builder);
        this.alias = builder.alias;
        this.encryptPassword = builder.encryptPassword;
        this.encryptTicket = builder.encryptTicket;
        this.loginEmail = builder.loginEmail;
        this.organizationId = builder.organizationId;
        this.orientedEcId = builder.orientedEcId;
        this.orientedLeId = builder.orientedLeId;
        this.orientedNbId = builder.orientedNbId;
        this.requestId = builder.requestId;
        this.showCompleteInfo = builder.showCompleteInfo;
        this.siteNick = builder.siteNick;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseRegisterAccountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return encryptPassword
     */
    public String getEncryptPassword() {
        return this.encryptPassword;
    }

    /**
     * @return encryptTicket
     */
    public String getEncryptTicket() {
        return this.encryptTicket;
    }

    /**
     * @return loginEmail
     */
    public String getLoginEmail() {
        return this.loginEmail;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return orientedEcId
     */
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    /**
     * @return orientedLeId
     */
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    /**
     * @return orientedNbId
     */
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return showCompleteInfo
     */
    public Boolean getShowCompleteInfo() {
        return this.showCompleteInfo;
    }

    /**
     * @return siteNick
     */
    public String getSiteNick() {
        return this.siteNick;
    }

    public static final class Builder extends Request.Builder<EnterpriseRegisterAccountRequest, Builder> {
        private String alias; 
        private String encryptPassword; 
        private String encryptTicket; 
        private String loginEmail; 
        private String organizationId; 
        private String orientedEcId; 
        private String orientedLeId; 
        private String orientedNbId; 
        private String requestId; 
        private Boolean showCompleteInfo; 
        private String siteNick; 

        private Builder() {
            super();
        } 

        private Builder(EnterpriseRegisterAccountRequest request) {
            super(request);
            this.alias = request.alias;
            this.encryptPassword = request.encryptPassword;
            this.encryptTicket = request.encryptTicket;
            this.loginEmail = request.loginEmail;
            this.organizationId = request.organizationId;
            this.orientedEcId = request.orientedEcId;
            this.orientedLeId = request.orientedLeId;
            this.orientedNbId = request.orientedNbId;
            this.requestId = request.requestId;
            this.showCompleteInfo = request.showCompleteInfo;
            this.siteNick = request.siteNick;
        } 

        /**
         * Alias.
         */
        public Builder alias(String alias) {
            this.putQueryParameter("Alias", alias);
            this.alias = alias;
            return this;
        }

        /**
         * EncryptPassword.
         */
        public Builder encryptPassword(String encryptPassword) {
            this.putQueryParameter("EncryptPassword", encryptPassword);
            this.encryptPassword = encryptPassword;
            return this;
        }

        /**
         * EncryptTicket.
         */
        public Builder encryptTicket(String encryptTicket) {
            this.putQueryParameter("EncryptTicket", encryptTicket);
            this.encryptTicket = encryptTicket;
            return this;
        }

        /**
         * LoginEmail.
         */
        public Builder loginEmail(String loginEmail) {
            this.putQueryParameter("LoginEmail", loginEmail);
            this.loginEmail = loginEmail;
            return this;
        }

        /**
         * OrganizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("OrganizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * OrientedEcId.
         */
        public Builder orientedEcId(String orientedEcId) {
            this.putBodyParameter("OrientedEcId", orientedEcId);
            this.orientedEcId = orientedEcId;
            return this;
        }

        /**
         * OrientedLeId.
         */
        public Builder orientedLeId(String orientedLeId) {
            this.putBodyParameter("OrientedLeId", orientedLeId);
            this.orientedLeId = orientedLeId;
            return this;
        }

        /**
         * OrientedNbId.
         */
        public Builder orientedNbId(String orientedNbId) {
            this.putBodyParameter("OrientedNbId", orientedNbId);
            this.orientedNbId = orientedNbId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>A93073FC-1E86-58BA-AB83-54DA6BDB4F03</p>
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * ShowCompleteInfo.
         */
        public Builder showCompleteInfo(Boolean showCompleteInfo) {
            this.putQueryParameter("ShowCompleteInfo", showCompleteInfo);
            this.showCompleteInfo = showCompleteInfo;
            return this;
        }

        /**
         * SiteNick.
         */
        public Builder siteNick(String siteNick) {
            this.putQueryParameter("SiteNick", siteNick);
            this.siteNick = siteNick;
            return this;
        }

        @Override
        public EnterpriseRegisterAccountRequest build() {
            return new EnterpriseRegisterAccountRequest(this);
        } 

    } 

}
