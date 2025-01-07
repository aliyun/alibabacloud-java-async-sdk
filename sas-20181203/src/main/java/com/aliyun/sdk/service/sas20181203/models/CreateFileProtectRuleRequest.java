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
    private java.util.List<String> fileOps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilePaths")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> filePaths;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcPaths")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> procPaths;

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
        this.platform = builder.platform;
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
    public java.util.List<String> getFileOps() {
        return this.fileOps;
    }

    /**
     * @return filePaths
     */
    public java.util.List<String> getFilePaths() {
        return this.filePaths;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return procPaths
     */
    public java.util.List<String> getProcPaths() {
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
        private java.util.List<String> fileOps; 
        private java.util.List<String> filePaths; 
        private String platform; 
        private java.util.List<String> procPaths; 
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
            this.platform = request.platform;
            this.procPaths = request.procPaths;
            this.ruleAction = request.ruleAction;
            this.ruleName = request.ruleName;
            this.status = request.status;
            this.switchId = request.switchId;
        } 

        /**
         * <p>The severity of alerts. Valid values:</p>
         * <ul>
         * <li>0: does not generate alerts</li>
         * <li>1: sends notifications</li>
         * <li>2: suspicious</li>
         * <li>3: high-risk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder alertLevel(Integer alertLevel) {
            this.putQueryParameter("AlertLevel", alertLevel);
            this.alertLevel = alertLevel;
            return this;
        }

        /**
         * <p>The operations that you want to perform on the files.</p>
         * <p>This parameter is required.</p>
         */
        public Builder fileOps(java.util.List<String> fileOps) {
            this.putQueryParameter("FileOps", fileOps);
            this.fileOps = fileOps;
            return this;
        }

        /**
         * <p>The paths to the files that you want to monitor. Wildcard characters are supported.</p>
         * <p>This parameter is required.</p>
         */
        public Builder filePaths(java.util.List<String> filePaths) {
            this.putQueryParameter("FilePaths", filePaths);
            this.filePaths = filePaths;
            return this;
        }

        /**
         * <p>The type of the operating system. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong>: Windows</li>
         * <li><strong>linux</strong>: Linux</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * <p>The paths to the processes that you want to monitor. Wildcard characters are supported.</p>
         * <p>This parameter is required.</p>
         */
        public Builder procPaths(java.util.List<String> procPaths) {
            this.putQueryParameter("ProcPaths", procPaths);
            this.procPaths = procPaths;
            return this;
        }

        /**
         * <p>The handling method of the rule. Valid values:</p>
         * <ul>
         * <li>pass: allow</li>
         * <li>alert</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        public Builder ruleAction(String ruleAction) {
            this.putQueryParameter("RuleAction", ruleAction);
            this.ruleAction = ruleAction;
            return this;
        }

        /**
         * <p>The name of the rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tetsRule</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>Specifies whether to enable the rule. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The switch ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>FILE_PROTECT_RULE_SWITCH_TYPE_0000</p>
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
