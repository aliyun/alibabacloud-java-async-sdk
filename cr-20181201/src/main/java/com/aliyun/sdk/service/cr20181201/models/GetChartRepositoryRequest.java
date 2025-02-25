// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChartRepositoryRequest} extends {@link RequestModel}
 *
 * <p>GetChartRepositoryRequest</p>
 */
public class GetChartRepositoryRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    private GetChartRepositoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.repoName = builder.repoName;
        this.repoNamespaceName = builder.repoNamespaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChartRepositoryRequest create() {
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

    public static final class Builder extends Request.Builder<GetChartRepositoryRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String repoName; 
        private String repoNamespaceName; 

        private Builder() {
            super();
        } 

        private Builder(GetChartRepositoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.repoName = request.repoName;
            this.repoNamespaceName = request.repoNamespaceName;
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
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the repository.
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * The name of the namespace.
         */
        public Builder repoNamespaceName(String repoNamespaceName) {
            this.putQueryParameter("RepoNamespaceName", repoNamespaceName);
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }

        @Override
        public GetChartRepositoryRequest build() {
            return new GetChartRepositoryRequest(this);
        } 

    } 

}
