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
 * {@link CreateJenkinsImageScanTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateJenkinsImageScanTaskRequest</p>
 */
public class CreateJenkinsImageScanTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Digest")
    private String digest;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageCreate")
    private Long imageCreate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageSize")
    private Long imageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageUpdate")
    private Long imageUpdate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JenkinsEnv")
    private String jenkinsEnv;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RepoName")
    private String repoName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
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

        private Builder(CreateJenkinsImageScanTaskRequest request) {
            super(request);
            this.digest = request.digest;
            this.imageCreate = request.imageCreate;
            this.imageId = request.imageId;
            this.imageSize = request.imageSize;
            this.imageUpdate = request.imageUpdate;
            this.jenkinsEnv = request.jenkinsEnv;
            this.namespace = request.namespace;
            this.repoName = request.repoName;
            this.sourceIp = request.sourceIp;
            this.tag = request.tag;
            this.token = request.token;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The image summary.</p>
         * 
         * <strong>example:</strong>
         * <p>a8c9f3765684cd8d9053db9523eab58878e99a199217500efd9ae2a860a7****</p>
         */
        public Builder digest(String digest) {
            this.putBodyParameter("Digest", digest);
            this.digest = digest;
            return this;
        }

        /**
         * <p>The image creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1717430400000</p>
         */
        public Builder imageCreate(Long imageCreate) {
            this.putBodyParameter("ImageCreate", imageCreate);
            this.imageCreate = imageCreate;
            return this;
        }

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b10ef7b245c34a0822055c74fc4a0e8b5baf0279306316b2c517a501ed25****</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The image size. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>6120340</p>
         */
        public Builder imageSize(Long imageSize) {
            this.putBodyParameter("ImageSize", imageSize);
            this.imageSize = imageSize;
            return this;
        }

        /**
         * <p>The image update time. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1717430498600</p>
         */
        public Builder imageUpdate(Long imageUpdate) {
            this.putBodyParameter("ImageUpdate", imageUpdate);
            this.imageUpdate = imageUpdate;
            return this;
        }

        /**
         * <p>The Jenkins environment context. Leave this parameter empty or set it to the fixed value: <strong>release</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>release</p>
         */
        public Builder jenkinsEnv(String jenkinsEnv) {
            this.putQueryParameter("JenkinsEnv", jenkinsEnv);
            this.jenkinsEnv = jenkinsEnv;
            return this;
        }

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>lkl-zf-ss-ccss</p>
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The repository name.</p>
         * 
         * <strong>example:</strong>
         * <p>sdk</p>
         */
        public Builder repoName(String repoName) {
            this.putBodyParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>The access source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>119.136.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The image label.</p>
         * 
         * <strong>example:</strong>
         * <p>00f597223f-20210831-1</p>
         */
        public Builder tag(String tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The access token for the Jenkins image repository. Obtain the token from the homepage of the Chinese documentation center &gt; Security Center &gt; User Guide &gt; Container Protection &gt; CI/CD Access Settings. You can also invoke CreateJenkinsImageRegistry to create a CI/CD image repository and obtain the token from the response parameter Data.Token. For an existing repository, invoke PageImageRegistry to query the token.</p>
         * 
         * <strong>example:</strong>
         * <p>c3de8326-273e-11fc-a0e3-d012435c****</p>
         */
        public Builder token(String token) {
            this.putBodyParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * <p>The UUID of the image asset.</p>
         * 
         * <strong>example:</strong>
         * <p>5b268326-273e-44fc-a0e3-9482435c****</p>
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
