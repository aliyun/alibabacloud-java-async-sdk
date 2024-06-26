// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAntChainContractContentRequest} extends {@link RequestModel}
 *
 * <p>CreateAntChainContractContentRequest</p>
 */
public class CreateAntChainContractContentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsDirectory")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean isDirectory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParentContentId")
    private String parentContentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    private CreateAntChainContractContentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.content = builder.content;
        this.contentName = builder.contentName;
        this.isDirectory = builder.isDirectory;
        this.parentContentId = builder.parentContentId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAntChainContractContentRequest create() {
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
     * @return contentName
     */
    public String getContentName() {
        return this.contentName;
    }

    /**
     * @return isDirectory
     */
    public Boolean getIsDirectory() {
        return this.isDirectory;
    }

    /**
     * @return parentContentId
     */
    public String getParentContentId() {
        return this.parentContentId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<CreateAntChainContractContentRequest, Builder> {
        private String regionId; 
        private String content; 
        private String contentName; 
        private Boolean isDirectory; 
        private String parentContentId; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAntChainContractContentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.content = request.content;
            this.contentName = request.contentName;
            this.isDirectory = request.isDirectory;
            this.parentContentId = request.parentContentId;
            this.projectId = request.projectId;
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
         * ContentName.
         */
        public Builder contentName(String contentName) {
            this.putBodyParameter("ContentName", contentName);
            this.contentName = contentName;
            return this;
        }

        /**
         * IsDirectory.
         */
        public Builder isDirectory(Boolean isDirectory) {
            this.putBodyParameter("IsDirectory", isDirectory);
            this.isDirectory = isDirectory;
            return this;
        }

        /**
         * ParentContentId.
         */
        public Builder parentContentId(String parentContentId) {
            this.putBodyParameter("ParentContentId", parentContentId);
            this.parentContentId = parentContentId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public CreateAntChainContractContentRequest build() {
            return new CreateAntChainContractContentRequest(this);
        } 

    } 

}
