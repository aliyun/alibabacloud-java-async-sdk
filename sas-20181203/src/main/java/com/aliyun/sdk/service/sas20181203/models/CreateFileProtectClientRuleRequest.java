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
 * {@link CreateFileProtectClientRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateFileProtectClientRuleRequest</p>
 */
public class CreateFileProtectClientRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertLevel")
    private Integer alertLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeUsers")
    private java.util.List<String> excludeUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileOps")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> fileOps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilePaths")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> filePaths;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileTypes")
    private java.util.List<String> fileTypes;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchId")
    private String switchId;

    private CreateFileProtectClientRuleRequest(Builder builder) {
        super(builder);
        this.alertLevel = builder.alertLevel;
        this.clientToken = builder.clientToken;
        this.excludeUsers = builder.excludeUsers;
        this.fileOps = builder.fileOps;
        this.filePaths = builder.filePaths;
        this.fileTypes = builder.fileTypes;
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

    public static CreateFileProtectClientRuleRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return excludeUsers
     */
    public java.util.List<String> getExcludeUsers() {
        return this.excludeUsers;
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
     * @return fileTypes
     */
    public java.util.List<String> getFileTypes() {
        return this.fileTypes;
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

    public static final class Builder extends Request.Builder<CreateFileProtectClientRuleRequest, Builder> {
        private Integer alertLevel; 
        private String clientToken; 
        private java.util.List<String> excludeUsers; 
        private java.util.List<String> fileOps; 
        private java.util.List<String> filePaths; 
        private java.util.List<String> fileTypes; 
        private String platform; 
        private java.util.List<String> procPaths; 
        private String ruleAction; 
        private String ruleName; 
        private Integer status; 
        private String switchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateFileProtectClientRuleRequest request) {
            super(request);
            this.alertLevel = request.alertLevel;
            this.clientToken = request.clientToken;
            this.excludeUsers = request.excludeUsers;
            this.fileOps = request.fileOps;
            this.filePaths = request.filePaths;
            this.fileTypes = request.fileTypes;
            this.platform = request.platform;
            this.procPaths = request.procPaths;
            this.ruleAction = request.ruleAction;
            this.ruleName = request.ruleName;
            this.status = request.status;
            this.switchId = request.switchId;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ExcludeUsers.
         */
        public Builder excludeUsers(java.util.List<String> excludeUsers) {
            this.putQueryParameter("ExcludeUsers", excludeUsers);
            this.excludeUsers = excludeUsers;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder fileOps(java.util.List<String> fileOps) {
            this.putQueryParameter("FileOps", fileOps);
            this.fileOps = fileOps;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder filePaths(java.util.List<String> filePaths) {
            this.putQueryParameter("FilePaths", filePaths);
            this.filePaths = filePaths;
            return this;
        }

        /**
         * FileTypes.
         */
        public Builder fileTypes(java.util.List<String> fileTypes) {
            this.putQueryParameter("FileTypes", fileTypes);
            this.fileTypes = fileTypes;
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
         * <p>This parameter is required.</p>
         */
        public Builder procPaths(java.util.List<String> procPaths) {
            this.putQueryParameter("ProcPaths", procPaths);
            this.procPaths = procPaths;
            return this;
        }

        /**
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
         * <p>This parameter is required.</p>
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
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * SwitchId.
         */
        public Builder switchId(String switchId) {
            this.putQueryParameter("SwitchId", switchId);
            this.switchId = switchId;
            return this;
        }

        @Override
        public CreateFileProtectClientRuleRequest build() {
            return new CreateFileProtectClientRuleRequest(this);
        } 

    } 

}
