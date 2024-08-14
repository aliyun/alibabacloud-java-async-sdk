// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataServiceApiAuthorityRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataServiceApiAuthorityRequest</p>
 */
public class DeleteDataServiceApiAuthorityRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long apiId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthorizedProjectId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long authorizedProjectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tenantId;

    private DeleteDataServiceApiAuthorityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.apiId = builder.apiId;
        this.authorizedProjectId = builder.authorizedProjectId;
        this.projectId = builder.projectId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataServiceApiAuthorityRequest create() {
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
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<DeleteDataServiceApiAuthorityRequest, Builder> {
        private String regionId; 
        private Long apiId; 
        private Long authorizedProjectId; 
        private Long projectId; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataServiceApiAuthorityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.apiId = request.apiId;
            this.authorizedProjectId = request.authorizedProjectId;
            this.projectId = request.projectId;
            this.tenantId = request.tenantId;
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
         * The API ID.
         */
        public Builder apiId(Long apiId) {
            this.putBodyParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * The ID of the workspace from which you want to revoke the access permissions on the API.
         */
        public Builder authorizedProjectId(Long authorizedProjectId) {
            this.putBodyParameter("AuthorizedProjectId", authorizedProjectId);
            this.authorizedProjectId = authorizedProjectId;
            return this;
        }

        /**
         * The workspace ID.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The tenant ID. This parameter is deprecated.
         */
        public Builder tenantId(Long tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public DeleteDataServiceApiAuthorityRequest build() {
            return new DeleteDataServiceApiAuthorityRequest(this);
        } 

    } 

}
