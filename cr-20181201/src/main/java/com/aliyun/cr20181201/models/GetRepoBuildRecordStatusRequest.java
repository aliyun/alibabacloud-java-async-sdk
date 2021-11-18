// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetRepoBuildRecordStatusRequest} extends {@link RequestModel}
 *
 * <p>GetRepoBuildRecordStatusRequest</p>
 */
public class GetRepoBuildRecordStatusRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("BuildRecordId")
    private String buildRecordId;

    @Query
    @NameInMap("RepoId")
    private String repoId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;


    private GetRepoBuildRecordStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.buildRecordId = builder.buildRecordId;
        this.repoId = builder.repoId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoBuildRecordStatusRequest create() {
        return builder().build();
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
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder {
        private String regionId; 
        private String buildRecordId; 
        private String repoId; 
        private String instanceId; 

        /**
         * <p>The region ID.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Build record ID</p>
         */
        public Builder buildRecordId(String buildRecordId) {
            this.putQueryParameter("BuildRecordId", buildRecordId);
            this.buildRecordId = buildRecordId;
            return this;
        }

        /**
         * <p>Mirror warehouse ID</p>
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
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

        public GetRepoBuildRecordStatusRequest build() {
            return new GetRepoBuildRecordStatusRequest(this);
        } 

    } 

}
