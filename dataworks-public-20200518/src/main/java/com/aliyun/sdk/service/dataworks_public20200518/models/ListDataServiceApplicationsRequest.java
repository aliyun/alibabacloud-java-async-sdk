// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataServiceApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListDataServiceApplicationsRequest</p>
 */
public class ListDataServiceApplicationsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private Long tenantId;

    private ListDataServiceApplicationsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectIdList = builder.projectIdList;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataServiceApplicationsRequest create() {
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
     * @return projectIdList
     */
    public String getProjectIdList() {
        return this.projectIdList;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListDataServiceApplicationsRequest, Builder> {
        private String regionId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String projectIdList; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListDataServiceApplicationsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectIdList = request.projectIdList;
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
         * The number of the page to return. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10. Maximum value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the workspace based on which you want to query the basic information of applications. You can specify multiple IDs. Separate them with commas (,). You must specify at least one workspace ID. You can specify a maximum of 50 workspace IDs.
         */
        public Builder projectIdList(String projectIdList) {
            this.putBodyParameter("ProjectIdList", projectIdList);
            this.projectIdList = projectIdList;
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
        public ListDataServiceApplicationsRequest build() {
            return new ListDataServiceApplicationsRequest(this);
        } 

    } 

}
