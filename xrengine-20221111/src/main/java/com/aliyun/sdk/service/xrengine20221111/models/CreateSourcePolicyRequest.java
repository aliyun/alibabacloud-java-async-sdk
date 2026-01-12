// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20221111.models;

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
 * {@link CreateSourcePolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateSourcePolicyRequest</p>
 */
public class CreateSourcePolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JwtToken")
    private String jwtToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssKey")
    private String ossKey;

    private CreateSourcePolicyRequest(Builder builder) {
        super(builder);
        this.jwtToken = builder.jwtToken;
        this.ossKey = builder.ossKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSourcePolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return ossKey
     */
    public String getOssKey() {
        return this.ossKey;
    }

    public static final class Builder extends Request.Builder<CreateSourcePolicyRequest, Builder> {
        private String jwtToken; 
        private String ossKey; 

        private Builder() {
            super();
        } 

        private Builder(CreateSourcePolicyRequest request) {
            super(request);
            this.jwtToken = request.jwtToken;
            this.ossKey = request.ossKey;
        } 

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putQueryParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * OssKey.
         */
        public Builder ossKey(String ossKey) {
            this.putQueryParameter("OssKey", ossKey);
            this.ossKey = ossKey;
            return this;
        }

        @Override
        public CreateSourcePolicyRequest build() {
            return new CreateSourcePolicyRequest(this);
        } 

    } 

}
