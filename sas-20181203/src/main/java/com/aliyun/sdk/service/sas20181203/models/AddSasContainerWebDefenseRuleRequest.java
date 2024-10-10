// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddSasContainerWebDefenseRuleRequest} extends {@link RequestModel}
 *
 * <p>AddSasContainerWebDefenseRuleRequest</p>
 */
public class AddSasContainerWebDefenseRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PathConfDTOList")
    private java.util.List < PathConfDTOList> pathConfDTOList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(maxLength = 50, minLength = 3)
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
         * <p>The paths that you want to protect.</p>
         */
        public Builder pathConfDTOList(java.util.List < PathConfDTOList> pathConfDTOList) {
            this.putQueryParameter("PathConfDTOList", pathConfDTOList);
            this.pathConfDTOList = pathConfDTOList;
            return this;
        }

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test-2020</p>
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

    /**
     * 
     * {@link AddSasContainerWebDefenseRuleRequest} extends {@link TeaModel}
     *
     * <p>AddSasContainerWebDefenseRuleRequest</p>
     */
    public static class PathConfDTOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupPath")
        private String backupPath;

        @com.aliyun.core.annotation.NameInMap("DefenseMode")
        private String defenseMode;

        @com.aliyun.core.annotation.NameInMap("DefensePath")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 500)
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

        @com.aliyun.core.annotation.NameInMap("ProcessPathList")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The backup path.</p>
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
             * 
             * <strong>example:</strong>
             * <p>audit</p>
             */
            public Builder defenseMode(String defenseMode) {
                this.defenseMode = defenseMode;
                return this;
            }

            /**
             * <p>The path that you want to protect.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/test/</p>
             */
            public Builder defensePath(String defensePath) {
                this.defensePath = defensePath;
                return this;
            }

            /**
             * <p>The file that you want to exclude.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/test/aa</p>
             */
            public Builder excludeFile(String excludeFile) {
                this.excludeFile = excludeFile;
                return this;
            }

            /**
             * <p>The path to the file that you want to exclude.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/test/tt</p>
             */
            public Builder excludeFilePath(String excludeFilePath) {
                this.excludeFilePath = excludeFilePath;
                return this;
            }

            /**
             * <p>The type of the file that you want to exclude.</p>
             * 
             * <strong>example:</strong>
             * <p>jsp</p>
             */
            public Builder excludeFileType(String excludeFileType) {
                this.excludeFileType = excludeFileType;
                return this;
            }

            /**
             * <p>The protecion mode. Valid values:</p>
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
             * <p>The file that you want to include.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/test/t1</p>
             */
            public Builder includeFile(String includeFile) {
                this.includeFile = includeFile;
                return this;
            }

            /**
             * <p>The type of the file that you want to include.</p>
             * 
             * <strong>example:</strong>
             * <p>*.jsp</p>
             */
            public Builder includeFileType(String includeFileType) {
                this.includeFileType = includeFileType;
                return this;
            }

            /**
             * <p>The processes that you want to add to the whitelist.</p>
             * <p>This parameter is required.</p>
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
