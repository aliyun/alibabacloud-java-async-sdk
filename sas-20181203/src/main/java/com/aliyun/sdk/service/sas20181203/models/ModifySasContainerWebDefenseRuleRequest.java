// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySasContainerWebDefenseRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifySasContainerWebDefenseRuleRequest</p>
 */
public class ModifySasContainerWebDefenseRuleRequest extends Request {
    @Query
    @NameInMap("PathConfDTOList")
    private java.util.List < PathConfDTOList> pathConfDTOList;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private Long ruleId;

    @Query
    @NameInMap("RuleName")
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
    public java.util.List < PathConfDTOList> getPathConfDTOList() {
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
        private java.util.List < PathConfDTOList> pathConfDTOList; 
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
         * The paths that are protected.
         */
        public Builder pathConfDTOList(java.util.List < PathConfDTOList> pathConfDTOList) {
            this.putQueryParameter("PathConfDTOList", pathConfDTOList);
            this.pathConfDTOList = pathConfDTOList;
            return this;
        }

        /**
         * The ID of the rule.
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
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

        @Override
        public ModifySasContainerWebDefenseRuleRequest build() {
            return new ModifySasContainerWebDefenseRuleRequest(this);
        } 

    } 

    public static class PathConfDTOList extends TeaModel {
        @NameInMap("BackupPath")
        private String backupPath;

        @NameInMap("DefenseMode")
        @Validation(required = true)
        private String defenseMode;

        @NameInMap("DefensePath")
        @Validation(required = true)
        private String defensePath;

        @NameInMap("ExcludeFile")
        private String excludeFile;

        @NameInMap("ExcludeFilePath")
        private String excludeFilePath;

        @NameInMap("ExcludeFileType")
        private String excludeFileType;

        @NameInMap("GuardType")
        @Validation(required = true)
        private Integer guardType;

        @NameInMap("IncludeFile")
        private String includeFile;

        @NameInMap("IncludeFileType")
        private String includeFileType;

        @NameInMap("PathConfId")
        private Long pathConfId;

        @NameInMap("ProcessPathList")
        private java.util.List < String > processPathList;

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
        public java.util.List < String > getProcessPathList() {
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
            private java.util.List < String > processPathList; 

            /**
             * The backup paths.
             */
            public Builder backupPath(String backupPath) {
                this.backupPath = backupPath;
                return this;
            }

            /**
             * The prevention mode. Valid values:
             * <p>
             * 
             * *   **block**
             * *   **audit**
             */
            public Builder defenseMode(String defenseMode) {
                this.defenseMode = defenseMode;
                return this;
            }

            /**
             * The path that is protected.
             */
            public Builder defensePath(String defensePath) {
                this.defensePath = defensePath;
                return this;
            }

            /**
             * The files that are excluded.
             */
            public Builder excludeFile(String excludeFile) {
                this.excludeFile = excludeFile;
                return this;
            }

            /**
             * The paths to the files that are excluded.
             */
            public Builder excludeFilePath(String excludeFilePath) {
                this.excludeFilePath = excludeFilePath;
                return this;
            }

            /**
             * The types of the files that are excluded.
             */
            public Builder excludeFileType(String excludeFileType) {
                this.excludeFileType = excludeFileType;
                return this;
            }

            /**
             * The protection mode. Valid values:
             * <p>
             * 
             * *   **0**: basic mode (whitelist)
             * *   **1**: complex mode (blacklist)
             */
            public Builder guardType(Integer guardType) {
                this.guardType = guardType;
                return this;
            }

            /**
             * The files that are included.
             */
            public Builder includeFile(String includeFile) {
                this.includeFile = includeFile;
                return this;
            }

            /**
             * The type of the files that are included.
             */
            public Builder includeFileType(String includeFileType) {
                this.includeFileType = includeFileType;
                return this;
            }

            /**
             * The path ID.
             */
            public Builder pathConfId(Long pathConfId) {
                this.pathConfId = pathConfId;
                return this;
            }

            /**
             * The processes that are added to the whitelist.
             */
            public Builder processPathList(java.util.List < String > processPathList) {
                this.processPathList = processPathList;
                return this;
            }

            public PathConfDTOList build() {
                return new PathConfDTOList(this);
            } 

        } 

    }
}
