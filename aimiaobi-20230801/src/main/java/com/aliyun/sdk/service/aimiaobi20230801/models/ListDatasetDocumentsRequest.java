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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetDescription")
    private String datasetDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private Long datasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    private String datasetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocType")
    private String docType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExcludeFields")
    private java.util.List<String> excludeFields;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private ListDatasetDocumentsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.datasetDescription = builder.datasetDescription;
        this.datasetId = builder.datasetId;
        this.datasetName = builder.datasetName;
        this.docType = builder.docType;
        this.excludeFields = builder.excludeFields;
        this.includeFields = builder.includeFields;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.query = builder.query;
        this.status = builder.status;
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
     * @return docType
     */
    public String getDocType() {
        return this.docType;
    }

    /**
     * @return excludeFields
     */
    public java.util.List<String> getExcludeFields() {
        return this.excludeFields;
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
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListDatasetDocumentsRequest, Builder> {
        private String regionId; 
        private String datasetDescription; 
        private Long datasetId; 
        private String datasetName; 
        private String docType; 
        private java.util.List<String> excludeFields; 
        private java.util.List<String> includeFields; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String query; 
        private Integer status; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListDatasetDocumentsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.datasetDescription = request.datasetDescription;
            this.datasetId = request.datasetId;
            this.datasetName = request.datasetName;
            this.docType = request.docType;
            this.excludeFields = request.excludeFields;
            this.includeFields = request.includeFields;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.query = request.query;
            this.status = request.status;
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
         * DocType.
         */
        public Builder docType(String docType) {
            this.putBodyParameter("DocType", docType);
            this.docType = docType;
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
         * Status.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
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
