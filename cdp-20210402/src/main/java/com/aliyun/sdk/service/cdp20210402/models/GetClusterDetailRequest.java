// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterDetailRequest} extends {@link RequestModel}
 *
 * <p>GetClusterDetailRequest</p>
 */
public class GetClusterDetailRequest extends Request {
    @Query
    @NameInMap("ClusterBizId")
    @Validation(required = true)
    private String clusterBizId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    private GetClusterDetailRequest(Builder builder) {
        super(builder);
        this.clusterBizId = builder.clusterBizId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterDetailRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetClusterDetailRequest, Builder> {
        private String clusterBizId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetClusterDetailRequest request) {
            super(request);
            this.clusterBizId = request.clusterBizId;
            this.instanceId = request.instanceId;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetClusterDetailRequest build() {
            return new GetClusterDetailRequest(this);
        } 

    } 

}
