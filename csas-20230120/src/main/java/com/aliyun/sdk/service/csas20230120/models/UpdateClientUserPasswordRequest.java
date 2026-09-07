// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link UpdateClientUserPasswordRequest} extends {@link RequestModel}
 *
 * <p>UpdateClientUserPasswordRequest</p>
 */
public class UpdateClientUserPasswordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    private UpdateClientUserPasswordRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.password = builder.password;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateClientUserPasswordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<UpdateClientUserPasswordRequest, Builder> {
        private String id; 
        private String password; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(UpdateClientUserPasswordRequest request) {
            super(request);
            this.id = request.id;
            this.password = request.password;
            this.username = request.username;
        } 

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1128</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The password. If this parameter is left empty, a random password is automatically generated.</p>
         * 
         * <strong>example:</strong>
         * <p>kehudiyidj</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public UpdateClientUserPasswordRequest build() {
            return new UpdateClientUserPasswordRequest(this);
        } 

    } 

}
