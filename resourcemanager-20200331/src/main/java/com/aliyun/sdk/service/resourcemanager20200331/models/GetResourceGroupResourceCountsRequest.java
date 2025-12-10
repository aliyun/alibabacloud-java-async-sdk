// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link GetResourceGroupResourceCountsRequest} extends {@link RequestModel}
 *
 * <p>GetResourceGroupResourceCountsRequest</p>
 */
public class GetResourceGroupResourceCountsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupByKey")
    private String groupByKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
    private String resourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTypes")
    private java.util.List<ResourceTypes> resourceTypes;

    private GetResourceGroupResourceCountsRequest(Builder builder) {
        super(builder);
        this.groupByKey = builder.groupByKey;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceRegionId = builder.resourceRegionId;
        this.resourceTypes = builder.resourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceGroupResourceCountsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupByKey
     */
    public String getGroupByKey() {
        return this.groupByKey;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceRegionId
     */
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    /**
     * @return resourceTypes
     */
    public java.util.List<ResourceTypes> getResourceTypes() {
        return this.resourceTypes;
    }

    public static final class Builder extends Request.Builder<GetResourceGroupResourceCountsRequest, Builder> {
        private String groupByKey; 
        private String resourceGroupId; 
        private String resourceRegionId; 
        private java.util.List<ResourceTypes> resourceTypes; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceGroupResourceCountsRequest request) {
            super(request);
            this.groupByKey = request.groupByKey;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceRegionId = request.resourceRegionId;
            this.resourceTypes = request.resourceTypes;
        } 

        /**
         * <p>The dimension by which resources are queried.</p>
         * <blockquote>
         * <p>If you do not specify a dimension, no results are returned.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>ResourceGroupId</li>
         * <li>ResourceType</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ResourceGroupId</p>
         */
        public Builder groupByKey(String groupByKey) {
            this.putQueryParameter("GroupByKey", groupByKey);
            this.groupByKey = groupByKey;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2716558.html">ListResourceGroups</a> operation to obtain the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-9gLOoK****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The region ID of the resources.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder resourceRegionId(String resourceRegionId) {
            this.putQueryParameter("ResourceRegionId", resourceRegionId);
            this.resourceRegionId = resourceRegionId;
            return this;
        }

        /**
         * <p>The resource types.</p>
         */
        public Builder resourceTypes(java.util.List<ResourceTypes> resourceTypes) {
            this.putQueryParameter("ResourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
            return this;
        }

        @Override
        public GetResourceGroupResourceCountsRequest build() {
            return new GetResourceGroupResourceCountsRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceGroupResourceCountsRequest} extends {@link TeaModel}
     *
     * <p>GetResourceGroupResourceCountsRequest</p>
     */
    public static class ResourceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceTypeCode")
        private String resourceTypeCode;

        @com.aliyun.core.annotation.NameInMap("Service")
        private String service;

        private ResourceTypes(Builder builder) {
            this.resourceTypeCode = builder.resourceTypeCode;
            this.service = builder.service;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceTypes create() {
            return builder().build();
        }

        /**
         * @return resourceTypeCode
         */
        public String getResourceTypeCode() {
            return this.resourceTypeCode;
        }

        /**
         * @return service
         */
        public String getService() {
            return this.service;
        }

        public static final class Builder {
            private String resourceTypeCode; 
            private String service; 

            private Builder() {
            } 

            private Builder(ResourceTypes model) {
                this.resourceTypeCode = model.resourceTypeCode;
                this.service = model.service;
            } 

            /**
             * <p>The resource type.</p>
             * <p>You can obtain the resource type from the <strong>Resource type</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder resourceTypeCode(String resourceTypeCode) {
                this.resourceTypeCode = resourceTypeCode;
                return this;
            }

            /**
             * <p>The service code.</p>
             * <p>You can obtain the code from the <strong>Service code</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            public ResourceTypes build() {
                return new ResourceTypes(this);
            } 

        } 

    }
}
