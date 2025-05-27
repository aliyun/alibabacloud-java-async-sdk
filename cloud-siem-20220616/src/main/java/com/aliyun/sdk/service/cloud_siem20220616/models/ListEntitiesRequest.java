// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link ListEntitiesRequest} extends {@link RequestModel}
 *
 * <p>ListEntitiesRequest</p>
 */
public class ListEntitiesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityName")
    private String entityName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityUuid")
    private String entityUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncidentUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String incidentUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsMalwareEntity")
    private String isMalwareEntity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MalwareType")
    private String malwareType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    private ListEntitiesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.entityName = builder.entityName;
        this.entityType = builder.entityType;
        this.entityUuid = builder.entityUuid;
        this.incidentUuid = builder.incidentUuid;
        this.isMalwareEntity = builder.isMalwareEntity;
        this.malwareType = builder.malwareType;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEntitiesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return entityName
     */
    public String getEntityName() {
        return this.entityName;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return entityUuid
     */
    public String getEntityUuid() {
        return this.entityUuid;
    }

    /**
     * @return incidentUuid
     */
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    /**
     * @return isMalwareEntity
     */
    public String getIsMalwareEntity() {
        return this.isMalwareEntity;
    }

    /**
     * @return malwareType
     */
    public String getMalwareType() {
        return this.malwareType;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public Integer getRoleType() {
        return this.roleType;
    }

    public static final class Builder extends Request.Builder<ListEntitiesRequest, Builder> {
        private Integer currentPage; 
        private String entityName; 
        private String entityType; 
        private String entityUuid; 
        private String incidentUuid; 
        private String isMalwareEntity; 
        private String malwareType; 
        private Integer pageSize; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 

        private Builder() {
            super();
        } 

        private Builder(ListEntitiesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.entityName = request.entityName;
            this.entityType = request.entityType;
            this.entityUuid = request.entityUuid;
            this.incidentUuid = request.incidentUuid;
            this.isMalwareEntity = request.isMalwareEntity;
            this.malwareType = request.malwareType;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * EntityName.
         */
        public Builder entityName(String entityName) {
            this.putBodyParameter("EntityName", entityName);
            this.entityName = entityName;
            return this;
        }

        /**
         * EntityType.
         */
        public Builder entityType(String entityType) {
            this.putBodyParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * EntityUuid.
         */
        public Builder entityUuid(String entityUuid) {
            this.putBodyParameter("EntityUuid", entityUuid);
            this.entityUuid = entityUuid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
         */
        public Builder incidentUuid(String incidentUuid) {
            this.putBodyParameter("IncidentUuid", incidentUuid);
            this.incidentUuid = incidentUuid;
            return this;
        }

        /**
         * IsMalwareEntity.
         */
        public Builder isMalwareEntity(String isMalwareEntity) {
            this.putBodyParameter("IsMalwareEntity", isMalwareEntity);
            this.isMalwareEntity = isMalwareEntity;
            return this;
        }

        /**
         * MalwareType.
         */
        public Builder malwareType(String malwareType) {
            this.putBodyParameter("MalwareType", malwareType);
            this.malwareType = malwareType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * RoleType.
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        @Override
        public ListEntitiesRequest build() {
            return new ListEntitiesRequest(this);
        } 

    } 

}
