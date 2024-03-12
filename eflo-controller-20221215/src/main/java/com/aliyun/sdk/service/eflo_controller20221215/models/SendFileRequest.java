// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendFileRequest} extends {@link RequestModel}
 *
 * <p>SendFileRequest</p>
 */
public class SendFileRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Body
    @NameInMap("ContentType")
    private String contentType;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("FileGroup")
    private String fileGroup;

    @Body
    @NameInMap("FileMode")
    private String fileMode;

    @Body
    @NameInMap("FileOwner")
    private String fileOwner;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("NodeIdList")
    @Validation(required = true)
    private java.util.List < String > nodeIdList;

    @Body
    @NameInMap("Overwrite")
    private Boolean overwrite;

    @Body
    @NameInMap("TargetDir")
    @Validation(required = true)
    private String targetDir;

    @Body
    @NameInMap("Timeout")
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
    public java.util.List < String > getNodeIdList() {
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
        private java.util.List < String > nodeIdList; 
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
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * ContentType.
         */
        public Builder contentType(String contentType) {
            this.putBodyParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * FileGroup.
         */
        public Builder fileGroup(String fileGroup) {
            this.putBodyParameter("FileGroup", fileGroup);
            this.fileGroup = fileGroup;
            return this;
        }

        /**
         * FileMode.
         */
        public Builder fileMode(String fileMode) {
            this.putBodyParameter("FileMode", fileMode);
            this.fileMode = fileMode;
            return this;
        }

        /**
         * FileOwner.
         */
        public Builder fileOwner(String fileOwner) {
            this.putBodyParameter("FileOwner", fileOwner);
            this.fileOwner = fileOwner;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NodeIdList.
         */
        public Builder nodeIdList(java.util.List < String > nodeIdList) {
            String nodeIdListShrink = shrink(nodeIdList, "NodeIdList", "json");
            this.putBodyParameter("NodeIdList", nodeIdListShrink);
            this.nodeIdList = nodeIdList;
            return this;
        }

        /**
         * Overwrite.
         */
        public Builder overwrite(Boolean overwrite) {
            this.putBodyParameter("Overwrite", overwrite);
            this.overwrite = overwrite;
            return this;
        }

        /**
         * TargetDir.
         */
        public Builder targetDir(String targetDir) {
            this.putBodyParameter("TargetDir", targetDir);
            this.targetDir = targetDir;
            return this;
        }

        /**
         * Timeout.
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
