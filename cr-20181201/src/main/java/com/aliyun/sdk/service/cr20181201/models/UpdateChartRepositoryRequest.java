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
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
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

    @Query
    @NameInMap("RepoType")
    private String repoType;

    @Query
    @NameInMap("Summary")
    private String summary;

    private UpdateChartRepositoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
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
        private String regionId; 
        private String instanceId; 
        private String repoName; 
        private String repoNamespaceName; 
        private String repoType; 
        private String summary; 

        private Builder() {
            super();
        } 

        private Builder(UpdateChartRepositoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.repoName = request.repoName;
            this.repoNamespaceName = request.repoNamespaceName;
            this.repoType = request.repoType;
            this.summary = request.summary;
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
         * The name of the namespace to which the repository belongs.
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
         * *   `PUBLIC`: a public repository.
         * *   `PRIVATE`: a private repository.
         */
        public Builder repoType(String repoType) {
            this.putQueryParameter("RepoType", repoType);
            this.repoType = repoType;
            return this;
        }

        /**
         * The summary of the repository.
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
