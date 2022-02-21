// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetVsStreamsNotifyUrlConfigRequest} extends {@link RequestModel}
 *
 * <p>SetVsStreamsNotifyUrlConfigRequest</p>
 */
public class SetVsStreamsNotifyUrlConfigRequest extends Request {
    @Query
    @NameInMap("AuthKey")
    private String authKey;

    @Query
    @NameInMap("AuthType")
    private String authType;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("NotifyUrl")
    @Validation(required = true)
    private String notifyUrl;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private SetVsStreamsNotifyUrlConfigRequest(Builder builder) {
        super(builder);
        this.authKey = builder.authKey;
        this.authType = builder.authType;
        this.domainName = builder.domainName;
        this.notifyUrl = builder.notifyUrl;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetVsStreamsNotifyUrlConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
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

    public static final class Builder extends Request.Builder<SetVsStreamsNotifyUrlConfigRequest, Builder> {
        private String authKey; 
        private String authType; 
        private String domainName; 
        private String notifyUrl; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(SetVsStreamsNotifyUrlConfigRequest response) {
            super(response);
            this.authKey = response.authKey;
            this.authType = response.authType;
            this.domainName = response.domainName;
            this.notifyUrl = response.notifyUrl;
            this.ownerId = response.ownerId;
        } 

        /**
         * AuthKey.
         */
        public Builder authKey(String authKey) {
            this.putQueryParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * AuthType.
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * NotifyUrl.
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

        @Override
        public SetVsStreamsNotifyUrlConfigRequest build() {
            return new SetVsStreamsNotifyUrlConfigRequest(this);
        } 

    } 

}
