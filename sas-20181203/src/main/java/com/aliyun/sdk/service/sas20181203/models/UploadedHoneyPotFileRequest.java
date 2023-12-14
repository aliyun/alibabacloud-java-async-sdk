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
         * The file key that you use to upload the file.
         * <p>
         * 
         * >  The key is in the format of HONEYPOT_FILE/{Timestamp}\_{Custom file name}.
         */
        public Builder fileKey(String fileKey) {
            this.putQueryParameter("FileKey", fileKey);
            this.fileKey = fileKey;
            return this;
        }

        /**
         * The name of the file that you want to upload.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * The file type.
         */
        public Builder fileType(String fileType) {
            this.putQueryParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * The name of the honeypot image.
         */
        public Builder honeypotImageName(String honeypotImageName) {
            this.putQueryParameter("HoneypotImageName", honeypotImageName);
            this.honeypotImageName = honeypotImageName;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the management node to which the honeypot belongs.
         * <p>
         * 
         * >  You can call the [ListHoneypotNode](~~ListHoneypotNode~~) operation to obtain the IDs of management nodes. operation to query the management node ID.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The prompt template that corresponds to the file.
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
