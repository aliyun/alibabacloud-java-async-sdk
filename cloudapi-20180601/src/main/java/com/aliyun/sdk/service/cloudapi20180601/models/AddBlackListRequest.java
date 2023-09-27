// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddBlackListRequest} extends {@link RequestModel}
 *
 * <p>AddBlackListRequest</p>
 */
public class AddBlackListRequest extends Request {
    @Query
    @NameInMap("BlackContent")
    @Validation(required = true)
    private String blackContent;

    @Query
    @NameInMap("BlackType")
    @Validation(required = true)
    private String blackType;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private AddBlackListRequest(Builder builder) {
        super(builder);
        this.blackContent = builder.blackContent;
        this.blackType = builder.blackType;
        this.description = builder.description;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddBlackListRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<AddBlackListRequest, Builder> {
        private String blackContent; 
        private String blackType; 
        private String description; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(AddBlackListRequest request) {
            super(request);
            this.blackContent = request.blackContent;
            this.blackType = request.blackType;
            this.description = request.description;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
        public AddBlackListRequest build() {
            return new AddBlackListRequest(this);
        } 

    } 

}
