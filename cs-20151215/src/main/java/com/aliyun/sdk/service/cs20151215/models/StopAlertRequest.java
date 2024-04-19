// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopAlertRequest} extends {@link RequestModel}
 *
 * <p>StopAlertRequest</p>
 */
public class StopAlertRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("alert_rule_group_name")
    private String alertRuleGroupName;

    @Body
    @NameInMap("alert_rule_name")
    private String alertRuleName;

    private StopAlertRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.alertRuleGroupName = builder.alertRuleGroupName;
        this.alertRuleName = builder.alertRuleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopAlertRequest create() {
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
     * @return alertRuleGroupName
     */
    public String getAlertRuleGroupName() {
        return this.alertRuleGroupName;
    }

    /**
     * @return alertRuleName
     */
    public String getAlertRuleName() {
        return this.alertRuleName;
    }

    public static final class Builder extends Request.Builder<StopAlertRequest, Builder> {
        private String clusterId; 
        private String alertRuleGroupName; 
        private String alertRuleName; 

        private Builder() {
            super();
        } 

        private Builder(StopAlertRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.alertRuleGroupName = request.alertRuleGroupName;
            this.alertRuleName = request.alertRuleName;
        } 

        /**
         * The cluster ID.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to obtain cluster IDs.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The name of the alert rule set to be disabled.
         */
        public Builder alertRuleGroupName(String alertRuleGroupName) {
            this.putBodyParameter("alert_rule_group_name", alertRuleGroupName);
            this.alertRuleGroupName = alertRuleGroupName;
            return this;
        }

        /**
         * The name of the alert rule to be disabled. If you do not specify an alert rule name, the alert rule set is disabled.
         */
        public Builder alertRuleName(String alertRuleName) {
            this.putBodyParameter("alert_rule_name", alertRuleName);
            this.alertRuleName = alertRuleName;
            return this;
        }

        @Override
        public StopAlertRequest build() {
            return new StopAlertRequest(this);
        } 

    } 

}
