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
 * {@link ModifySasContainerWebDefenseRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifySasContainerWebDefenseRuleRequest</p>
 */
public class ModifySasContainerWebDefenseRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PathConfDTOList")
    private java.util.List<PathConfDTOList> pathConfDTOList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    private ModifySasContainerWebDefenseRuleRequest(Builder builder) {
        super(builder);
        this.pathConfDTOList = builder.pathConfDTOList;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySasContainerWebDefenseRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pathConfDTOList
     */
    public java.util.List<PathConfDTOList> getPathConfDTOList() {
        return this.pathConfDTOList;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<ModifySasContainerWebDefenseRuleRequest, Builder> {
        private java.util.List<PathConfDTOList> pathConfDTOList; 
        private Long ruleId; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(ModifySasContainerWebDefenseRuleRequest request) {
            super(request);
            this.pathConfDTOList = request.pathConfDTOList;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
        } 

        /**
         * <p>The paths that are protected.</p>
         */
        public Builder pathConfDTOList(java.util.List<PathConfDTOList> pathConfDTOList) {
            this.putQueryParameter("PathConfDTOList", pathConfDTOList);
            this.pathConfDTOList = pathConfDTOList;
            return this;
        }

        /**
         * <p>The ID of the rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200634</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>wwwwwww</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        @Override
        public ModifySasContainerWebDefenseRuleRequest build() {
            return new ModifySasContainerWebDefenseRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifySasContainerWebDefenseRuleRequest} extends {@link TeaModel}
     *
     * <p>ModifySasContainerWebDefenseRuleRequest</p>
     */
    public static class PathConfDTOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupPath")
        private String backupPath;

        @com.aliyun.core.annotation.NameInMap("DefenseMode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String defenseMode;

        @com.aliyun.core.annotation.NameInMap("DefensePath")
        @com.aliyun.core.annotation.Validation(required = true)
        private String defensePath;

        @com.aliyun.core.annotation.NameInMap("ExcludeFile")
        private String excludeFile;

        @com.aliyun.core.annotation.NameInMap("ExcludeFilePath")
        private String excludeFilePath;

        @com.aliyun.core.annotation.NameInMap("ExcludeFileType")
        private String excludeFileType;

        @com.aliyun.core.annotation.NameInMap("GuardType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer guardType;

        @com.aliyun.core.annotation.NameInMap("IncludeFile")
        private String includeFile;

        @com.aliyun.core.annotation.NameInMap("IncludeFileType")
        private String includeFileType;

        @com.aliyun.core.annotation.NameInMap("PathConfId")
        private Long pathConfId;

        @com.aliyun.core.annotation.NameInMap("ProcessPathList")
        private java.util.List<String> processPathList;

        private PathConfDTOList(Builder builder) {
            this.backupPath = builder.backupPath;
            this.defenseMode = builder.defenseMode;
            this.defensePath = builder.defensePath;
            this.excludeFile = builder.excludeFile;
            this.excludeFilePath = builder.excludeFilePath;
            this.excludeFileType = builder.excludeFileType;
            this.guardType = builder.guardType;
            this.includeFile = builder.includeFile;
            this.includeFileType = builder.includeFileType;
            this.pathConfId = builder.pathConfId;
            this.processPathList = builder.processPathList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PathConfDTOList create() {
            return builder().build();
        }

        /**
         * @return backupPath
         */
        public String getBackupPath() {
            return this.backupPath;
        }

        /**
         * @return defenseMode
         */
        public String getDefenseMode() {
            return this.defenseMode;
        }

        /**
         * @return defensePath
         */
        public String getDefensePath() {
            return this.defensePath;
        }

        /**
         * @return excludeFile
         */
        public String getExcludeFile() {
            return this.excludeFile;
        }

        /**
         * @return excludeFilePath
         */
        public String getExcludeFilePath() {
            return this.excludeFilePath;
        }

        /**
         * @return excludeFileType
         */
        public String getExcludeFileType() {
            return this.excludeFileType;
        }

        /**
         * @return guardType
         */
        public Integer getGuardType() {
            return this.guardType;
        }

        /**
         * @return includeFile
         */
        public String getIncludeFile() {
            return this.includeFile;
        }

        /**
         * @return includeFileType
         */
        public String getIncludeFileType() {
            return this.includeFileType;
        }

        /**
         * @return pathConfId
         */
        public Long getPathConfId() {
            return this.pathConfId;
        }

        /**
         * @return processPathList
         */
        public java.util.List<String> getProcessPathList() {
            return this.processPathList;
        }

        public static final class Builder {
            private String backupPath; 
            private String defenseMode; 
            private String defensePath; 
            private String excludeFile; 
            private String excludeFilePath; 
            private String excludeFileType; 
            private Integer guardType; 
            private String includeFile; 
            private String includeFileType; 
            private Long pathConfId; 
            private java.util.List<String> processPathList; 

            /**
             * <p>The backup paths.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp/test</p>
             */
            public Builder backupPath(String backupPath) {
                this.backupPath = backupPath;
                return this;
            }

            /**
             * <p>The prevention mode. Valid values:</p>
             * <ul>
             * <li><strong>block</strong></li>
             * <li><strong>audit</strong></li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>audit</p>
             */
            public Builder defenseMode(String defenseMode) {
                this.defenseMode = defenseMode;
                return this;
            }

            /**
             * <p>The path that is protected.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/test/home/</p>
             */
            public Builder defensePath(String defensePath) {
                this.defensePath = defensePath;
                return this;
            }

            /**
             * <p>The files that are excluded.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/test</p>
             */
            public Builder excludeFile(String excludeFile) {
                this.excludeFile = excludeFile;
                return this;
            }

            /**
             * <p>The paths to the files that are excluded.</p>
             * 
             * <strong>example:</strong>
             * <p>/test/home/qq</p>
             */
            public Builder excludeFilePath(String excludeFilePath) {
                this.excludeFilePath = excludeFilePath;
                return this;
            }

            /**
             * <p>The types of the files that are excluded.</p>
             * 
             * <strong>example:</strong>
             * <p>php</p>
             */
            public Builder excludeFileType(String excludeFileType) {
                this.excludeFileType = excludeFileType;
                return this;
            }

            /**
             * <p>The protection mode. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: basic mode (whitelist)</li>
             * <li><strong>1</strong>: complex mode (blacklist)</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder guardType(Integer guardType) {
                this.guardType = guardType;
                return this;
            }

            /**
             * <p>The files that are included.</p>
             * 
             * <strong>example:</strong>
             * <p>/home/admin/test</p>
             */
            public Builder includeFile(String includeFile) {
                this.includeFile = includeFile;
                return this;
            }

            /**
             * <p>The type of the files that are included.</p>
             * 
             * <strong>example:</strong>
             * <p>jsp</p>
             */
            public Builder includeFileType(String includeFileType) {
                this.includeFileType = includeFileType;
                return this;
            }

            /**
             * <p>The path ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678</p>
             */
            public Builder pathConfId(Long pathConfId) {
                this.pathConfId = pathConfId;
                return this;
            }

            /**
             * <p>The processes that are added to the whitelist.</p>
             */
            public Builder processPathList(java.util.List<String> processPathList) {
                this.processPathList = processPathList;
                return this;
            }

            public PathConfDTOList build() {
                return new PathConfDTOList(this);
            } 

        } 

    }
}
