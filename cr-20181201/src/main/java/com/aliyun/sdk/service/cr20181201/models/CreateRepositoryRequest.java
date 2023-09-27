// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRepositoryRequest} extends {@link RequestModel}
 *
 * <p>CreateRepositoryRequest</p>
 */
public class CreateRepositoryRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Detail")
    private String detail;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RepoName")
    @Validation(required = true)
    private String repoName;

    @Query
    @NameInMap("RepoNamespaceName")
    @Validation(required = true)
    private String repoNamespaceName;

    @Query
    @NameInMap("RepoType")
    @Validation(required = true)
    private String repoType;

    @Query
    @NameInMap("Summary")
    @Validation(required = true)
    private String summary;

    @Query
    @NameInMap("TagImmutability")
    private Boolean tagImmutability;

    private CreateRepositoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.detail = builder.detail;
        this.instanceId = builder.instanceId;
        this.repoName = builder.repoName;
        this.repoNamespaceName = builder.repoNamespaceName;
        this.repoType = builder.repoType;
        this.summary = builder.summary;
        this.tagImmutability = builder.tagImmutability;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepositoryRequest create() {
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
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return repoNamespaceName
     */
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

    /**
     * @return repoType
     */
    public String getRepoType() {
        return this.repoType;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * @return tagImmutability
     */
    public Boolean getTagImmutability() {
        return this.tagImmutability;
    }

    public static final class Builder extends Request.Builder<CreateRepositoryRequest, Builder> {
        private String regionId; 
        private String detail; 
        private String instanceId; 
        private String repoName; 
        private String repoNamespaceName; 
        private String repoType; 
        private String summary; 
        private Boolean tagImmutability; 

        private Builder() {
            super();
        } 

        private Builder(CreateRepositoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.detail = request.detail;
            this.instanceId = request.instanceId;
            this.repoName = request.repoName;
            this.repoNamespaceName = request.repoNamespaceName;
            this.repoType = request.repoType;
            this.summary = request.summary;
            this.tagImmutability = request.tagImmutability;
        } 

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The description of the repository.
         */
        public Builder detail(String detail) {
            this.putQueryParameter("Detail", detail);
            this.detail = detail;
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
         * The name of the image repository.
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * The name of the namespace to which the image repository belongs.
         */
        public Builder repoNamespaceName(String repoNamespaceName) {
            this.putQueryParameter("RepoNamespaceName", repoNamespaceName);
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }

        /**
         * The type of the repository. Valid values:
         * <p>
         * 
         * *   `PUBLIC`: The repository is a public repository.
         * *   `PRIVATE`: The repository is a private repository.
         */
        public Builder repoType(String repoType) {
            this.putQueryParameter("RepoType", repoType);
            this.repoType = repoType;
            return this;
        }

        /**
         * The summary about the repository.
         */
        public Builder summary(String summary) {
            this.putQueryParameter("Summary", summary);
            this.summary = summary;
            return this;
        }

        /**
         * Specifies whether to enable the feature of image tag immutability. Valid values:
         * <p>
         * 
         * *   `true`: enables the feature of image tag immutability.
         * *   `false`: disables the feature of image tag immutability.
         */
        public Builder tagImmutability(Boolean tagImmutability) {
            this.putQueryParameter("TagImmutability", tagImmutability);
            this.tagImmutability = tagImmutability;
            return this;
        }

        @Override
        public CreateRepositoryRequest build() {
            return new CreateRepositoryRequest(this);
        } 

    } 

}
