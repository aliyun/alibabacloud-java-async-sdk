// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataServiceFoldersRequest} extends {@link RequestModel}
 *
 * <p>ListDataServiceFoldersRequest</p>
 */
public class ListDataServiceFoldersRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("FolderNameKeyword")
    private String folderNameKeyword;

    @Body
    @NameInMap("GroupId")
    private String groupId;

    @Body
    @NameInMap("PageNumber")
    @Validation(maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true, minimum = 1)
    private Long projectId;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true, minimum = 1)
    private Long tenantId;

    private ListDataServiceFoldersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.folderNameKeyword = builder.folderNameKeyword;
        this.groupId = builder.groupId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataServiceFoldersRequest create() {
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
     * @return folderNameKeyword
     */
    public String getFolderNameKeyword() {
        return this.folderNameKeyword;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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

    public static final class Builder extends Request.Builder<ListDataServiceFoldersRequest, Builder> {
        private String regionId; 
        private String folderNameKeyword; 
        private String groupId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListDataServiceFoldersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.folderNameKeyword = request.folderNameKeyword;
            this.groupId = request.groupId;
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
         * The keyword in folder names. The keyword is used to search for folders whose names contain this keyword.
         */
        public Builder folderNameKeyword(String folderNameKeyword) {
            this.putBodyParameter("FolderNameKeyword", folderNameKeyword);
            this.folderNameKeyword = folderNameKeyword;
            return this;
        }

        /**
         * The ID of the business process to which the folders belong.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
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
        public ListDataServiceFoldersRequest build() {
            return new ListDataServiceFoldersRequest(this);
        } 

    } 

}
