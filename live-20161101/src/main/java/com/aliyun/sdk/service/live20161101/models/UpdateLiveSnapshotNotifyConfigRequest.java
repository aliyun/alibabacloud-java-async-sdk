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
 * {@link UpdateLiveSnapshotNotifyConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveSnapshotNotifyConfigRequest</p>
 */
public class UpdateLiveSnapshotNotifyConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private UpdateLiveSnapshotNotifyConfigRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.notifyAuthKey = builder.notifyAuthKey;
        this.notifyReqAuth = builder.notifyReqAuth;
        this.notifyUrl = builder.notifyUrl;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveSnapshotNotifyConfigRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateLiveSnapshotNotifyConfigRequest, Builder> {
        private String domainName; 
        private String notifyAuthKey; 
        private String notifyReqAuth; 
        private String notifyUrl; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveSnapshotNotifyConfigRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.notifyAuthKey = request.notifyAuthKey;
            this.notifyReqAuth = request.notifyReqAuth;
            this.notifyUrl = request.notifyUrl;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The main streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ww.yourdomain***.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The callback authentication key. The key can be 16 to 32 characters in length and can contain only letters and digits.</p>
         * <blockquote>
         * <p> This parameter is required if you set the NotifyReqAuth parameter to <strong>yes</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>yourkey</p>
         */
        public Builder notifyAuthKey(String notifyAuthKey) {
            this.putQueryParameter("NotifyAuthKey", notifyAuthKey);
            this.notifyAuthKey = notifyAuthKey;
            return this;
        }

        /**
         * <p>Specifies whether to enable callback authentication. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong>: enables callback authentication</li>
         * <li><strong>no</strong>: disables callback authentication</li>
         * </ul>
         * <blockquote>
         * <p> Default value: <strong>no</strong>. If you set this parameter to <strong>yes</strong>, the NotifyAuthKey parameter is required.</p>
         * </blockquote>
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
         * <p>The callback URL. Specify a valid URL that is up to 500 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://callback.yourdomain***.com">http://callback.yourdomain***.com</a></p>
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateLiveSnapshotNotifyConfigRequest build() {
            return new UpdateLiveSnapshotNotifyConfigRequest(this);
        } 

    } 

}
