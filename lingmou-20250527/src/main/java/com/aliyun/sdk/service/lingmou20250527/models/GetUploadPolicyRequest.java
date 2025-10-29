// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lingmou20250527.models;

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
 * {@link GetUploadPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetUploadPolicyRequest</p>
 */
public class GetUploadPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("jwtToken")
    private String jwtToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private GetUploadPolicyRequest(Builder builder) {
        super(builder);
        this.jwtToken = builder.jwtToken;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUploadPolicyRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetUploadPolicyRequest, Builder> {
        private String jwtToken; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetUploadPolicyRequest request) {
            super(request);
            this.jwtToken = request.jwtToken;
            this.type = request.type;
        } 

        /**
         * jwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putQueryParameter("jwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetUploadPolicyRequest build() {
            return new GetUploadPolicyRequest(this);
        } 

    } 

}
