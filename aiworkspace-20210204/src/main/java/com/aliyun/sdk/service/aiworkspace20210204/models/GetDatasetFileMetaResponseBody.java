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
 * {@link GetDatasetFileMetaResponseBody} extends {@link TeaModel}
 *
 * <p>GetDatasetFileMetaResponseBody</p>
 */
public class GetDatasetFileMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatasetFileMeta")
    private DatasetFileMetaContentGet datasetFileMeta;

    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private String datasetId;

    @com.aliyun.core.annotation.NameInMap("DatasetVersion")
    private String datasetVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetDatasetFileMetaResponseBody(Builder builder) {
        this.datasetFileMeta = builder.datasetFileMeta;
        this.datasetId = builder.datasetId;
        this.datasetVersion = builder.datasetVersion;
        this.requestId = builder.requestId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatasetFileMetaResponseBody create() {
        return builder().build();
    }

    /**
     * @return datasetFileMeta
     */
    public DatasetFileMetaContentGet getDatasetFileMeta() {
        return this.datasetFileMeta;
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return datasetVersion
     */
    public String getDatasetVersion() {
        return this.datasetVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private DatasetFileMetaContentGet datasetFileMeta; 
        private String datasetId; 
        private String datasetVersion; 
        private String requestId; 
        private String workspaceId; 

        /**
         * DatasetFileMeta.
         */
        public Builder datasetFileMeta(DatasetFileMetaContentGet datasetFileMeta) {
            this.datasetFileMeta = datasetFileMeta;
            return this;
        }

        /**
         * DatasetId.
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * DatasetVersion.
         */
        public Builder datasetVersion(String datasetVersion) {
            this.datasetVersion = datasetVersion;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetDatasetFileMetaResponseBody build() {
            return new GetDatasetFileMetaResponseBody(this);
        } 

    } 

}
