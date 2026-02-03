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
 * {@link ListDatasetDocumentsRequest} extends {@link RequestModel}
 *
 * <p>ListDatasetDocumentsRequest</p>
 */
public class ListDatasetDocumentsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("DatasetDescription")
    private String datasetDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private Long datasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    private String datasetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocIds")
    private java.util.List<String> docIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocType")
    private String docType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocUuids")
    private java.util.List<String> docUuids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExcludeFields")
    private java.util.List<String> excludeFields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extend1")
    private String extend1;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extend2")
    private String extend2;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extend3")
    private String extend3;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncludeFields")
    private java.util.List<String> includeFields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<String> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private ListDatasetDocumentsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.categoryUuids = builder.categoryUuids;
        this.createTimeEnd = builder.createTimeEnd;
        this.createTimeStart = builder.createTimeStart;
        this.datasetDescription = builder.datasetDescription;
        this.datasetId = builder.datasetId;
        this.datasetName = builder.datasetName;
        this.docIds = builder.docIds;
        this.docType = builder.docType;
        this.docUuids = builder.docUuids;
        this.endTime = builder.endTime;
        this.excludeFields = builder.excludeFields;
        this.extend1 = builder.extend1;
        this.extend2 = builder.extend2;
        this.extend3 = builder.extend3;
        this.includeFields = builder.includeFields;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.query = builder.query;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.tags = builder.tags;
        this.title = builder.title;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatasetDocumentsRequest create() {
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
     * @return datasetDescription
     */
    public String getDatasetDescription() {
        return this.datasetDescription;
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
     * @return docType
     */
    public String getDocType() {
        return this.docType;
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
     * @return excludeFields
     */
    public java.util.List<String> getExcludeFields() {
        return this.excludeFields;
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
     * @return includeFields
     */
    public java.util.List<String> getIncludeFields() {
        return this.includeFields;
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
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.List<String> getTags() {
        return this.tags;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListDatasetDocumentsRequest, Builder> {
        private String regionId; 
        private java.util.List<String> categoryUuids; 
        private Long createTimeEnd; 
        private Long createTimeStart; 
        private String datasetDescription; 
        private Long datasetId; 
        private String datasetName; 
        private java.util.List<String> docIds; 
        private String docType; 
        private java.util.List<String> docUuids; 
        private Long endTime; 
        private java.util.List<String> excludeFields; 
        private String extend1; 
        private String extend2; 
        private String extend3; 
        private java.util.List<String> includeFields; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String query; 
        private Long startTime; 
        private Integer status; 
        private java.util.List<String> tags; 
        private String title; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListDatasetDocumentsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.categoryUuids = request.categoryUuids;
            this.createTimeEnd = request.createTimeEnd;
            this.createTimeStart = request.createTimeStart;
            this.datasetDescription = request.datasetDescription;
            this.datasetId = request.datasetId;
            this.datasetName = request.datasetName;
            this.docIds = request.docIds;
            this.docType = request.docType;
            this.docUuids = request.docUuids;
            this.endTime = request.endTime;
            this.excludeFields = request.excludeFields;
            this.extend1 = request.extend1;
            this.extend2 = request.extend2;
            this.extend3 = request.extend3;
            this.includeFields = request.includeFields;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.query = request.query;
            this.startTime = request.startTime;
            this.status = request.status;
            this.tags = request.tags;
            this.title = request.title;
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
         * DatasetDescription.
         */
        public Builder datasetDescription(String datasetDescription) {
            this.putBodyParameter("DatasetDescription", datasetDescription);
            this.datasetDescription = datasetDescription;
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
         * DocType.
         */
        public Builder docType(String docType) {
            this.putBodyParameter("DocType", docType);
            this.docType = docType;
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
         * ExcludeFields.
         */
        public Builder excludeFields(java.util.List<String> excludeFields) {
            String excludeFieldsShrink = shrink(excludeFields, "ExcludeFields", "json");
            this.putBodyParameter("ExcludeFields", excludeFieldsShrink);
            this.excludeFields = excludeFields;
            return this;
        }

        /**
         * Extend1.
         */
        public Builder extend1(String extend1) {
            this.putQueryParameter("Extend1", extend1);
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
         * IncludeFields.
         */
        public Builder includeFields(java.util.List<String> includeFields) {
            String includeFieldsShrink = shrink(includeFields, "IncludeFields", "json");
            this.putBodyParameter("IncludeFields", includeFieldsShrink);
            this.includeFields = includeFields;
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
         * Query.
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
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
         * Status.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
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
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListDatasetDocumentsRequest build() {
            return new ListDatasetDocumentsRequest(this);
        } 

    } 

}
