// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link UntagResourcesRequest} extends {@link RequestModel}
 *
 * <p>UntagResourcesRequest</p>
 */
public class UntagResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("All")
    private Boolean all;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private java.util.List<String> resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourcePrincipalName")
    private java.util.List<String> resourcePrincipalName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagKey")
    private java.util.List<String> tagKey;

    private UntagResourcesRequest(Builder builder) {
        super(builder);
        this.all = builder.all;
        this.resourceId = builder.resourceId;
        this.resourcePrincipalName = builder.resourcePrincipalName;
        this.resourceType = builder.resourceType;
        this.tagKey = builder.tagKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UntagResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return all
     */
    public Boolean getAll() {
        return this.all;
    }

    /**
     * @return resourceId
     */
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourcePrincipalName
     */
    public java.util.List<String> getResourcePrincipalName() {
        return this.resourcePrincipalName;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tagKey
     */
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

    public static final class Builder extends Request.Builder<UntagResourcesRequest, Builder> {
        private Boolean all; 
        private java.util.List<String> resourceId; 
        private java.util.List<String> resourcePrincipalName; 
        private String resourceType; 
        private java.util.List<String> tagKey; 

        private Builder() {
            super();
        } 

        private Builder(UntagResourcesRequest request) {
            super(request);
            this.all = request.all;
            this.resourceId = request.resourceId;
            this.resourcePrincipalName = request.resourcePrincipalName;
            this.resourceType = request.resourceType;
            this.tagKey = request.tagKey;
        } 

        /**
         * <p>Specifies whether to remove all tags from the resource. Valid values:</p>
         * <ul>
         * <li>true: remove all tags from the resources.</li>
         * <li>false (default): does not remove all tags from the resources.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when TagKey.N is not set in the request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder all(Boolean all) {
            this.putQueryParameter("All", all);
            this.all = all;
            return this;
        }

        /**
         * <p>The IDs of resources.</p>
         * <p>Valid values of N: 1 to 50. If the ResourceType parameter is set to user, the resource ID is the ID of the RAM user.</p>
         * <blockquote>
         * <p>You must specify only one of the following parameters: ResourceId and ResourcePrincipalName.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>UntagResources</p>
         */
        public Builder resourceId(java.util.List<String> resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The names of resources.</p>
         * <p>Valid values of N: 1 to 50. If the ResourceType parameter is set to user, the resource name is the name of the RAM user.</p>
         * <blockquote>
         * <p>You must specify only one of the following parameters: ResourceId and ResourcePrincipalName.</p>
         * </blockquote>
         */
        public Builder resourcePrincipalName(java.util.List<String> resourcePrincipalName) {
            this.putQueryParameter("ResourcePrincipalName", resourcePrincipalName);
            this.resourcePrincipalName = resourcePrincipalName;
            return this;
        }

        /**
         * <p>The type of the resource. Valid value:</p>
         * <ul>
         * <li>user: a RAM user</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The tag keys of resources.</p>
         * <p>Valid values of N: 1 to 20. N must be consecutive.</p>
         */
        public Builder tagKey(java.util.List<String> tagKey) {
            this.putQueryParameter("TagKey", tagKey);
            this.tagKey = tagKey;
            return this;
        }

        @Override
        public UntagResourcesRequest build() {
            return new UntagResourcesRequest(this);
        } 

    } 

}
