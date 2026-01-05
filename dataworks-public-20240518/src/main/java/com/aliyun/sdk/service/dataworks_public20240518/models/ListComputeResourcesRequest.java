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
 * {@link ListComputeResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListComputeResourcesRequest</p>
 */
public class ListComputeResourcesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvType")
    private String envType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Types")
    private java.util.List<String> types;

    private ListComputeResourcesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.envType = builder.envType;
        this.name = builder.name;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.sortBy = builder.sortBy;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComputeResourcesRequest create() {
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
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
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
     * @return types
     */
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<ListComputeResourcesRequest, Builder> {
        private String regionId; 
        private String envType; 
        private String name; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private String sortBy; 
        private java.util.List<String> types; 

        private Builder() {
            super();
        } 

        private Builder(ListComputeResourcesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.envType = request.envType;
            this.name = request.name;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.sortBy = request.sortBy;
            this.types = request.types;
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
         * <p>The environment type of the computing resource. Valid values:</p>
         * <ul>
         * <li>Dev</li>
         * <li>Prod</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Dev</p>
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * <p>The name of the computing resource.</p>
         * 
         * <strong>example:</strong>
         * <p>category name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The sort direction of the computing resource list. Valid values:</p>
         * <ul>
         * <li>Desc: descending order.</li>
         * <li>Asc: ascending order.</li>
         * </ul>
         * <p>Default value: Desc</p>
         * 
         * <strong>example:</strong>
         * <p>Asc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number to query. The default value is 1, which indicates the first page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. The default value is 10, and the maximum value is 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>21229</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The field to sort the computing resource list by. Supported fields include name, creation time, and computing resource ID.</p>
         * <ul>
         * <li>CreateTime: Sorts by creation time</li>
         * <li>Id: Sorts by computing resource ID</li>
         * <li>Name: Sorts by computing resource name.</li>
         * <li>CreateTimeWithDefaultFirst: Sorts based on whether it is the default resource and by creation time, with the default computing resource listed first.</li>
         * </ul>
         * <p>Default value: CreateTime</p>
         * 
         * <strong>example:</strong>
         * <p>CreateTimeWithDefaultFirst</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The filter for computing resource types. You can configure multiple types for filtering.</p>
         */
        public Builder types(java.util.List<String> types) {
            String typesShrink = shrink(types, "Types", "simple");
            this.putQueryParameter("Types", typesShrink);
            this.types = types;
            return this;
        }

        @Override
        public ListComputeResourcesRequest build() {
            return new ListComputeResourcesRequest(this);
        } 

    } 

}
