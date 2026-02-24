// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbai20251013.models;

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
 * {@link ListMultimodalSearchTaskRequest} extends {@link RequestModel}
 *
 * <p>ListMultimodalSearchTaskRequest</p>
 */
public class ListMultimodalSearchTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetIds")
    private java.util.List<String> datasetIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputField")
    private String inputField;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelMode")
    private String modelMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    private ListMultimodalSearchTaskRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.datasetIds = builder.datasetIds;
        this.inputField = builder.inputField;
        this.modelMode = builder.modelMode;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sourceRegionId = builder.sourceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMultimodalSearchTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return datasetIds
     */
    public java.util.List<String> getDatasetIds() {
        return this.datasetIds;
    }

    /**
     * @return inputField
     */
    public String getInputField() {
        return this.inputField;
    }

    /**
     * @return modelMode
     */
    public String getModelMode() {
        return this.modelMode;
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
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    public static final class Builder extends Request.Builder<ListMultimodalSearchTaskRequest, Builder> {
        private String DBClusterId; 
        private java.util.List<String> datasetIds; 
        private String inputField; 
        private String modelMode; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sourceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(ListMultimodalSearchTaskRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.datasetIds = request.datasetIds;
            this.inputField = request.inputField;
            this.modelMode = request.modelMode;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sourceRegionId = request.sourceRegionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2ze454l20me07****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * DatasetIds.
         */
        public Builder datasetIds(java.util.List<String> datasetIds) {
            String datasetIdsShrink = shrink(datasetIds, "DatasetIds", "json");
            this.putQueryParameter("DatasetIds", datasetIdsShrink);
            this.datasetIds = datasetIds;
            return this;
        }

        /**
         * InputField.
         */
        public Builder inputField(String inputField) {
            this.putQueryParameter("InputField", inputField);
            this.inputField = inputField;
            return this;
        }

        /**
         * ModelMode.
         */
        public Builder modelMode(String modelMode) {
            this.putQueryParameter("ModelMode", modelMode);
            this.modelMode = modelMode;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putQueryParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        @Override
        public ListMultimodalSearchTaskRequest build() {
            return new ListMultimodalSearchTaskRequest(this);
        } 

    } 

}
