// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link ListResourceTypesRequest} extends {@link RequestModel}
 *
 * <p>ListResourceTypesRequest</p>
 */
public class ListResourceTypesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Provider")
    private String provider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private ListResourceTypesRequest(Builder builder) {
        super(builder);
        this.entityType = builder.entityType;
        this.provider = builder.provider;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceTypesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<ListResourceTypesRequest, Builder> {
        private String entityType; 
        private String provider; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceTypesRequest request) {
            super(request);
            this.entityType = request.entityType;
            this.provider = request.provider;
            this.resourceType = request.resourceType;
        } 

        /**
         * <p>The entity type. Valid values:</p>
         * <ul>
         * <li>All: all types of resources.</li>
         * <li>Resource (default): regular resources. For more information, see <a href="https://help.aliyun.com/document_detail/28863.html">Resources</a>.</li>
         * <li>DataSource: DataSource resources. For more information, see <a href="https://help.aliyun.com/document_detail/404753.html">DataSource resources</a>.</li>
         * <li>Module: modules.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Resource</p>
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * <p>The provider of the resource type. Valid values:</p>
         * <ul>
         * <li>ROS (default): The resource type is provided by Resource Orchestration Service (ROS).</li>
         * <li>Self: The resource type is provided by you.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ROS</p>
         */
        public Builder provider(String provider) {
            this.putQueryParameter("Provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * <p>The resource type. The resource type can contain letters, digits, colons (:), and asterisks (*). You can use an asterisk (*) to perform a fuzzy match.</p>
         * 
         * <strong>example:</strong>
         * <p>MODULE::MyOrganization::MyService::MyUsecase</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public ListResourceTypesRequest build() {
            return new ListResourceTypesRequest(this);
        } 

    } 

}
