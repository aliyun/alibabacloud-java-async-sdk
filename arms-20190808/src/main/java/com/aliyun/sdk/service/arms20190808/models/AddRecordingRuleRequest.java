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
 * {@link AddRecordingRuleRequest} extends {@link RequestModel}
 *
 * <p>AddRecordingRuleRequest</p>
 */
public class AddRecordingRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleYaml")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleYaml;

    private AddRecordingRuleRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.ruleYaml = builder.ruleYaml;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddRecordingRuleRequest create() {
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

    public static final class Builder extends Request.Builder<AddRecordingRuleRequest, Builder> {
        private String clusterId; 
        private String regionId; 
        private String ruleYaml; 

        private Builder() {
            super();
        } 

        private Builder(AddRecordingRuleRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.regionId = request.regionId;
            this.ruleYaml = request.ruleYaml;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc7a37ee31aea4ed1a059eff8034b****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The custom recording rule. The value is in the YAML format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>groups: - name: &quot;recording_demo&quot;   rules:   - expr: &quot;sum(jvm_memory_max_bytes)&quot;     record: &quot;rate_coredns_demo&quot;</p>
         */
        public Builder ruleYaml(String ruleYaml) {
            this.putQueryParameter("RuleYaml", ruleYaml);
            this.ruleYaml = ruleYaml;
            return this;
        }

        @Override
        public AddRecordingRuleRequest build() {
            return new AddRecordingRuleRequest(this);
        } 

    } 

}
