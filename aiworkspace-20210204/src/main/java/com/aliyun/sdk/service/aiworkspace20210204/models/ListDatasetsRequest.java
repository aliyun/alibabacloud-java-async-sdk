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
    @com.aliyun.core.annotation.NameInMap("DataSourceTypes")
    private String dataSourceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataTypes")
    private String dataTypes;

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
        this.dataSourceTypes = builder.dataSourceTypes;
        this.dataTypes = builder.dataTypes;
        this.label = builder.label;
        this.name = builder.name;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.properties = builder.properties;
        this.provider = builder.provider;
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
        private String dataSourceTypes; 
        private String dataTypes; 
        private String label; 
        private String name; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String properties; 
        private String provider; 
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
            this.dataSourceTypes = request.dataSourceTypes;
            this.dataTypes = request.dataTypes;
            this.label = request.label;
            this.name = request.name;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.properties = request.properties;
            this.provider = request.provider;
            this.sortBy = request.sortBy;
            this.sourceDatasetId = request.sourceDatasetId;
            this.sourceId = request.sourceId;
            this.sourceTypes = request.sourceTypes;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The storage types of the data source. Multiple data source types are separated by commas (,). Valid values:</p>
         * <ul>
         * <li>NAS: File Storage NAS (NAS).</li>
         * <li>OSS: Object Storage Service (OSS).</li>
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
         * <p>The dataset types. Multiple dataset types are separated by commas (,). Valid values:</p>
         * <ul>
         * <li>Video: video</li>
         * <li>COMMON: common</li>
         * <li>TEXT: text</li>
         * <li>PIC: picture</li>
         * <li>AUDIO: audio</li>
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
         * <p>The dataset tag, which is used to filter datasets. Datasets whose tag key or tag value contains a specified string are filtered.</p>
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
         * <p>The dataset name. Fuzzy search based on the dataset name is supported.</p>
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
         * <p>The order of specific fields of the entries on the returned page. Valid values: ASC and DESC. Default value: ASC.</p>
         * <ul>
         * <li>ASC: The entries are sorted in ascending order.</li>
         * <li>DESC: The entries are sorted in descending order.</li>
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
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
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
         * <p>The number of entries per page. Default value: 10.</p>
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
         * <p>The dataset properties. Multiple properties are separated by commas (,). Valid values:</p>
         * <ul>
         * <li>DIRECTORY</li>
         * <li>FILE</li>
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
         * <p>The dataset provider. If the value pai is returned, the dataset is a public dataset provided by PAI.</p>
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
         * <p>The field used for sorting.</p>
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
         * <p>The ID of the iTAG labeled dataset that is used as the source dataset.</p>
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
         * <li>If SourceType is set to USER, the value of SourceId is a custom string.</li>
         * <li>If SourceType is set to ITAG, the value of SourceId is the ID of the labeling job of iTAG.</li>
         * <li>If SourceType is set to PAI_PUBLIC_DATASET, SourceId is empty by default.</li>
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
         * <p>The source types. Multiple source types are separated by commas (,). Valid values:</p>
         * <ul>
         * <li>PAI-PUBLIC-DATASET: a public dataset of Platform for AI (PAI).</li>
         * <li>ITAG: a dataset generated from a labeling job of iTAG.</li>
         * <li>USER: a dataset registered by a user.</li>
         * </ul>
         * <!---->
         * 
         * <ul>
         * <li></li>
         * <li></li>
         * <li></li>
         * </ul>
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
         * <p>The ID of the workspace to which the dataset belongs. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID. If you do not specify this parameter, the default workspace is used. If the default workspace does not exist, an error is reported.</p>
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
