// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private GetUserRequest(Builder builder) {
        super(builder);
        this.userName = builder.userName;
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
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<GetUserRequest, Builder> {
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(GetUserRequest request) {
            super(request);
            this.userName = request.userName;
        } 

        /**
         * <p>The username of the RAM user.</p>
         * <p>The username must be 1 to 64 characters in length, and can contain letters, digits, periods (.), hyphens (-), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public GetUserRequest build() {
            return new GetUserRequest(this);
        } 

    } 

}
