// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOrganizationalUnitsRequest} extends {@link RequestModel}
 *
 * <p>ListOrganizationalUnitsRequest</p>
 */
public class ListOrganizationalUnitsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    @Query
    @NameInMap("OrganizationalUnitIds")
    private java.util.List < String > organizationalUnitIds;

    @Query
    @NameInMap("OrganizationalUnitName")
    @Validation(maxLength = 64)
    private String organizationalUnitName;

    @Query
    @NameInMap("OrganizationalUnitNameStartsWith")
    @Validation(maxLength = 64)
    private String organizationalUnitNameStartsWith;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("ParentId")
    @Validation(maxLength = 64)
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
    public java.util.List < String > getOrganizationalUnitIds() {
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
        private java.util.List < String > organizationalUnitIds; 
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
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 组织ID列表。size限制最大100。
         */
        public Builder organizationalUnitIds(java.util.List < String > organizationalUnitIds) {
            this.putQueryParameter("OrganizationalUnitIds", organizationalUnitIds);
            this.organizationalUnitIds = organizationalUnitIds;
            return this;
        }

        /**
         * The name of the organizational unit.
         */
        public Builder organizationalUnitName(String organizationalUnitName) {
            this.putQueryParameter("OrganizationalUnitName", organizationalUnitName);
            this.organizationalUnitName = organizationalUnitName;
            return this;
        }

        /**
         * 组织名称，左匹配
         */
        public Builder organizationalUnitNameStartsWith(String organizationalUnitNameStartsWith) {
            this.putQueryParameter("OrganizationalUnitNameStartsWith", organizationalUnitNameStartsWith);
            this.organizationalUnitNameStartsWith = organizationalUnitNameStartsWith;
            return this;
        }

        /**
         * The number of the page to return. Default value: 1.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 20.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the parent organizational unit.
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
