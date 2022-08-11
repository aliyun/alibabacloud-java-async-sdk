// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCurrentTasksForResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>ListCurrentTasksForResourceGroupRequest</p>
 */
public class ListCurrentTasksForResourceGroupRequest extends Request {
    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    private String projectEnv;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ResourceGroupIdentifier")
    @Validation(required = true)
    private String resourceGroupIdentifier;

    @Body
    @NameInMap("Status")
    @Validation(required = true, maximum = 10, minimum = 1)
    private Integer status;

    private ListCurrentTasksForResourceGroupRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectEnv = builder.projectEnv;
        this.regionId = builder.regionId;
        this.resourceGroupIdentifier = builder.resourceGroupIdentifier;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCurrentTasksForResourceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupIdentifier
     */
    public String getResourceGroupIdentifier() {
        return this.resourceGroupIdentifier;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListCurrentTasksForResourceGroupRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String projectEnv; 
        private String regionId; 
        private String resourceGroupIdentifier; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(ListCurrentTasksForResourceGroupRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectEnv = request.projectEnv;
            this.regionId = request.regionId;
            this.resourceGroupIdentifier = request.resourceGroupIdentifier;
            this.status = request.status;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProjectEnv.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
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
         * ResourceGroupIdentifier.
         */
        public Builder resourceGroupIdentifier(String resourceGroupIdentifier) {
            this.putBodyParameter("ResourceGroupIdentifier", resourceGroupIdentifier);
            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }

        /**
         * 3-等待资源；4-运行中
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListCurrentTasksForResourceGroupRequest build() {
            return new ListCurrentTasksForResourceGroupRequest(this);
        } 

    } 

}
