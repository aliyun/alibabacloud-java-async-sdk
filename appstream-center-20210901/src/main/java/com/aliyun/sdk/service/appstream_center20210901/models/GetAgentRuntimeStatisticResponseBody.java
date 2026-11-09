// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetAgentRuntimeStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentRuntimeStatisticResponseBody</p>
 */
public class GetAgentRuntimeStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private GetAgentRuntimeStatisticResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentRuntimeStatisticResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(GetAgentRuntimeStatisticResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of runtime statistics grouped by agent platform and agent provider. If AgentProvider is specified but no matching runtimes are found, a record with all statistical values set to 0 is returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID, which uniquely identifies the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of returned statistics records, which is the length of the Data list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetAgentRuntimeStatisticResponseBody build() {
            return new GetAgentRuntimeStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentRuntimeStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentRuntimeStatisticResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentDisplayName")
        private String agentDisplayName;

        @com.aliyun.core.annotation.NameInMap("AgentPlatform")
        private String agentPlatform;

        @com.aliyun.core.annotation.NameInMap("AgentProvider")
        private String agentProvider;

        @com.aliyun.core.annotation.NameInMap("ExpiredCount")
        private Integer expiredCount;

        @com.aliyun.core.annotation.NameInMap("NoChannelConfiguredRuntimeCount")
        private Integer noChannelConfiguredRuntimeCount;

        @com.aliyun.core.annotation.NameInMap("NoModelConfiguredRuntimeCount")
        private Integer noModelConfiguredRuntimeCount;

        @com.aliyun.core.annotation.NameInMap("RiskyRuntimeCount")
        private Integer riskyRuntimeCount;

        @com.aliyun.core.annotation.NameInMap("TotalRuntimeCount")
        private Integer totalRuntimeCount;

        private Data(Builder builder) {
            this.agentDisplayName = builder.agentDisplayName;
            this.agentPlatform = builder.agentPlatform;
            this.agentProvider = builder.agentProvider;
            this.expiredCount = builder.expiredCount;
            this.noChannelConfiguredRuntimeCount = builder.noChannelConfiguredRuntimeCount;
            this.noModelConfiguredRuntimeCount = builder.noModelConfiguredRuntimeCount;
            this.riskyRuntimeCount = builder.riskyRuntimeCount;
            this.totalRuntimeCount = builder.totalRuntimeCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentDisplayName
         */
        public String getAgentDisplayName() {
            return this.agentDisplayName;
        }

        /**
         * @return agentPlatform
         */
        public String getAgentPlatform() {
            return this.agentPlatform;
        }

        /**
         * @return agentProvider
         */
        public String getAgentProvider() {
            return this.agentProvider;
        }

        /**
         * @return expiredCount
         */
        public Integer getExpiredCount() {
            return this.expiredCount;
        }

        /**
         * @return noChannelConfiguredRuntimeCount
         */
        public Integer getNoChannelConfiguredRuntimeCount() {
            return this.noChannelConfiguredRuntimeCount;
        }

        /**
         * @return noModelConfiguredRuntimeCount
         */
        public Integer getNoModelConfiguredRuntimeCount() {
            return this.noModelConfiguredRuntimeCount;
        }

        /**
         * @return riskyRuntimeCount
         */
        public Integer getRiskyRuntimeCount() {
            return this.riskyRuntimeCount;
        }

        /**
         * @return totalRuntimeCount
         */
        public Integer getTotalRuntimeCount() {
            return this.totalRuntimeCount;
        }

        public static final class Builder {
            private String agentDisplayName; 
            private String agentPlatform; 
            private String agentProvider; 
            private Integer expiredCount; 
            private Integer noChannelConfiguredRuntimeCount; 
            private Integer noModelConfiguredRuntimeCount; 
            private Integer riskyRuntimeCount; 
            private Integer totalRuntimeCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentDisplayName = model.agentDisplayName;
                this.agentPlatform = model.agentPlatform;
                this.agentProvider = model.agentProvider;
                this.expiredCount = model.expiredCount;
                this.noChannelConfiguredRuntimeCount = model.noChannelConfiguredRuntimeCount;
                this.noModelConfiguredRuntimeCount = model.noModelConfiguredRuntimeCount;
                this.riskyRuntimeCount = model.riskyRuntimeCount;
                this.totalRuntimeCount = model.totalRuntimeCount;
            } 

            /**
             * <p>The agent display name, which is determined by both the agent platform and the agent provider. For example, OpenClaw under the ENTERPRISE platform is displayed as OpenClaw, and OpenClaw under the JVS platform is displayed as JVS Claw.</p>
             * 
             * <strong>example:</strong>
             * <p>Agentic Computer</p>
             */
            public Builder agentDisplayName(String agentDisplayName) {
                this.agentDisplayName = agentDisplayName;
                return this;
            }

            /**
             * <p>The agent platform, such as ENTERPRISE_AGENTIC_COMPUTER.</p>
             * 
             * <strong>example:</strong>
             * <p>ENTERPRISE_AGENTIC_COMPUTER</p>
             */
            public Builder agentPlatform(String agentPlatform) {
                this.agentPlatform = agentPlatform;
                return this;
            }

            /**
             * <p>The agent provider, such as AgenticComputer.</p>
             * 
             * <strong>example:</strong>
             * <p>AgenticComputer</p>
             */
            public Builder agentProvider(String agentProvider) {
                this.agentProvider = agentProvider;
                return this;
            }

            /**
             * <p>The number of expired runtime resources in the group. A runtime is counted as expired if its resource status is Expired or Ceased, case-insensitive.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder expiredCount(Integer expiredCount) {
                this.expiredCount = expiredCount;
                return this;
            }

            /**
             * <p>The number of runtime resources without channel configurations in the group, which is the total number of runtime resources minus the number of runtime resources with channel configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder noChannelConfiguredRuntimeCount(Integer noChannelConfiguredRuntimeCount) {
                this.noChannelConfiguredRuntimeCount = noChannelConfiguredRuntimeCount;
                return this;
            }

            /**
             * <p>The number of runtime resources without model configurations in the group. A runtime is considered to have a model configured if a model is configured for the runtime itself or its associated resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder noModelConfiguredRuntimeCount(Integer noModelConfiguredRuntimeCount) {
                this.noModelConfiguredRuntimeCount = noModelConfiguredRuntimeCount;
                return this;
            }

            /**
             * <p>The number of risky runtime resources in the group, deduplicated by runtime ID. A runtime is counted as risky if it has any of the following risks: model configuration modified, third-party channel configuration modified, or agent being uninstalled.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskyRuntimeCount(Integer riskyRuntimeCount) {
                this.riskyRuntimeCount = riskyRuntimeCount;
                return this;
            }

            /**
             * <p>The total number of runtime resources in the group, deduplicated by runtime ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalRuntimeCount(Integer totalRuntimeCount) {
                this.totalRuntimeCount = totalRuntimeCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
