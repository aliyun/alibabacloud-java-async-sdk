// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link UpdateGatewayQuotaRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayQuotaRuleRequest</p>
 */
public class UpdateGatewayQuotaRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ruleId")
    private String ruleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("addIds")
    private java.util.List<String> addIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("conflictHash")
    private String conflictHash;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("consumerGroupIds")
    private java.util.List<String> consumerGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("overwrite")
    private Boolean overwrite;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("quotaLimit")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long quotaLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("removeIds")
    private java.util.List<String> removeIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ruleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    private UpdateGatewayQuotaRuleRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.ruleId = builder.ruleId;
        this.addIds = builder.addIds;
        this.conflictHash = builder.conflictHash;
        this.consumerGroupIds = builder.consumerGroupIds;
        this.dryRun = builder.dryRun;
        this.overwrite = builder.overwrite;
        this.quotaLimit = builder.quotaLimit;
        this.removeIds = builder.removeIds;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayQuotaRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return addIds
     */
    public java.util.List<String> getAddIds() {
        return this.addIds;
    }

    /**
     * @return conflictHash
     */
    public String getConflictHash() {
        return this.conflictHash;
    }

    /**
     * @return consumerGroupIds
     */
    public java.util.List<String> getConsumerGroupIds() {
        return this.consumerGroupIds;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return overwrite
     */
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    /**
     * @return quotaLimit
     */
    public Long getQuotaLimit() {
        return this.quotaLimit;
    }

    /**
     * @return removeIds
     */
    public java.util.List<String> getRemoveIds() {
        return this.removeIds;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayQuotaRuleRequest, Builder> {
        private String gatewayId; 
        private String ruleId; 
        private java.util.List<String> addIds; 
        private String conflictHash; 
        private java.util.List<String> consumerGroupIds; 
        private Boolean dryRun; 
        private Boolean overwrite; 
        private Long quotaLimit; 
        private java.util.List<String> removeIds; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayQuotaRuleRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.ruleId = request.ruleId;
            this.addIds = request.addIds;
            this.conflictHash = request.conflictHash;
            this.consumerGroupIds = request.consumerGroupIds;
            this.dryRun = request.dryRun;
            this.overwrite = request.overwrite;
            this.quotaLimit = request.quotaLimit;
            this.removeIds = request.removeIds;
            this.ruleName = request.ruleName;
        } 

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * ruleId.
         */
        public Builder ruleId(String ruleId) {
            this.putPathParameter("ruleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * addIds.
         */
        public Builder addIds(java.util.List<String> addIds) {
            this.putBodyParameter("addIds", addIds);
            this.addIds = addIds;
            return this;
        }

        /**
         * conflictHash.
         */
        public Builder conflictHash(String conflictHash) {
            this.putBodyParameter("conflictHash", conflictHash);
            this.conflictHash = conflictHash;
            return this;
        }

        /**
         * consumerGroupIds.
         */
        public Builder consumerGroupIds(java.util.List<String> consumerGroupIds) {
            this.putBodyParameter("consumerGroupIds", consumerGroupIds);
            this.consumerGroupIds = consumerGroupIds;
            return this;
        }

        /**
         * dryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * overwrite.
         */
        public Builder overwrite(Boolean overwrite) {
            this.putBodyParameter("overwrite", overwrite);
            this.overwrite = overwrite;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder quotaLimit(Long quotaLimit) {
            this.putBodyParameter("quotaLimit", quotaLimit);
            this.quotaLimit = quotaLimit;
            return this;
        }

        /**
         * removeIds.
         */
        public Builder removeIds(java.util.List<String> removeIds) {
            this.putBodyParameter("removeIds", removeIds);
            this.removeIds = removeIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>team-rule</p>
         */
        public Builder ruleName(String ruleName) {
            this.putBodyParameter("ruleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        @Override
        public UpdateGatewayQuotaRuleRequest build() {
            return new UpdateGatewayQuotaRuleRequest(this);
        } 

    } 

}
