// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link ListNodePodsRequest} extends {@link RequestModel}
 *
 * <p>ListNodePodsRequest</p>
 */
public class ListNodePodsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GPUIndexes")
    private String GPUIndexes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OversoldTypes")
    private String oversoldTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupId;

    private ListNodePodsRequest(Builder builder) {
        super(builder);
        this.nodeId = builder.nodeId;
        this.GPUIndexes = builder.GPUIndexes;
        this.oversoldTypes = builder.oversoldTypes;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodePodsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return GPUIndexes
     */
    public String getGPUIndexes() {
        return this.GPUIndexes;
    }

    /**
     * @return oversoldTypes
     */
    public String getOversoldTypes() {
        return this.oversoldTypes;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ListNodePodsRequest, Builder> {
        private String nodeId; 
        private String GPUIndexes; 
        private String oversoldTypes; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListNodePodsRequest request) {
            super(request);
            this.nodeId = request.nodeId;
            this.GPUIndexes = request.GPUIndexes;
            this.oversoldTypes = request.oversoldTypes;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lingj19q90jp66nq-mg1a2kc92f9nn8yd-20</p>
         */
        public Builder nodeId(String nodeId) {
            this.putPathParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * GPUIndexes.
         */
        public Builder GPUIndexes(String GPUIndexes) {
            this.putQueryParameter("GPUIndexes", GPUIndexes);
            this.GPUIndexes = GPUIndexes;
            return this;
        }

        /**
         * OversoldTypes.
         */
        public Builder oversoldTypes(String oversoldTypes) {
            this.putQueryParameter("OversoldTypes", oversoldTypes);
            this.oversoldTypes = oversoldTypes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lingj19q90jp66nq</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ListNodePodsRequest build() {
            return new ListNodePodsRequest(this);
        } 

    } 

}
