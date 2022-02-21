// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadFileRequest} extends {@link RequestModel}
 *
 * <p>UploadFileRequest</p>
 */
public class UploadFileRequest extends Request {
    @Body
    @NameInMap("CorpId")
    private String corpId;

    @Body
    @NameInMap("DataSourceId")
    @Validation(required = true)
    private String dataSourceId;

    @Body
    @NameInMap("FileAliasName")
    private String fileAliasName;

    @Body
    @NameInMap("FileContent")
    private String fileContent;

    @Body
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    @Body
    @NameInMap("FilePath")
    private String filePath;

    @Body
    @NameInMap("FileType")
    @Validation(required = true)
    private String fileType;

    @Body
    @NameInMap("MD5")
    private String MD5;

    private UploadFileRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.dataSourceId = builder.dataSourceId;
        this.fileAliasName = builder.fileAliasName;
        this.fileContent = builder.fileContent;
        this.fileName = builder.fileName;
        this.filePath = builder.filePath;
        this.fileType = builder.fileType;
        this.MD5 = builder.MD5;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return fileAliasName
     */
    public String getFileAliasName() {
        return this.fileAliasName;
    }

    /**
     * @return fileContent
     */
    public String getFileContent() {
        return this.fileContent;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @return MD5
     */
    public String getMD5() {
        return this.MD5;
    }

    public static final class Builder extends Request.Builder<UploadFileRequest, Builder> {
        private String corpId; 
        private String dataSourceId; 
        private String fileAliasName; 
        private String fileContent; 
        private String fileName; 
        private String filePath; 
        private String fileType; 
        private String MD5; 

        private Builder() {
            super();
        } 

        private Builder(UploadFileRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.dataSourceId = response.dataSourceId;
            this.fileAliasName = response.fileAliasName;
            this.fileContent = response.fileContent;
            this.fileName = response.fileName;
            this.filePath = response.filePath;
            this.fileType = response.fileType;
            this.MD5 = response.MD5;
        } 

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * DataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putBodyParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * FileAliasName.
         */
        public Builder fileAliasName(String fileAliasName) {
            this.putBodyParameter("FileAliasName", fileAliasName);
            this.fileAliasName = fileAliasName;
            return this;
        }

        /**
         * FileContent.
         */
        public Builder fileContent(String fileContent) {
            this.putBodyParameter("FileContent", fileContent);
            this.fileContent = fileContent;
            return this;
        }

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * FilePath.
         */
        public Builder filePath(String filePath) {
            this.putBodyParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * FileType.
         */
        public Builder fileType(String fileType) {
            this.putBodyParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * MD5.
         */
        public Builder MD5(String MD5) {
            this.putBodyParameter("MD5", MD5);
            this.MD5 = MD5;
            return this;
        }

        @Override
        public UploadFileRequest build() {
            return new UploadFileRequest(this);
        } 

    } 

}
