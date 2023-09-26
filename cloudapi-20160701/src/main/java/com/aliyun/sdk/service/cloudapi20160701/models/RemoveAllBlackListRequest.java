// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveAllBlackListRequest} extends {@link RequestModel}
 *
 * <p>RemoveAllBlackListRequest</p>
 */
public class RemoveAllBlackListRequest extends Request {
    @Query
    @NameInMap("BlackType")
    @Validation(required = true)
    private String blackType;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private RemoveAllBlackListRequest(Builder builder) {
        super(builder);
        this.blackType = builder.blackType;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveAllBlackListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blackType
     */
    public String getBlackType() {
        return this.blackType;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<RemoveAllBlackListRequest, Builder> {
        private String blackType; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(RemoveAllBlackListRequest request) {
            super(request);
            this.blackType = request.blackType;
            this.securityToken = request.securityToken;
        } 

        /**
         * BlackType.
         */
        public Builder blackType(String blackType) {
            this.putQueryParameter("BlackType", blackType);
            this.blackType = blackType;
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
        public RemoveAllBlackListRequest build() {
            return new RemoveAllBlackListRequest(this);
        } 

    } 

}
