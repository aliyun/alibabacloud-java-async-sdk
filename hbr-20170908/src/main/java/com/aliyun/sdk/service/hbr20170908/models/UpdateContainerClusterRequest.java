// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateContainerClusterRequest} extends {@link RequestModel}
 *
 * <p>UpdateContainerClusterRequest</p>
 */
public class UpdateContainerClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenewToken")
    private Boolean renewToken;

    private UpdateContainerClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.description = builder.description;
        this.name = builder.name;
        this.networkType = builder.networkType;
        this.renewToken = builder.renewToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateContainerClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return renewToken
     */
    public Boolean getRenewToken() {
        return this.renewToken;
    }

    public static final class Builder extends Request.Builder<UpdateContainerClusterRequest, Builder> {
        private String clusterId; 
        private String description; 
        private String name; 
        private String networkType; 
        private Boolean renewToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateContainerClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.description = request.description;
            this.name = request.name;
            this.networkType = request.networkType;
            this.renewToken = request.renewToken;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * RenewToken.
         */
        public Builder renewToken(Boolean renewToken) {
            this.putQueryParameter("RenewToken", renewToken);
            this.renewToken = renewToken;
            return this;
        }

        @Override
        public UpdateContainerClusterRequest build() {
            return new UpdateContainerClusterRequest(this);
        } 

    } 

}
