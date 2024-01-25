// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOperationsRequest} extends {@link RequestModel}
 *
 * <p>ListOperationsRequest</p>
 */
public class ListOperationsRequest extends Request {
    @Query
    @NameInMap("ClusterBizId")
    @Validation(required = true)
    private String clusterBizId;

    @Query
    @NameInMap("ParentOperationNodeId")
    private String parentOperationNodeId;

    private ListOperationsRequest(Builder builder) {
        super(builder);
        this.clusterBizId = builder.clusterBizId;
        this.parentOperationNodeId = builder.parentOperationNodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationsRequest create() {
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
     * @return parentOperationNodeId
     */
    public String getParentOperationNodeId() {
        return this.parentOperationNodeId;
    }

    public static final class Builder extends Request.Builder<ListOperationsRequest, Builder> {
        private String clusterBizId; 
        private String parentOperationNodeId; 

        private Builder() {
            super();
        } 

        private Builder(ListOperationsRequest request) {
            super(request);
            this.clusterBizId = request.clusterBizId;
            this.parentOperationNodeId = request.parentOperationNodeId;
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
         * ParentOperationNodeId.
         */
        public Builder parentOperationNodeId(String parentOperationNodeId) {
            this.putQueryParameter("ParentOperationNodeId", parentOperationNodeId);
            this.parentOperationNodeId = parentOperationNodeId;
            return this;
        }

        @Override
        public ListOperationsRequest build() {
            return new ListOperationsRequest(this);
        } 

    } 

}
