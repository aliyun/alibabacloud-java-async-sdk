// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSasContainerWebDefenseRuleRequest} extends {@link RequestModel}
 *
 * <p>AddSasContainerWebDefenseRuleRequest</p>
 */
public class AddSasContainerWebDefenseRuleRequest extends Request {
    @Query
    @NameInMap("PathConfDTOList")
    private java.util.List < PathConfDTOList> pathConfDTOList;

    @Query
    @NameInMap("RuleName")
    @Validation(maxLength = 50, minLength = 3)
    private String ruleName;

    private AddSasContainerWebDefenseRuleRequest(Builder builder) {
        super(builder);
        this.pathConfDTOList = builder.pathConfDTOList;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSasContainerWebDefenseRuleRequest create() {
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
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<AddSasContainerWebDefenseRuleRequest, Builder> {
        private java.util.List < PathConfDTOList> pathConfDTOList; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(AddSasContainerWebDefenseRuleRequest request) {
            super(request);
            this.pathConfDTOList = request.pathConfDTOList;
            this.ruleName = request.ruleName;
        } 

        /**
         * PathConfDTOList.
         */
        public Builder pathConfDTOList(java.util.List < PathConfDTOList> pathConfDTOList) {
            this.putQueryParameter("PathConfDTOList", pathConfDTOList);
            this.pathConfDTOList = pathConfDTOList;
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

        @Override
        public AddSasContainerWebDefenseRuleRequest build() {
            return new AddSasContainerWebDefenseRuleRequest(this);
        } 

    } 

    public static class PathConfDTOList extends TeaModel {
        @NameInMap("BackupPath")
        private String backupPath;

        @NameInMap("DefenseMode")
        private String defenseMode;

        @NameInMap("DefensePath")
        @Validation(required = true, maxLength = 500)
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

        @NameInMap("ProcessPathList")
        @Validation(required = true)
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
            private java.util.List < String > processPathList; 

            /**
             * BackupPath.
             */
            public Builder backupPath(String backupPath) {
                this.backupPath = backupPath;
                return this;
            }

            /**
             * DefenseMode.
             */
            public Builder defenseMode(String defenseMode) {
                this.defenseMode = defenseMode;
                return this;
            }

            /**
             * DefensePath.
             */
            public Builder defensePath(String defensePath) {
                this.defensePath = defensePath;
                return this;
            }

            /**
             * ExcludeFile.
             */
            public Builder excludeFile(String excludeFile) {
                this.excludeFile = excludeFile;
                return this;
            }

            /**
             * ExcludeFilePath.
             */
            public Builder excludeFilePath(String excludeFilePath) {
                this.excludeFilePath = excludeFilePath;
                return this;
            }

            /**
             * ExcludeFileType.
             */
            public Builder excludeFileType(String excludeFileType) {
                this.excludeFileType = excludeFileType;
                return this;
            }

            /**
             * GuardType.
             */
            public Builder guardType(Integer guardType) {
                this.guardType = guardType;
                return this;
            }

            /**
             * IncludeFile.
             */
            public Builder includeFile(String includeFile) {
                this.includeFile = includeFile;
                return this;
            }

            /**
             * IncludeFileType.
             */
            public Builder includeFileType(String includeFileType) {
                this.includeFileType = includeFileType;
                return this;
            }

            /**
             * ProcessPathList.
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
