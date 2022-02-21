// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteClusterNodeRequest} extends {@link RequestModel}
 *
 * <p>DeleteClusterNodeRequest</p>
 */
public class DeleteClusterNodeRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("Ip")
    @Validation(required = true)
    private String ip;

    @Query
    @NameInMap("force")
    private String force;

    @Query
    @NameInMap("releaseInstance")
    private String releaseInstance;

    private DeleteClusterNodeRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.ip = builder.ip;
        this.force = builder.force;
        this.releaseInstance = builder.releaseInstance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClusterNodeRequest create() {
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
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return force
     */
    public String getForce() {
        return this.force;
    }

    /**
     * @return releaseInstance
     */
    public String getReleaseInstance() {
        return this.releaseInstance;
    }

    public static final class Builder extends Request.Builder<DeleteClusterNodeRequest, Builder> {
        private String clusterId; 
        private String ip; 
        private String force; 
        private String releaseInstance; 

        private Builder() {
            super();
        } 

        private Builder(DeleteClusterNodeRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.ip = response.ip;
            this.force = response.force;
            this.releaseInstance = response.releaseInstance;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.putPathParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * force.
         */
        public Builder force(String force) {
            this.putQueryParameter("force", force);
            this.force = force;
            return this;
        }

        /**
         * releaseInstance.
         */
        public Builder releaseInstance(String releaseInstance) {
            this.putQueryParameter("releaseInstance", releaseInstance);
            this.releaseInstance = releaseInstance;
            return this;
        }

        @Override
        public DeleteClusterNodeRequest build() {
            return new DeleteClusterNodeRequest(this);
        } 

    } 

}
