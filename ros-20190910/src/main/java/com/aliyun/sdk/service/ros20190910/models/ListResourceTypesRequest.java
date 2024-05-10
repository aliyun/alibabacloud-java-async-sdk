// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The entity type. Valid values:
         * <p>
         * 
         * *   All: all types of resources.
         * *   Resource (default): regular resources. For more information, see [Resources](~~28863~~).
         * *   DataSource: DataSource resources. For more information, see [DataSource resources](~~404753~~).
         * *   Module: modules.
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * The provider of the resource type. Valid values:
         * <p>
         * 
         * *   ROS (default): The resource type is provided by Resource Orchestration Service (ROS).
         * *   Self: The resource type is provided by you.
         */
        public Builder provider(String provider) {
            this.putQueryParameter("Provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * The resource type. The resource type can contain letters, digits, colons (:), and asterisks (\*). You can use an asterisk (\*) to perform a fuzzy match.
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
