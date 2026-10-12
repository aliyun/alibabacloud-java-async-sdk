// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceTypes")
    private String dataSourceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataTypes")
    private String dataTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetIds")
    private String datasetIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Edition")
    private String edition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

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
    @com.aliyun.core.annotation.NameInMap("Properties")
    private String properties;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Provider")
    private String provider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareScope")
    private String shareScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDatasetId")
    private String sourceDatasetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceId")
    private String sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceTypes")
    private String sourceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListDatasetsRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.dataSourceTypes = builder.dataSourceTypes;
        this.dataTypes = builder.dataTypes;
        this.datasetIds = builder.datasetIds;
        this.edition = builder.edition;
        this.label = builder.label;
        this.name = builder.name;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.properties = builder.properties;
        this.provider = builder.provider;
        this.shareScope = builder.shareScope;
        this.sortBy = builder.sortBy;
        this.sourceDatasetId = builder.sourceDatasetId;
        this.sourceId = builder.sourceId;
        this.sourceTypes = builder.sourceTypes;
        this.workspaceId = builder.workspaceId;
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
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return dataSourceTypes
     */
    public String getDataSourceTypes() {
        return this.dataSourceTypes;
    }

    /**
     * @return dataTypes
     */
    public String getDataTypes() {
        return this.dataTypes;
    }

    /**
     * @return datasetIds
     */
    public String getDatasetIds() {
        return this.datasetIds;
    }

    /**
     * @return edition
     */
    public String getEdition() {
        return this.edition;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
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
     * @return properties
     */
    public String getProperties() {
        return this.properties;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return shareScope
     */
    public String getShareScope() {
        return this.shareScope;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return sourceDatasetId
     */
    public String getSourceDatasetId() {
        return this.sourceDatasetId;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceTypes
     */
    public String getSourceTypes() {
        return this.sourceTypes;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListDatasetsRequest, Builder> {
        private String accessibility; 
        private String dataSourceTypes; 
        private String dataTypes; 
        private String datasetIds; 
        private String edition; 
        private String label; 
        private String name; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String properties; 
        private String provider; 
        private String shareScope; 
        private String sortBy; 
        private String sourceDatasetId; 
        private String sourceId; 
        private String sourceTypes; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListDatasetsRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.dataSourceTypes = request.dataSourceTypes;
            this.dataTypes = request.dataTypes;
            this.datasetIds = request.datasetIds;
            this.edition = request.edition;
            this.label = request.label;
            this.name = request.name;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.properties = request.properties;
            this.provider = request.provider;
            this.shareScope = request.shareScope;
            this.sortBy = request.sortBy;
            this.sourceDatasetId = request.sourceDatasetId;
            this.sourceId = request.sourceId;
            this.sourceTypes = request.sourceTypes;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The visibility of the dataset.</p>
         * <ul>
         * <li>PUBLIC: public.</li>
         * <li>PRIVATE: private.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.putQueryParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The data source types. Separate multiple values with commas (,). Valid values:</p>
         * <ul>
         * <li>NAS: Alibaba Cloud Network Attached Storage (NAS).</li>
         * <li>OSS: Alibaba Cloud Object Storage Service (OSS).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder dataSourceTypes(String dataSourceTypes) {
            this.putQueryParameter("DataSourceTypes", dataSourceTypes);
            this.dataSourceTypes = dataSourceTypes;
            return this;
        }

        /**
         * <p>The data types of the dataset. Separate multiple values with commas (,). Valid values:</p>
         * <ul>
         * <li>VIDEO: video.</li>
         * <li>COMMON: common.</li>
         * <li>TEXT: text.</li>
         * <li>PIC: image.</li>
         * <li>AUDIO: audio.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMMON,TEXT</p>
         */
        public Builder dataTypes(String dataTypes) {
            this.putQueryParameter("DataTypes", dataTypes);
            this.dataTypes = dataTypes;
            return this;
        }

        /**
         * <p>The dataset IDs. You can specify multiple dataset IDs separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>d-rcdg3wxxxxxhc5jk87</p>
         */
        public Builder datasetIds(String datasetIds) {
            this.putQueryParameter("DatasetIds", datasetIds);
            this.datasetIds = datasetIds;
            return this;
        }

        /**
         * <p>The dataset edition. Valid values:</p>
         * <ul>
         * <li>BASIC: Basic Edition. Does not support dataset file metadata management.</li>
         * <li>ADVANCED: Advanced Edition. Supported only for OSS type. Each version supports up to 1 million file metadata entries.</li>
         * <li>LOGICAL: Logical Edition. Supported only for OSS type. Each version supports up to 1 million file metadata entries. Applicable to most scenarios and requires the use of the SDK.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        public Builder edition(String edition) {
            this.putQueryParameter("Edition", edition);
            this.edition = edition;
            return this;
        }

        /**
         * <p>The dataset label used to filter the dataset list. Datasets whose label key or value contains the specified string are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder label(String label) {
            this.putQueryParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * <p>The dataset name. Fuzzy match is supported based on the dataset name.</p>
         * 
         * <strong>example:</strong>
         * <p>myName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The sorting order for the specified sort field in paging queries. Default value: ASC.</p>
         * <ul>
         * <li>ASC: ascending order.</li>
         * <li>DESC: descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number of the dataset list. Minimum value: 1. Default value: 1.</p>
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
         * <p>The number of entries per page settings for paging queries. Default value: 10.</p>
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
         * <p>The dataset properties. Separate multiple values with commas (,). Valid values:</p>
         * <ul>
         * <li>DIRECTORY: folder.</li>
         * <li>FILE: file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FILE</p>
         */
        public Builder properties(String properties) {
            this.putQueryParameter("Properties", properties);
            this.properties = properties;
            return this;
        }

        /**
         * <p>The dataset provider. A value of &quot;pai&quot; indicates that the dataset is a PAI platform public dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>pai</p>
         */
        public Builder provider(String provider) {
            this.putQueryParameter("Provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * <p>The sharing filter for datasets:</p>
         * <ul>
         * <li>TO_ME: returns only datasets shared with you.</li>
         * <li>BY_ME: returns only datasets you shared with others, with sharing configuration details displayed.</li>
         * <li>If this parameter is not set or is set to empty: returns all datasets in the current workspace, including TO_ME.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BY_ME</p>
         */
        public Builder shareScope(String shareScope) {
            this.putQueryParameter("ShareScope", shareScope);
            this.shareScope = shareScope;
            return this;
        }

        /**
         * <p>The field by which to sort the results.</p>
         * 
         * <strong>example:</strong>
         * <p>GmtCreateTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The source dataset ID of the iTAG annotation set.</p>
         * 
         * <strong>example:</strong>
         * <p>d-rcdg3wxxxxxhc5jk87</p>
         */
        public Builder sourceDatasetId(String sourceDatasetId) {
            this.putQueryParameter("SourceDatasetId", sourceDatasetId);
            this.sourceDatasetId = sourceDatasetId;
            return this;
        }

        /**
         * <p>The data source ID.</p>
         * <ul>
         * <li>If SourceTypes is set to USER, you can customize the SourceId value.</li>
         * <li>If SourceTypes is set to ITAG, which indicates a dataset generated from iTAG annotation results, SourceId is the iTAG task ID.</li>
         * <li>If SourceTypes is set to PAI_PUBLIC_DATASET, which indicates a dataset created from a PAI public dataset, SourceId is empty by default.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>d-rbvg5wzljzjhc9ks92</p>
         */
        public Builder sourceId(String sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The source types. Separate multiple values with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>USER,ITAG</p>
         */
        public Builder sourceTypes(String sourceTypes) {
            this.putQueryParameter("SourceTypes", sourceTypes);
            this.sourceTypes = sourceTypes;
            return this;
        }

        /**
         * <p>The ID of the workspace where the dataset resides. For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.
         * If you do not specify this parameter, the default workspace is used. If the default workspace does not exist, an error is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>324**</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListDatasetsRequest build() {
            return new ListDatasetsRequest(this);
        } 

    } 

}
