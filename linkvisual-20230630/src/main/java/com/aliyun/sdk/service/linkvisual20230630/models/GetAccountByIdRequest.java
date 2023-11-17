// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountByIdRequest} extends {@link RequestModel}
 *
 * <p>GetAccountByIdRequest</p>
 */
public class GetAccountByIdRequest extends Request {
    @Query
    @NameInMap("IdentityId")
    private String identityId;

    @Query
    @NameInMap("OpenId")
    private String openId;

    @Query
    @NameInMap("OpenIdAppKey")
    private String openIdAppKey;

    private GetAccountByIdRequest(Builder builder) {
        super(builder);
        this.identityId = builder.identityId;
        this.openId = builder.openId;
        this.openIdAppKey = builder.openIdAppKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountByIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identityId
     */
    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * @return openId
     */
    public String getOpenId() {
        return this.openId;
    }

    /**
     * @return openIdAppKey
     */
    public String getOpenIdAppKey() {
        return this.openIdAppKey;
    }

    public static final class Builder extends Request.Builder<GetAccountByIdRequest, Builder> {
        private String identityId; 
        private String openId; 
        private String openIdAppKey; 

        private Builder() {
            super();
        } 

        private Builder(GetAccountByIdRequest request) {
            super(request);
            this.identityId = request.identityId;
            this.openId = request.openId;
            this.openIdAppKey = request.openIdAppKey;
        } 

        /**
         * IdentityId.
         */
        public Builder identityId(String identityId) {
            this.putQueryParameter("IdentityId", identityId);
            this.identityId = identityId;
            return this;
        }

        /**
         * OpenId.
         */
        public Builder openId(String openId) {
            this.putQueryParameter("OpenId", openId);
            this.openId = openId;
            return this;
        }

        /**
         * OpenIdAppKey.
         */
        public Builder openIdAppKey(String openIdAppKey) {
            this.putQueryParameter("OpenIdAppKey", openIdAppKey);
            this.openIdAppKey = openIdAppKey;
            return this;
        }

        @Override
        public GetAccountByIdRequest build() {
            return new GetAccountByIdRequest(this);
        } 

    } 

}
