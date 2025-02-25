// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link SendFileRequest} extends {@link RequestModel}
 *
 * <p>SendFileRequest</p>
 */
public class SendFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentType")
    private String contentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileGroup")
    private String fileGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileMode")
    private String fileMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileOwner")
    private String fileOwner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> nodeIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Overwrite")
    private Boolean overwrite;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetDir")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetDir;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Integer timeout;

    private SendFileRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.content = builder.content;
        this.contentType = builder.contentType;
        this.description = builder.description;
        this.fileGroup = builder.fileGroup;
        this.fileMode = builder.fileMode;
        this.fileOwner = builder.fileOwner;
        this.name = builder.name;
        this.nodeIdList = builder.nodeIdList;
        this.overwrite = builder.overwrite;
        this.targetDir = builder.targetDir;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileGroup
     */
    public String getFileGroup() {
        return this.fileGroup;
    }

    /**
     * @return fileMode
     */
    public String getFileMode() {
        return this.fileMode;
    }

    /**
     * @return fileOwner
     */
    public String getFileOwner() {
        return this.fileOwner;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nodeIdList
     */
    public java.util.List<String> getNodeIdList() {
        return this.nodeIdList;
    }

    /**
     * @return overwrite
     */
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    /**
     * @return targetDir
     */
    public String getTargetDir() {
        return this.targetDir;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<SendFileRequest, Builder> {
        private String regionId; 
        private String content; 
        private String contentType; 
        private String description; 
        private String fileGroup; 
        private String fileMode; 
        private String fileOwner; 
        private String name; 
        private java.util.List<String> nodeIdList; 
        private Boolean overwrite; 
        private String targetDir; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(SendFileRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.content = request.content;
            this.contentType = request.contentType;
            this.description = request.description;
            this.fileGroup = request.fileGroup;
            this.fileMode = request.fileMode;
            this.fileOwner = request.fileOwner;
            this.name = request.name;
            this.nodeIdList = request.nodeIdList;
            this.overwrite = request.overwrite;
            this.targetDir = request.targetDir;
            this.timeout = request.timeout;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The content of the file. After Base64 encoding, the size cannot exceed 32 KB.</p>
         * <ul>
         * <li>When the <code>ContentType</code> parameter is <code>PlainText</code>, this field is plain text.</li>
         * <li>When the <code>ContentType</code> parameter is <code>Base64</code>, this field is Base64 encoded text.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>#!/bin/bash echo &quot;Current User is :&quot; echo $(ps | grep &quot;$$&quot; | awk &quot;{print $2}&quot;) -------- oss://bucketName/objectName</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The content type of the file.</p>
         * <p>PlainText: Plain text.
         * Base64: Base64 encoded.
         * The default value is PlainText.</p>
         * 
         * <strong>example:</strong>
         * <p>PlainText</p>
         */
        public Builder contentType(String contentType) {
            this.putBodyParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>Description information. Supports all character sets, and the length must not exceed 512 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a test file.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The group of the file. Applies only to Linux instances, and the default is root. The length must not exceed 64 characters.</p>
         * <p>Note
         * When using other groups, ensure that the group exists in the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder fileGroup(String fileGroup) {
            this.putBodyParameter("FileGroup", fileGroup);
            this.fileGroup = fileGroup;
            return this;
        }

        /**
         * <p>The permissions of the file. Applies only to Linux instances, and the setting method is the same as the chmod command.</p>
         * <p>The default value is 0644, which means the user has read and write permissions, while the group and other users have read-only permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>0644</p>
         */
        public Builder fileMode(String fileMode) {
            this.putBodyParameter("FileMode", fileMode);
            this.fileMode = fileMode;
            return this;
        }

        /**
         * <p>The owner of the file. Applies only to Linux instances, and the default is root.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder fileOwner(String fileOwner) {
            this.putBodyParameter("FileOwner", fileOwner);
            this.fileOwner = fileOwner;
            return this;
        }

        /**
         * <p>The name of the file. Supports all character sets, and the length must not exceed 255 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>file.txt</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>List of nodes.</p>
         * <p>This parameter is required.</p>
         */
        public Builder nodeIdList(java.util.List<String> nodeIdList) {
            String nodeIdListShrink = shrink(nodeIdList, "NodeIdList", "json");
            this.putBodyParameter("NodeIdList", nodeIdListShrink);
            this.nodeIdList = nodeIdList;
            return this;
        }

        /**
         * <p>Whether to overwrite the file if a file with the same name already exists in the target directory.</p>
         * <ul>
         * <li>true: Overwrite.</li>
         * <li>false: Do not overwrite.</li>
         * </ul>
         * <p>The default value is false.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder overwrite(Boolean overwrite) {
            this.putBodyParameter("Overwrite", overwrite);
            this.overwrite = overwrite;
            return this;
        }

        /**
         * <p>The directory in the target Lingjun node where the file will be sent. If it does not exist, it will be automatically created.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/home</p>
         */
        public Builder targetDir(String targetDir) {
            this.putBodyParameter("TargetDir", targetDir);
            this.targetDir = targetDir;
            return this;
        }

        /**
         * <p>The timeout for sending the file. Unit: seconds.</p>
         * <ul>
         * <li>A timeout may occur due to process reasons, missing modules, or missing Cloud Assistant Agent.</li>
         * <li>If the set timeout is less than 10 seconds, to ensure successful delivery, the system will automatically set the timeout to 10 seconds.</li>
         * </ul>
         * <p>The default value is 60.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder timeout(Integer timeout) {
            this.putBodyParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public SendFileRequest build() {
            return new SendFileRequest(this);
        } 

    } 

}
