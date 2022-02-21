// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateChartRepositoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateChartRepositoryRequest</p>
 */
public class UpdateChartRepositoryRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

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
    private String repoType;

    @Query
    @NameInMap("Summary")
    private String summary;

    private UpdateChartRepositoryRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.repoName = builder.repoName;
        this.repoNamespaceName = builder.repoNamespaceName;
        this.repoType = builder.repoType;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateChartRepositoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<UpdateChartRepositoryRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String repoName; 
        private String repoNamespaceName; 
        private String repoType; 
        private String summary; 

        private Builder() {
            super();
        } 

        private Builder(UpdateChartRepositoryRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.repoName = response.repoName;
            this.repoNamespaceName = response.repoNamespaceName;
            this.repoType = response.repoType;
            this.summary = response.summary;
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
         * RepoName.
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * RepoNamespaceName.
         */
        public Builder repoNamespaceName(String repoNamespaceName) {
            this.putQueryParameter("RepoNamespaceName", repoNamespaceName);
            this.repoNamespaceName = repoNamespaceName;
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

        @Override
        public UpdateChartRepositoryRequest build() {
            return new UpdateChartRepositoryRequest(this);
        } 

    } 

}
