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
 * {@link SetLiveStreamsNotifyUrlConfigRequest} extends {@link RequestModel}
 *
 * <p>SetLiveStreamsNotifyUrlConfigRequest</p>
 */
public class SetLiveStreamsNotifyUrlConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExceptionNotifyUrl")
    private String exceptionNotifyUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyAuthKey")
    private String notifyAuthKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyReqAuth")
    private String notifyReqAuth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyUrl")
    private String notifyUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchNotifyUrl")
    private String switchNotifyUrl;

    private SetLiveStreamsNotifyUrlConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domainName = builder.domainName;
        this.exceptionNotifyUrl = builder.exceptionNotifyUrl;
        this.notifyAuthKey = builder.notifyAuthKey;
        this.notifyReqAuth = builder.notifyReqAuth;
        this.notifyUrl = builder.notifyUrl;
        this.ownerId = builder.ownerId;
        this.switchNotifyUrl = builder.switchNotifyUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLiveStreamsNotifyUrlConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return exceptionNotifyUrl
     */
    public String getExceptionNotifyUrl() {
        return this.exceptionNotifyUrl;
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
    public String getNotifyReqAuth() {
        return this.notifyReqAuth;
    }

    /**
     * @return notifyUrl
     */
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return switchNotifyUrl
     */
    public String getSwitchNotifyUrl() {
        return this.switchNotifyUrl;
    }

    public static final class Builder extends Request.Builder<SetLiveStreamsNotifyUrlConfigRequest, Builder> {
        private String regionId; 
        private String domainName; 
        private String exceptionNotifyUrl; 
        private String notifyAuthKey; 
        private String notifyReqAuth; 
        private String notifyUrl; 
        private Long ownerId; 
        private String switchNotifyUrl; 

        private Builder() {
            super();
        } 

        private Builder(SetLiveStreamsNotifyUrlConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domainName = request.domainName;
            this.exceptionNotifyUrl = request.exceptionNotifyUrl;
            this.notifyAuthKey = request.notifyAuthKey;
            this.notifyReqAuth = request.notifyReqAuth;
            this.notifyUrl = request.notifyUrl;
            this.ownerId = request.ownerId;
            this.switchNotifyUrl = request.switchNotifyUrl;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ingest domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.aliyundoc.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Exception event callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://4a7e5f08.r37.cpolar.top/live/Rsssd/call-back/streamStart">https://4a7e5f08.r37.cpolar.top/live/Rsssd/call-back/streamStart</a></p>
         */
        public Builder exceptionNotifyUrl(String exceptionNotifyUrl) {
            this.putQueryParameter("ExceptionNotifyUrl", exceptionNotifyUrl);
            this.exceptionNotifyUrl = exceptionNotifyUrl;
            return this;
        }

        /**
         * <p>The authentication key.</p>
         * <blockquote>
         * <p> This parameter is required if you set the NotifyReqAuth parameter to <strong>yes</strong>.</p>
         * </blockquote>
         * <p>Value requirements:</p>
         * <ul>
         * <li>The key must be 16 to 64 characters in length.</li>
         * <li>The key can contain letters and digits.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder notifyAuthKey(String notifyAuthKey) {
            this.putQueryParameter("NotifyAuthKey", notifyAuthKey);
            this.notifyAuthKey = notifyAuthKey;
            return this;
        }

        /**
         * <p>Specifies whether to enable callback authentication. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong>: enables callback authentication. If you set this parameter to <strong>yes</strong>, you must also specify the NotifyAuthKey parameter.</li>
         * <li><strong>no</strong>: disables callback authentication.</li>
         * </ul>
         * <blockquote>
         * <p> If you do not specify this parameter, the default value <strong>no</strong> is used.</p>
         * </blockquote>
         * <p>For information about the authentication logic, see <strong>Authentication for stream ingest callbacks</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        public Builder notifyReqAuth(String notifyReqAuth) {
            this.putQueryParameter("NotifyReqAuth", notifyReqAuth);
            this.notifyReqAuth = notifyReqAuth;
            return this;
        }

        /**
         * <p>The URL to which the stream ingest callbacks are sent.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://guide.aliyundoc.com/notify">http://guide.aliyundoc.com/notify</a></p>
         */
        public Builder notifyUrl(String notifyUrl) {
            this.putQueryParameter("NotifyUrl", notifyUrl);
            this.notifyUrl = notifyUrl;
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
         * SwitchNotifyUrl.
         */
        public Builder switchNotifyUrl(String switchNotifyUrl) {
            this.putQueryParameter("SwitchNotifyUrl", switchNotifyUrl);
            this.switchNotifyUrl = switchNotifyUrl;
            return this;
        }

        @Override
        public SetLiveStreamsNotifyUrlConfigRequest build() {
            return new SetLiveStreamsNotifyUrlConfigRequest(this);
        } 

    } 

}
