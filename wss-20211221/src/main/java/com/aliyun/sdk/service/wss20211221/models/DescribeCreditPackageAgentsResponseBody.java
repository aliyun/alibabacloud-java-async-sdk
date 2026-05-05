// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

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
 * {@link DescribeCreditPackageAgentsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCreditPackageAgentsResponseBody</p>
 */
public class DescribeCreditPackageAgentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Agents")
    private java.util.List<Agents> agents;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCreditPackageAgentsResponseBody(Builder builder) {
        this.agents = builder.agents;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCreditPackageAgentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agents
     */
    public java.util.List<Agents> getAgents() {
        return this.agents;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Agents> agents; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCreditPackageAgentsResponseBody model) {
            this.agents = model.agents;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * Agents.
         */
        public Builder agents(java.util.List<Agents> agents) {
            this.agents = agents;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCreditPackageAgentsResponseBody build() {
            return new DescribeCreditPackageAgentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCreditPackageAgentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCreditPackageAgentsResponseBody</p>
     */
    public static class Agents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("CreditPackageId")
        private String creditPackageId;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("TotalCredit")
        private Long totalCredit;

        @com.aliyun.core.annotation.NameInMap("UsedCredit")
        private Long usedCredit;

        @com.aliyun.core.annotation.NameInMap("WarnPercent")
        private Integer warnPercent;

        private Agents(Builder builder) {
            this.agentId = builder.agentId;
            this.createdTime = builder.createdTime;
            this.creditPackageId = builder.creditPackageId;
            this.expiredTime = builder.expiredTime;
            this.instanceType = builder.instanceType;
            this.totalCredit = builder.totalCredit;
            this.usedCredit = builder.usedCredit;
            this.warnPercent = builder.warnPercent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Agents create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return creditPackageId
         */
        public String getCreditPackageId() {
            return this.creditPackageId;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return totalCredit
         */
        public Long getTotalCredit() {
            return this.totalCredit;
        }

        /**
         * @return usedCredit
         */
        public Long getUsedCredit() {
            return this.usedCredit;
        }

        /**
         * @return warnPercent
         */
        public Integer getWarnPercent() {
            return this.warnPercent;
        }

        public static final class Builder {
            private String agentId; 
            private String createdTime; 
            private String creditPackageId; 
            private String expiredTime; 
            private String instanceType; 
            private Long totalCredit; 
            private Long usedCredit; 
            private Integer warnPercent; 

            private Builder() {
            } 

            private Builder(Agents model) {
                this.agentId = model.agentId;
                this.createdTime = model.createdTime;
                this.creditPackageId = model.creditPackageId;
                this.expiredTime = model.expiredTime;
                this.instanceType = model.instanceType;
                this.totalCredit = model.totalCredit;
                this.usedCredit = model.usedCredit;
                this.warnPercent = model.warnPercent;
            } 

            /**
             * <p>Agent ID</p>
             * 
             * <strong>example:</strong>
             * <p>agent-abc</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * CreditPackageId.
             */
            public Builder creditPackageId(String creditPackageId) {
                this.creditPackageId = creditPackageId;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * TotalCredit.
             */
            public Builder totalCredit(Long totalCredit) {
                this.totalCredit = totalCredit;
                return this;
            }

            /**
             * UsedCredit.
             */
            public Builder usedCredit(Long usedCredit) {
                this.usedCredit = usedCredit;
                return this;
            }

            /**
             * WarnPercent.
             */
            public Builder warnPercent(Integer warnPercent) {
                this.warnPercent = warnPercent;
                return this;
            }

            public Agents build() {
                return new Agents(this);
            } 

        } 

    }
}
