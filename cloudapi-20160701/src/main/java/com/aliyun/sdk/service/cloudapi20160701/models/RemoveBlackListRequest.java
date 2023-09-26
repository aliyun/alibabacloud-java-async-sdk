// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveBlackListRequest} extends {@link RequestModel}
 *
 * <p>RemoveBlackListRequest</p>
 */
public class RemoveBlackListRequest extends Request {
    @Query
    @NameInMap("BlackContent")
    @Validation(required = true)
    private String blackContent;

    @Query
    @NameInMap("BlackType")
    @Validation(required = true)
    private String blackType;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private RemoveBlackListRequest(Builder builder) {
        super(builder);
        this.blackContent = builder.blackContent;
        this.blackType = builder.blackType;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveBlackListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blackContent
     */
    public String getBlackContent() {
        return this.blackContent;
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

    public static final class Builder extends Request.Builder<RemoveBlackListRequest, Builder> {
        private String blackContent; 
        private String blackType; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(RemoveBlackListRequest request) {
            super(request);
            this.blackContent = request.blackContent;
            this.blackType = request.blackType;
            this.securityToken = request.securityToken;
        } 

        /**
         * BlackContent.
         */
        public Builder blackContent(String blackContent) {
            this.putQueryParameter("BlackContent", blackContent);
            this.blackContent = blackContent;
            return this;
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
        public RemoveBlackListRequest build() {
            return new RemoveBlackListRequest(this);
        } 

    } 

}
