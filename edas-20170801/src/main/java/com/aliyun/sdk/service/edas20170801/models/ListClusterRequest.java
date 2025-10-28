// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListClusterRequest} extends {@link RequestModel}
 *
 * <p>ListClusterRequest</p>
 */
public class ListClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalRegionId")
    private String logicalRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ListClusterRequest(Builder builder) {
        super(builder);
        this.logicalRegionId = builder.logicalRegionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logicalRegionId
     */
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ListClusterRequest, Builder> {
        private String logicalRegionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterRequest request) {
            super(request);
            this.logicalRegionId = request.logicalRegionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The ID of the namespace. You can call the ListUserDefineRegion operation to query the namespace ID. For more information, see <a href="https://help.aliyun.com/document_detail/149377.html">ListUserDefineRegion</a>.</p>
         * <ul>
         * <li>If this parameter is left empty, the clusters in the default namespace are queried.</li>
         * <li>If this parameter is specified, the clusters in the specified namespace are queried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        public Builder logicalRegionId(String logicalRegionId) {
            this.putQueryParameter("LogicalRegionId", logicalRegionId);
            this.logicalRegionId = logicalRegionId;
            return this;
        }

        /**
         * <p>The ID of the resource group. You can call the ListResourceGroup operation to query the resource group ID. For more information, see <a href="https://help.aliyun.com/document_detail/62055.html">ListResourceGroup</a>.</p>
         * <ul>
         * <li>If this parameter is left empty, the clusters in the default resource group are queried.</li>
         * <li>If this parameter is specified, the clusters in the specified resource group are queried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>461</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ListClusterRequest build() {
            return new ListClusterRequest(this);
        } 

    } 

}
