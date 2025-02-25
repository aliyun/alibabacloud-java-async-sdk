// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cf09705f5a82f454db0d50420b6b4e904</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>87348589207</p>
         */
        public Builder queryUserId(String queryUserId) {
            this.putQueryParameter("QueryUserId", queryUserId);
            this.queryUserId = queryUserId;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The recording rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>groups:\n- interval: 60s\n  name: auto_analyzer_recording_rule_60s\n  rules:\n  - expr: sum(node_cpu_seconds_total)\n    record: sum:node_cpu_seconds_total:recording_rule_hash_f341458c0f7d\n</p>
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
