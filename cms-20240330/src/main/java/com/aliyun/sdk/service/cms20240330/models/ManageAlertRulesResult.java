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

    @com.aliyun.core.annotation.NameInMap("updatedCount")
    private Integer updatedCount;

    @com.aliyun.core.annotation.NameInMap("updatedUuidList")
    private java.util.List<String> updatedUuidList;

    private ManageAlertRulesResult(Builder builder) {
        this.alertRule = builder.alertRule;
        this.deletedCount = builder.deletedCount;
        this.deletedUuidList = builder.deletedUuidList;
        this.updatedCount = builder.updatedCount;
        this.updatedUuidList = builder.updatedUuidList;
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

    /**
     * @return updatedCount
     */
    public Integer getUpdatedCount() {
        return this.updatedCount;
    }

    /**
     * @return updatedUuidList
     */
    public java.util.List<String> getUpdatedUuidList() {
        return this.updatedUuidList;
    }

    public static final class Builder {
        private AlertRuleV2 alertRule; 
        private Integer deletedCount; 
        private java.util.List<String> deletedUuidList; 
        private Integer updatedCount; 
        private java.util.List<String> updatedUuidList; 

        private Builder() {
        } 

        private Builder(ManageAlertRulesResult model) {
            this.alertRule = model.alertRule;
            this.deletedCount = model.deletedCount;
            this.deletedUuidList = model.deletedUuidList;
            this.updatedCount = model.updatedCount;
            this.updatedUuidList = model.updatedUuidList;
        } 

        /**
         * alertRule.
         */
        public Builder alertRule(AlertRuleV2 alertRule) {
            this.alertRule = alertRule;
            return this;
        }

        /**
         * deletedCount.
         */
        public Builder deletedCount(Integer deletedCount) {
            this.deletedCount = deletedCount;
            return this;
        }

        /**
         * deletedUuidList.
         */
        public Builder deletedUuidList(java.util.List<String> deletedUuidList) {
            this.deletedUuidList = deletedUuidList;
            return this;
        }

        /**
         * updatedCount.
         */
        public Builder updatedCount(Integer updatedCount) {
            this.updatedCount = updatedCount;
            return this;
        }

        /**
         * updatedUuidList.
         */
        public Builder updatedUuidList(java.util.List<String> updatedUuidList) {
            this.updatedUuidList = updatedUuidList;
            return this;
        }

        public ManageAlertRulesResult build() {
            return new ManageAlertRulesResult(this);
        } 

    } 

}
