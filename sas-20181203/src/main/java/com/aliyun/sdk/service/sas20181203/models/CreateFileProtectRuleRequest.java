// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFileProtectRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateFileProtectRuleRequest</p>
 */
public class CreateFileProtectRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertLevel")
    private Integer alertLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileOps")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > fileOps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilePaths")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > filePaths;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcPaths")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > procPaths;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchId")
    private String switchId;

    private CreateFileProtectRuleRequest(Builder builder) {
        super(builder);
        this.alertLevel = builder.alertLevel;
        this.fileOps = builder.fileOps;
        this.filePaths = builder.filePaths;
        this.procPaths = builder.procPaths;
        this.ruleAction = builder.ruleAction;
        this.ruleName = builder.ruleName;
        this.status = builder.status;
        this.switchId = builder.switchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileProtectRuleRequest create() {
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
     * @return fileOps
     */
    public java.util.List < String > getFileOps() {
        return this.fileOps;
    }

    /**
     * @return filePaths
     */
    public java.util.List < String > getFilePaths() {
        return this.filePaths;
    }

    /**
     * @return procPaths
     */
    public java.util.List < String > getProcPaths() {
        return this.procPaths;
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
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return switchId
     */
    public String getSwitchId() {
        return this.switchId;
    }

    public static final class Builder extends Request.Builder<CreateFileProtectRuleRequest, Builder> {
        private Integer alertLevel; 
        private java.util.List < String > fileOps; 
        private java.util.List < String > filePaths; 
        private java.util.List < String > procPaths; 
        private String ruleAction; 
        private String ruleName; 
        private Integer status; 
        private String switchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateFileProtectRuleRequest request) {
            super(request);
            this.alertLevel = request.alertLevel;
            this.fileOps = request.fileOps;
            this.filePaths = request.filePaths;
            this.procPaths = request.procPaths;
            this.ruleAction = request.ruleAction;
            this.ruleName = request.ruleName;
            this.status = request.status;
            this.switchId = request.switchId;
        } 

        /**
         * The severity of alerts. Valid values:
         * <p>
         * 
         * *   0: does not generate alerts
         * *   1: sends notifications
         * *   2: suspicious
         * *   3: high-risk
         */
        public Builder alertLevel(Integer alertLevel) {
            this.putQueryParameter("AlertLevel", alertLevel);
            this.alertLevel = alertLevel;
            return this;
        }

        /**
         * The operations that you want to perform on the files.
         */
        public Builder fileOps(java.util.List < String > fileOps) {
            this.putQueryParameter("FileOps", fileOps);
            this.fileOps = fileOps;
            return this;
        }

        /**
         * The paths to the files that you want to monitor. Wildcard characters are supported.
         */
        public Builder filePaths(java.util.List < String > filePaths) {
            this.putQueryParameter("FilePaths", filePaths);
            this.filePaths = filePaths;
            return this;
        }

        /**
         * The paths to the processes that you want to monitor. Wildcard characters are supported.
         */
        public Builder procPaths(java.util.List < String > procPaths) {
            this.putQueryParameter("ProcPaths", procPaths);
            this.procPaths = procPaths;
            return this;
        }

        /**
         * The handling method of the rule. Valid values:
         * <p>
         * 
         * *   pass: allow
         * *   alert
         */
        public Builder ruleAction(String ruleAction) {
            this.putQueryParameter("RuleAction", ruleAction);
            this.ruleAction = ruleAction;
            return this;
        }

        /**
         * The name of the rule.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * Specifies whether to enable the rule. Valid values:
         * <p>
         * 
         * *   **1**: yes
         * *   **0**: no
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The switch ID of the rule.
         */
        public Builder switchId(String switchId) {
            this.putQueryParameter("SwitchId", switchId);
            this.switchId = switchId;
            return this;
        }

        @Override
        public CreateFileProtectRuleRequest build() {
            return new CreateFileProtectRuleRequest(this);
        } 

    } 

}
