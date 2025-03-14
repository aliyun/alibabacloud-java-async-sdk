// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link UploadedHoneyPotFileRequest} extends {@link RequestModel}
 *
 * <p>UploadedHoneyPotFileRequest</p>
 */
public class UploadedHoneyPotFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoneypotImageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String honeypotImageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateExtra")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The file key that you use to upload the file.</p>
         * <blockquote>
         * <p> The key is in the format of HONEYPOT_FILE/{Timestamp}_{Custom file name}.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HONEYPOT_FILE/1601097845544644_********</p>
         */
        public Builder fileKey(String fileKey) {
            this.putQueryParameter("FileKey", fileKey);
            this.fileKey = fileKey;
            return this;
        }

        /**
         * <p>The name of the file that you want to upload.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>trojan.zip</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The file type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>application/zip</p>
         */
        public Builder fileType(String fileType) {
            this.putQueryParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * <p>The name of the honeypot image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ruoyi</p>
         */
        public Builder honeypotImageName(String honeypotImageName) {
            this.putQueryParameter("HoneypotImageName", honeypotImageName);
            this.honeypotImageName = honeypotImageName;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
         * <p>The ID of the management node to which the honeypot belongs.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListHoneypotNode~~">ListHoneypotNode</a> operation to obtain the IDs of management nodes. operation to query the management node ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cc427e14-f257-4670-9d2b-d83bbbe*****</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The prompt template that corresponds to the file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;help&quot;:&quot;.zip&quot;,&quot;label&quot;:&quot;file&quot;,&quot;type&quot;:&quot;file&quot;,&quot;key&quot;:&quot;ftpfiles.zip&quot;}</p>
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
