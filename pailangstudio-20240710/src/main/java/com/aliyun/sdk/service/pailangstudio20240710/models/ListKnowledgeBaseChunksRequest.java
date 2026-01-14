// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
 * {@link ListKnowledgeBaseChunksRequest} extends {@link RequestModel}
 *
 * <p>ListKnowledgeBaseChunksRequest</p>
 */
public class ListKnowledgeBaseChunksRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChunkStatus")
    private String chunkStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetaData")
    private MetaData metaData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private ListKnowledgeBaseChunksRequest(Builder builder) {
        super(builder);
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.chunkStatus = builder.chunkStatus;
        this.metaData = builder.metaData;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKnowledgeBaseChunksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return chunkStatus
     */
    public String getChunkStatus() {
        return this.chunkStatus;
    }

    /**
     * @return metaData
     */
    public MetaData getMetaData() {
        return this.metaData;
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
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder extends Request.Builder<ListKnowledgeBaseChunksRequest, Builder> {
        private String knowledgeBaseId; 
        private String chunkStatus; 
        private MetaData metaData; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String versionName; 

        private Builder() {
            super();
        } 

        private Builder(ListKnowledgeBaseChunksRequest request) {
            super(request);
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.chunkStatus = request.chunkStatus;
            this.metaData = request.metaData;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.versionName = request.versionName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-ab****89</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putPathParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * ChunkStatus.
         */
        public Builder chunkStatus(String chunkStatus) {
            this.putQueryParameter("ChunkStatus", chunkStatus);
            this.chunkStatus = chunkStatus;
            return this;
        }

        /**
         * MetaData.
         */
        public Builder metaData(MetaData metaData) {
            this.putQueryParameter("MetaData", metaData);
            this.metaData = metaData;
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
         * VersionName.
         */
        public Builder versionName(String versionName) {
            this.putQueryParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        @Override
        public ListKnowledgeBaseChunksRequest build() {
            return new ListKnowledgeBaseChunksRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListKnowledgeBaseChunksRequest} extends {@link TeaModel}
     *
     * <p>ListKnowledgeBaseChunksRequest</p>
     */
    public static class MetaData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileMetaId")
        private String fileMetaId;

        @com.aliyun.core.annotation.NameInMap("FileUri")
        private String fileUri;

        private MetaData(Builder builder) {
            this.fileMetaId = builder.fileMetaId;
            this.fileUri = builder.fileUri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetaData create() {
            return builder().build();
        }

        /**
         * @return fileMetaId
         */
        public String getFileMetaId() {
            return this.fileMetaId;
        }

        /**
         * @return fileUri
         */
        public String getFileUri() {
            return this.fileUri;
        }

        public static final class Builder {
            private String fileMetaId; 
            private String fileUri; 

            private Builder() {
            } 

            private Builder(MetaData model) {
                this.fileMetaId = model.fileMetaId;
                this.fileUri = model.fileUri;
            } 

            /**
             * <p>文件元数据ID</p>
             * 
             * <strong>example:</strong>
             * <p>xd8e****79du</p>
             */
            public Builder fileMetaId(String fileMetaId) {
                this.fileMetaId = fileMetaId;
                return this;
            }

            /**
             * <p>文件地址</p>
             * 
             * <strong>example:</strong>
             * <p>oss://mybucketpath/file1.txt</p>
             */
            public Builder fileUri(String fileUri) {
                this.fileUri = fileUri;
                return this;
            }

            public MetaData build() {
                return new MetaData(this);
            } 

        } 

    }
}
