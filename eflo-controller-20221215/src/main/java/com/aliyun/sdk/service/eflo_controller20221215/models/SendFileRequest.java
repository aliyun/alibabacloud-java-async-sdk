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
         * <p>The content of the file. The file must not exceed 32 KB in size after it is encoded in Base64.</p>
         * <ul>
         * <li>If <code>ContentType</code> is set to <code>PlainText</code>, the value of Content is in plaintext.</li>
         * <li>If <code>ContentType</code> is set to <code>Base64</code>, the value of Content is Base64-encoded.</li>
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
         * <p>PlainText Base64 Default value: PlainText.</p>
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
         * <p>The description of the file. The description can be up to 512 characters in length and can contain any characters.</p>
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
         * <p>The user group of the file. This parameter takes effect only on Linux instances. Default value: root. The value can be up to 64 characters in length.</p>
         * <p>Note If you want to use a non-root user group, make sure that the user group exists in the instances.</p>
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
         * <p>The permissions on the file. This parameter takes effect only on Linux instances. You can configure this parameter in the same way as you configure the chmod command.</p>
         * <p>Default value: 0644: the owner of the file has the read and write permission. The user group of the file and other users have read-only permission.</p>
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
         * <p>The owner of the file. This parameter takes effect only on Linux instances. Default value: root.</p>
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
         * <p>The file name. The name can be up to 255 characters in length and can contain any characters.</p>
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
         * <p>The node list.</p>
         * <p>This parameter is required.</p>
         */
        public Builder nodeIdList(java.util.List<String> nodeIdList) {
            String nodeIdListShrink = shrink(nodeIdList, "NodeIdList", "json");
            this.putBodyParameter("NodeIdList", nodeIdListShrink);
            this.nodeIdList = nodeIdList;
            return this;
        }

        /**
         * <p>Specifies whether to overwrite file with the same name in the destination directory.</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
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
         * <p>The directory in the Lingjun node to which the file is sent. If the specified directory does not exist, the system creates the directory automatically.</p>
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
         * <p>The timeout period for the file sending task. Unit: seconds.</p>
         * <ul>
         * <li>A timeout error occurs when a file cannot be sent because the process slows down or because a specific module or Cloud Assistant Agent does not exist.</li>
         * <li>If the specified timeout period is less than 10 seconds, the system sets the timeout period to 10 seconds to ensure that the file can be sent.</li>
         * </ul>
         * <p>Default value: 60.</p>
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
