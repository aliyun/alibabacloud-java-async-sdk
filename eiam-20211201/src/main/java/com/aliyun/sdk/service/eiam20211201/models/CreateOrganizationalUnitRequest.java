// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrganizationalUnitRequest} extends {@link RequestModel}
 *
 * <p>CreateOrganizationalUnitRequest</p>
 */
public class CreateOrganizationalUnitRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Description")
    @Validation(maxLength = 256)
    private String description;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    @Query
    @NameInMap("OrganizationalUnitExternalId")
    @Validation(maxLength = 128)
    private String organizationalUnitExternalId;

    @Query
    @NameInMap("OrganizationalUnitName")
    @Validation(required = true, maxLength = 64)
    private String organizationalUnitName;

    @Query
    @NameInMap("ParentId")
    @Validation(required = true, maxLength = 64)
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
         * 组织描述。
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * IDaaS EIAM实例的ID。
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 外部ID。
         */
        public Builder organizationalUnitExternalId(String organizationalUnitExternalId) {
            this.putQueryParameter("OrganizationalUnitExternalId", organizationalUnitExternalId);
            this.organizationalUnitExternalId = organizationalUnitExternalId;
            return this;
        }

        /**
         * 组织名称。
         */
        public Builder organizationalUnitName(String organizationalUnitName) {
            this.putQueryParameter("OrganizationalUnitName", organizationalUnitName);
            this.organizationalUnitName = organizationalUnitName;
            return this;
        }

        /**
         * 父组织ID。
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
