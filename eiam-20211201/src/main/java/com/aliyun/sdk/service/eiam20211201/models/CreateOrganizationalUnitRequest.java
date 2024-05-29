// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrganizationalUnitRequest} extends {@link RequestModel}
 *
 * <p>CreateOrganizationalUnitRequest</p>
 */
public class CreateOrganizationalUnitRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationalUnitExternalId")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String organizationalUnitExternalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationalUnitName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String organizationalUnitName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String parentId;

    private CreateOrganizationalUnitRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.organizationalUnitExternalId = builder.organizationalUnitExternalId;
        this.organizationalUnitName = builder.organizationalUnitName;
        this.parentId = builder.parentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrganizationalUnitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return organizationalUnitExternalId
     */
    public String getOrganizationalUnitExternalId() {
        return this.organizationalUnitExternalId;
    }

    /**
     * @return organizationalUnitName
     */
    public String getOrganizationalUnitName() {
        return this.organizationalUnitName;
    }

    /**
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    public static final class Builder extends Request.Builder<CreateOrganizationalUnitRequest, Builder> {
        private String regionId; 
        private String description; 
        private String instanceId; 
        private String organizationalUnitExternalId; 
        private String organizationalUnitName; 
        private String parentId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrganizationalUnitRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.organizationalUnitExternalId = request.organizationalUnitExternalId;
            this.organizationalUnitName = request.organizationalUnitName;
            this.parentId = request.parentId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The description of the organization. The value can be up to 256 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The external ID of the organization, which can be used to associate the organization with an external system. By default, the external ID is the organization ID. The value can be up to 64 characters in length.
         */
        public Builder organizationalUnitExternalId(String organizationalUnitExternalId) {
            this.putQueryParameter("OrganizationalUnitExternalId", organizationalUnitExternalId);
            this.organizationalUnitExternalId = organizationalUnitExternalId;
            return this;
        }

        /**
         * The name of the organization. The name can be up to 64 characters in length.
         */
        public Builder organizationalUnitName(String organizationalUnitName) {
            this.putQueryParameter("OrganizationalUnitName", organizationalUnitName);
            this.organizationalUnitName = organizationalUnitName;
            return this;
        }

        /**
         * The parent organization ID.
         */
        public Builder parentId(String parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        @Override
        public CreateOrganizationalUnitRequest build() {
            return new CreateOrganizationalUnitRequest(this);
        } 

    } 

}
