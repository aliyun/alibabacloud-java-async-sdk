// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateEdgeContainerAppImageSecretRequest} extends {@link RequestModel}
 *
 * <p>CreateEdgeContainerAppImageSecretRequest</p>
 */
public class CreateEdgeContainerAppImageSecretRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Registry")
    @com.aliyun.core.annotation.Validation(required = true)
    private String registry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    @com.aliyun.core.annotation.Validation(required = true)
    private String username;

    private CreateEdgeContainerAppImageSecretRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.password = builder.password;
        this.registry = builder.registry;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEdgeContainerAppImageSecretRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return registry
     */
    public String getRegistry() {
        return this.registry;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<CreateEdgeContainerAppImageSecretRequest, Builder> {
        private String appId; 
        private String password; 
        private String registry; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(CreateEdgeContainerAppImageSecretRequest request) {
            super(request);
            this.appId = request.appId;
            this.password = request.password;
            this.registry = request.registry;
            this.username = request.username;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app-88068867578379****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-cn-shanghai.edas.aliyuncs.com</p>
         */
        public Builder registry(String registry) {
            this.putQueryParameter("Registry", registry);
            this.registry = registry;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public CreateEdgeContainerAppImageSecretRequest build() {
            return new CreateEdgeContainerAppImageSecretRequest(this);
        } 

    } 

}
