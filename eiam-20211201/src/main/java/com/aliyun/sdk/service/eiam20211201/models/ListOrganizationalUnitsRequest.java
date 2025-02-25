// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListOrganizationalUnitsRequest} extends {@link RequestModel}
 *
 * <p>ListOrganizationalUnitsRequest</p>
 */
public class ListOrganizationalUnitsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationalUnitIds")
    private java.util.List<String> organizationalUnitIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationalUnitName")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String organizationalUnitName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationalUnitNameStartsWith")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String organizationalUnitNameStartsWith;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String parentId;

    private ListOrganizationalUnitsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.organizationalUnitIds = builder.organizationalUnitIds;
        this.organizationalUnitName = builder.organizationalUnitName;
        this.organizationalUnitNameStartsWith = builder.organizationalUnitNameStartsWith;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.parentId = builder.parentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrganizationalUnitsRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return organizationalUnitIds
     */
    public java.util.List<String> getOrganizationalUnitIds() {
        return this.organizationalUnitIds;
    }

    /**
     * @return organizationalUnitName
     */
    public String getOrganizationalUnitName() {
        return this.organizationalUnitName;
    }

    /**
     * @return organizationalUnitNameStartsWith
     */
    public String getOrganizationalUnitNameStartsWith() {
        return this.organizationalUnitNameStartsWith;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    public static final class Builder extends Request.Builder<ListOrganizationalUnitsRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private java.util.List<String> organizationalUnitIds; 
        private String organizationalUnitName; 
        private String organizationalUnitNameStartsWith; 
        private Long pageNumber; 
        private Long pageSize; 
        private String parentId; 

        private Builder() {
            super();
        } 

        private Builder(ListOrganizationalUnitsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.organizationalUnitIds = request.organizationalUnitIds;
            this.organizationalUnitName = request.organizationalUnitName;
            this.organizationalUnitNameStartsWith = request.organizationalUnitNameStartsWith;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.parentId = request.parentId;
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
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The IDs of organizational units.</p>
         * 
         * <strong>example:</strong>
         * <p>[ou_wovwffm62xifdziem7an7xxxxx]</p>
         */
        public Builder organizationalUnitIds(java.util.List<String> organizationalUnitIds) {
            this.putQueryParameter("OrganizationalUnitIds", organizationalUnitIds);
            this.organizationalUnitIds = organizationalUnitIds;
            return this;
        }

        /**
         * <p>The name of the organizational unit.</p>
         * 
         * <strong>example:</strong>
         * <p>name_001</p>
         */
        public Builder organizationalUnitName(String organizationalUnitName) {
            this.putQueryParameter("OrganizationalUnitName", organizationalUnitName);
            this.organizationalUnitName = organizationalUnitName;
            return this;
        }

        /**
         * <p>Organization name, matching left</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder organizationalUnitNameStartsWith(String organizationalUnitNameStartsWith) {
            this.putQueryParameter("OrganizationalUnitNameStartsWith", organizationalUnitNameStartsWith);
            this.organizationalUnitNameStartsWith = organizationalUnitNameStartsWith;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the parent organizational unit.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
         */
        public Builder parentId(String parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        @Override
        public ListOrganizationalUnitsRequest build() {
            return new ListOrganizationalUnitsRequest(this);
        } 

    } 

}
