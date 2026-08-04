// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link CreateAgAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateAgAccountRequest</p>
 */
public class CreateAgAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginEmail")
    private String loginEmail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mpk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mpk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NationCode")
    private String nationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Own")
    private String own;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealParentPk")
    private String realParentPk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityMobile")
    private String securityMobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowNickName")
    private String showNickName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteNick")
    private String siteNick;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("srcAccountInfo")
    private String srcAccountInfo;

    private CreateAgAccountRequest(Builder builder) {
        super(builder);
        this.loginEmail = builder.loginEmail;
        this.mpk = builder.mpk;
        this.nationCode = builder.nationCode;
        this.own = builder.own;
        this.realParentPk = builder.realParentPk;
        this.securityMobile = builder.securityMobile;
        this.showNickName = builder.showNickName;
        this.siteNick = builder.siteNick;
        this.srcAccountInfo = builder.srcAccountInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgAccountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return loginEmail
     */
    public String getLoginEmail() {
        return this.loginEmail;
    }

    /**
     * @return mpk
     */
    public String getMpk() {
        return this.mpk;
    }

    /**
     * @return nationCode
     */
    public String getNationCode() {
        return this.nationCode;
    }

    /**
     * @return own
     */
    public String getOwn() {
        return this.own;
    }

    /**
     * @return realParentPk
     */
    public String getRealParentPk() {
        return this.realParentPk;
    }

    /**
     * @return securityMobile
     */
    public String getSecurityMobile() {
        return this.securityMobile;
    }

    /**
     * @return showNickName
     */
    public String getShowNickName() {
        return this.showNickName;
    }

    /**
     * @return siteNick
     */
    public String getSiteNick() {
        return this.siteNick;
    }

    /**
     * @return srcAccountInfo
     */
    public String getSrcAccountInfo() {
        return this.srcAccountInfo;
    }

    public static final class Builder extends Request.Builder<CreateAgAccountRequest, Builder> {
        private String loginEmail; 
        private String mpk; 
        private String nationCode; 
        private String own; 
        private String realParentPk; 
        private String securityMobile; 
        private String showNickName; 
        private String siteNick; 
        private String srcAccountInfo; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgAccountRequest request) {
            super(request);
            this.loginEmail = request.loginEmail;
            this.mpk = request.mpk;
            this.nationCode = request.nationCode;
            this.own = request.own;
            this.realParentPk = request.realParentPk;
            this.securityMobile = request.securityMobile;
            this.showNickName = request.showNickName;
            this.siteNick = request.siteNick;
            this.srcAccountInfo = request.srcAccountInfo;
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
         * <p>This parameter is required.</p>
         */
        public Builder mpk(String mpk) {
            this.putQueryParameter("Mpk", mpk);
            this.mpk = mpk;
            return this;
        }

        /**
         * NationCode.
         */
        public Builder nationCode(String nationCode) {
            this.putQueryParameter("NationCode", nationCode);
            this.nationCode = nationCode;
            return this;
        }

        /**
         * Own.
         */
        public Builder own(String own) {
            this.putQueryParameter("Own", own);
            this.own = own;
            return this;
        }

        /**
         * RealParentPk.
         */
        public Builder realParentPk(String realParentPk) {
            this.putQueryParameter("RealParentPk", realParentPk);
            this.realParentPk = realParentPk;
            return this;
        }

        /**
         * SecurityMobile.
         */
        public Builder securityMobile(String securityMobile) {
            this.putQueryParameter("SecurityMobile", securityMobile);
            this.securityMobile = securityMobile;
            return this;
        }

        /**
         * ShowNickName.
         */
        public Builder showNickName(String showNickName) {
            this.putQueryParameter("ShowNickName", showNickName);
            this.showNickName = showNickName;
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

        /**
         * srcAccountInfo.
         */
        public Builder srcAccountInfo(String srcAccountInfo) {
            this.putQueryParameter("srcAccountInfo", srcAccountInfo);
            this.srcAccountInfo = srcAccountInfo;
            return this;
        }

        @Override
        public CreateAgAccountRequest build() {
            return new CreateAgAccountRequest(this);
        } 

    } 

}
