// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the workflow. You can call the [ListBusiness](~~173945~~) operation to query the ID.
         */
        public Builder businessId(String businessId) {
            this.putBodyParameter("BusinessId", businessId);
            this.businessId = businessId;
            return this;
        }

        /**
         * The ID of the folder. You can call the [GetFolder](~~173952~~) or [ListFolders](~~173955~~) operation to query the ID.
         */
        public Builder folderId(String folderId) {
            this.putBodyParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * The ID of the DataWorks workspace. You can click the Workspace Manage icon in the upper-right corner of the DataStudio page to go to the Workspace Management page and view the workspace ID.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The unique identifier of the DataWorks workspace. You can click the identifier in the upper-left corner of the DataStudio page to switch to another workspace.
         * <p>
         * 
         * You must specify either this parameter or ProjectId to determine the DataWorks workspace to which the operation is applied.
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putBodyParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        /**
         * The universally unique identifier (UUID) of the table. You can call the [SearchMetaTables](~~173919~~) operation to query the UUID.
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
