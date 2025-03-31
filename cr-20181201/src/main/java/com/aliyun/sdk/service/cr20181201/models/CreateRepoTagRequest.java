// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link CreateRepoTagRequest} extends {@link RequestModel}
 *
 * <p>CreateRepoTagRequest</p>
 */
public class CreateRepoTagRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fromTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repoName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String toTag;

    private CreateRepoTagRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fromTag = builder.fromTag;
        this.instanceId = builder.instanceId;
        this.namespaceName = builder.namespaceName;
        this.repoName = builder.repoName;
        this.toTag = builder.toTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoTagRequest create() {
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
     * @return fromTag
     */
    public String getFromTag() {
        return this.fromTag;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return toTag
     */
    public String getToTag() {
        return this.toTag;
    }

    public static final class Builder extends Request.Builder<CreateRepoTagRequest, Builder> {
        private String regionId; 
        private String fromTag; 
        private String instanceId; 
        private String namespaceName; 
        private String repoName; 
        private String toTag; 

        private Builder() {
            super();
        } 

        private Builder(CreateRepoTagRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fromTag = request.fromTag;
            this.instanceId = request.instanceId;
            this.namespaceName = request.namespaceName;
            this.repoName = request.repoName;
            this.toTag = request.toTag;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The source image tag.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder fromTag(String fromTag) {
            this.putQueryParameter("FromTag", fromTag);
            this.fromTag = fromTag;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-shac42yvqzv****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ns</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * <p>The name of the image repository.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>repo1</p>
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>The image tag that you want to create.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        public Builder toTag(String toTag) {
            this.putQueryParameter("ToTag", toTag);
            this.toTag = toTag;
            return this;
        }

        @Override
        public CreateRepoTagRequest build() {
            return new CreateRepoTagRequest(this);
        } 

    } 

}
