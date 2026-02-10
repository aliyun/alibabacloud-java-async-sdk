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
 * {@link UpdateMultimodalFineTuneDatasetRequest} extends {@link RequestModel}
 *
 * <p>UpdateMultimodalFineTuneDatasetRequest</p>
 */
public class UpdateMultimodalFineTuneDatasetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetDescription")
    private String datasetDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private String datasetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    private String datasetName;

    private UpdateMultimodalFineTuneDatasetRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.datasetDescription = builder.datasetDescription;
        this.datasetId = builder.datasetId;
        this.datasetName = builder.datasetName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMultimodalFineTuneDatasetRequest create() {
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
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    public static final class Builder extends Request.Builder<UpdateMultimodalFineTuneDatasetRequest, Builder> {
        private String DBClusterId; 
        private String datasetDescription; 
        private String datasetId; 
        private String datasetName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMultimodalFineTuneDatasetRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.datasetDescription = request.datasetDescription;
            this.datasetId = request.datasetId;
            this.datasetName = request.datasetName;
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
         * DatasetId.
         */
        public Builder datasetId(String datasetId) {
            this.putQueryParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
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

        @Override
        public UpdateMultimodalFineTuneDatasetRequest build() {
            return new UpdateMultimodalFineTuneDatasetRequest(this);
        } 

    } 

}
