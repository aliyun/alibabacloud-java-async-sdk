// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFileProtectRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateFileProtectRuleRequest</p>
 */
public class CreateFileProtectRuleRequest extends Request {
    @Query
    @NameInMap("AlertLevel")
    private Integer alertLevel;

    @Query
    @NameInMap("FileOps")
    @Validation(required = true)
    private java.util.List < String > fileOps;

    @Query
    @NameInMap("FilePaths")
    @Validation(required = true)
    private java.util.List < String > filePaths;

    @Query
    @NameInMap("ProcPaths")
    @Validation(required = true)
    private java.util.List < String > procPaths;

    @Query
    @NameInMap("RuleAction")
    @Validation(required = true)
    private String ruleAction;

    @Query
    @NameInMap("RuleName")
    @Validation(required = true)
    private String ruleName;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("SwitchId")
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
         * AlertLevel.
         */
        public Builder alertLevel(Integer alertLevel) {
            this.putQueryParameter("AlertLevel", alertLevel);
            this.alertLevel = alertLevel;
            return this;
        }

        /**
         * FileOps.
         */
        public Builder fileOps(java.util.List < String > fileOps) {
            this.putQueryParameter("FileOps", fileOps);
            this.fileOps = fileOps;
            return this;
        }

        /**
         * FilePaths.
         */
        public Builder filePaths(java.util.List < String > filePaths) {
            this.putQueryParameter("FilePaths", filePaths);
            this.filePaths = filePaths;
            return this;
        }

        /**
         * ProcPaths.
         */
        public Builder procPaths(java.util.List < String > procPaths) {
            this.putQueryParameter("ProcPaths", procPaths);
            this.procPaths = procPaths;
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
         * Status.
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
        public CreateFileProtectRuleRequest build() {
            return new CreateFileProtectRuleRequest(this);
        } 

    } 

}
