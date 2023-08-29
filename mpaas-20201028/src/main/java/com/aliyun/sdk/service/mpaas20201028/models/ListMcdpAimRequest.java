// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMcdpAimRequest} extends {@link RequestModel}
 *
 * <p>ListMcdpAimRequest</p>
 */
public class ListMcdpAimRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    private String appId;

    @Body
    @NameInMap("EmptyTag")
    private String emptyTag;

    @Body
    @NameInMap("Keyword")
    private String keyword;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("PageNo")
    private Long pageNo;

    @Body
    @NameInMap("PageSize")
    private Long pageSize;

    @Body
    @NameInMap("Sort")
    private String sort;

    @Body
    @NameInMap("SortField")
    private String sortField;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    @Body
    @NameInMap("Type")
    private String type;

    @Body
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private ListMcdpAimRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.emptyTag = builder.emptyTag;
        this.keyword = builder.keyword;
        this.name = builder.name;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.sort = builder.sort;
        this.sortField = builder.sortField;
        this.tenantId = builder.tenantId;
        this.type = builder.type;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMcdpAimRequest create() {
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return emptyTag
     */
    public String getEmptyTag() {
        return this.emptyTag;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return sortField
     */
    public String getSortField() {
        return this.sortField;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListMcdpAimRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String emptyTag; 
        private String keyword; 
        private String name; 
        private Long pageNo; 
        private Long pageSize; 
        private String sort; 
        private String sortField; 
        private String tenantId; 
        private String type; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListMcdpAimRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.emptyTag = request.emptyTag;
            this.keyword = request.keyword;
            this.name = request.name;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.sort = request.sort;
            this.sortField = request.sortField;
            this.tenantId = request.tenantId;
            this.type = request.type;
            this.workspaceId = request.workspaceId;
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
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * EmptyTag.
         */
        public Builder emptyTag(String emptyTag) {
            this.putBodyParameter("EmptyTag", emptyTag);
            this.emptyTag = emptyTag;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(String sort) {
            this.putBodyParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * SortField.
         */
        public Builder sortField(String sortField) {
            this.putBodyParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListMcdpAimRequest build() {
            return new ListMcdpAimRequest(this);
        } 

    } 

}
