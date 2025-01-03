// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link GetPipelineResponseBody} extends {@link TeaModel}
 *
 * <p>GetPipelineResponseBody</p>
 */
public class GetPipelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("pipeline")
    private Pipeline pipeline;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetPipelineResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.pipeline = builder.pipeline;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return pipeline
     */
    public Pipeline getPipeline() {
        return this.pipeline;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private Pipeline pipeline; 
        private String requestId; 
        private Boolean success; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * pipeline.
         */
        public Builder pipeline(Pipeline pipeline) {
            this.pipeline = pipeline;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPipelineResponseBody build() {
            return new GetPipelineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("branch")
        private String branch;

        @com.aliyun.core.annotation.NameInMap("cloneDepth")
        private Long cloneDepth;

        @com.aliyun.core.annotation.NameInMap("credentialId")
        private Long credentialId;

        @com.aliyun.core.annotation.NameInMap("credentialLabel")
        private String credentialLabel;

        @com.aliyun.core.annotation.NameInMap("credentialType")
        private String credentialType;

        @com.aliyun.core.annotation.NameInMap("events")
        private java.util.List<String> events;

        @com.aliyun.core.annotation.NameInMap("isBranchMode")
        private Boolean isBranchMode;

        @com.aliyun.core.annotation.NameInMap("isCloneDepth")
        private Boolean isCloneDepth;

        @com.aliyun.core.annotation.NameInMap("isSubmodule")
        private Boolean isSubmodule;

        @com.aliyun.core.annotation.NameInMap("isTrigger")
        private Boolean isTrigger;

        @com.aliyun.core.annotation.NameInMap("label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("repo")
        private String repo;

        @com.aliyun.core.annotation.NameInMap("serviceConnectionId")
        private Long serviceConnectionId;

        @com.aliyun.core.annotation.NameInMap("triggerFilter")
        private String triggerFilter;

        @com.aliyun.core.annotation.NameInMap("webhook")
        private String webhook;

        private Data(Builder builder) {
            this.branch = builder.branch;
            this.cloneDepth = builder.cloneDepth;
            this.credentialId = builder.credentialId;
            this.credentialLabel = builder.credentialLabel;
            this.credentialType = builder.credentialType;
            this.events = builder.events;
            this.isBranchMode = builder.isBranchMode;
            this.isCloneDepth = builder.isCloneDepth;
            this.isSubmodule = builder.isSubmodule;
            this.isTrigger = builder.isTrigger;
            this.label = builder.label;
            this.namespace = builder.namespace;
            this.repo = builder.repo;
            this.serviceConnectionId = builder.serviceConnectionId;
            this.triggerFilter = builder.triggerFilter;
            this.webhook = builder.webhook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return branch
         */
        public String getBranch() {
            return this.branch;
        }

        /**
         * @return cloneDepth
         */
        public Long getCloneDepth() {
            return this.cloneDepth;
        }

        /**
         * @return credentialId
         */
        public Long getCredentialId() {
            return this.credentialId;
        }

        /**
         * @return credentialLabel
         */
        public String getCredentialLabel() {
            return this.credentialLabel;
        }

        /**
         * @return credentialType
         */
        public String getCredentialType() {
            return this.credentialType;
        }

        /**
         * @return events
         */
        public java.util.List<String> getEvents() {
            return this.events;
        }

        /**
         * @return isBranchMode
         */
        public Boolean getIsBranchMode() {
            return this.isBranchMode;
        }

        /**
         * @return isCloneDepth
         */
        public Boolean getIsCloneDepth() {
            return this.isCloneDepth;
        }

        /**
         * @return isSubmodule
         */
        public Boolean getIsSubmodule() {
            return this.isSubmodule;
        }

        /**
         * @return isTrigger
         */
        public Boolean getIsTrigger() {
            return this.isTrigger;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return repo
         */
        public String getRepo() {
            return this.repo;
        }

        /**
         * @return serviceConnectionId
         */
        public Long getServiceConnectionId() {
            return this.serviceConnectionId;
        }

        /**
         * @return triggerFilter
         */
        public String getTriggerFilter() {
            return this.triggerFilter;
        }

        /**
         * @return webhook
         */
        public String getWebhook() {
            return this.webhook;
        }

        public static final class Builder {
            private String branch; 
            private Long cloneDepth; 
            private Long credentialId; 
            private String credentialLabel; 
            private String credentialType; 
            private java.util.List<String> events; 
            private Boolean isBranchMode; 
            private Boolean isCloneDepth; 
            private Boolean isSubmodule; 
            private Boolean isTrigger; 
            private String label; 
            private String namespace; 
            private String repo; 
            private Long serviceConnectionId; 
            private String triggerFilter; 
            private String webhook; 

            /**
             * branch.
             */
            public Builder branch(String branch) {
                this.branch = branch;
                return this;
            }

            /**
             * cloneDepth.
             */
            public Builder cloneDepth(Long cloneDepth) {
                this.cloneDepth = cloneDepth;
                return this;
            }

            /**
             * <p>Credential Id</p>
             * 
             * <strong>example:</strong>
             * <p>222</p>
             */
            public Builder credentialId(Long credentialId) {
                this.credentialId = credentialId;
                return this;
            }

            /**
             * <p>Credential Label</p>
             * 
             * <strong>example:</strong>
             * <p>企业公钥</p>
             */
            public Builder credentialLabel(String credentialLabel) {
                this.credentialLabel = credentialLabel;
                return this;
            }

            /**
             * <p>Credential Type</p>
             * 
             * <strong>example:</strong>
             * <p>region-ssh</p>
             */
            public Builder credentialType(String credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * events.
             */
            public Builder events(java.util.List<String> events) {
                this.events = events;
                return this;
            }

            /**
             * isBranchMode.
             */
            public Builder isBranchMode(Boolean isBranchMode) {
                this.isBranchMode = isBranchMode;
                return this;
            }

            /**
             * isCloneDepth.
             */
            public Builder isCloneDepth(Boolean isCloneDepth) {
                this.isCloneDepth = isCloneDepth;
                return this;
            }

            /**
             * isSubmodule.
             */
            public Builder isSubmodule(Boolean isSubmodule) {
                this.isSubmodule = isSubmodule;
                return this;
            }

            /**
             * isTrigger.
             */
            public Builder isTrigger(Boolean isTrigger) {
                this.isTrigger = isTrigger;
                return this;
            }

            /**
             * label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * repo.
             */
            public Builder repo(String repo) {
                this.repo = repo;
                return this;
            }

            /**
             * serviceConnectionId.
             */
            public Builder serviceConnectionId(Long serviceConnectionId) {
                this.serviceConnectionId = serviceConnectionId;
                return this;
            }

            /**
             * triggerFilter.
             */
            public Builder triggerFilter(String triggerFilter) {
                this.triggerFilter = triggerFilter;
                return this;
            }

            /**
             * webhook.
             */
            public Builder webhook(String webhook) {
                this.webhook = webhook;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineResponseBody</p>
     */
    public static class Sources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("sign")
        private String sign;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Sources(Builder builder) {
            this.data = builder.data;
            this.sign = builder.sign;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sources create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Data data; 
            private String sign; 
            private String type; 

            /**
             * data.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * sign.
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Sources build() {
                return new Sources(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineResponseBody</p>
     */
    public static class PipelineConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flow")
        private String flow;

        @com.aliyun.core.annotation.NameInMap("settings")
        private String settings;

        @com.aliyun.core.annotation.NameInMap("sources")
        private java.util.List<Sources> sources;

        private PipelineConfig(Builder builder) {
            this.flow = builder.flow;
            this.settings = builder.settings;
            this.sources = builder.sources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PipelineConfig create() {
            return builder().build();
        }

        /**
         * @return flow
         */
        public String getFlow() {
            return this.flow;
        }

        /**
         * @return settings
         */
        public String getSettings() {
            return this.settings;
        }

        /**
         * @return sources
         */
        public java.util.List<Sources> getSources() {
            return this.sources;
        }

        public static final class Builder {
            private String flow; 
            private String settings; 
            private java.util.List<Sources> sources; 

            /**
             * flow.
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * settings.
             */
            public Builder settings(String settings) {
                this.settings = settings;
                return this;
            }

            /**
             * sources.
             */
            public Builder sources(java.util.List<Sources> sources) {
                this.sources = sources;
                return this;
            }

            public PipelineConfig build() {
                return new PipelineConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineResponseBody</p>
     */
    public static class TagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private TagList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private String name; 

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public TagList build() {
                return new TagList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineResponseBody</p>
     */
    public static class Pipeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("creatorAccountId")
        private String creatorAccountId;

        @com.aliyun.core.annotation.NameInMap("envId")
        private Integer envId;

        @com.aliyun.core.annotation.NameInMap("envName")
        private String envName;

        @com.aliyun.core.annotation.NameInMap("groupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("modifierAccountId")
        private String modifierAccountId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("pipelineConfig")
        private PipelineConfig pipelineConfig;

        @com.aliyun.core.annotation.NameInMap("tagList")
        private java.util.List<TagList> tagList;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private Long updateTime;

        private Pipeline(Builder builder) {
            this.createTime = builder.createTime;
            this.creatorAccountId = builder.creatorAccountId;
            this.envId = builder.envId;
            this.envName = builder.envName;
            this.groupId = builder.groupId;
            this.modifierAccountId = builder.modifierAccountId;
            this.name = builder.name;
            this.pipelineConfig = builder.pipelineConfig;
            this.tagList = builder.tagList;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pipeline create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorAccountId
         */
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        /**
         * @return envId
         */
        public Integer getEnvId() {
            return this.envId;
        }

        /**
         * @return envName
         */
        public String getEnvName() {
            return this.envName;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return modifierAccountId
         */
        public String getModifierAccountId() {
            return this.modifierAccountId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pipelineConfig
         */
        public PipelineConfig getPipelineConfig() {
            return this.pipelineConfig;
        }

        /**
         * @return tagList
         */
        public java.util.List<TagList> getTagList() {
            return this.tagList;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private String creatorAccountId; 
            private Integer envId; 
            private String envName; 
            private Long groupId; 
            private String modifierAccountId; 
            private String name; 
            private PipelineConfig pipelineConfig; 
            private java.util.List<TagList> tagList; 
            private Long updateTime; 

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * creatorAccountId.
             */
            public Builder creatorAccountId(String creatorAccountId) {
                this.creatorAccountId = creatorAccountId;
                return this;
            }

            /**
             * envId.
             */
            public Builder envId(Integer envId) {
                this.envId = envId;
                return this;
            }

            /**
             * envName.
             */
            public Builder envName(String envName) {
                this.envName = envName;
                return this;
            }

            /**
             * groupId.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * modifierAccountId.
             */
            public Builder modifierAccountId(String modifierAccountId) {
                this.modifierAccountId = modifierAccountId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * pipelineConfig.
             */
            public Builder pipelineConfig(PipelineConfig pipelineConfig) {
                this.pipelineConfig = pipelineConfig;
                return this;
            }

            /**
             * tagList.
             */
            public Builder tagList(java.util.List<TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Pipeline build() {
                return new Pipeline(this);
            } 

        } 

    }
}
