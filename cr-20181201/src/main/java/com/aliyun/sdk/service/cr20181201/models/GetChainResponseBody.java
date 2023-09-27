// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChainResponseBody} extends {@link TeaModel}
 *
 * <p>GetChainResponseBody</p>
 */
public class GetChainResponseBody extends TeaModel {
    @NameInMap("ChainConfig")
    private ChainConfig chainConfig;

    @NameInMap("ChainId")
    private String chainId;

    @NameInMap("Code")
    private String code;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("ModifiedTime")
    private Long modifiedTime;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScopeExclude")
    private java.util.List < String > scopeExclude;

    @NameInMap("ScopeId")
    private String scopeId;

    @NameInMap("ScopeType")
    private String scopeType;

    private GetChainResponseBody(Builder builder) {
        this.chainConfig = builder.chainConfig;
        this.chainId = builder.chainId;
        this.code = builder.code;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.isSuccess = builder.isSuccess;
        this.modifiedTime = builder.modifiedTime;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.scopeExclude = builder.scopeExclude;
        this.scopeId = builder.scopeId;
        this.scopeType = builder.scopeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChainResponseBody create() {
        return builder().build();
    }

    /**
     * @return chainConfig
     */
    public ChainConfig getChainConfig() {
        return this.chainConfig;
    }

    /**
     * @return chainId
     */
    public String getChainId() {
        return this.chainId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return modifiedTime
     */
    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scopeExclude
     */
    public java.util.List < String > getScopeExclude() {
        return this.scopeExclude;
    }

    /**
     * @return scopeId
     */
    public String getScopeId() {
        return this.scopeId;
    }

    /**
     * @return scopeType
     */
    public String getScopeType() {
        return this.scopeType;
    }

    public static final class Builder {
        private ChainConfig chainConfig; 
        private String chainId; 
        private String code; 
        private Long createTime; 
        private String description; 
        private String instanceId; 
        private Boolean isSuccess; 
        private Long modifiedTime; 
        private String name; 
        private String requestId; 
        private java.util.List < String > scopeExclude; 
        private String scopeId; 
        private String scopeType; 

        /**
         * ChainConfig.
         */
        public Builder chainConfig(ChainConfig chainConfig) {
            this.chainConfig = chainConfig;
            return this;
        }

        /**
         * ChainId.
         */
        public Builder chainId(String chainId) {
            this.chainId = chainId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * ModifiedTime.
         */
        public Builder modifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScopeExclude.
         */
        public Builder scopeExclude(java.util.List < String > scopeExclude) {
            this.scopeExclude = scopeExclude;
            return this;
        }

        /**
         * ScopeId.
         */
        public Builder scopeId(String scopeId) {
            this.scopeId = scopeId;
            return this;
        }

        /**
         * ScopeType.
         */
        public Builder scopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }

        public GetChainResponseBody build() {
            return new GetChainResponseBody(this);
        } 

    } 

    public static class DenyPolicy extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("BaselineList")
        private String baselineList;

        @NameInMap("IssueCount")
        private String issueCount;

        @NameInMap("IssueLevel")
        private String issueLevel;

        @NameInMap("IssueList")
        private String issueList;

        @NameInMap("Logic")
        private String logic;

        @NameInMap("MaliciousList")
        private String maliciousList;

        private DenyPolicy(Builder builder) {
            this.action = builder.action;
            this.baselineList = builder.baselineList;
            this.issueCount = builder.issueCount;
            this.issueLevel = builder.issueLevel;
            this.issueList = builder.issueList;
            this.logic = builder.logic;
            this.maliciousList = builder.maliciousList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DenyPolicy create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return baselineList
         */
        public String getBaselineList() {
            return this.baselineList;
        }

        /**
         * @return issueCount
         */
        public String getIssueCount() {
            return this.issueCount;
        }

        /**
         * @return issueLevel
         */
        public String getIssueLevel() {
            return this.issueLevel;
        }

        /**
         * @return issueList
         */
        public String getIssueList() {
            return this.issueList;
        }

        /**
         * @return logic
         */
        public String getLogic() {
            return this.logic;
        }

        /**
         * @return maliciousList
         */
        public String getMaliciousList() {
            return this.maliciousList;
        }

        public static final class Builder {
            private String action; 
            private String baselineList; 
            private String issueCount; 
            private String issueLevel; 
            private String issueList; 
            private String logic; 
            private String maliciousList; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * BaselineList.
             */
            public Builder baselineList(String baselineList) {
                this.baselineList = baselineList;
                return this;
            }

            /**
             * IssueCount.
             */
            public Builder issueCount(String issueCount) {
                this.issueCount = issueCount;
                return this;
            }

            /**
             * IssueLevel.
             */
            public Builder issueLevel(String issueLevel) {
                this.issueLevel = issueLevel;
                return this;
            }

            /**
             * IssueList.
             */
            public Builder issueList(String issueList) {
                this.issueList = issueList;
                return this;
            }

            /**
             * Logic.
             */
            public Builder logic(String logic) {
                this.logic = logic;
                return this;
            }

            /**
             * MaliciousList.
             */
            public Builder maliciousList(String maliciousList) {
                this.maliciousList = maliciousList;
                return this;
            }

            public DenyPolicy build() {
                return new DenyPolicy(this);
            } 

        } 

    }
    public static class NodeConfig extends TeaModel {
        @NameInMap("DenyPolicy")
        private DenyPolicy denyPolicy;

        @NameInMap("Retry")
        private Integer retry;

        @NameInMap("ScanEngine")
        private String scanEngine;

        @NameInMap("Timeout")
        private Long timeout;

        private NodeConfig(Builder builder) {
            this.denyPolicy = builder.denyPolicy;
            this.retry = builder.retry;
            this.scanEngine = builder.scanEngine;
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeConfig create() {
            return builder().build();
        }

        /**
         * @return denyPolicy
         */
        public DenyPolicy getDenyPolicy() {
            return this.denyPolicy;
        }

        /**
         * @return retry
         */
        public Integer getRetry() {
            return this.retry;
        }

        /**
         * @return scanEngine
         */
        public String getScanEngine() {
            return this.scanEngine;
        }

        /**
         * @return timeout
         */
        public Long getTimeout() {
            return this.timeout;
        }

        public static final class Builder {
            private DenyPolicy denyPolicy; 
            private Integer retry; 
            private String scanEngine; 
            private Long timeout; 

            /**
             * DenyPolicy.
             */
            public Builder denyPolicy(DenyPolicy denyPolicy) {
                this.denyPolicy = denyPolicy;
                return this;
            }

            /**
             * Retry.
             */
            public Builder retry(Integer retry) {
                this.retry = retry;
                return this;
            }

            /**
             * ScanEngine.
             */
            public Builder scanEngine(String scanEngine) {
                this.scanEngine = scanEngine;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            public NodeConfig build() {
                return new NodeConfig(this);
            } 

        } 

    }
    public static class Nodes extends TeaModel {
        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("NodeConfig")
        private NodeConfig nodeConfig;

        @NameInMap("NodeName")
        private String nodeName;

        private Nodes(Builder builder) {
            this.enable = builder.enable;
            this.nodeConfig = builder.nodeConfig;
            this.nodeName = builder.nodeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return nodeConfig
         */
        public NodeConfig getNodeConfig() {
            return this.nodeConfig;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        public static final class Builder {
            private Boolean enable; 
            private NodeConfig nodeConfig; 
            private String nodeName; 

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * NodeConfig.
             */
            public Builder nodeConfig(NodeConfig nodeConfig) {
                this.nodeConfig = nodeConfig;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    public static class From extends TeaModel {
        @NameInMap("NodeName")
        private String nodeName;

        private From(Builder builder) {
            this.nodeName = builder.nodeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static From create() {
            return builder().build();
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        public static final class Builder {
            private String nodeName; 

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            public From build() {
                return new From(this);
            } 

        } 

    }
    public static class To extends TeaModel {
        @NameInMap("NodeName")
        private String nodeName;

        private To(Builder builder) {
            this.nodeName = builder.nodeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static To create() {
            return builder().build();
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        public static final class Builder {
            private String nodeName; 

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            public To build() {
                return new To(this);
            } 

        } 

    }
    public static class Routers extends TeaModel {
        @NameInMap("From")
        private From from;

        @NameInMap("To")
        private To to;

        private Routers(Builder builder) {
            this.from = builder.from;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Routers create() {
            return builder().build();
        }

        /**
         * @return from
         */
        public From getFrom() {
            return this.from;
        }

        /**
         * @return to
         */
        public To getTo() {
            return this.to;
        }

        public static final class Builder {
            private From from; 
            private To to; 

            /**
             * From.
             */
            public Builder from(From from) {
                this.from = from;
                return this;
            }

            /**
             * To.
             */
            public Builder to(To to) {
                this.to = to;
                return this;
            }

            public Routers build() {
                return new Routers(this);
            } 

        } 

    }
    public static class ChainConfig extends TeaModel {
        @NameInMap("ChainConfigId")
        private String chainConfigId;

        @NameInMap("IsActive")
        private Boolean isActive;

        @NameInMap("Nodes")
        private java.util.List < Nodes> nodes;

        @NameInMap("Routers")
        private java.util.List < Routers> routers;

        @NameInMap("Version")
        private String version;

        private ChainConfig(Builder builder) {
            this.chainConfigId = builder.chainConfigId;
            this.isActive = builder.isActive;
            this.nodes = builder.nodes;
            this.routers = builder.routers;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChainConfig create() {
            return builder().build();
        }

        /**
         * @return chainConfigId
         */
        public String getChainConfigId() {
            return this.chainConfigId;
        }

        /**
         * @return isActive
         */
        public Boolean getIsActive() {
            return this.isActive;
        }

        /**
         * @return nodes
         */
        public java.util.List < Nodes> getNodes() {
            return this.nodes;
        }

        /**
         * @return routers
         */
        public java.util.List < Routers> getRouters() {
            return this.routers;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String chainConfigId; 
            private Boolean isActive; 
            private java.util.List < Nodes> nodes; 
            private java.util.List < Routers> routers; 
            private String version; 

            /**
             * ChainConfigId.
             */
            public Builder chainConfigId(String chainConfigId) {
                this.chainConfigId = chainConfigId;
                return this;
            }

            /**
             * IsActive.
             */
            public Builder isActive(Boolean isActive) {
                this.isActive = isActive;
                return this;
            }

            /**
             * Nodes.
             */
            public Builder nodes(java.util.List < Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * Routers.
             */
            public Builder routers(java.util.List < Routers> routers) {
                this.routers = routers;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ChainConfig build() {
                return new ChainConfig(this);
            } 

        } 

    }
}
