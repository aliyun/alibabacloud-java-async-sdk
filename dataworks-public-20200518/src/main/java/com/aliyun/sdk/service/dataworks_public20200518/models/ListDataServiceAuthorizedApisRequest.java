// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataServiceAuthorizedApisRequest} extends {@link RequestModel}
 *
 * <p>ListDataServiceAuthorizedApisRequest</p>
 */
public class ListDataServiceAuthorizedApisRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("ApiNameKeyword")
    private String apiNameKeyword;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private Long projectId;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private Long tenantId;

    private ListDataServiceAuthorizedApisRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.apiNameKeyword = builder.apiNameKeyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataServiceAuthorizedApisRequest create() {
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
     * @return apiNameKeyword
     */
    public String getApiNameKeyword() {
        return this.apiNameKeyword;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<ListDataServiceAuthorizedApisRequest, Builder> {
        private String regionId; 
        private String apiNameKeyword; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListDataServiceAuthorizedApisRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.apiNameKeyword = request.apiNameKeyword;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
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
         * The keyword in API names. The keyword is used to search for the APIs whose names contain the keyword.
         */
        public Builder apiNameKeyword(String apiNameKeyword) {
            this.putBodyParameter("ApiNameKeyword", apiNameKeyword);
            this.apiNameKeyword = apiNameKeyword;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10. Maximum value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the workspace.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The ID of the tenant.
         */
        public Builder tenantId(Long tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ListDataServiceAuthorizedApisRequest build() {
            return new ListDataServiceAuthorizedApisRequest(this);
        } 

    } 

}
