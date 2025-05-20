// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link GetUserRequest} extends {@link RequestModel}
 *
 * <p>GetUserRequest</p>
 */
public class GetUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userPrincipal")
    private String userPrincipal;

    private GetUserRequest(Builder builder) {
        super(builder);
        this.userPrincipal = builder.userPrincipal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userPrincipal
     */
    public String getUserPrincipal() {
        return this.userPrincipal;
    }

    public static final class Builder extends Request.Builder<GetUserRequest, Builder> {
        private String userPrincipal; 

        private Builder() {
            super();
        } 

        private Builder(GetUserRequest request) {
            super(request);
            this.userPrincipal = request.userPrincipal;
        } 

        /**
         * userPrincipal.
         */
        public Builder userPrincipal(String userPrincipal) {
            this.putQueryParameter("userPrincipal", userPrincipal);
            this.userPrincipal = userPrincipal;
            return this;
        }

        @Override
        public GetUserRequest build() {
            return new GetUserRequest(this);
        } 

    } 

}
