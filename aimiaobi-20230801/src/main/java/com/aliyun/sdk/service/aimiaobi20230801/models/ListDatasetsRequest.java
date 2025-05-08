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
 * {@link ListDatasetsRequest} extends {@link RequestModel}
 *
 * <p>ListDatasetsRequest</p>
 */
public class ListDatasetsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("DatasetType")
    private String datasetType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncludeConfig")
    private Boolean includeConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchDatasetEnable")
    private Integer searchDatasetEnable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private ListDatasetsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.datasetId = builder.datasetId;
        this.datasetName = builder.datasetName;
        this.datasetType = builder.datasetType;
        this.endTime = builder.endTime;
        this.includeConfig = builder.includeConfig;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchDatasetEnable = builder.searchDatasetEnable;
        this.startTime = builder.startTime;
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
     * @return datasetType
     */
    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return includeConfig
     */
    public Boolean getIncludeConfig() {
        return this.includeConfig;
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
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return searchDatasetEnable
     */
    public Integer getSearchDatasetEnable() {
        return this.searchDatasetEnable;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListDatasetsRequest, Builder> {
        private String regionId; 
        private Long datasetId; 
        private String datasetName; 
        private String datasetType; 
        private String endTime; 
        private Boolean includeConfig; 
        private Integer pageNumber; 
        private String pageSize; 
        private Integer searchDatasetEnable; 
        private String startTime; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListDatasetsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.datasetId = request.datasetId;
            this.datasetName = request.datasetName;
            this.datasetType = request.datasetType;
            this.endTime = request.endTime;
            this.includeConfig = request.includeConfig;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchDatasetEnable = request.searchDatasetEnable;
            this.startTime = request.startTime;
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
         * DatasetType.
         */
        public Builder datasetType(String datasetType) {
            this.putBodyParameter("DatasetType", datasetType);
            this.datasetType = datasetType;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IncludeConfig.
         */
        public Builder includeConfig(Boolean includeConfig) {
            this.putBodyParameter("IncludeConfig", includeConfig);
            this.includeConfig = includeConfig;
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
        public Builder pageSize(String pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SearchDatasetEnable.
         */
        public Builder searchDatasetEnable(Integer searchDatasetEnable) {
            this.putBodyParameter("SearchDatasetEnable", searchDatasetEnable);
            this.searchDatasetEnable = searchDatasetEnable;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListDatasetsRequest build() {
            return new ListDatasetsRequest(this);
        } 

    } 

}
