// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListDatasetsRequest} extends {@link RequestModel}
 *
 * <p>ListDatasetsRequest</p>
 */
public class ListDatasetsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreatorId")
    private String creatorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataTypeList")
    private java.util.List<String> dataTypeList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Origin")
    private String origin;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StorageTypeList")
    private java.util.List<String> storageTypeList;

    private ListDatasetsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.creatorId = builder.creatorId;
        this.dataTypeList = builder.dataTypeList;
        this.name = builder.name;
        this.order = builder.order;
        this.origin = builder.origin;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.sortBy = builder.sortBy;
        this.storageTypeList = builder.storageTypeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatasetsRequest create() {
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
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return dataTypeList
     */
    public java.util.List<String> getDataTypeList() {
        return this.dataTypeList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
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
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return storageTypeList
     */
    public java.util.List<String> getStorageTypeList() {
        return this.storageTypeList;
    }

    public static final class Builder extends Request.Builder<ListDatasetsRequest, Builder> {
        private String regionId; 
        private String creatorId; 
        private java.util.List<String> dataTypeList; 
        private String name; 
        private String order; 
        private String origin; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private String sortBy; 
        private java.util.List<String> storageTypeList; 

        private Builder() {
            super();
        } 

        private Builder(ListDatasetsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.creatorId = request.creatorId;
            this.dataTypeList = request.dataTypeList;
            this.name = request.name;
            this.order = request.order;
            this.origin = request.origin;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.sortBy = request.sortBy;
            this.storageTypeList = request.storageTypeList;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CreatorId.
         */
        public Builder creatorId(String creatorId) {
            this.putBodyParameter("CreatorId", creatorId);
            this.creatorId = creatorId;
            return this;
        }

        /**
         * DataTypeList.
         */
        public Builder dataTypeList(java.util.List<String> dataTypeList) {
            String dataTypeListShrink = shrink(dataTypeList, "DataTypeList", "simple");
            this.putBodyParameter("DataTypeList", dataTypeListShrink);
            this.dataTypeList = dataTypeList;
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
         * Order.
         */
        public Builder order(String order) {
            this.putBodyParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * Origin.
         */
        public Builder origin(String origin) {
            this.putBodyParameter("Origin", origin);
            this.origin = origin;
            return this;
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
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putBodyParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * StorageTypeList.
         */
        public Builder storageTypeList(java.util.List<String> storageTypeList) {
            String storageTypeListShrink = shrink(storageTypeList, "StorageTypeList", "simple");
            this.putBodyParameter("StorageTypeList", storageTypeListShrink);
            this.storageTypeList = storageTypeList;
            return this;
        }

        @Override
        public ListDatasetsRequest build() {
            return new ListDatasetsRequest(this);
        } 

    } 

}
