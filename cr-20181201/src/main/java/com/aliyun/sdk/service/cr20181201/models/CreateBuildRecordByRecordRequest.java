// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBuildRecordByRecordRequest} extends {@link RequestModel}
 *
 * <p>CreateBuildRecordByRecordRequest</p>
 */
public class CreateBuildRecordByRecordRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("BuildRecordId")
    @Validation(required = true)
    private String buildRecordId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RepoId")
    @Validation(required = true)
    private String repoId;

    private CreateBuildRecordByRecordRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.buildRecordId = builder.buildRecordId;
        this.instanceId = builder.instanceId;
        this.repoId = builder.repoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBuildRecordByRecordRequest create() {
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
     * @return buildRecordId
     */
    public String getBuildRecordId() {
        return this.buildRecordId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    public static final class Builder extends Request.Builder<CreateBuildRecordByRecordRequest, Builder> {
        private String regionId; 
        private String buildRecordId; 
        private String instanceId; 
        private String repoId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBuildRecordByRecordRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.buildRecordId = request.buildRecordId;
            this.instanceId = request.instanceId;
            this.repoId = request.repoId;
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
         * BuildRecordId.
         */
        public Builder buildRecordId(String buildRecordId) {
            this.putQueryParameter("BuildRecordId", buildRecordId);
            this.buildRecordId = buildRecordId;
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
         * RepoId.
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        @Override
        public CreateBuildRecordByRecordRequest build() {
            return new CreateBuildRecordByRecordRequest(this);
        } 

    } 

}
