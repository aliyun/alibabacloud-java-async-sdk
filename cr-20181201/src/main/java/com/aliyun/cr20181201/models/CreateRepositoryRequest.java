// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateRepositoryRequest} extends {@link RequestModel}
 *
 * <p>CreateRepositoryRequest</p>
 */
public class CreateRepositoryRequest extends Request {
    @Query
    @NameInMap("RepoName")
    private String repoName;

    @Query
    @NameInMap("TagImmutability")
    private Boolean tagImmutability;

    @Query
    @NameInMap("RepoNamespaceName")
    private String repoNamespaceName;

    @Query
    @NameInMap("Detail")
    private String detail;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("RepoType")
    private String repoType;

    @Query
    @NameInMap("Summary")
    private String summary;


    private CreateRepositoryRequest(Builder builder) {
        super(builder);
        this.repoName = builder.repoName;
        this.tagImmutability = builder.tagImmutability;
        this.repoNamespaceName = builder.repoNamespaceName;
        this.detail = builder.detail;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.repoType = builder.repoType;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepositoryRequest create() {
        return builder().build();
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return tagImmutability
     */
    public Boolean getTagImmutability() {
        return this.tagImmutability;
    }

    /**
     * @return repoNamespaceName
     */
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder {
        private String repoName; 
        private Boolean tagImmutability; 
        private String repoNamespaceName; 
        private String detail; 
        private String regionId; 
        private String instanceId; 
        private String repoType; 
        private String summary; 

        /**
         * <p>Image repository name</p>
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>The image tag cannot be modified. Valid values:

-"true": enabled

-"false": Disabled</p>
         */
        public Builder tagImmutability(Boolean tagImmutability) {
            this.putQueryParameter("TagImmutability", tagImmutability);
            this.tagImmutability = tagImmutability;
            return this;
        }

        /**
         * <p>The namespace of the image repository.</p>
         */
        public Builder repoNamespaceName(String repoNamespaceName) {
            this.putQueryParameter("RepoNamespaceName", repoNamespaceName);
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }

        /**
         * <p>Detailed description</p>
         */
        public Builder detail(String detail) {
            this.putQueryParameter("Detail", detail);
            this.detail = detail;
            return this;
        }

        /**
         * <p>Region</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of the repository. Valid values:

-"PUBLIC": public repository

-"PRIVATE": private repository
</p>
         */
        public Builder repoType(String repoType) {
            this.putQueryParameter("RepoType", repoType);
            this.repoType = repoType;
            return this;
        }

        /**
         * <p>Summary</p>
         */
        public Builder summary(String summary) {
            this.putQueryParameter("Summary", summary);
            this.summary = summary;
            return this;
        }

        public CreateRepositoryRequest build() {
            return new CreateRepositoryRequest(this);
        } 

    } 

}
