// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCommitResponseBody} extends {@link TeaModel}
 *
 * <p>GetCommitResponseBody</p>
 */
public class GetCommitResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetCommitResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCommitResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCommitResponseBody build() {
            return new GetCommitResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("CommitDigest")
        private String commitDigest;

        @NameInMap("CommitId")
        private String commitId;

        @NameInMap("CommitLog")
        private String commitLog;

        @NameInMap("CommitType")
        private String commitType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("MainModuleCommitId")
        private String mainModuleCommitId;

        @NameInMap("MainModuleId")
        private String mainModuleId;

        @NameInMap("ModelDataPath")
        private String modelDataPath;

        @NameInMap("ModelDigest")
        private java.util.Map < String, String > modelDigest;

        @NameInMap("ModelPack")
        private java.util.List < ? > modelPack;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("ModuleId")
        private String moduleId;

        @NameInMap("ResourceDataPath")
        private String resourceDataPath;

        @NameInMap("ResourceDigest")
        private java.util.Map < String, String > resourceDigest;

        @NameInMap("ResourcePack")
        private java.util.List < java.util.Map<String, String>> resourcePack;

        @NameInMap("RollbackToCommitId")
        private String rollbackToCommitId;

        @NameInMap("RollbackType")
        private String rollbackType;

        @NameInMap("SchemaVersion")
        private String schemaVersion;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.commitDigest = builder.commitDigest;
            this.commitId = builder.commitId;
            this.commitLog = builder.commitLog;
            this.commitType = builder.commitType;
            this.createTime = builder.createTime;
            this.mainModuleCommitId = builder.mainModuleCommitId;
            this.mainModuleId = builder.mainModuleId;
            this.modelDataPath = builder.modelDataPath;
            this.modelDigest = builder.modelDigest;
            this.modelPack = builder.modelPack;
            this.modifiedTime = builder.modifiedTime;
            this.moduleId = builder.moduleId;
            this.resourceDataPath = builder.resourceDataPath;
            this.resourceDigest = builder.resourceDigest;
            this.resourcePack = builder.resourcePack;
            this.rollbackToCommitId = builder.rollbackToCommitId;
            this.rollbackType = builder.rollbackType;
            this.schemaVersion = builder.schemaVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return commitDigest
         */
        public String getCommitDigest() {
            return this.commitDigest;
        }

        /**
         * @return commitId
         */
        public String getCommitId() {
            return this.commitId;
        }

        /**
         * @return commitLog
         */
        public String getCommitLog() {
            return this.commitLog;
        }

        /**
         * @return commitType
         */
        public String getCommitType() {
            return this.commitType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return mainModuleCommitId
         */
        public String getMainModuleCommitId() {
            return this.mainModuleCommitId;
        }

        /**
         * @return mainModuleId
         */
        public String getMainModuleId() {
            return this.mainModuleId;
        }

        /**
         * @return modelDataPath
         */
        public String getModelDataPath() {
            return this.modelDataPath;
        }

        /**
         * @return modelDigest
         */
        public java.util.Map < String, String > getModelDigest() {
            return this.modelDigest;
        }

        /**
         * @return modelPack
         */
        public java.util.List < ? > getModelPack() {
            return this.modelPack;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return moduleId
         */
        public String getModuleId() {
            return this.moduleId;
        }

        /**
         * @return resourceDataPath
         */
        public String getResourceDataPath() {
            return this.resourceDataPath;
        }

        /**
         * @return resourceDigest
         */
        public java.util.Map < String, String > getResourceDigest() {
            return this.resourceDigest;
        }

        /**
         * @return resourcePack
         */
        public java.util.List < java.util.Map<String, String>> getResourcePack() {
            return this.resourcePack;
        }

        /**
         * @return rollbackToCommitId
         */
        public String getRollbackToCommitId() {
            return this.rollbackToCommitId;
        }

        /**
         * @return rollbackType
         */
        public String getRollbackType() {
            return this.rollbackType;
        }

        /**
         * @return schemaVersion
         */
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public static final class Builder {
            private String appId; 
            private String commitDigest; 
            private String commitId; 
            private String commitLog; 
            private String commitType; 
            private String createTime; 
            private String mainModuleCommitId; 
            private String mainModuleId; 
            private String modelDataPath; 
            private java.util.Map < String, String > modelDigest; 
            private java.util.List < ? > modelPack; 
            private String modifiedTime; 
            private String moduleId; 
            private String resourceDataPath; 
            private java.util.Map < String, String > resourceDigest; 
            private java.util.List < java.util.Map<String, String>> resourcePack; 
            private String rollbackToCommitId; 
            private String rollbackType; 
            private String schemaVersion; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CommitDigest.
             */
            public Builder commitDigest(String commitDigest) {
                this.commitDigest = commitDigest;
                return this;
            }

            /**
             * CommitId.
             */
            public Builder commitId(String commitId) {
                this.commitId = commitId;
                return this;
            }

            /**
             * CommitLog.
             */
            public Builder commitLog(String commitLog) {
                this.commitLog = commitLog;
                return this;
            }

            /**
             * CommitType.
             */
            public Builder commitType(String commitType) {
                this.commitType = commitType;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * MainModuleCommitId.
             */
            public Builder mainModuleCommitId(String mainModuleCommitId) {
                this.mainModuleCommitId = mainModuleCommitId;
                return this;
            }

            /**
             * MainModuleId.
             */
            public Builder mainModuleId(String mainModuleId) {
                this.mainModuleId = mainModuleId;
                return this;
            }

            /**
             * ModelDataPath.
             */
            public Builder modelDataPath(String modelDataPath) {
                this.modelDataPath = modelDataPath;
                return this;
            }

            /**
             * ModelDigest.
             */
            public Builder modelDigest(java.util.Map < String, String > modelDigest) {
                this.modelDigest = modelDigest;
                return this;
            }

            /**
             * ModelPack.
             */
            public Builder modelPack(java.util.List < ? > modelPack) {
                this.modelPack = modelPack;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * ModuleId.
             */
            public Builder moduleId(String moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * ResourceDataPath.
             */
            public Builder resourceDataPath(String resourceDataPath) {
                this.resourceDataPath = resourceDataPath;
                return this;
            }

            /**
             * ResourceDigest.
             */
            public Builder resourceDigest(java.util.Map < String, String > resourceDigest) {
                this.resourceDigest = resourceDigest;
                return this;
            }

            /**
             * ResourcePack.
             */
            public Builder resourcePack(java.util.List < java.util.Map<String, String>> resourcePack) {
                this.resourcePack = resourcePack;
                return this;
            }

            /**
             * RollbackToCommitId.
             */
            public Builder rollbackToCommitId(String rollbackToCommitId) {
                this.rollbackToCommitId = rollbackToCommitId;
                return this;
            }

            /**
             * RollbackType.
             */
            public Builder rollbackType(String rollbackType) {
                this.rollbackType = rollbackType;
                return this;
            }

            /**
             * SchemaVersion.
             */
            public Builder schemaVersion(String schemaVersion) {
                this.schemaVersion = schemaVersion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
