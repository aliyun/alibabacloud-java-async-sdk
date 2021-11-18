// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UpdateRepositoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateRepositoryRequest</p>
 */
public class UpdateRepositoryRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Detail")
    private String detail;

    @Query
    @NameInMap("RepoId")
    private String repoId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("RepoType")
    private String repoType;

    @Query
    @NameInMap("TagImmutability")
    private Boolean tagImmutability;

    @Query
    @NameInMap("Summary")
    private String summary;


    private UpdateRepositoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.detail = builder.detail;
        this.repoId = builder.repoId;
        this.instanceId = builder.instanceId;
        this.repoType = builder.repoType;
        this.tagImmutability = builder.tagImmutability;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRepositoryRequest create() {
        return builder().build();
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
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
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
     * @return tagImmutability
     */
    public Boolean getTagImmutability() {
        return this.tagImmutability;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    public static final class Builder extends Request.Builder {
        private String regionId; 
        private String detail; 
        private String repoId; 
        private String instanceId; 
        private String repoType; 
        private Boolean tagImmutability; 
        private String summary; 

        /**
         * <p>Region</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Warehouse introduction</p>
         */
        public Builder detail(String detail) {
            this.putQueryParameter("Detail", detail);
            this.detail = detail;
            return this;
        }

        /**
         * <p>Warehouse ID</p>
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
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

-"PRIVATE": private repository</p>
         */
        public Builder repoType(String repoType) {
            this.putQueryParameter("RepoType", repoType);
            this.repoType = repoType;
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
         * <p>Summary Information</p>
         */
        public Builder summary(String summary) {
            this.putQueryParameter("Summary", summary);
            this.summary = summary;
            return this;
        }

        public UpdateRepositoryRequest build() {
            return new UpdateRepositoryRequest(this);
        } 

    } 

}
