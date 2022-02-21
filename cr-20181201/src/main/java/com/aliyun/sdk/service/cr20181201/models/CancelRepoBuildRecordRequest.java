// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelRepoBuildRecordRequest} extends {@link RequestModel}
 *
 * <p>CancelRepoBuildRecordRequest</p>
 */
public class CancelRepoBuildRecordRequest extends Request {
    @Query
    @NameInMap("BuildRecordId")
    @Validation(required = true)
    private String buildRecordId;

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

    private CancelRepoBuildRecordRequest(Builder builder) {
        super(builder);
        this.buildRecordId = builder.buildRecordId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.repoId = builder.repoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelRepoBuildRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<CancelRepoBuildRecordRequest, Builder> {
        private String buildRecordId; 
        private String instanceId; 
        private String regionId; 
        private String repoId; 

        private Builder() {
            super();
        } 

        private Builder(CancelRepoBuildRecordRequest response) {
            super(response);
            this.buildRecordId = response.buildRecordId;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.repoId = response.repoId;
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

        @Override
        public CancelRepoBuildRecordRequest build() {
            return new CancelRepoBuildRecordRequest(this);
        } 

    } 

}
