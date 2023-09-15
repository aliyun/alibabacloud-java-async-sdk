// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFileProtectRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateFileProtectRuleRequest</p>
 */
public class UpdateFileProtectRuleRequest extends Request {
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
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("ProcPaths")
    @Validation(required = true)
    private java.util.List < String > procPaths;

    @Query
    @NameInMap("RuleAction")
    private String ruleAction;

    @Query
    @NameInMap("RuleName")
    @Validation(required = true)
    private String ruleName;

    @Query
    @NameInMap("Status")
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
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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

        @Override
        public UpdateFileProtectRuleRequest build() {
            return new UpdateFileProtectRuleRequest(this);
        } 

    } 

}
