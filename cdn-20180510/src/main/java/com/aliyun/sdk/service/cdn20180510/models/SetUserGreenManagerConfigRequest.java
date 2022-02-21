// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetUserGreenManagerConfigRequest} extends {@link RequestModel}
 *
 * <p>SetUserGreenManagerConfigRequest</p>
 */
public class SetUserGreenManagerConfigRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Quota")
    @Validation(required = true)
    private String quota;

    @Query
    @NameInMap("Ratio")
    @Validation(required = true)
    private String ratio;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SetUserGreenManagerConfigRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.quota = builder.quota;
        this.ratio = builder.ratio;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetUserGreenManagerConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return quota
     */
    public String getQuota() {
        return this.quota;
    }

    /**
     * @return ratio
     */
    public String getRatio() {
        return this.ratio;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<SetUserGreenManagerConfigRequest, Builder> {
        private Long ownerId; 
        private String quota; 
        private String ratio; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetUserGreenManagerConfigRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.quota = response.quota;
            this.ratio = response.ratio;
            this.securityToken = response.securityToken;
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
         * Quota.
         */
        public Builder quota(String quota) {
            this.putQueryParameter("Quota", quota);
            this.quota = quota;
            return this;
        }

        /**
         * Ratio.
         */
        public Builder ratio(String ratio) {
            this.putQueryParameter("Ratio", ratio);
            this.ratio = ratio;
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
        public SetUserGreenManagerConfigRequest build() {
            return new SetUserGreenManagerConfigRequest(this);
        } 

    } 

}
