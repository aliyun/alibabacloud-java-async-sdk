// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateJenkinsImageScanTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateJenkinsImageScanTaskRequest</p>
 */
public class CreateJenkinsImageScanTaskRequest extends Request {
    @Body
    @NameInMap("Digest")
    private String digest;

    @Body
    @NameInMap("ImageCreate")
    private Long imageCreate;

    @Body
    @NameInMap("ImageId")
    private String imageId;

    @Body
    @NameInMap("ImageSize")
    private Long imageSize;

    @Body
    @NameInMap("ImageUpdate")
    private Long imageUpdate;

    @Query
    @NameInMap("JenkinsEnv")
    private String jenkinsEnv;

    @Body
    @NameInMap("Namespace")
    private String namespace;

    @Body
    @NameInMap("RepoName")
    private String repoName;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Body
    @NameInMap("Tag")
    private String tag;

    @Body
    @NameInMap("Token")
    private String token;

    @Body
    @NameInMap("Uuid")
    private String uuid;

    private CreateJenkinsImageScanTaskRequest(Builder builder) {
        super(builder);
        this.digest = builder.digest;
        this.imageCreate = builder.imageCreate;
        this.imageId = builder.imageId;
        this.imageSize = builder.imageSize;
        this.imageUpdate = builder.imageUpdate;
        this.jenkinsEnv = builder.jenkinsEnv;
        this.namespace = builder.namespace;
        this.repoName = builder.repoName;
        this.sourceIp = builder.sourceIp;
        this.tag = builder.tag;
        this.token = builder.token;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJenkinsImageScanTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return digest
     */
    public String getDigest() {
        return this.digest;
    }

    /**
     * @return imageCreate
     */
    public Long getImageCreate() {
        return this.imageCreate;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageSize
     */
    public Long getImageSize() {
        return this.imageSize;
    }

    /**
     * @return imageUpdate
     */
    public Long getImageUpdate() {
        return this.imageUpdate;
    }

    /**
     * @return jenkinsEnv
     */
    public String getJenkinsEnv() {
        return this.jenkinsEnv;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<CreateJenkinsImageScanTaskRequest, Builder> {
        private String digest; 
        private Long imageCreate; 
        private String imageId; 
        private Long imageSize; 
        private Long imageUpdate; 
        private String jenkinsEnv; 
        private String namespace; 
        private String repoName; 
        private String sourceIp; 
        private String tag; 
        private String token; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(CreateJenkinsImageScanTaskRequest response) {
            super(response);
            this.digest = response.digest;
            this.imageCreate = response.imageCreate;
            this.imageId = response.imageId;
            this.imageSize = response.imageSize;
            this.imageUpdate = response.imageUpdate;
            this.jenkinsEnv = response.jenkinsEnv;
            this.namespace = response.namespace;
            this.repoName = response.repoName;
            this.sourceIp = response.sourceIp;
            this.tag = response.tag;
            this.token = response.token;
            this.uuid = response.uuid;
        } 

        /**
         * 镜像 digest
         */
        public Builder digest(String digest) {
            this.putBodyParameter("Digest", digest);
            this.digest = digest;
            return this;
        }

        /**
         * 创建时间，timestamp
         */
        public Builder imageCreate(Long imageCreate) {
            this.putBodyParameter("ImageCreate", imageCreate);
            this.imageCreate = imageCreate;
            return this;
        }

        /**
         * imageId
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * 镜像大小，字节
         */
        public Builder imageSize(Long imageSize) {
            this.putBodyParameter("ImageSize", imageSize);
            this.imageSize = imageSize;
            return this;
        }

        /**
         * 修改时间，timestamp
         */
        public Builder imageUpdate(Long imageUpdate) {
            this.putBodyParameter("ImageUpdate", imageUpdate);
            this.imageUpdate = imageUpdate;
            return this;
        }

        /**
         * JenkinsEnv.
         */
        public Builder jenkinsEnv(String jenkinsEnv) {
            this.putQueryParameter("JenkinsEnv", jenkinsEnv);
            this.jenkinsEnv = jenkinsEnv;
            return this;
        }

        /**
         * 镜像命名空间，可选
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * repo名称
         */
        public Builder repoName(String repoName) {
            this.putBodyParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * 镜像标签
         */
        public Builder tag(String tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * jenkins 镜像仓库 token，必填
         */
        public Builder token(String token) {
            this.putBodyParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * 资产 uuid
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public CreateJenkinsImageScanTaskRequest build() {
            return new CreateJenkinsImageScanTaskRequest(this);
        } 

    } 

}
