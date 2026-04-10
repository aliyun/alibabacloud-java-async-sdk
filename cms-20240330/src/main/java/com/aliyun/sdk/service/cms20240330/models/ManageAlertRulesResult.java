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
 * {@link ManageAlertRulesResult} extends {@link TeaModel}
 *
 * <p>ManageAlertRulesResult</p>
 */
public class ManageAlertRulesResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alertRule")
    private AlertRuleV2 alertRule;

    @com.aliyun.core.annotation.NameInMap("deletedCount")
    private Integer deletedCount;

    @com.aliyun.core.annotation.NameInMap("deletedUuidList")
    private java.util.List<String> deletedUuidList;

    private ManageAlertRulesResult(Builder builder) {
        this.alertRule = builder.alertRule;
        this.deletedCount = builder.deletedCount;
        this.deletedUuidList = builder.deletedUuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManageAlertRulesResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertRule
     */
    public AlertRuleV2 getAlertRule() {
        return this.alertRule;
    }

    /**
     * @return deletedCount
     */
    public Integer getDeletedCount() {
        return this.deletedCount;
    }

    /**
     * @return deletedUuidList
     */
    public java.util.List<String> getDeletedUuidList() {
        return this.deletedUuidList;
    }

    public static final class Builder {
        private AlertRuleV2 alertRule; 
        private Integer deletedCount; 
        private java.util.List<String> deletedUuidList; 

        private Builder() {
        } 

        private Builder(ManageAlertRulesResult model) {
            this.alertRule = model.alertRule;
            this.deletedCount = model.deletedCount;
            this.deletedUuidList = model.deletedUuidList;
        } 

        /**
         * alertRule.
         */
        public Builder alertRule(AlertRuleV2 alertRule) {
            this.alertRule = alertRule;
            return this;
        }

        /**
         * <p>成功删除的规则数量</p>
         */
        public Builder deletedCount(Integer deletedCount) {
            this.deletedCount = deletedCount;
            return this;
        }

        /**
         * <p>成功删除的规则 UUID 列表</p>
         */
        public Builder deletedUuidList(java.util.List<String> deletedUuidList) {
            this.deletedUuidList = deletedUuidList;
            return this;
        }

        public ManageAlertRulesResult build() {
            return new ManageAlertRulesResult(this);
        } 

    } 

}
