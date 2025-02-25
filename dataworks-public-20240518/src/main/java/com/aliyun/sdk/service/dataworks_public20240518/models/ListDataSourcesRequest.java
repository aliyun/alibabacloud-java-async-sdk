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
 * {@link ListDataSourcesRequest} extends {@link RequestModel}
 *
 * <p>ListDataSourcesRequest</p>
 */
public class ListDataSourcesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Types")
    private java.util.List<String> types;

    private ListDataSourcesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.envType = builder.envType;
        this.name = builder.name;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.sortBy = builder.sortBy;
        this.tags = builder.tags;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourcesRequest create() {
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
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return types
     */
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<ListDataSourcesRequest, Builder> {
        private String regionId; 
        private String envType; 
        private String name; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private String sortBy; 
        private String tags; 
        private java.util.List<String> types; 

        private Builder() {
            super();
        } 

        private Builder(ListDataSourcesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.envType = request.envType;
            this.name = request.name;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.sortBy = request.sortBy;
            this.tags = request.tags;
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
         * <p>The environment in which the data sources are used. Valid values:</p>
         * <ul>
         * <li>Dev: development environment</li>
         * <li>Prod: production environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * <p>The name of the data source. Fuzzy match by data source name is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The order in which you want to sort the data sources. Valid values:</p>
         * <ul>
         * <li>Desc: descending order</li>
         * <li>Asc: ascending order</li>
         * </ul>
         * <p>Default value: Asc</p>
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
         * <p>The page number. Default value: 1.</p>
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
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
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
         * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
         * <p>You must configure this parameter to specify the DataWorks workspace to which the API operation is applied.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>17820</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The field that you want to use to sort the data sources. Valid values:</p>
         * <ul>
         * <li>CreateTime</li>
         * <li>Id</li>
         * <li>Name</li>
         * </ul>
         * <p>Default value: Id</p>
         * 
         * <strong>example:</strong>
         * <p>Id</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The tag of the data source. This parameter specifies a filter condition.</p>
         * <ul>
         * <li>You can specify multiple tags, which are in the logical AND relation. For example, you can query the data sources that contain the following tags: <code>[&quot;tag1&quot;, &quot;tag2&quot;, &quot;tag3&quot;]</code>.</li>
         * <li>If you do not configure this parameter, tag-based filtering is not performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;tag1&quot;, &quot;tag2&quot;, &quot;tag3&quot;]</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The data source types. This parameter specifies a filter condition. You can specify multiple data source types.</p>
         */
        public Builder types(java.util.List<String> types) {
            String typesShrink = shrink(types, "Types", "simple");
            this.putQueryParameter("Types", typesShrink);
            this.types = types;
            return this;
        }

        @Override
        public ListDataSourcesRequest build() {
            return new ListDataSourcesRequest(this);
        } 

    } 

}
