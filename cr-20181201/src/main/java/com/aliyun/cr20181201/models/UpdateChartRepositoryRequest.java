// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UpdateChartRepositoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateChartRepositoryRequest</p>
 */
public class UpdateChartRepositoryRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("RepoNamespaceName")
    private String repoNamespaceName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RepoType")
    private String repoType;

    @Query
    @NameInMap("RepoName")
    private String repoName;

    @Query
    @NameInMap("Summary")
    private String summary;


    private UpdateChartRepositoryRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.repoNamespaceName = builder.repoNamespaceName;
        this.regionId = builder.regionId;
        this.repoType = builder.repoType;
        this.repoName = builder.repoName;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateChartRepositoryRequest create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return repoNamespaceName
     */
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repoType
     */
    public String getRepoType() {
        return this.repoType;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    public static final class Builder extends Request.Builder {
        private String instanceId; 
        private String repoNamespaceName; 
        private String regionId; 
        private String repoType; 
        private String repoName; 
        private String summary; 

        /**
         * <p>Instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the repository namespace.</p>
         */
        public Builder repoNamespaceName(String repoNamespaceName) {
            this.putQueryParameter("RepoNamespaceName", repoNamespaceName);
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }

        /**
         * <p>The region ID.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * <p>Repository name</p>
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
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

        public UpdateChartRepositoryRequest build() {
            return new UpdateChartRepositoryRequest(this);
        } 

    } 

}
