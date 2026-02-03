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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryUuids")
    private java.util.List<String> categoryUuids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeEnd")
    private Long createTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeStart")
    private Long createTimeStart;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private Long datasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    private String datasetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocIds")
    private java.util.List<String> docIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocTypes")
    private java.util.List<String> docTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocUuids")
    private java.util.List<String> docUuids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Extend1")
    private String extend1;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extend2")
    private String extend2;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extend3")
    private String extend3;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchMode")
    private String searchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<String> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private SearchDatasetDocumentsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.categoryUuids = builder.categoryUuids;
        this.createTimeEnd = builder.createTimeEnd;
        this.createTimeStart = builder.createTimeStart;
        this.datasetId = builder.datasetId;
        this.datasetName = builder.datasetName;
        this.docIds = builder.docIds;
        this.docTypes = builder.docTypes;
        this.docUuids = builder.docUuids;
        this.endTime = builder.endTime;
        this.extend1 = builder.extend1;
        this.extend2 = builder.extend2;
        this.extend3 = builder.extend3;
        this.includeContent = builder.includeContent;
        this.pageSize = builder.pageSize;
        this.query = builder.query;
        this.searchMode = builder.searchMode;
        this.startTime = builder.startTime;
        this.tags = builder.tags;
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
     * @return categoryUuids
     */
    public java.util.List<String> getCategoryUuids() {
        return this.categoryUuids;
    }

    /**
     * @return createTimeEnd
     */
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    /**
     * @return createTimeStart
     */
    public Long getCreateTimeStart() {
        return this.createTimeStart;
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
     * @return docIds
     */
    public java.util.List<String> getDocIds() {
        return this.docIds;
    }

    /**
     * @return docTypes
     */
    public java.util.List<String> getDocTypes() {
        return this.docTypes;
    }

    /**
     * @return docUuids
     */
    public java.util.List<String> getDocUuids() {
        return this.docUuids;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return extend1
     */
    public String getExtend1() {
        return this.extend1;
    }

    /**
     * @return extend2
     */
    public String getExtend2() {
        return this.extend2;
    }

    /**
     * @return extend3
     */
    public String getExtend3() {
        return this.extend3;
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
     * @return searchMode
     */
    public String getSearchMode() {
        return this.searchMode;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return tags
     */
    public java.util.List<String> getTags() {
        return this.tags;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<SearchDatasetDocumentsRequest, Builder> {
        private String regionId; 
        private java.util.List<String> categoryUuids; 
        private Long createTimeEnd; 
        private Long createTimeStart; 
        private Long datasetId; 
        private String datasetName; 
        private java.util.List<String> docIds; 
        private java.util.List<String> docTypes; 
        private java.util.List<String> docUuids; 
        private Long endTime; 
        private String extend1; 
        private String extend2; 
        private String extend3; 
        private Boolean includeContent; 
        private String pageSize; 
        private String query; 
        private String searchMode; 
        private Long startTime; 
        private java.util.List<String> tags; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SearchDatasetDocumentsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.categoryUuids = request.categoryUuids;
            this.createTimeEnd = request.createTimeEnd;
            this.createTimeStart = request.createTimeStart;
            this.datasetId = request.datasetId;
            this.datasetName = request.datasetName;
            this.docIds = request.docIds;
            this.docTypes = request.docTypes;
            this.docUuids = request.docUuids;
            this.endTime = request.endTime;
            this.extend1 = request.extend1;
            this.extend2 = request.extend2;
            this.extend3 = request.extend3;
            this.includeContent = request.includeContent;
            this.pageSize = request.pageSize;
            this.query = request.query;
            this.searchMode = request.searchMode;
            this.startTime = request.startTime;
            this.tags = request.tags;
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
         * CategoryUuids.
         */
        public Builder categoryUuids(java.util.List<String> categoryUuids) {
            String categoryUuidsShrink = shrink(categoryUuids, "CategoryUuids", "json");
            this.putQueryParameter("CategoryUuids", categoryUuidsShrink);
            this.categoryUuids = categoryUuids;
            return this;
        }

        /**
         * CreateTimeEnd.
         */
        public Builder createTimeEnd(Long createTimeEnd) {
            this.putQueryParameter("CreateTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * CreateTimeStart.
         */
        public Builder createTimeStart(Long createTimeStart) {
            this.putQueryParameter("CreateTimeStart", createTimeStart);
            this.createTimeStart = createTimeStart;
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
         * DocIds.
         */
        public Builder docIds(java.util.List<String> docIds) {
            String docIdsShrink = shrink(docIds, "DocIds", "json");
            this.putQueryParameter("DocIds", docIdsShrink);
            this.docIds = docIds;
            return this;
        }

        /**
         * DocTypes.
         */
        public Builder docTypes(java.util.List<String> docTypes) {
            String docTypesShrink = shrink(docTypes, "DocTypes", "json");
            this.putQueryParameter("DocTypes", docTypesShrink);
            this.docTypes = docTypes;
            return this;
        }

        /**
         * DocUuids.
         */
        public Builder docUuids(java.util.List<String> docUuids) {
            String docUuidsShrink = shrink(docUuids, "DocUuids", "json");
            this.putQueryParameter("DocUuids", docUuidsShrink);
            this.docUuids = docUuids;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * Extend2.
         */
        public Builder extend2(String extend2) {
            this.putQueryParameter("Extend2", extend2);
            this.extend2 = extend2;
            return this;
        }

        /**
         * Extend3.
         */
        public Builder extend3(String extend3) {
            this.putQueryParameter("Extend3", extend3);
            this.extend3 = extend3;
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
         * SearchMode.
         */
        public Builder searchMode(String searchMode) {
            this.putQueryParameter("SearchMode", searchMode);
            this.searchMode = searchMode;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List<String> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
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
