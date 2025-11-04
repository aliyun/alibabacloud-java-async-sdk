// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link AddLiveRecordNotifyConfigRequest} extends {@link RequestModel}
 *
 * <p>AddLiveRecordNotifyConfigRequest</p>
 */
public class AddLiveRecordNotifyConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedStatusNotify")
    private Boolean needStatusNotify;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyAuthKey")
    @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 16)
    private String notifyAuthKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyReqAuth")
    private Boolean notifyReqAuth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String notifyUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnDemandUrl")
    private String onDemandUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private AddLiveRecordNotifyConfigRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.needStatusNotify = builder.needStatusNotify;
        this.notifyAuthKey = builder.notifyAuthKey;
        this.notifyReqAuth = builder.notifyReqAuth;
        this.notifyUrl = builder.notifyUrl;
        this.onDemandUrl = builder.onDemandUrl;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLiveRecordNotifyConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return needStatusNotify
     */
    public Boolean getNeedStatusNotify() {
        return this.needStatusNotify;
    }

    /**
     * @return notifyAuthKey
     */
    public String getNotifyAuthKey() {
        return this.notifyAuthKey;
    }

    /**
     * @return notifyReqAuth
     */
    public Boolean getNotifyReqAuth() {
        return this.notifyReqAuth;
    }

    /**
     * @return notifyUrl
     */
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    /**
     * @return onDemandUrl
     */
    public String getOnDemandUrl() {
        return this.onDemandUrl;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<AddLiveRecordNotifyConfigRequest, Builder> {
        private String domainName; 
        private Boolean needStatusNotify; 
        private String notifyAuthKey; 
        private Boolean notifyReqAuth; 
        private String notifyUrl; 
        private String onDemandUrl; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(AddLiveRecordNotifyConfigRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.needStatusNotify = request.needStatusNotify;
            this.notifyAuthKey = request.notifyAuthKey;
            this.notifyReqAuth = request.notifyReqAuth;
            this.notifyUrl = request.notifyUrl;
            this.onDemandUrl = request.onDemandUrl;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The main streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Specifies whether to enable callbacks for recording status. Valid values:</p>
         * <ul>
         * <li>true: enables callbacks for recording status. If you set this parameter to <strong>true</strong>, an example of recording status callback is returned.</li>
         * <li>false (default): disables callbacks for recording status.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder needStatusNotify(Boolean needStatusNotify) {
            this.putQueryParameter("NeedStatusNotify", needStatusNotify);
            this.needStatusNotify = needStatusNotify;
            return this;
        }

        /**
         * NotifyAuthKey.
         */
        public Builder notifyAuthKey(String notifyAuthKey) {
            this.putQueryParameter("NotifyAuthKey", notifyAuthKey);
            this.notifyAuthKey = notifyAuthKey;
            return this;
        }

        /**
         * NotifyReqAuth.
         */
        public Builder notifyReqAuth(Boolean notifyReqAuth) {
            this.putQueryParameter("NotifyReqAuth", notifyReqAuth);
            this.notifyReqAuth = notifyReqAuth;
            return this;
        }

        /**
         * <p>The callback URL that is used to receive notifications about recording events and status.</p>
         * <blockquote>
         * <p> The URL must start with <code>http://</code> or <code>https://</code>. For more information, see <a href="https://help.aliyun.com/document_detail/55016.html">Callbacks for live stream recording</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://demo.aliyundoc.com/examplecallback.action">http://demo.aliyundoc.com/examplecallback.action</a></p>
         */
        public Builder notifyUrl(String notifyUrl) {
            this.putQueryParameter("NotifyUrl", notifyUrl);
            this.notifyUrl = notifyUrl;
            return this;
        }

        /**
         * <p>The callback URL for on-demand recordings.</p>
         * <blockquote>
         * <p> The URL must start with <code>http://</code> or <code>https://</code>. For more information, see <a href="https://help.aliyun.com/document_detail/85910.html">On-demand recording</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://learn.aliyundoc.com/ondemandcallback.action">http://learn.aliyundoc.com/ondemandcallback.action</a></p>
         */
        public Builder onDemandUrl(String onDemandUrl) {
            this.putQueryParameter("OnDemandUrl", onDemandUrl);
            this.onDemandUrl = onDemandUrl;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public AddLiveRecordNotifyConfigRequest build() {
            return new AddLiveRecordNotifyConfigRequest(this);
        } 

    } 

}
