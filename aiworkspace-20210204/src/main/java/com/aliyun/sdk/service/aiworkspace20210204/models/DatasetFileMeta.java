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
 * {@link DatasetFileMeta} extends {@link TeaModel}
 *
 * <p>DatasetFileMeta</p>
 */
public class DatasetFileMeta extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataSize")
    private Long dataSize;

    @com.aliyun.core.annotation.NameInMap("DatasetFileMetaId")
    private String datasetFileMetaId;

    @com.aliyun.core.annotation.NameInMap("DownloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("FileFingerPrint")
    private String fileFingerPrint;

    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("FileUpdateTime")
    private String fileUpdateTime;

    @com.aliyun.core.annotation.NameInMap("Score")
    private Float score;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.NameInMap("Uri")
    private String uri;

    private DatasetFileMeta(Builder builder) {
        this.dataSize = builder.dataSize;
        this.datasetFileMetaId = builder.datasetFileMetaId;
        this.downloadUrl = builder.downloadUrl;
        this.fileFingerPrint = builder.fileFingerPrint;
        this.fileName = builder.fileName;
        this.fileUpdateTime = builder.fileUpdateTime;
        this.score = builder.score;
        this.tags = builder.tags;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatasetFileMeta create() {
        return builder().build();
    }

    /**
     * @return dataSize
     */
    public Long getDataSize() {
        return this.dataSize;
    }

    /**
     * @return datasetFileMetaId
     */
    public String getDatasetFileMetaId() {
        return this.datasetFileMetaId;
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return fileFingerPrint
     */
    public String getFileFingerPrint() {
        return this.fileFingerPrint;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return fileUpdateTime
     */
    public String getFileUpdateTime() {
        return this.fileUpdateTime;
    }

    /**
     * @return score
     */
    public Float getScore() {
        return this.score;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder {
        private Long dataSize; 
        private String datasetFileMetaId; 
        private String downloadUrl; 
        private String fileFingerPrint; 
        private String fileName; 
        private String fileUpdateTime; 
        private Float score; 
        private String tags; 
        private String uri; 

        /**
         * DataSize.
         */
        public Builder dataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }

        /**
         * DatasetFileMetaId.
         */
        public Builder datasetFileMetaId(String datasetFileMetaId) {
            this.datasetFileMetaId = datasetFileMetaId;
            return this;
        }

        /**
         * DownloadUrl.
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * FileFingerPrint.
         */
        public Builder fileFingerPrint(String fileFingerPrint) {
            this.fileFingerPrint = fileFingerPrint;
            return this;
        }

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        public Builder fileUpdateTime(String fileUpdateTime) {
            this.fileUpdateTime = fileUpdateTime;
            return this;
        }

        /**
         * Score.
         */
        public Builder score(Float score) {
            this.score = score;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Uri.
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public DatasetFileMeta build() {
            return new DatasetFileMeta(this);
        } 

    } 

}
