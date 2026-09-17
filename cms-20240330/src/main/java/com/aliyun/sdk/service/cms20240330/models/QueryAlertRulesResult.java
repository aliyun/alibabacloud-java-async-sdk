// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link QueryAlertRulesResult} extends {@link TeaModel}
 *
 * <p>QueryAlertRulesResult</p>
 */
public class QueryAlertRulesResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alertRules")
    private java.util.List<AlertRuleV2> alertRules;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private QueryAlertRulesResult(Builder builder) {
        this.alertRules = builder.alertRules;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAlertRulesResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertRules
     */
    public java.util.List<AlertRuleV2> getAlertRules() {
        return this.alertRules;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AlertRuleV2> alertRules; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(QueryAlertRulesResult model) {
            this.alertRules = model.alertRules;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of alert rules returned by the query. Each element contains the complete configuration information of an alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;uuid&quot;:&quot;a1b2c3d4-e5f6-7890-abcd-ef1234567890&quot;,&quot;displayName&quot;:&quot;CPU usage alert&quot;,&quot;status&quot;:&quot;OK&quot;}]</p>
         */
        public Builder alertRules(java.util.List<AlertRuleV2> alertRules) {
            this.alertRules = alertRules;
            return this;
        }

        /**
         * <p>The total number of alert rules that match the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryAlertRulesResult build() {
            return new QueryAlertRulesResult(this);
        } 

    } 

}
