// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBusinessRequest} extends {@link RequestModel}
 *
 * <p>GetBusinessRequest</p>
 */
public class GetBusinessRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("BusinessId")
    @Validation(required = true)
    private Long businessId;

    @Body
    @NameInMap("ProjectId")
    private Long projectId;

    @Body
    @NameInMap("ProjectIdentifier")
    private String projectIdentifier;

    private GetBusinessRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.businessId = builder.businessId;
        this.projectId = builder.projectId;
        this.projectIdentifier = builder.projectIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBusinessRequest create() {
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
    public Long getBusinessId() {
        return this.businessId;
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

    public static final class Builder extends Request.Builder<GetBusinessRequest, Builder> {
        private String regionId; 
        private Long businessId; 
        private Long projectId; 
        private String projectIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(GetBusinessRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.businessId = request.businessId;
            this.projectId = request.projectId;
            this.projectIdentifier = request.projectIdentifier;
        } 

        /**
         * The region ID. For example, the ID of the China (Shanghai) region is cn-shanghai, and that of the China (Zhangjiakou) region is cn-zhangjiakou. The system automatically determines the value of this parameter based on the endpoint used to call the operation.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the workflow. You can call the [ListBusiness](~~173945~~) operation to query the ID.
         */
        public Builder businessId(Long businessId) {
            this.putBodyParameter("BusinessId", businessId);
            this.businessId = businessId;
            return this;
        }

        /**
         * The ID of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace Management page to obtain the ID. You must specify either this parameter or ProjectIdentifier to determine the DataWorks workspace to which the operation is applied.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The name of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace Settings panel to obtain the name. You must specify either this parameter or ProjectId to determine the DataWorks workspace to which the operation is applied.
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putBodyParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        @Override
        public GetBusinessRequest build() {
            return new GetBusinessRequest(this);
        } 

    } 

}
