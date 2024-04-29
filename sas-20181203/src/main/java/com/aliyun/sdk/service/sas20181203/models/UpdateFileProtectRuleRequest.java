// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFileProtectRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateFileProtectRuleRequest</p>
 */
public class UpdateFileProtectRuleRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcPaths")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > procPaths;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleAction")
    private String ruleAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private UpdateFileProtectRuleRequest(Builder builder) {
        super(builder);
        this.alertLevel = builder.alertLevel;
        this.fileOps = builder.fileOps;
        this.filePaths = builder.filePaths;
        this.id = builder.id;
        this.procPaths = builder.procPaths;
        this.ruleAction = builder.ruleAction;
        this.ruleName = builder.ruleName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFileProtectRuleRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
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

    public static final class Builder extends Request.Builder<UpdateFileProtectRuleRequest, Builder> {
        private Integer alertLevel; 
        private java.util.List < String > fileOps; 
        private java.util.List < String > filePaths; 
        private Long id; 
        private java.util.List < String > procPaths; 
        private String ruleAction; 
        private String ruleName; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFileProtectRuleRequest request) {
            super(request);
            this.alertLevel = request.alertLevel;
            this.fileOps = request.fileOps;
            this.filePaths = request.filePaths;
            this.id = request.id;
            this.procPaths = request.procPaths;
            this.ruleAction = request.ruleAction;
            this.ruleName = request.ruleName;
            this.status = request.status;
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
         * The operations performed on the files.
         */
        public Builder fileOps(java.util.List < String > fileOps) {
            this.putQueryParameter("FileOps", fileOps);
            this.fileOps = fileOps;
            return this;
        }

        /**
         * The paths to the monitored files. Wildcard characters are supported.
         */
        public Builder filePaths(java.util.List < String > filePaths) {
            this.putQueryParameter("FilePaths", filePaths);
            this.filePaths = filePaths;
            return this;
        }

        /**
         * The ID of the rule.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The paths to the monitored processes.
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
         * The status of the rule. Valid values:
         * <p>
         * 
         * *   **0**: disabled
         * *   **1**: enabled
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateFileProtectRuleRequest build() {
            return new UpdateFileProtectRuleRequest(this);
        } 

    } 

}
