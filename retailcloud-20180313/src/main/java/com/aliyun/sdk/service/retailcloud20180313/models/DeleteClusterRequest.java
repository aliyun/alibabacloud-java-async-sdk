// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteClusterRequest} extends {@link RequestModel}
 *
 * <p>DeleteClusterRequest</p>
 */
public class DeleteClusterRequest extends Request {
    @Query
    @NameInMap("ClusterInstanceId")
    @Validation(required = true)
    private String clusterInstanceId;

    private DeleteClusterRequest(Builder builder) {
        super(builder);
        this.clusterInstanceId = builder.clusterInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterInstanceId
     */
    public String getClusterInstanceId() {
        return this.clusterInstanceId;
    }

    public static final class Builder extends Request.Builder<DeleteClusterRequest, Builder> {
        private String clusterInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteClusterRequest request) {
            super(request);
            this.clusterInstanceId = request.clusterInstanceId;
        } 

        /**
         * ClusterInstanceId.
         */
        public Builder clusterInstanceId(String clusterInstanceId) {
            this.putQueryParameter("ClusterInstanceId", clusterInstanceId);
            this.clusterInstanceId = clusterInstanceId;
            return this;
        }

        @Override
        public DeleteClusterRequest build() {
            return new DeleteClusterRequest(this);
        } 

    } 

}
