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
 * {@link DeleteMultimodalFineTuneDatasetRequest} extends {@link RequestModel}
 *
 * <p>DeleteMultimodalFineTuneDatasetRequest</p>
 */
public class DeleteMultimodalFineTuneDatasetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    private DeleteMultimodalFineTuneDatasetRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.datasetId = builder.datasetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMultimodalFineTuneDatasetRequest create() {
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
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    public static final class Builder extends Request.Builder<DeleteMultimodalFineTuneDatasetRequest, Builder> {
        private String DBClusterId; 
        private String datasetId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMultimodalFineTuneDatasetRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.datasetId = request.datasetId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-***</p>
         */
        public Builder datasetId(String datasetId) {
            this.putQueryParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        @Override
        public DeleteMultimodalFineTuneDatasetRequest build() {
            return new DeleteMultimodalFineTuneDatasetRequest(this);
        } 

    } 

}
