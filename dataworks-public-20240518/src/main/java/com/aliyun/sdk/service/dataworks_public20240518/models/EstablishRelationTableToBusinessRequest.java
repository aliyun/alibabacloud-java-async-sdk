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
         * <p>The workflow ID. You can call the <a href="https://help.aliyun.com/document_detail/173945.html">ListBusiness</a> operation to obtain the workflow ID.</p>
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
         * <p>The ID of the folder. You can call the <a href="https://help.aliyun.com/document_detail/173952.html">GetFolder</a> or <a href="https://help.aliyun.com/document_detail/173955.html">ListFolders</a> operation to obtain the folder ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2eb6f9****</p>
         */
        public Builder folderId(String folderId) {
            this.putBodyParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace. You can click the wrench icon in the top-right corner to access the workspace management page and view the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The unique identifier of the DataWorks workspace. This is the identifier shown in the workspace switcher at the top of the Data Studio page.</p>
         * <p>Either this parameter or ProjectId must be specified to determine which DataWorks workspace this API call operates on.</p>
         * 
         * <strong>example:</strong>
         * <p>dw</p>
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putBodyParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        /**
         * <p>The UUID of the table. You can call the <a href="https://help.aliyun.com/document_detail/173919.html">SearchMetaTables</a> operation to obtain the table UUID.</p>
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
