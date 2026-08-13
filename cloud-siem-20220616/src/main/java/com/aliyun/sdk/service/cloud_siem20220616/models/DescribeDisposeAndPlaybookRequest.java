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
 * {@link DescribeDisposeAndPlaybookRequest} extends {@link RequestModel}
 *
 * <p>DescribeDisposeAndPlaybookRequest</p>
 */
public class DescribeDisposeAndPlaybookRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvailableOnly")
    private Boolean availableOnly;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityUuid")
    private String entityUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityUuidList")
    private String entityUuidList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncidentUuid")
    private String incidentUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
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

    private DescribeDisposeAndPlaybookRequest(Builder builder) {
        super(builder);
        this.availableOnly = builder.availableOnly;
        this.currentPage = builder.currentPage;
        this.entityType = builder.entityType;
        this.entityUuid = builder.entityUuid;
        this.entityUuidList = builder.entityUuidList;
        this.incidentUuid = builder.incidentUuid;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDisposeAndPlaybookRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availableOnly
     */
    public Boolean getAvailableOnly() {
        return this.availableOnly;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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
     * @return entityUuidList
     */
    public String getEntityUuidList() {
        return this.entityUuidList;
    }

    /**
     * @return incidentUuid
     */
    public String getIncidentUuid() {
        return this.incidentUuid;
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

    public static final class Builder extends Request.Builder<DescribeDisposeAndPlaybookRequest, Builder> {
        private Boolean availableOnly; 
        private Integer currentPage; 
        private String entityType; 
        private String entityUuid; 
        private String entityUuidList; 
        private String incidentUuid; 
        private Integer pageSize; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDisposeAndPlaybookRequest request) {
            super(request);
            this.availableOnly = request.availableOnly;
            this.currentPage = request.currentPage;
            this.entityType = request.entityType;
            this.entityUuid = request.entityUuid;
            this.entityUuidList = request.entityUuidList;
            this.incidentUuid = request.incidentUuid;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
        } 

        /**
         * AvailableOnly.
         */
        public Builder availableOnly(Boolean availableOnly) {
            this.putQueryParameter("AvailableOnly", availableOnly);
            this.availableOnly = availableOnly;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1.</p>
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
         * <p>The entity type. Valid values:</p>
         * <ul>
         * <li>ip</li>
         * <li>process</li>
         * <li>file</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
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
         * EntityUuidList.
         */
        public Builder entityUuidList(String entityUuidList) {
            this.putQueryParameter("EntityUuidList", entityUuidList);
            this.entityUuidList = entityUuidList;
            return this;
        }

        /**
         * <p>The UUID of the event.</p>
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
         * <p>The number of entries to return on each page. Maximum value: 100.</p>
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
         * <p>The data management center of the threat analysis feature. Specify this parameter based on the region in which your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets reside in regions inside China.</li>
         * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the account that you switch from the management account.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The type of the view. Valid values:</p>
         * <ul>
         * <li>0: the current Alibaba Cloud account</li>
         * <li>1: the global account</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        @Override
        public DescribeDisposeAndPlaybookRequest build() {
            return new DescribeDisposeAndPlaybookRequest(this);
        } 

    } 

}
