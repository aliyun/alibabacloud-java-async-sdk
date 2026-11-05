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
 * {@link AddGatewayQuotaRuleRequest} extends {@link RequestModel}
 *
 * <p>AddGatewayQuotaRuleRequest</p>
 */
public class AddGatewayQuotaRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("conflictHash")
    private String conflictHash;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("consumerGroupIds")
    private java.util.List<String> consumerGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("consumerIds")
    private java.util.List<String> consumerIds;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String periodType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("quotaDimension")
    @com.aliyun.core.annotation.Validation(required = true)
    private String quotaDimension;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("quotaLimit")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long quotaLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ruleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subjectType")
    private String subjectType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("timezone")
    private String timezone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("windowAlignment")
    private String windowAlignment;

    private AddGatewayQuotaRuleRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.conflictHash = builder.conflictHash;
        this.consumerGroupIds = builder.consumerGroupIds;
        this.consumerIds = builder.consumerIds;
        this.dryRun = builder.dryRun;
        this.overwrite = builder.overwrite;
        this.periodMultiplier = builder.periodMultiplier;
        this.periodType = builder.periodType;
        this.quotaDimension = builder.quotaDimension;
        this.quotaLimit = builder.quotaLimit;
        this.ruleName = builder.ruleName;
        this.subjectType = builder.subjectType;
        this.timezone = builder.timezone;
        this.windowAlignment = builder.windowAlignment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddGatewayQuotaRuleRequest create() {
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
     * @return consumerIds
     */
    public java.util.List<String> getConsumerIds() {
        return this.consumerIds;
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
     * @return quotaDimension
     */
    public String getQuotaDimension() {
        return this.quotaDimension;
    }

    /**
     * @return quotaLimit
     */
    public Long getQuotaLimit() {
        return this.quotaLimit;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return subjectType
     */
    public String getSubjectType() {
        return this.subjectType;
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

    public static final class Builder extends Request.Builder<AddGatewayQuotaRuleRequest, Builder> {
        private String gatewayId; 
        private String conflictHash; 
        private java.util.List<String> consumerGroupIds; 
        private java.util.List<String> consumerIds; 
        private Boolean dryRun; 
        private Boolean overwrite; 
        private Long periodMultiplier; 
        private String periodType; 
        private String quotaDimension; 
        private Long quotaLimit; 
        private String ruleName; 
        private String subjectType; 
        private String timezone; 
        private String windowAlignment; 

        private Builder() {
            super();
        } 

        private Builder(AddGatewayQuotaRuleRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.conflictHash = request.conflictHash;
            this.consumerGroupIds = request.consumerGroupIds;
            this.consumerIds = request.consumerIds;
            this.dryRun = request.dryRun;
            this.overwrite = request.overwrite;
            this.periodMultiplier = request.periodMultiplier;
            this.periodType = request.periodType;
            this.quotaDimension = request.quotaDimension;
            this.quotaLimit = request.quotaLimit;
            this.ruleName = request.ruleName;
            this.subjectType = request.subjectType;
            this.timezone = request.timezone;
            this.windowAlignment = request.windowAlignment;
        } 

        /**
         * <p>The unique identifier of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-d8ki1xxxxxxxxxxxxxxx</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The conflict snapshot hash used to prevent concurrent dirty overwrites when you confirm an overwrite. You can obtain this value by first performing a dry run with dryRun=true and extracting it from the response.</p>
         * <p>You do not need to specify this parameter in the following scenarios: no conflict exists; you are only performing a dry run with dryRun=true; or overwrite=false, which means you do not confirm the overwrite.</p>
         * <p>If dryRun=false and overwrite=true but this parameter is not specified or has expired and does not match, the backend returns accepted=false along with a new conflict preview. In this case, you must perform a dry run again to confirm the new conflict.</p>
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
         * <p>The list of consumer group IDs to which the rule is bound.</p>
         * 
         * <strong>example:</strong>
         * <p>group1,group2</p>
         */
        public Builder consumerGroupIds(java.util.List<String> consumerGroupIds) {
            this.putBodyParameter("consumerGroupIds", consumerGroupIds);
            this.consumerGroupIds = consumerGroupIds;
            return this;
        }

        /**
         * <p>The list of consumer IDs to which the rule is bound. You can specify up to 1,000 consumers in a single request.</p>
         * 
         * <strong>example:</strong>
         * <p>1001,1002,1003</p>
         */
        public Builder consumerIds(java.util.List<String> consumerIds) {
            this.putBodyParameter("consumerIds", consumerIds);
            this.consumerIds = consumerIds;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run without saving data to the database or delivering actual configurations. This parameter is used to check whether conflicting rules exist on the bound consumption subjects. A single consumption subject cannot be configured with two natural period quotas of the same period. For example, a consumption subject that already has a natural day quota cannot be added with another natural day quota rule.</p>
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
         * <p>Specifies whether to allow overwriting when a conflict occurs. If you allow overwriting, the conflicting subjects (consumers or consumer groups) are unbound from the old rule and bound to the new rule.</p>
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
         * <p>The period multiplier. This parameter applies to custom period rules.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder periodMultiplier(Long periodMultiplier) {
            this.putBodyParameter("periodMultiplier", periodMultiplier);
            this.periodMultiplier = periodMultiplier;
            return this;
        }

        /**
         * <p>The period type. Natural periods support daily, weekly, and monthly statistics. Valid values: day, week, and month. Custom periods support only daily statistics, and the value is fixed to day.</p>
         * <p>This parameter is required.</p>
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
         * <p>The quota dimension or limit type. Valid values: token and credit.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>token</p>
         */
        public Builder quotaDimension(String quotaDimension) {
            this.putBodyParameter("quotaDimension", quotaDimension);
            this.quotaDimension = quotaDimension;
            return this;
        }

        /**
         * <p>The total available quota (limit) for the period.</p>
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
         * <p>The name of the rule.</p>
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

        /**
         * <p>The subject type of the rule. consumer indicates a consumer, and consumer_group indicates a consumer group. If you do not specify this parameter, the default value is consumer.</p>
         * 
         * <strong>example:</strong>
         * <p>consumer_group</p>
         */
        public Builder subjectType(String subjectType) {
            this.putBodyParameter("subjectType", subjectType);
            this.subjectType = subjectType;
            return this;
        }

        /**
         * <p>The time zone corresponding to the natural period in the UTC+x format.</p>
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
         * <p>The reset period type. Natural periods (windowAlignment=calendar) and custom periods (windowAlignment=epoch) are supported.</p>
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
        public AddGatewayQuotaRuleRequest build() {
            return new AddGatewayQuotaRuleRequest(this);
        } 

    } 

}
