// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceTypeRegistrationsRequest} extends {@link RequestModel}
 *
 * <p>ListResourceTypeRegistrationsRequest</p>
 */
public class ListResourceTypeRegistrationsRequest extends Request {
    @Query
    @NameInMap("EntityType")
    private String entityType;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegistrationId")
    private String registrationId;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("Status")
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
         * EntityType.
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegistrationId.
         */
        public Builder registrationId(String registrationId) {
            this.putQueryParameter("RegistrationId", registrationId);
            this.registrationId = registrationId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Status.
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
