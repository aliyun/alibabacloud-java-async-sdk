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
 * {@link UpdateLocationTreeRequest} extends {@link RequestModel}
 *
 * <p>UpdateLocationTreeRequest</p>
 */
public class UpdateLocationTreeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JwtToken")
    private String jwtToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TreeConfig")
    private String treeConfig;

    private UpdateLocationTreeRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.jwtToken = builder.jwtToken;
        this.treeConfig = builder.treeConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLocationTreeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return treeConfig
     */
    public String getTreeConfig() {
        return this.treeConfig;
    }

    public static final class Builder extends Request.Builder<UpdateLocationTreeRequest, Builder> {
        private Long id; 
        private String jwtToken; 
        private String treeConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLocationTreeRequest request) {
            super(request);
            this.id = request.id;
            this.jwtToken = request.jwtToken;
            this.treeConfig = request.treeConfig;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putBodyParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * TreeConfig.
         */
        public Builder treeConfig(String treeConfig) {
            this.putBodyParameter("TreeConfig", treeConfig);
            this.treeConfig = treeConfig;
            return this;
        }

        @Override
        public UpdateLocationTreeRequest build() {
            return new UpdateLocationTreeRequest(this);
        } 

    } 

}
