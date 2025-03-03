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
 * {@link DeleteDatasetJobConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteDatasetJobConfigRequest</p>
 */
public class DeleteDatasetJobConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetJobConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetJobConfigId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private DeleteDatasetJobConfigRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.datasetJobConfigId = builder.datasetJobConfigId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDatasetJobConfigRequest create() {
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
     * @return datasetJobConfigId
     */
    public String getDatasetJobConfigId() {
        return this.datasetJobConfigId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DeleteDatasetJobConfigRequest, Builder> {
        private String datasetId; 
        private String datasetJobConfigId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDatasetJobConfigRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.datasetJobConfigId = request.datasetJobConfigId;
            this.workspaceId = request.workspaceId;
        } 

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dscfg-xxxxxxxxxxxx</p>
         */
        public Builder datasetJobConfigId(String datasetJobConfigId) {
            this.putPathParameter("DatasetJobConfigId", datasetJobConfigId);
            this.datasetJobConfigId = datasetJobConfigId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public DeleteDatasetJobConfigRequest build() {
            return new DeleteDatasetJobConfigRequest(this);
        } 

    } 

}
