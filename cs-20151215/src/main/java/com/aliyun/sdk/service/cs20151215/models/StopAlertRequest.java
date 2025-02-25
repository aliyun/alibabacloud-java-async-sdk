// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link StopAlertRequest} extends {@link RequestModel}
 *
 * <p>StopAlertRequest</p>
 */
public class StopAlertRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("alert_rule_group_name")
    private String alertRuleGroupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("alert_rule_name")
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
         * <p>The cluster ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to obtain cluster IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c7f9c85baee73452883b3299a0107****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The name of the alert rule set to be disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>sample</p>
         */
        public Builder alertRuleGroupName(String alertRuleGroupName) {
            this.putBodyParameter("alert_rule_group_name", alertRuleGroupName);
            this.alertRuleGroupName = alertRuleGroupName;
            return this;
        }

        /**
         * <p>The name of the alert rule to be disabled. If you do not specify an alert rule name, the alert rule set is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>sample</p>
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
