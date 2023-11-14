// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadedHoneyPotFileRequest} extends {@link RequestModel}
 *
 * <p>UploadedHoneyPotFileRequest</p>
 */
public class UploadedHoneyPotFileRequest extends Request {
    @Query
    @NameInMap("FileKey")
    @Validation(required = true)
    private String fileKey;

    @Query
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    @Query
    @NameInMap("FileType")
    @Validation(required = true)
    private String fileType;

    @Query
    @NameInMap("HoneypotImageName")
    @Validation(required = true)
    private String honeypotImageName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("NodeId")
    private String nodeId;

    @Query
    @NameInMap("TemplateExtra")
    @Validation(required = true)
    private String templateExtra;

    private UploadedHoneyPotFileRequest(Builder builder) {
        super(builder);
        this.fileKey = builder.fileKey;
        this.fileName = builder.fileName;
        this.fileType = builder.fileType;
        this.honeypotImageName = builder.honeypotImageName;
        this.lang = builder.lang;
        this.nodeId = builder.nodeId;
        this.templateExtra = builder.templateExtra;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadedHoneyPotFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileKey
     */
    public String getFileKey() {
        return this.fileKey;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @return honeypotImageName
     */
    public String getHoneypotImageName() {
        return this.honeypotImageName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return templateExtra
     */
    public String getTemplateExtra() {
        return this.templateExtra;
    }

    public static final class Builder extends Request.Builder<UploadedHoneyPotFileRequest, Builder> {
        private String fileKey; 
        private String fileName; 
        private String fileType; 
        private String honeypotImageName; 
        private String lang; 
        private String nodeId; 
        private String templateExtra; 

        private Builder() {
            super();
        } 

        private Builder(UploadedHoneyPotFileRequest request) {
            super(request);
            this.fileKey = request.fileKey;
            this.fileName = request.fileName;
            this.fileType = request.fileType;
            this.honeypotImageName = request.honeypotImageName;
            this.lang = request.lang;
            this.nodeId = request.nodeId;
            this.templateExtra = request.templateExtra;
        } 

        /**
         * FileKey.
         */
        public Builder fileKey(String fileKey) {
            this.putQueryParameter("FileKey", fileKey);
            this.fileKey = fileKey;
            return this;
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
         * FileType.
         */
        public Builder fileType(String fileType) {
            this.putQueryParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * HoneypotImageName.
         */
        public Builder honeypotImageName(String honeypotImageName) {
            this.putQueryParameter("HoneypotImageName", honeypotImageName);
            this.honeypotImageName = honeypotImageName;
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
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * TemplateExtra.
         */
        public Builder templateExtra(String templateExtra) {
            this.putQueryParameter("TemplateExtra", templateExtra);
            this.templateExtra = templateExtra;
            return this;
        }

        @Override
        public UploadedHoneyPotFileRequest build() {
            return new UploadedHoneyPotFileRequest(this);
        } 

    } 

}
