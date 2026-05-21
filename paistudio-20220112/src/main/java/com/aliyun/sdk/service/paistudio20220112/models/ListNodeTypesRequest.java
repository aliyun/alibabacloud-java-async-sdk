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
 * {@link ListNodeTypesRequest} extends {@link RequestModel}
 *
 * <p>ListNodeTypesRequest</p>
 */
public class ListNodeTypesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorType")
    private String acceleratorType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GPUType")
    private String GPUType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeTypes")
    private String nodeTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupIds")
    private String resourceGroupIds;

    private ListNodeTypesRequest(Builder builder) {
        super(builder);
        this.acceleratorType = builder.acceleratorType;
        this.GPUType = builder.GPUType;
        this.nodeTypes = builder.nodeTypes;
        this.quotaId = builder.quotaId;
        this.resourceGroupIds = builder.resourceGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodeTypesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorType
     */
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    /**
     * @return GPUType
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * @return nodeTypes
     */
    public String getNodeTypes() {
        return this.nodeTypes;
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return resourceGroupIds
     */
    public String getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    public static final class Builder extends Request.Builder<ListNodeTypesRequest, Builder> {
        private String acceleratorType; 
        private String GPUType; 
        private String nodeTypes; 
        private String quotaId; 
        private String resourceGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(ListNodeTypesRequest request) {
            super(request);
            this.acceleratorType = request.acceleratorType;
            this.GPUType = request.GPUType;
            this.nodeTypes = request.nodeTypes;
            this.quotaId = request.quotaId;
            this.resourceGroupIds = request.resourceGroupIds;
        } 

        /**
         * AcceleratorType.
         */
        public Builder acceleratorType(String acceleratorType) {
            this.putQueryParameter("AcceleratorType", acceleratorType);
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * GPUType.
         */
        public Builder GPUType(String GPUType) {
            this.putQueryParameter("GPUType", GPUType);
            this.GPUType = GPUType;
            return this;
        }

        /**
         * NodeTypes.
         */
        public Builder nodeTypes(String nodeTypes) {
            this.putQueryParameter("NodeTypes", nodeTypes);
            this.nodeTypes = nodeTypes;
            return this;
        }

        /**
         * QuotaId.
         */
        public Builder quotaId(String quotaId) {
            this.putQueryParameter("QuotaId", quotaId);
            this.quotaId = quotaId;
            return this;
        }

        /**
         * ResourceGroupIds.
         */
        public Builder resourceGroupIds(String resourceGroupIds) {
            this.putQueryParameter("ResourceGroupIds", resourceGroupIds);
            this.resourceGroupIds = resourceGroupIds;
            return this;
        }

        @Override
        public ListNodeTypesRequest build() {
            return new ListNodeTypesRequest(this);
        } 

    } 

}
