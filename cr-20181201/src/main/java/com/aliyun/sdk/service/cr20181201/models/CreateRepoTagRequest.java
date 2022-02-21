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

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

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
        this.fromTag = builder.fromTag;
        this.instanceId = builder.instanceId;
        this.namespaceName = builder.namespaceName;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String fromTag; 
        private String instanceId; 
        private String namespaceName; 
        private String regionId; 
        private String repoName; 
        private String toTag; 

        private Builder() {
            super();
        } 

        private Builder(CreateRepoTagRequest response) {
            super(response);
            this.fromTag = response.fromTag;
            this.instanceId = response.instanceId;
            this.namespaceName = response.namespaceName;
            this.regionId = response.regionId;
            this.repoName = response.repoName;
            this.toTag = response.toTag;
        } 

        /**
         * FromTag.
         */
        public Builder fromTag(String fromTag) {
            this.putQueryParameter("FromTag", fromTag);
            this.fromTag = fromTag;
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
         * NamespaceName.
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
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
         * RepoName.
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * ToTag.
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
