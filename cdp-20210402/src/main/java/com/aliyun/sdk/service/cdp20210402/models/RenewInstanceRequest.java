// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewInstanceRequest} extends {@link RequestModel}
 *
 * <p>RenewInstanceRequest</p>
 */
public class RenewInstanceRequest extends Request {
    @Query
    @NameInMap("ClusterBizId")
    @Validation(required = true)
    private String clusterBizId;

    @Query
    @NameInMap("Instances")
    private String instances;

    private RenewInstanceRequest(Builder builder) {
        super(builder);
        this.clusterBizId = builder.clusterBizId;
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterBizId
     */
    public String getClusterBizId() {
        return this.clusterBizId;
    }

    /**
     * @return instances
     */
    public String getInstances() {
        return this.instances;
    }

    public static final class Builder extends Request.Builder<RenewInstanceRequest, Builder> {
        private String clusterBizId; 
        private String instances; 

        private Builder() {
            super();
        } 

        private Builder(RenewInstanceRequest request) {
            super(request);
            this.clusterBizId = request.clusterBizId;
            this.instances = request.instances;
        } 

        /**
         * ClusterBizId.
         */
        public Builder clusterBizId(String clusterBizId) {
            this.putQueryParameter("ClusterBizId", clusterBizId);
            this.clusterBizId = clusterBizId;
            return this;
        }

        /**
         * Instances.
         */
        public Builder instances(String instances) {
            this.putQueryParameter("Instances", instances);
            this.instances = instances;
            return this;
        }

        @Override
        public RenewInstanceRequest build() {
            return new RenewInstanceRequest(this);
        } 

    } 

}
