// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceTypeRegistrationsRequest} extends {@link RequestModel}
 *
 * <p>ListResourceTypeRegistrationsRequest</p>
 */
public class ListResourceTypeRegistrationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrationId")
    private String registrationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListResourceTypeRegistrationsRequest(Builder builder) {
        super(builder);
        this.entityType = builder.entityType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.registrationId = builder.registrationId;
        this.resourceType = builder.resourceType;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceTypeRegistrationsRequest create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return registrationId
     */
    public String getRegistrationId() {
        return this.registrationId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListResourceTypeRegistrationsRequest, Builder> {
        private String entityType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String registrationId; 
        private String resourceType; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceTypeRegistrationsRequest request) {
            super(request);
            this.entityType = request.entityType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.registrationId = request.registrationId;
            this.resourceType = request.resourceType;
            this.status = request.status;
        } 

        /**
         * The entity type. Set the value to Module.
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * The page number. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values: 1 to 50. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the registration record.
         */
        public Builder registrationId(String registrationId) {
            this.putQueryParameter("RegistrationId", registrationId);
            this.registrationId = registrationId;
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

        /**
         * The registration state. Valid values:
         * <p>
         * 
         * *   IN_PROGRESS
         * *   COMPLETE
         * *   FAILED
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListResourceTypeRegistrationsRequest build() {
            return new ListResourceTypeRegistrationsRequest(this);
        } 

    } 

}
