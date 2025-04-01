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
 * {@link ListDatasetFileMetasResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatasetFileMetasResponseBody</p>
 */
public class ListDatasetFileMetasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatasetFileMetas")
    private java.util.List<DatasetFileMeta> datasetFileMetas;

    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private String datasetId;

    @com.aliyun.core.annotation.NameInMap("DatasetVersion")
    private String datasetVersion;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListDatasetFileMetasResponseBody(Builder builder) {
        this.datasetFileMetas = builder.datasetFileMetas;
        this.datasetId = builder.datasetId;
        this.datasetVersion = builder.datasetVersion;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatasetFileMetasResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetFileMetas
     */
    public java.util.List<DatasetFileMeta> getDatasetFileMetas() {
        return this.datasetFileMetas;
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private java.util.List<DatasetFileMeta> datasetFileMetas; 
        private String datasetId; 
        private String datasetVersion; 
        private String nextToken; 
        private Integer pageSize; 
        private Integer totalCount; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(ListDatasetFileMetasResponseBody model) {
            this.datasetFileMetas = model.datasetFileMetas;
            this.datasetId = model.datasetId;
            this.datasetVersion = model.datasetVersion;
            this.nextToken = model.nextToken;
            this.pageSize = model.pageSize;
            this.totalCount = model.totalCount;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * DatasetFileMetas.
         */
        public Builder datasetFileMetas(java.util.List<DatasetFileMeta> datasetFileMetas) {
            this.datasetFileMetas = datasetFileMetas;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public ListDatasetFileMetasResponseBody build() {
            return new ListDatasetFileMetasResponseBody(this);
        } 

    } 

}
