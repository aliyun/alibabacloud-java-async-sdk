// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteChartReleaseRequest} extends {@link RequestModel}
 *
 * <p>DeleteChartReleaseRequest</p>
 */
public class DeleteChartReleaseRequest extends Request {
    @Query
    @NameInMap("Chart")
    @Validation(required = true)
    private String chart;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Release")
    @Validation(required = true)
    private String release;

    @Query
    @NameInMap("RepoName")
    @Validation(required = true)
    private String repoName;

    @Query
    @NameInMap("RepoNamespaceName")
    @Validation(required = true)
    private String repoNamespaceName;

    private DeleteChartReleaseRequest(Builder builder) {
        super(builder);
        this.chart = builder.chart;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.release = builder.release;
        this.repoName = builder.repoName;
        this.repoNamespaceName = builder.repoNamespaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteChartReleaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chart
     */
    public String getChart() {
        return this.chart;
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
     * @return release
     */
    public String getRelease() {
        return this.release;
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

    public static final class Builder extends Request.Builder<DeleteChartReleaseRequest, Builder> {
        private String chart; 
        private String instanceId; 
        private String regionId; 
        private String release; 
        private String repoName; 
        private String repoNamespaceName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteChartReleaseRequest response) {
            super(response);
            this.chart = response.chart;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.release = response.release;
            this.repoName = response.repoName;
            this.repoNamespaceName = response.repoNamespaceName;
        } 

        /**
         * Chart.
         */
        public Builder chart(String chart) {
            this.putQueryParameter("Chart", chart);
            this.chart = chart;
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
         * Release.
         */
        public Builder release(String release) {
            this.putQueryParameter("Release", release);
            this.release = release;
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

        @Override
        public DeleteChartReleaseRequest build() {
            return new DeleteChartReleaseRequest(this);
        } 

    } 

}
