// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataServicePublishedApisRequest} extends {@link RequestModel}
 *
 * <p>ListDataServicePublishedApisRequest</p>
 */
public class ListDataServicePublishedApisRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiNameKeyword")
    private String apiNameKeyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiPathKeyword")
    private String apiPathKeyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreatorId")
    private String creatorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private Long tenantId;

    private ListDataServicePublishedApisRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.apiNameKeyword = builder.apiNameKeyword;
        this.apiPathKeyword = builder.apiPathKeyword;
        this.creatorId = builder.creatorId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataServicePublishedApisRequest create() {
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
     * @return apiPathKeyword
     */
    public String getApiPathKeyword() {
        return this.apiPathKeyword;
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
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

    public static final class Builder extends Request.Builder<ListDataServicePublishedApisRequest, Builder> {
        private String regionId; 
        private String apiNameKeyword; 
        private String apiPathKeyword; 
        private String creatorId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListDataServicePublishedApisRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.apiNameKeyword = request.apiNameKeyword;
            this.apiPathKeyword = request.apiPathKeyword;
            this.creatorId = request.creatorId;
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
         * The ID of the tenant.
         */
        public Builder apiNameKeyword(String apiNameKeyword) {
            this.putBodyParameter("ApiNameKeyword", apiNameKeyword);
            this.apiNameKeyword = apiNameKeyword;
            return this;
        }

        /**
         * The keyword in the name of the API. The keyword can be used to search for the API whose name contains the keyword.
         */
        public Builder apiPathKeyword(String apiPathKeyword) {
            this.putBodyParameter("ApiPathKeyword", apiPathKeyword);
            this.apiPathKeyword = apiPathKeyword;
            return this;
        }

        /**
         * The keyword in the path of the API. The keyword can be used to search for the API whose path contains the keyword.
         */
        public Builder creatorId(String creatorId) {
            this.putBodyParameter("CreatorId", creatorId);
            this.creatorId = creatorId;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **ListDataServicePublishedApis**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page 1. Default value: 1.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10. A maximum of 100 entries can be returned on each page.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The ID of the workspace.
         */
        public Builder tenantId(Long tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ListDataServicePublishedApisRequest build() {
            return new ListDataServicePublishedApisRequest(this);
        } 

    } 

}
