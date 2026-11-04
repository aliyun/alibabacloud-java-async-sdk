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
         * <p>The agent list.</p>
         */
        public Builder agents(java.util.List<Agents> agents) {
            this.agents = agents;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Set this parameter to an empty string for the first request. For subsequent requests, use the <code>nextToken</code> value from the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjIwfQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request trace ID, which is used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-xxxx-xxxx</p>
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
             * <p>The time when the instance was created, in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-01 10:00:00</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p><strong>The ID of the currently active credit package instance.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>cp-inst-001</p>
             */
            public Builder creditPackageId(String creditPackageId) {
                this.creditPackageId = creditPackageId;
                return this;
            }

            /**
             * <p>The time when the instance expires, in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-01 10:00:00</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>jvs-copilot.standard</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p><strong>The total number of credits.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder totalCredit(Long totalCredit) {
                this.totalCredit = totalCredit;
                return this;
            }

            /**
             * <p><strong>The number of credits used.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder usedCredit(Long usedCredit) {
                this.usedCredit = usedCredit;
                return this;
            }

            /**
             * <p><strong>The alert threshold percentage (0–100).</strong></p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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
