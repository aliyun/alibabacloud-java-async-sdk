// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
         * <p>File name.</p>
         * 
         * <strong>example:</strong>
         * <p>P4911_2707.csv</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>File URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://res-v1.cupl-fdfs.com/direct/79886bdc-9855-4ff4-aa34-eb5b21cd43a7">https://res-v1.cupl-fdfs.com/direct/79886bdc-9855-4ff4-aa34-eb5b21cd43a7</a></p>
         */
        public Builder fileUrl(String fileUrl) {
            this.putQueryParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>FNNCIEA</p>
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
