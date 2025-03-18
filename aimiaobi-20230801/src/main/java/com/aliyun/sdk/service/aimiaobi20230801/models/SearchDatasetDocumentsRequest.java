// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link SearchDatasetDocumentsRequest} extends {@link RequestModel}
 *
 * <p>SearchDatasetDocumentsRequest</p>
 */
public class SearchDatasetDocumentsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private Long datasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    private String datasetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Extend1")
    private String extend1;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncludeContent")
    private Boolean includeContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private SearchDatasetDocumentsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.datasetId = builder.datasetId;
        this.datasetName = builder.datasetName;
        this.extend1 = builder.extend1;
        this.includeContent = builder.includeContent;
        this.pageSize = builder.pageSize;
        this.query = builder.query;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchDatasetDocumentsRequest create() {
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
     * @return datasetId
     */
    public Long getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return extend1
     */
    public String getExtend1() {
        return this.extend1;
    }

    /**
     * @return includeContent
     */
    public Boolean getIncludeContent() {
        return this.includeContent;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<SearchDatasetDocumentsRequest, Builder> {
        private String regionId; 
        private Long datasetId; 
        private String datasetName; 
        private String extend1; 
        private Boolean includeContent; 
        private String pageSize; 
        private String query; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SearchDatasetDocumentsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.datasetId = request.datasetId;
            this.datasetName = request.datasetName;
            this.extend1 = request.extend1;
            this.includeContent = request.includeContent;
            this.pageSize = request.pageSize;
            this.query = request.query;
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
         * DatasetId.
         */
        public Builder datasetId(Long datasetId) {
            this.putBodyParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * DatasetName.
         */
        public Builder datasetName(String datasetName) {
            this.putBodyParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * Extend1.
         */
        public Builder extend1(String extend1) {
            this.putBodyParameter("Extend1", extend1);
            this.extend1 = extend1;
            return this;
        }

        /**
         * IncludeContent.
         */
        public Builder includeContent(Boolean includeContent) {
            this.putBodyParameter("IncludeContent", includeContent);
            this.includeContent = includeContent;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>搜索内容</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public SearchDatasetDocumentsRequest build() {
            return new SearchDatasetDocumentsRequest(this);
        } 

    } 

}
