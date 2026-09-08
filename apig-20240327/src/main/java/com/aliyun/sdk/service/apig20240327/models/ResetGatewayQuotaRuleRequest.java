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
 * {@link ResetGatewayQuotaRuleRequest} extends {@link RequestModel}
 *
 * <p>ResetGatewayQuotaRuleRequest</p>
 */
public class ResetGatewayQuotaRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ruleId")
    private String ruleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("conflictHash")
    private String conflictHash;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("overwrite")
    private Boolean overwrite;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("periodMultiplier")
    private Long periodMultiplier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("periodType")
    private String periodType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("quotaLimit")
    private Long quotaLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("timezone")
    private String timezone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("windowAlignment")
    private String windowAlignment;

    private ResetGatewayQuotaRuleRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.ruleId = builder.ruleId;
        this.conflictHash = builder.conflictHash;
        this.dryRun = builder.dryRun;
        this.overwrite = builder.overwrite;
        this.periodMultiplier = builder.periodMultiplier;
        this.periodType = builder.periodType;
        this.quotaLimit = builder.quotaLimit;
        this.timezone = builder.timezone;
        this.windowAlignment = builder.windowAlignment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetGatewayQuotaRuleRequest create() {
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
     * @return conflictHash
     */
    public String getConflictHash() {
        return this.conflictHash;
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
     * @return periodMultiplier
     */
    public Long getPeriodMultiplier() {
        return this.periodMultiplier;
    }

    /**
     * @return periodType
     */
    public String getPeriodType() {
        return this.periodType;
    }

    /**
     * @return quotaLimit
     */
    public Long getQuotaLimit() {
        return this.quotaLimit;
    }

    /**
     * @return timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    /**
     * @return windowAlignment
     */
    public String getWindowAlignment() {
        return this.windowAlignment;
    }

    public static final class Builder extends Request.Builder<ResetGatewayQuotaRuleRequest, Builder> {
        private String gatewayId; 
        private String ruleId; 
        private String conflictHash; 
        private Boolean dryRun; 
        private Boolean overwrite; 
        private Long periodMultiplier; 
        private String periodType; 
        private Long quotaLimit; 
        private String timezone; 
        private String windowAlignment; 

        private Builder() {
            super();
        } 

        private Builder(ResetGatewayQuotaRuleRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.ruleId = request.ruleId;
            this.conflictHash = request.conflictHash;
            this.dryRun = request.dryRun;
            this.overwrite = request.overwrite;
            this.periodMultiplier = request.periodMultiplier;
            this.periodType = request.periodType;
            this.quotaLimit = request.quotaLimit;
            this.timezone = request.timezone;
            this.windowAlignment = request.windowAlignment;
        } 

        /**
         * <p>The unique identifier of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-123456</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>qr-d8j7fpmm1hksxxxxxx</p>
         */
        public Builder ruleId(String ruleId) {
            this.putPathParameter("ruleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The conflict snapshot hash, used to prevent concurrent dirty overwrites when confirming an overwrite. Obtain this value from the response of a previous dryRun=true call.</p>
         * <p>You do not need to specify this parameter in the following cases: no conflicts exist, you are performing a dry run (dryRun=true), or you are not confirming an overwrite (overwrite=false).</p>
         * <p>When dryRun is set to false and overwrite is set to true, if this parameter is not specified or the value has expired and no longer matches, the backend returns accepted=false with a new conflict preview. You must perform the dry run again to confirm the new conflicts.</p>
         * 
         * <strong>example:</strong>
         * <p>f8f44dc6cf369a017d56b7197eb4fb5ac4bbb6b09a92b9b41999541fxxxxxxxx</p>
         */
        public Builder conflictHash(String conflictHash) {
            this.putBodyParameter("conflictHash", conflictHash);
            this.conflictHash = conflictHash;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run without persisting or applying the configuration. A dry run checks whether conflicting rules exist on the bound subjects. The same subject cannot have two calendar-period quotas with the same period. For example, a subject that already has a daily calendar quota cannot have another daily calendar quota rule added.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether to allow overwriting when conflicts exist. If you allow overwriting, the conflicting subjects (consumers or consumer groups) are unbound from the old rule and bound to the new rule.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder overwrite(Boolean overwrite) {
            this.putBodyParameter("overwrite", overwrite);
            this.overwrite = overwrite;
            return this;
        }

        /**
         * <p>The period multiplier, which specifies the number of periods after which the quota is reset. This parameter is returned when the rule uses a custom period. Minimum value: 1. Maximum value: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder periodMultiplier(Long periodMultiplier) {
            this.putBodyParameter("periodMultiplier", periodMultiplier);
            this.periodMultiplier = periodMultiplier;
            return this;
        }

        /**
         * <p>The period type. Calendar periods support daily, weekly, and monthly statistics. Valid values: day, week, and month. Custom periods support only daily statistics. The value is fixed to day.</p>
         * 
         * <strong>example:</strong>
         * <p>week</p>
         */
        public Builder periodType(String periodType) {
            this.putBodyParameter("periodType", periodType);
            this.periodType = periodType;
            return this;
        }

        /**
         * <p>The total available quota per period after the reset.</p>
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
         * <p>The time zone for the calendar period, in UTC+x format.</p>
         * 
         * <strong>example:</strong>
         * <p>UTC+8</p>
         */
        public Builder timezone(String timezone) {
            this.putBodyParameter("timezone", timezone);
            this.timezone = timezone;
            return this;
        }

        /**
         * <p>The period alignment type after the reset. Valid values:</p>
         * <ul>
         * <li>calendar: calendar period.</li>
         * <li>epoch: custom period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>calendar</p>
         */
        public Builder windowAlignment(String windowAlignment) {
            this.putBodyParameter("windowAlignment", windowAlignment);
            this.windowAlignment = windowAlignment;
            return this;
        }

        @Override
        public ResetGatewayQuotaRuleRequest build() {
            return new ResetGatewayQuotaRuleRequest(this);
        } 

    } 

}
