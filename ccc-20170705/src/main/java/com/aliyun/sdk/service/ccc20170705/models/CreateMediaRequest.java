// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMediaRequest} extends {@link RequestModel}
 *
 * <p>CreateMediaRequest</p>
 */
public class CreateMediaRequest extends Request {
    @Query
    @NameInMap("Content")
    private String content;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OssFileName")
    @Validation(required = true)
    private String ossFileName;

    @Query
    @NameInMap("OssFilePath")
    @Validation(required = true)
    private String ossFilePath;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("UploadResult")
    @Validation(required = true)
    private String uploadResult;

    private CreateMediaRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.description = builder.description;
        this.fileName = builder.fileName;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.ossFileName = builder.ossFileName;
        this.ossFilePath = builder.ossFilePath;
        this.type = builder.type;
        this.uploadResult = builder.uploadResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMediaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ossFileName
     */
    public String getOssFileName() {
        return this.ossFileName;
    }

    /**
     * @return ossFilePath
     */
    public String getOssFilePath() {
        return this.ossFilePath;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uploadResult
     */
    public String getUploadResult() {
        return this.uploadResult;
    }

    public static final class Builder extends Request.Builder<CreateMediaRequest, Builder> {
        private String content; 
        private String description; 
        private String fileName; 
        private String instanceId; 
        private String name; 
        private String ossFileName; 
        private String ossFilePath; 
        private String type; 
        private String uploadResult; 

        private Builder() {
            super();
        } 

        private Builder(CreateMediaRequest response) {
            super(response);
            this.content = response.content;
            this.description = response.description;
            this.fileName = response.fileName;
            this.instanceId = response.instanceId;
            this.name = response.name;
            this.ossFileName = response.ossFileName;
            this.ossFilePath = response.ossFilePath;
            this.type = response.type;
            this.uploadResult = response.uploadResult;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OssFileName.
         */
        public Builder ossFileName(String ossFileName) {
            this.putQueryParameter("OssFileName", ossFileName);
            this.ossFileName = ossFileName;
            return this;
        }

        /**
         * OssFilePath.
         */
        public Builder ossFilePath(String ossFilePath) {
            this.putQueryParameter("OssFilePath", ossFilePath);
            this.ossFilePath = ossFilePath;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * UploadResult.
         */
        public Builder uploadResult(String uploadResult) {
            this.putQueryParameter("UploadResult", uploadResult);
            this.uploadResult = uploadResult;
            return this;
        }

        @Override
        public CreateMediaRequest build() {
            return new CreateMediaRequest(this);
        } 

    } 

}
