// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link EstablishRelationTableToBusinessRequest} extends {@link RequestModel}
 *
 * <p>EstablishRelationTableToBusinessRequest</p>
 */
public class EstablishRelationTableToBusinessRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FolderId")
    private String folderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectIdentifier")
    private String projectIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TableGuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableGuid;

    private EstablishRelationTableToBusinessRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.businessId = builder.businessId;
        this.folderId = builder.folderId;
        this.projectId = builder.projectId;
        this.projectIdentifier = builder.projectIdentifier;
        this.tableGuid = builder.tableGuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EstablishRelationTableToBusinessRequest create() {
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
     * @return businessId
     */
    public String getBusinessId() {
        return this.businessId;
    }

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectIdentifier
     */
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    /**
     * @return tableGuid
     */
    public String getTableGuid() {
        return this.tableGuid;
    }

    public static final class Builder extends Request.Builder<EstablishRelationTableToBusinessRequest, Builder> {
        private String regionId; 
        private String businessId; 
        private String folderId; 
        private Long projectId; 
        private String projectIdentifier; 
        private String tableGuid; 

        private Builder() {
            super();
        } 

        private Builder(EstablishRelationTableToBusinessRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.businessId = request.businessId;
            this.folderId = request.folderId;
            this.projectId = request.projectId;
            this.projectIdentifier = request.projectIdentifier;
            this.tableGuid = request.tableGuid;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000001</p>
         */
        public Builder businessId(String businessId) {
            this.putBodyParameter("BusinessId", businessId);
            this.businessId = businessId;
            return this;
        }

        /**
         * FolderId.
         */
        public Builder folderId(String folderId) {
            this.putBodyParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ProjectIdentifier.
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putBodyParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.dw_project.tb1</p>
         */
        public Builder tableGuid(String tableGuid) {
            this.putBodyParameter("TableGuid", tableGuid);
            this.tableGuid = tableGuid;
            return this;
        }

        @Override
        public EstablishRelationTableToBusinessRequest build() {
            return new EstablishRelationTableToBusinessRequest(this);
        } 

    } 

}
