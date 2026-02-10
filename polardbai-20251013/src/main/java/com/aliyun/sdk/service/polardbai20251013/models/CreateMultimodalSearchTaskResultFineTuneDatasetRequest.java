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
 * {@link CreateMultimodalSearchTaskResultFineTuneDatasetRequest} extends {@link RequestModel}
 *
 * <p>CreateMultimodalSearchTaskResultFineTuneDatasetRequest</p>
 */
public class CreateMultimodalSearchTaskResultFineTuneDatasetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetDescription")
    private String datasetDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    private String datasetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResultIndex")
    private java.util.List<Integer> resultIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResultMode")
    private String resultMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopN")
    private Integer topN;

    private CreateMultimodalSearchTaskResultFineTuneDatasetRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.datasetDescription = builder.datasetDescription;
        this.datasetName = builder.datasetName;
        this.resultIndex = builder.resultIndex;
        this.resultMode = builder.resultMode;
        this.taskId = builder.taskId;
        this.topN = builder.topN;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMultimodalSearchTaskResultFineTuneDatasetRequest create() {
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
     * @return datasetDescription
     */
    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return resultIndex
     */
    public java.util.List<Integer> getResultIndex() {
        return this.resultIndex;
    }

    /**
     * @return resultMode
     */
    public String getResultMode() {
        return this.resultMode;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return topN
     */
    public Integer getTopN() {
        return this.topN;
    }

    public static final class Builder extends Request.Builder<CreateMultimodalSearchTaskResultFineTuneDatasetRequest, Builder> {
        private String DBClusterId; 
        private String datasetDescription; 
        private String datasetName; 
        private java.util.List<Integer> resultIndex; 
        private String resultMode; 
        private String taskId; 
        private Integer topN; 

        private Builder() {
            super();
        } 

        private Builder(CreateMultimodalSearchTaskResultFineTuneDatasetRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.datasetDescription = request.datasetDescription;
            this.datasetName = request.datasetName;
            this.resultIndex = request.resultIndex;
            this.resultMode = request.resultMode;
            this.taskId = request.taskId;
            this.topN = request.topN;
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
         * DatasetDescription.
         */
        public Builder datasetDescription(String datasetDescription) {
            this.putQueryParameter("DatasetDescription", datasetDescription);
            this.datasetDescription = datasetDescription;
            return this;
        }

        /**
         * DatasetName.
         */
        public Builder datasetName(String datasetName) {
            this.putQueryParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * ResultIndex.
         */
        public Builder resultIndex(java.util.List<Integer> resultIndex) {
            String resultIndexShrink = shrink(resultIndex, "ResultIndex", "json");
            this.putQueryParameter("ResultIndex", resultIndexShrink);
            this.resultIndex = resultIndex;
            return this;
        }

        /**
         * ResultMode.
         */
        public Builder resultMode(String resultMode) {
            this.putQueryParameter("ResultMode", resultMode);
            this.resultMode = resultMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>476751c5-*****-39f6aff1df96</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * TopN.
         */
        public Builder topN(Integer topN) {
            this.putQueryParameter("TopN", topN);
            this.topN = topN;
            return this;
        }

        @Override
        public CreateMultimodalSearchTaskResultFineTuneDatasetRequest build() {
            return new CreateMultimodalSearchTaskResultFineTuneDatasetRequest(this);
        } 

    } 

}
