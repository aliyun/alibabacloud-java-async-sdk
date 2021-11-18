// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteChartRepositoryRequest} extends {@link RequestModel}
 *
 * <p>DeleteChartRepositoryRequest</p>
 */
public class DeleteChartRepositoryRequest extends Request {
    @Query
    @NameInMap("RepoNamespaceName")
    private String repoNamespaceName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RepoName")
    private String repoName;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;


    private DeleteChartRepositoryRequest(Builder builder) {
        super(builder);
        this.repoNamespaceName = builder.repoNamespaceName;
        this.regionId = builder.regionId;
        this.repoName = builder.repoName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteChartRepositoryRequest create() {
        return builder().build();
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
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder {
        private String repoNamespaceName; 
        private String regionId; 
        private String repoName; 
        private String instanceId; 

        /**
         * <p>Namespace name</p>
         */
        public Builder repoNamespaceName(String repoNamespaceName) {
            this.putQueryParameter("RepoNamespaceName", repoNamespaceName);
            this.repoNamespaceName = repoNamespaceName;
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
         * <p>Repository name</p>
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
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

        public DeleteChartRepositoryRequest build() {
            return new DeleteChartRepositoryRequest(this);
        } 

    } 

}
