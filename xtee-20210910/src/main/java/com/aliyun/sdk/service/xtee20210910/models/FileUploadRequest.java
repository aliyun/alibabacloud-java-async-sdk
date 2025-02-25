// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FileUploadRequest} extends {@link RequestModel}
 *
 * <p>FileUploadRequest</p>
 */
public class FileUploadRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileUrl")
    private String fileUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tab")
    private String tab;

    private FileUploadRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
        this.fileUrl = builder.fileUrl;
        this.lang = builder.lang;
        this.tab = builder.tab;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FileUploadRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return tab
     */
    public String getTab() {
        return this.tab;
    }

    public static final class Builder extends Request.Builder<FileUploadRequest, Builder> {
        private String fileName; 
        private String fileUrl; 
        private String lang; 
        private String tab; 

        private Builder() {
            super();
        } 

        private Builder(FileUploadRequest request) {
            super(request);
            this.fileName = request.fileName;
            this.fileUrl = request.fileUrl;
            this.lang = request.lang;
            this.tab = request.tab;
        } 

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * FileUrl.
         */
        public Builder fileUrl(String fileUrl) {
            this.putQueryParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Tab.
         */
        public Builder tab(String tab) {
            this.putQueryParameter("Tab", tab);
            this.tab = tab;
            return this;
        }

        @Override
        public FileUploadRequest build() {
            return new FileUploadRequest(this);
        } 

    } 

}
