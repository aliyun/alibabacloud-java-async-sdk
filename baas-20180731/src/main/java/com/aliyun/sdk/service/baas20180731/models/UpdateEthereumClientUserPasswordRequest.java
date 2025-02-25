// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEthereumClientUserPasswordRequest} extends {@link RequestModel}
 *
 * <p>UpdateEthereumClientUserPasswordRequest</p>
 */
public class UpdateEthereumClientUserPasswordRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Username")
    @com.aliyun.core.annotation.Validation(required = true)
    private String username;

    private UpdateEthereumClientUserPasswordRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.nodeId = builder.nodeId;
        this.password = builder.password;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEthereumClientUserPasswordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
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

    public static final class Builder extends Request.Builder<UpdateEthereumClientUserPasswordRequest, Builder> {
        private String regionId; 
        private String nodeId; 
        private String password; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEthereumClientUserPasswordRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.nodeId = request.nodeId;
            this.password = request.password;
            this.username = request.username;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putBodyParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public UpdateEthereumClientUserPasswordRequest build() {
            return new UpdateEthereumClientUserPasswordRequest(this);
        } 

    } 

}
