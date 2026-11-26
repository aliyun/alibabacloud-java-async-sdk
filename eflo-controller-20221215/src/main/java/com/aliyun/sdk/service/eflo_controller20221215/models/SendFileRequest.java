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
         * <p>The file content. The size of the file content cannot exceed 32 KB after Base64 encoding.</p>
         * <ul>
         * <li>If the ContentType parameter is set to PlainText, this field contains plain text.</li>
         * <li>If the ContentType parameter is set to Base64, this field contains Base64-encoded text.</li>
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
         * <p>The content type of the file. Valid values:</p>
         * <ul>
         * <li>PlainText: plain text.</li>
         * <li>Base64: Base64-encoded text.
         * Default value: PlainText.</li>
         * </ul>
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
         * <p>The description. The description supports all character sets and can be up to 512 characters in length.</p>
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
         * <p>The file group. This parameter takes effect only on Linux instances. Default value: root. The value can be up to 64 characters in length.
         * Note
         * When you use a different group, make sure that the group exists on the instance.</p>
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
         * <p>The file permissions. This parameter takes effect only on Linux instances. The setting method is the same as that of the chmod command.
         * Default value: 0644, which indicates that the owner has read and write permissions, and the group and others have read-only permissions.</p>
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
         * <p>The file owner. This parameter takes effect only on Linux instances. Default value: root.</p>
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
         * <p>The file name. The name supports all character sets and can be up to 255 characters in length.</p>
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
         * <p>The list of node IDs. The node IDs must belong to created Lingjun nodes. You can call the ListClusterNodes or ListFreeNodes operation to query the node IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder nodeIdList(java.util.List<String> nodeIdList) {
            String nodeIdListShrink = shrink(nodeIdList, "NodeIdList", "json");
            this.putBodyParameter("NodeIdList", nodeIdListShrink);
            this.nodeIdList = nodeIdList;
            return this;
        }

        /**
         * <p>Specifies whether to overwrite the file if a file with the same name already exists in the target directory. Valid values:</p>
         * <ul>
         * <li>true: Overwrites the file.</li>
         * <li>false: Does not overwrite the file.
         * Default value: false.</li>
         * </ul>
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
         * <p>The target folder on the Lingjun nodes to which the file is delivered. If the folder does not exist, automatic creation is performed.</p>
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
         * <p>The timeout period for delivering the file. Unit: seconds.</p>
         * <ul>
         * <li>A timeout occurs if the file cannot be delivered due to process issues, missing modules, or a missing Cloud Assistant Agent.</li>
         * <li>If the specified timeout period is less than 10 seconds, the system automatically sets it to 10 seconds to ensure successful delivery.
         * Default value: 60.</li>
         * </ul>
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
