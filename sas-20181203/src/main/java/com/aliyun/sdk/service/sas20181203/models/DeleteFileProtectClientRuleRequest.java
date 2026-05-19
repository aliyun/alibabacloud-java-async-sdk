// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DeleteFileProtectClientRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteFileProtectClientRuleRequest</p>
 */
public class DeleteFileProtectClientRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertLevel")
    private Integer alertLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeIdList")
    private java.util.List<Long> excludeIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdList")
    private java.util.List<Long> idList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleAction")
    private String ruleAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectAll")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean selectAll;

    private DeleteFileProtectClientRuleRequest(Builder builder) {
        super(builder);
        this.alertLevel = builder.alertLevel;
        this.excludeIdList = builder.excludeIdList;
        this.idList = builder.idList;
        this.platform = builder.platform;
        this.ruleAction = builder.ruleAction;
        this.ruleName = builder.ruleName;
        this.selectAll = builder.selectAll;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFileProtectClientRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertLevel
     */
    public Integer getAlertLevel() {
        return this.alertLevel;
    }

    /**
     * @return excludeIdList
     */
    public java.util.List<Long> getExcludeIdList() {
        return this.excludeIdList;
    }

    /**
     * @return idList
     */
    public java.util.List<Long> getIdList() {
        return this.idList;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return ruleAction
     */
    public String getRuleAction() {
        return this.ruleAction;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return selectAll
     */
    public Boolean getSelectAll() {
        return this.selectAll;
    }

    public static final class Builder extends Request.Builder<DeleteFileProtectClientRuleRequest, Builder> {
        private Integer alertLevel; 
        private java.util.List<Long> excludeIdList; 
        private java.util.List<Long> idList; 
        private String platform; 
        private String ruleAction; 
        private String ruleName; 
        private Boolean selectAll; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFileProtectClientRuleRequest request) {
            super(request);
            this.alertLevel = request.alertLevel;
            this.excludeIdList = request.excludeIdList;
            this.idList = request.idList;
            this.platform = request.platform;
            this.ruleAction = request.ruleAction;
            this.ruleName = request.ruleName;
            this.selectAll = request.selectAll;
        } 

        /**
         * AlertLevel.
         */
        public Builder alertLevel(Integer alertLevel) {
            this.putQueryParameter("AlertLevel", alertLevel);
            this.alertLevel = alertLevel;
            return this;
        }

        /**
         * ExcludeIdList.
         */
        public Builder excludeIdList(java.util.List<Long> excludeIdList) {
            this.putQueryParameter("ExcludeIdList", excludeIdList);
            this.excludeIdList = excludeIdList;
            return this;
        }

        /**
         * IdList.
         */
        public Builder idList(java.util.List<Long> idList) {
            this.putQueryParameter("IdList", idList);
            this.idList = idList;
            return this;
        }

        /**
         * Platform.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * RuleAction.
         */
        public Builder ruleAction(String ruleAction) {
            this.putQueryParameter("RuleAction", ruleAction);
            this.ruleAction = ruleAction;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder selectAll(Boolean selectAll) {
            this.putQueryParameter("SelectAll", selectAll);
            this.selectAll = selectAll;
            return this;
        }

        @Override
        public DeleteFileProtectClientRuleRequest build() {
            return new DeleteFileProtectClientRuleRequest(this);
        } 

    } 

}
