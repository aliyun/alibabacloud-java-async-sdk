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
 * {@link ListDatasetVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListDatasetVersionsRequest</p>
 */
public class ListDatasetVersionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelKeys")
    private String labelKeys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelValues")
    private String labelValues;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Properties")
    private String properties;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceId")
    private String sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceTypes")
    private String sourceTypes;

    private ListDatasetVersionsRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.labelKeys = builder.labelKeys;
        this.labelValues = builder.labelValues;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.properties = builder.properties;
        this.sortBy = builder.sortBy;
        this.sourceId = builder.sourceId;
        this.sourceTypes = builder.sourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatasetVersionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return labelKeys
     */
    public String getLabelKeys() {
        return this.labelKeys;
    }

    /**
     * @return labelValues
     */
    public String getLabelValues() {
        return this.labelValues;
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
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
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

    public static final class Builder extends Request.Builder<ListDatasetVersionsRequest, Builder> {
        private String datasetId; 
        private String labelKeys; 
        private String labelValues; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String properties; 
        private String sortBy; 
        private String sourceId; 
        private String sourceTypes; 

        private Builder() {
            super();
        } 

        private Builder(ListDatasetVersionsRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.labelKeys = request.labelKeys;
            this.labelValues = request.labelValues;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.properties = request.properties;
            this.sortBy = request.sortBy;
            this.sourceId = request.sourceId;
            this.sourceTypes = request.sourceTypes;
        } 

        /**
         * <p>The dataset ID. You can call <a href="https://help.aliyun.com/document_detail/457222.html">ListDatasets</a> to obtain the dataset ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-rbvg5wz****c9ks92</p>
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The dataset tag keys, which are used to filter datasets. Datasets whose tag keys or tag values contain a specified string are filtered.</p>
         * 
         * <strong>example:</strong>
         * <p>key1,key2</p>
         */
        public Builder labelKeys(String labelKeys) {
            this.putQueryParameter("LabelKeys", labelKeys);
            this.labelKeys = labelKeys;
            return this;
        }

        /**
         * <p>The dataset tag values, which are used to filter datasets. Datasets whose tag keys or tag values contain a specified string are filtered.</p>
         * 
         * <strong>example:</strong>
         * <p>value1,value2</p>
         */
        public Builder labelValues(String labelValues) {
            this.putQueryParameter("LabelValues", labelValues);
            this.labelValues = labelValues;
            return this;
        }

        /**
         * <p>The order in which the entries are sorted by the specific field on the returned page. Default value: ASC. Valid values:</p>
         * <ul>
         * <li>ASC: ascending order</li>
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
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>The dataset properties. Valid values:</p>
         * <ul>
         * <li>DIRECTORY</li>
         * <li>FILE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DIRECTORY</p>
         */
        public Builder properties(String properties) {
            this.putQueryParameter("Properties", properties);
            this.properties = properties;
            return this;
        }

        /**
         * <p>The field used to sort the results in queries by page. Default value: GmtCreateTime.
         * Valid values:</p>
         * <ul>
         * <li>SourceType</li>
         * <li>DataSourceType</li>
         * <li>DataSize</li>
         * <li>DataCount</li>
         * <li>Property</li>
         * <li>GmtCreateTime: The results are sorted by creation time. This is the default value.</li>
         * <li>GmtModifiedTime: The results are sorted by modification time.</li>
         * <li>DatasetId</li>
         * </ul>
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
         * <p>The data source ID.</p>
         * <ul>
         * <li>If SourceType is set to USER, the value of SourceId is a custom string.</li>
         * <li>If SourceType is set to ITAG, the value of SourceId is the ID of the labeling job of iTAG.</li>
         * <li>If SourceType is set to PAI_PUBLIC_DATASET, SourceId is empty by default.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>d-a0xbe5n03bhqof46ce</p>
         */
        public Builder sourceId(String sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The source type. Valid values:</p>
         * <ul>
         * <li>PAI-PUBLIC-DATASET: a public dataset of Platform for AI (PAI).</li>
         * <li>ITAG: a dataset generated from a labeling job of iTAG.</li>
         * <li>USER: a dataset registered by a user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder sourceTypes(String sourceTypes) {
            this.putQueryParameter("SourceTypes", sourceTypes);
            this.sourceTypes = sourceTypes;
            return this;
        }

        @Override
        public ListDatasetVersionsRequest build() {
            return new ListDatasetVersionsRequest(this);
        } 

    } 

}
