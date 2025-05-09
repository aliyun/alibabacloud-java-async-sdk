// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetWafRulesetResponseBody} extends {@link TeaModel}
 *
 * <p>GetWafRulesetResponseBody</p>
 */
public class GetWafRulesetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String name;

    @com.aliyun.core.annotation.NameInMap("Phase")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phase;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<WafRuleConfig> rules;

    @com.aliyun.core.annotation.NameInMap("Shared")
    private WafBatchRuleShared shared;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private GetWafRulesetResponseBody(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.phase = builder.phase;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
        this.shared = builder.shared;
        this.status = builder.status;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWafRulesetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rules
     */
    public java.util.List<WafRuleConfig> getRules() {
        return this.rules;
    }

    /**
     * @return shared
     */
    public WafBatchRuleShared getShared() {
        return this.shared;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private Long id; 
        private String name; 
        private String phase; 
        private String requestId; 
        private java.util.List<WafRuleConfig> rules; 
        private WafBatchRuleShared shared; 
        private String status; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(GetWafRulesetResponseBody model) {
            this.id = model.id;
            this.name = model.name;
            this.phase = model.phase;
            this.requestId = model.requestId;
            this.rules = model.rules;
            this.shared = model.shared;
            this.status = model.status;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>Ruleset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Ruleset name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The WAF operation phase applicable to the ruleset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>http_bot</p>
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of rule configurations in the ruleset.</p>
         */
        public Builder rules(java.util.List<WafRuleConfig> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * <p>Shared configurations for the rules in the ruleset.</p>
         */
        public Builder shared(WafBatchRuleShared shared) {
            this.shared = shared;
            return this;
        }

        /**
         * <p>Ruleset status.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The last modified time of the ruleset.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetWafRulesetResponseBody build() {
            return new GetWafRulesetResponseBody(this);
        } 

    } 

}
