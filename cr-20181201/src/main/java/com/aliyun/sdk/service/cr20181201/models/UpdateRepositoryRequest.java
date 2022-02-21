// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRepositoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateRepositoryRequest</p>
 */
public class UpdateRepositoryRequest extends Request {
    @Query
    @NameInMap("Detail")
    private String detail;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RepoId")
    @Validation(required = true)
    private String repoId;

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

    private UpdateRepositoryRequest(Builder builder) {
        super(builder);
        this.detail = builder.detail;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.repoId = builder.repoId;
        this.repoType = builder.repoType;
        this.summary = builder.summary;
        this.tagImmutability = builder.tagImmutability;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRepositoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
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

    public static final class Builder extends Request.Builder<UpdateRepositoryRequest, Builder> {
        private String detail; 
        private String instanceId; 
        private String regionId; 
        private String repoId; 
        private String repoType; 
        private String summary; 
        private Boolean tagImmutability; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRepositoryRequest response) {
            super(response);
            this.detail = response.detail;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.repoId = response.repoId;
            this.repoType = response.repoType;
            this.summary = response.summary;
            this.tagImmutability = response.tagImmutability;
        } 

        /**
         * Detail.
         */
        public Builder detail(String detail) {
            this.putQueryParameter("Detail", detail);
            this.detail = detail;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RepoId.
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * RepoType.
         */
        public Builder repoType(String repoType) {
            this.putQueryParameter("RepoType", repoType);
            this.repoType = repoType;
            return this;
        }

        /**
         * Summary.
         */
        public Builder summary(String summary) {
            this.putQueryParameter("Summary", summary);
            this.summary = summary;
            return this;
        }

        /**
         * TagImmutability.
         */
        public Builder tagImmutability(Boolean tagImmutability) {
            this.putQueryParameter("TagImmutability", tagImmutability);
            this.tagImmutability = tagImmutability;
            return this;
        }

        @Override
        public UpdateRepositoryRequest build() {
            return new UpdateRepositoryRequest(this);
        } 

    } 

}
