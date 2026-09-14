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
 * {@link CreateBusinessRequest} extends {@link RequestModel}
 *
 * <p>CreateBusinessRequest</p>
 */
public class CreateBusinessRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectIdentifier")
    private String projectIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UseType")
    private String useType;

    private CreateBusinessRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.businessName = builder.businessName;
        this.description = builder.description;
        this.owner = builder.owner;
        this.projectId = builder.projectId;
        this.projectIdentifier = builder.projectIdentifier;
        this.useType = builder.useType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBusinessRequest create() {
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
     * @return businessName
     */
    public String getBusinessName() {
        return this.businessName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
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
     * @return useType
     */
    public String getUseType() {
        return this.useType;
    }

    public static final class Builder extends Request.Builder<CreateBusinessRequest, Builder> {
        private String regionId; 
        private String businessName; 
        private String description; 
        private String owner; 
        private Long projectId; 
        private String projectIdentifier; 
        private String useType; 

        private Builder() {
            super();
        } 

        private Builder(CreateBusinessRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.businessName = request.businessName;
            this.description = request.description;
            this.owner = request.owner;
            this.projectId = request.projectId;
            this.projectIdentifier = request.projectIdentifier;
            this.useType = request.useType;
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
         * <p>The name of the business process. The name must be unique within the same workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>My business process</p>
         */
        public Builder businessName(String businessName) {
            this.putBodyParameter("BusinessName", businessName);
            this.businessName = businessName;
            return this;
        }

        /**
         * <p>The description of the business process.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the owner of the business process. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and hover over the profile picture in the upper-right corner of the top navigation bar to view the account ID. If this parameter is left empty, the Alibaba Cloud account ID of the caller is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000001</p>
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace management page to view the ID.</p>
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
         * <p>The unique identifier of the DataWorks workspace, which is the English identifier displayed in the workspace switcher at the top of the DataStudio page. You must specify either this parameter or ProjectId to determine the DataWorks workspace on which the API operation is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>dw_project</p>
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putBodyParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        /**
         * <p>The functional module to which the business process belongs. Valid values:</p>
         * <ul>
         * <li>NORMAL: DataStudio.</li>
         * <li>MANUAL_BIZ: Manual business process.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder useType(String useType) {
            this.putBodyParameter("UseType", useType);
            this.useType = useType;
            return this;
        }

        @Override
        public CreateBusinessRequest build() {
            return new CreateBusinessRequest(this);
        } 

    } 

}
