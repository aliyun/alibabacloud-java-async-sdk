// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataServiceApiAuthorityRequest} extends {@link RequestModel}
 *
 * <p>CreateDataServiceApiAuthorityRequest</p>
 */
public class CreateDataServiceApiAuthorityRequest extends Request {
    @Body
    @NameInMap("ApiId")
    @Validation(required = true, minimum = 1)
    private Long apiId;

    @Body
    @NameInMap("AuthorizedProjectId")
    @Validation(required = true, minimum = 1)
    private Long authorizedProjectId;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true, minimum = 1)
    private Long endTime;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true, minimum = 1)
    private Long projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true, minimum = 1)
    private Long tenantId;

    private CreateDataServiceApiAuthorityRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.authorizedProjectId = builder.authorizedProjectId;
        this.endTime = builder.endTime;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataServiceApiAuthorityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiId
     */
    public Long getApiId() {
        return this.apiId;
    }

    /**
     * @return authorizedProjectId
     */
    public Long getAuthorizedProjectId() {
        return this.authorizedProjectId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreateDataServiceApiAuthorityRequest, Builder> {
        private Long apiId; 
        private Long authorizedProjectId; 
        private Long endTime; 
        private Long projectId; 
        private String regionId; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataServiceApiAuthorityRequest request) {
            super(request);
            this.apiId = request.apiId;
            this.authorizedProjectId = request.authorizedProjectId;
            this.endTime = request.endTime;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.tenantId = request.tenantId;
        } 

        /**
         * ApiId.
         */
        public Builder apiId(Long apiId) {
            this.putBodyParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * AuthorizedProjectId.
         */
        public Builder authorizedProjectId(Long authorizedProjectId) {
            this.putBodyParameter("AuthorizedProjectId", authorizedProjectId);
            this.authorizedProjectId = authorizedProjectId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreateDataServiceApiAuthorityRequest build() {
            return new CreateDataServiceApiAuthorityRequest(this);
        } 

    } 

}
