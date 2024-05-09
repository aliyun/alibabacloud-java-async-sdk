// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ManageRecordingRuleRequest} extends {@link RequestModel}
 *
 * <p>ManageRecordingRuleRequest</p>
 */
public class ManageRecordingRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queryUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleYaml")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleYaml;

    private ManageRecordingRuleRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.queryUserId = builder.queryUserId;
        this.regionId = builder.regionId;
        this.ruleYaml = builder.ruleYaml;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManageRecordingRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return queryUserId
     */
    public String getQueryUserId() {
        return this.queryUserId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ruleYaml
     */
    public String getRuleYaml() {
        return this.ruleYaml;
    }

    public static final class Builder extends Request.Builder<ManageRecordingRuleRequest, Builder> {
        private String clusterId; 
        private String queryUserId; 
        private String regionId; 
        private String ruleYaml; 

        private Builder() {
            super();
        } 

        private Builder(ManageRecordingRuleRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.queryUserId = request.queryUserId;
            this.regionId = request.regionId;
            this.ruleYaml = request.ruleYaml;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The user ID.
         */
        public Builder queryUserId(String queryUserId) {
            this.putQueryParameter("QueryUserId", queryUserId);
            this.queryUserId = queryUserId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The recording rule.
         */
        public Builder ruleYaml(String ruleYaml) {
            this.putQueryParameter("RuleYaml", ruleYaml);
            this.ruleYaml = ruleYaml;
            return this;
        }

        @Override
        public ManageRecordingRuleRequest build() {
            return new ManageRecordingRuleRequest(this);
        } 

    } 

}
