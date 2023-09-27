// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRepoTagRequest} extends {@link RequestModel}
 *
 * <p>CreateRepoTagRequest</p>
 */
public class CreateRepoTagRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("FromTag")
    @Validation(required = true)
    private String fromTag;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NamespaceName")
    @Validation(required = true)
    private String namespaceName;

    @Query
    @NameInMap("RepoName")
    @Validation(required = true)
    private String repoName;

    @Query
    @NameInMap("ToTag")
    @Validation(required = true)
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The source image tag.
         */
        public Builder fromTag(String fromTag) {
            this.putQueryParameter("FromTag", fromTag);
            this.fromTag = fromTag;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the namespace.
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * The name of the image repository.
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * The image tag that you want to create.
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
