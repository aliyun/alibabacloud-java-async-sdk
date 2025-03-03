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
 * {@link DeleteDatasetFileMetasRequest} extends {@link RequestModel}
 *
 * <p>DeleteDatasetFileMetasRequest</p>
 */
public class DeleteDatasetFileMetasRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetFileMetaIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetFileMetaIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetVersion")
    private String datasetVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private DeleteDatasetFileMetasRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.datasetFileMetaIds = builder.datasetFileMetaIds;
        this.datasetVersion = builder.datasetVersion;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDatasetFileMetasRequest create() {
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
     * @return datasetFileMetaIds
     */
    public String getDatasetFileMetaIds() {
        return this.datasetFileMetaIds;
    }

    /**
     * @return datasetVersion
     */
    public String getDatasetVersion() {
        return this.datasetVersion;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DeleteDatasetFileMetasRequest, Builder> {
        private String datasetId; 
        private String datasetFileMetaIds; 
        private String datasetVersion; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDatasetFileMetasRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.datasetFileMetaIds = request.datasetFileMetaIds;
            this.datasetVersion = request.datasetVersion;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-lfd60v0p****ujtsdx</p>
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
         * <p>07914c9534586e4e7aa6e9dbca5009082df******fd8a0d857b33296c59bf6</p>
         */
        public Builder datasetFileMetaIds(String datasetFileMetaIds) {
            this.putQueryParameter("DatasetFileMetaIds", datasetFileMetaIds);
            this.datasetFileMetaIds = datasetFileMetaIds;
            return this;
        }

        /**
         * DatasetVersion.
         */
        public Builder datasetVersion(String datasetVersion) {
            this.putQueryParameter("DatasetVersion", datasetVersion);
            this.datasetVersion = datasetVersion;
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
        public DeleteDatasetFileMetasRequest build() {
            return new DeleteDatasetFileMetasRequest(this);
        } 

    } 

}
