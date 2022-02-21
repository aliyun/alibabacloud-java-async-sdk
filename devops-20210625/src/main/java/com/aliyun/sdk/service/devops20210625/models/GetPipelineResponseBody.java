// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineResponseBody} extends {@link TeaModel}
 *
 * <p>GetPipelineResponseBody</p>
 */
public class GetPipelineResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("pipeline")
    private Pipeline pipeline;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
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
         * 错误码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 流水线
         */
        public Builder pipeline(Pipeline pipeline) {
            this.pipeline = pipeline;
            return this;
        }

        /**
         * 请求id，每次请求都是唯一值，便于后续排查问题
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * true 接口调用成功，false 接口调用失败
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPipelineResponseBody build() {
            return new GetPipelineResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("branch")
        private String branch;

        @NameInMap("cloneDepth")
        private Long cloneDepth;

        @NameInMap("credentialId")
        private Long credentialId;

        @NameInMap("credentialLabel")
        private String credentialLabel;

        @NameInMap("credentialType")
        private String credentialType;

        @NameInMap("events")
        private java.util.List < String > events;

        @NameInMap("isBranchMode")
        private Boolean isBranchMode;

        @NameInMap("isCloneDepth")
        private Boolean isCloneDepth;

        @NameInMap("isSubmodule")
        private Boolean isSubmodule;

        @NameInMap("isTrigger")
        private Boolean isTrigger;

        @NameInMap("label")
        private String label;

        @NameInMap("namespace")
        private String namespace;

        @NameInMap("repo")
        private String repo;

        @NameInMap("serviceConnectionId")
        private Long serviceConnectionId;

        @NameInMap("triggerFilter")
        private String triggerFilter;

        @NameInMap("webhook")
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
        public java.util.List < String > getEvents() {
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
            private java.util.List < String > events; 
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
             * 分支
             */
            public Builder branch(String branch) {
                this.branch = branch;
                return this;
            }

            /**
             * 克隆深度
             */
            public Builder cloneDepth(Long cloneDepth) {
                this.cloneDepth = cloneDepth;
                return this;
            }

            /**
             * Credential Id
             */
            public Builder credentialId(Long credentialId) {
                this.credentialId = credentialId;
                return this;
            }

            /**
             * Credential Label
             */
            public Builder credentialLabel(String credentialLabel) {
                this.credentialLabel = credentialLabel;
                return this;
            }

            /**
             * Credential Type
             */
            public Builder credentialType(String credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * 触发事件
             */
            public Builder events(java.util.List < String > events) {
                this.events = events;
                return this;
            }

            /**
             * 是否分支模式
             */
            public Builder isBranchMode(Boolean isBranchMode) {
                this.isBranchMode = isBranchMode;
                return this;
            }

            /**
             * 是否设置clone深度
             */
            public Builder isCloneDepth(Boolean isCloneDepth) {
                this.isCloneDepth = isCloneDepth;
                return this;
            }

            /**
             * 是否子模块
             */
            public Builder isSubmodule(Boolean isSubmodule) {
                this.isSubmodule = isSubmodule;
                return this;
            }

            /**
             * 是否提交触发
             */
            public Builder isTrigger(Boolean isTrigger) {
                this.isTrigger = isTrigger;
                return this;
            }

            /**
             * 代码源显示标签
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * github命名空间
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * 代码库地址
             */
            public Builder repo(String repo) {
                this.repo = repo;
                return this;
            }

            /**
             * 服务连接Id
             */
            public Builder serviceConnectionId(Long serviceConnectionId) {
                this.serviceConnectionId = serviceConnectionId;
                return this;
            }

            /**
             * 触发过滤条件
             */
            public Builder triggerFilter(String triggerFilter) {
                this.triggerFilter = triggerFilter;
                return this;
            }

            /**
             * webhhook地址
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
    public static class Sources extends TeaModel {
        @NameInMap("data")
        private Data data;

        @NameInMap("sign")
        private String sign;

        @NameInMap("type")
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
             * 代码数据
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * 代码源唯一标识
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            /**
             * 代码源类型aliyunGit 阿里云代码库 customGitlab  自建git giteeGit 码云 codeup Codeup git 通用git gitlab gitlab bitbucket bitbucket githubOAuth github
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
    public static class PipelineConfig extends TeaModel {
        @NameInMap("flow")
        private String flow;

        @NameInMap("settings")
        private String settings;

        @NameInMap("sources")
        private java.util.List < Sources> sources;

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
        public java.util.List < Sources> getSources() {
            return this.sources;
        }

        public static final class Builder {
            private String flow; 
            private String settings; 
            private java.util.List < Sources> sources; 

            /**
             * 流水线配置信息
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * 流水线环境变量等
             */
            public Builder settings(String settings) {
                this.settings = settings;
                return this;
            }

            /**
             * 代码源
             */
            public Builder sources(java.util.List < Sources> sources) {
                this.sources = sources;
                return this;
            }

            public PipelineConfig build() {
                return new PipelineConfig(this);
            } 

        } 

    }
    public static class TagList extends TeaModel {
        @NameInMap("id")
        private Long id;

        @NameInMap("name")
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
             * 标签id
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 标签名称
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
    public static class Pipeline extends TeaModel {
        @NameInMap("createTime")
        private Long createTime;

        @NameInMap("creatorAccountId")
        private String creatorAccountId;

        @NameInMap("envId")
        private Integer envId;

        @NameInMap("envName")
        private String envName;

        @NameInMap("groupId")
        private Long groupId;

        @NameInMap("modifierAccountId")
        private String modifierAccountId;

        @NameInMap("name")
        private String name;

        @NameInMap("pipelineConfig")
        private PipelineConfig pipelineConfig;

        @NameInMap("tagList")
        private java.util.List < TagList> tagList;

        @NameInMap("updateTime")
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
        public java.util.List < TagList> getTagList() {
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
            private java.util.List < TagList> tagList; 
            private Long updateTime; 

            /**
             * 创建时间
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 创建者阿里云账号id
             */
            public Builder creatorAccountId(String creatorAccountId) {
                this.creatorAccountId = creatorAccountId;
                return this;
            }

            /**
             * 环境id 0 日常环境  1预发环境 2正式环境
             */
            public Builder envId(Integer envId) {
                this.envId = envId;
                return this;
            }

            /**
             * 环境名称
             */
            public Builder envName(String envName) {
                this.envName = envName;
                return this;
            }

            /**
             * 流水线分组id
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * 更新人阿里云账号id
             */
            public Builder modifierAccountId(String modifierAccountId) {
                this.modifierAccountId = modifierAccountId;
                return this;
            }

            /**
             * 流水线名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 流水线配置
             */
            public Builder pipelineConfig(PipelineConfig pipelineConfig) {
                this.pipelineConfig = pipelineConfig;
                return this;
            }

            /**
             * 标签
             */
            public Builder tagList(java.util.List < TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * 更新时间
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
