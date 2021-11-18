// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteChartReleaseRequest} extends {@link RequestModel}
 *
 * <p>DeleteChartReleaseRequest</p>
 */
public class DeleteChartReleaseRequest extends Request {
    @Query
    @NameInMap("RepoName")
    private String repoName;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("RepoNamespaceName")
    private String repoNamespaceName;

    @Query
    @NameInMap("Chart")
    private String chart;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Release")
    private String release;


    private DeleteChartReleaseRequest(Builder builder) {
        super(builder);
        this.repoName = builder.repoName;
        this.instanceId = builder.instanceId;
        this.repoNamespaceName = builder.repoNamespaceName;
        this.chart = builder.chart;
        this.regionId = builder.regionId;
        this.release = builder.release;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteChartReleaseRequest create() {
        return builder().build();
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

    /**
     * @return repoNamespaceName
     */
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

    /**
     * @return chart
     */
    public String getChart() {
        return this.chart;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return release
     */
    public String getRelease() {
        return this.release;
    }

    public static final class Builder extends Request.Builder {
        private String repoName; 
        private String instanceId; 
        private String repoNamespaceName; 
        private String chart; 
        private String regionId; 
        private String release; 

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

        /**
         * <p>Namespace name</p>
         */
        public Builder repoNamespaceName(String repoNamespaceName) {
            this.putQueryParameter("RepoNamespaceName", repoNamespaceName);
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }

        /**
         * <p>Chart name</p>
         */
        public Builder chart(String chart) {
            this.putQueryParameter("Chart", chart);
            this.chart = chart;
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
         * <p>Chart version</p>
         */
        public Builder release(String release) {
            this.putQueryParameter("Release", release);
            this.release = release;
            return this;
        }

        public DeleteChartReleaseRequest build() {
            return new DeleteChartReleaseRequest(this);
        } 

    } 

}
