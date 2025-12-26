// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
 * {@link Flow} extends {@link TeaModel}
 *
 * <p>Flow</p>
 */
public class Flow extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.NameInMap("CodeModeRunInfo")
    private String codeModeRunInfo;

    @com.aliyun.core.annotation.NameInMap("CreateFrom")
    private String createFrom;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("FlowId")
    private String flowId;

    @com.aliyun.core.annotation.NameInMap("FlowName")
    private String flowName;

    @com.aliyun.core.annotation.NameInMap("FlowStoragePath")
    private String flowStoragePath;

    @com.aliyun.core.annotation.NameInMap("FlowTemplateId")
    private String flowTemplateId;

    @com.aliyun.core.annotation.NameInMap("FlowType")
    private String flowType;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Runtime")
    private Runtime runtime;

    @com.aliyun.core.annotation.NameInMap("RuntimeId")
    private String runtimeId;

    @com.aliyun.core.annotation.NameInMap("SourceUri")
    private String sourceUri;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    @com.aliyun.core.annotation.NameInMap("WorkDir")
    private String workDir;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private Flow(Builder builder) {
        this.accessibility = builder.accessibility;
        this.codeModeRunInfo = builder.codeModeRunInfo;
        this.createFrom = builder.createFrom;
        this.creator = builder.creator;
        this.description = builder.description;
        this.flowId = builder.flowId;
        this.flowName = builder.flowName;
        this.flowStoragePath = builder.flowStoragePath;
        this.flowTemplateId = builder.flowTemplateId;
        this.flowType = builder.flowType;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.runtime = builder.runtime;
        this.runtimeId = builder.runtimeId;
        this.sourceUri = builder.sourceUri;
        this.version = builder.version;
        this.workDir = builder.workDir;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Flow create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return codeModeRunInfo
     */
    public String getCodeModeRunInfo() {
        return this.codeModeRunInfo;
    }

    /**
     * @return createFrom
     */
    public String getCreateFrom() {
        return this.createFrom;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return flowStoragePath
     */
    public String getFlowStoragePath() {
        return this.flowStoragePath;
    }

    /**
     * @return flowTemplateId
     */
    public String getFlowTemplateId() {
        return this.flowTemplateId;
    }

    /**
     * @return flowType
     */
    public String getFlowType() {
        return this.flowType;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return runtime
     */
    public Runtime getRuntime() {
        return this.runtime;
    }

    /**
     * @return runtimeId
     */
    public String getRuntimeId() {
        return this.runtimeId;
    }

    /**
     * @return sourceUri
     */
    public String getSourceUri() {
        return this.sourceUri;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return workDir
     */
    public String getWorkDir() {
        return this.workDir;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String accessibility; 
        private String codeModeRunInfo; 
        private String createFrom; 
        private String creator; 
        private String description; 
        private String flowId; 
        private String flowName; 
        private String flowStoragePath; 
        private String flowTemplateId; 
        private String flowType; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private Runtime runtime; 
        private String runtimeId; 
        private String sourceUri; 
        private String version; 
        private String workDir; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(Flow model) {
            this.accessibility = model.accessibility;
            this.codeModeRunInfo = model.codeModeRunInfo;
            this.createFrom = model.createFrom;
            this.creator = model.creator;
            this.description = model.description;
            this.flowId = model.flowId;
            this.flowName = model.flowName;
            this.flowStoragePath = model.flowStoragePath;
            this.flowTemplateId = model.flowTemplateId;
            this.flowType = model.flowType;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.runtime = model.runtime;
            this.runtimeId = model.runtimeId;
            this.sourceUri = model.sourceUri;
            this.version = model.version;
            this.workDir = model.workDir;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * CodeModeRunInfo.
         */
        public Builder codeModeRunInfo(String codeModeRunInfo) {
            this.codeModeRunInfo = codeModeRunInfo;
            return this;
        }

        /**
         * CreateFrom.
         */
        public Builder createFrom(String createFrom) {
            this.createFrom = createFrom;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * FlowId.
         */
        public Builder flowId(String flowId) {
            this.flowId = flowId;
            return this;
        }

        /**
         * FlowName.
         */
        public Builder flowName(String flowName) {
            this.flowName = flowName;
            return this;
        }

        /**
         * FlowStoragePath.
         */
        public Builder flowStoragePath(String flowStoragePath) {
            this.flowStoragePath = flowStoragePath;
            return this;
        }

        /**
         * FlowTemplateId.
         */
        public Builder flowTemplateId(String flowTemplateId) {
            this.flowTemplateId = flowTemplateId;
            return this;
        }

        /**
         * FlowType.
         */
        public Builder flowType(String flowType) {
            this.flowType = flowType;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * Runtime.
         */
        public Builder runtime(Runtime runtime) {
            this.runtime = runtime;
            return this;
        }

        /**
         * RuntimeId.
         */
        public Builder runtimeId(String runtimeId) {
            this.runtimeId = runtimeId;
            return this;
        }

        /**
         * SourceUri.
         */
        public Builder sourceUri(String sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * WorkDir.
         */
        public Builder workDir(String workDir) {
            this.workDir = workDir;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public Flow build() {
            return new Flow(this);
        } 

    } 

    /**
     * 
     * {@link Flow} extends {@link TeaModel}
     *
     * <p>Flow</p>
     */
    public static class Runtime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuntimeId")
        private String runtimeId;

        @com.aliyun.core.annotation.NameInMap("RuntimeName")
        private String runtimeName;

        @com.aliyun.core.annotation.NameInMap("RuntimeStatus")
        private String runtimeStatus;

        @com.aliyun.core.annotation.NameInMap("RuntimeType")
        private String runtimeType;

        @com.aliyun.core.annotation.NameInMap("SupportSSEStream")
        private Boolean supportSSEStream;

        private Runtime(Builder builder) {
            this.runtimeId = builder.runtimeId;
            this.runtimeName = builder.runtimeName;
            this.runtimeStatus = builder.runtimeStatus;
            this.runtimeType = builder.runtimeType;
            this.supportSSEStream = builder.supportSSEStream;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Runtime create() {
            return builder().build();
        }

        /**
         * @return runtimeId
         */
        public String getRuntimeId() {
            return this.runtimeId;
        }

        /**
         * @return runtimeName
         */
        public String getRuntimeName() {
            return this.runtimeName;
        }

        /**
         * @return runtimeStatus
         */
        public String getRuntimeStatus() {
            return this.runtimeStatus;
        }

        /**
         * @return runtimeType
         */
        public String getRuntimeType() {
            return this.runtimeType;
        }

        /**
         * @return supportSSEStream
         */
        public Boolean getSupportSSEStream() {
            return this.supportSSEStream;
        }

        public static final class Builder {
            private String runtimeId; 
            private String runtimeName; 
            private String runtimeStatus; 
            private String runtimeType; 
            private Boolean supportSSEStream; 

            private Builder() {
            } 

            private Builder(Runtime model) {
                this.runtimeId = model.runtimeId;
                this.runtimeName = model.runtimeName;
                this.runtimeStatus = model.runtimeStatus;
                this.runtimeType = model.runtimeType;
                this.supportSSEStream = model.supportSSEStream;
            } 

            /**
             * <p>运行时ID</p>
             */
            public Builder runtimeId(String runtimeId) {
                this.runtimeId = runtimeId;
                return this;
            }

            /**
             * <p>运行时名称</p>
             */
            public Builder runtimeName(String runtimeName) {
                this.runtimeName = runtimeName;
                return this;
            }

            /**
             * <p>运行时状态</p>
             */
            public Builder runtimeStatus(String runtimeStatus) {
                this.runtimeStatus = runtimeStatus;
                return this;
            }

            /**
             * <p>运行时类型</p>
             */
            public Builder runtimeType(String runtimeType) {
                this.runtimeType = runtimeType;
                return this;
            }

            /**
             * <p>是否支持SSE</p>
             */
            public Builder supportSSEStream(Boolean supportSSEStream) {
                this.supportSSEStream = supportSSEStream;
                return this;
            }

            public Runtime build() {
                return new Runtime(this);
            } 

        } 

    }
}
