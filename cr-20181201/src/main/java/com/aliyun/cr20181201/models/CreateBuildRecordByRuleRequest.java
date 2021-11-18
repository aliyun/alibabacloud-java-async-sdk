// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateBuildRecordByRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateBuildRecordByRuleRequest</p>
 */
public class CreateBuildRecordByRuleRequest extends Request {
    @Query
    @NameInMap("BuildRuleId")
    private String buildRuleId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("RepoId")
    private String repoId;

    @Host
    @NameInMap("RegionId")
    private String regionId;


    private CreateBuildRecordByRuleRequest(Builder builder) {
        super(builder);
        this.buildRuleId = builder.buildRuleId;
        this.instanceId = builder.instanceId;
        this.repoId = builder.repoId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBuildRecordByRuleRequest create() {
        return builder().build();
    }

    /**
     * @return buildRuleId
     */
    public String getBuildRuleId() {
        return this.buildRuleId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder {
        private String buildRuleId; 
        private String instanceId; 
        private String repoId; 
        private String regionId; 

        /**
         * <p>Build Rules ID</p>
         */
        public Builder buildRuleId(String buildRuleId) {
            this.putQueryParameter("BuildRuleId", buildRuleId);
            this.buildRuleId = buildRuleId;
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
         * <p>Mirror warehouse ID</p>
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * <p>Geographical</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        public CreateBuildRecordByRuleRequest build() {
            return new CreateBuildRecordByRuleRequest(this);
        } 

    } 

}
