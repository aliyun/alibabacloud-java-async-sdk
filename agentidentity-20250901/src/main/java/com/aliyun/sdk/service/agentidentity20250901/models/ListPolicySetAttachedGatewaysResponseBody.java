// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link ListPolicySetAttachedGatewaysResponseBody} extends {@link TeaModel}
 *
 * <p>ListPolicySetAttachedGatewaysResponseBody</p>
 */
public class ListPolicySetAttachedGatewaysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttachedGateways")
    private java.util.List<AttachedGateways> attachedGateways;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListPolicySetAttachedGatewaysResponseBody(Builder builder) {
        this.attachedGateways = builder.attachedGateways;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicySetAttachedGatewaysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachedGateways
     */
    public java.util.List<AttachedGateways> getAttachedGateways() {
        return this.attachedGateways;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AttachedGateways> attachedGateways; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListPolicySetAttachedGatewaysResponseBody model) {
            this.attachedGateways = model.attachedGateways;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * AttachedGateways.
         */
        public Builder attachedGateways(java.util.List<AttachedGateways> attachedGateways) {
            this.attachedGateways = attachedGateways;
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPolicySetAttachedGatewaysResponseBody build() {
            return new ListPolicySetAttachedGatewaysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPolicySetAttachedGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>ListPolicySetAttachedGatewaysResponseBody</p>
     */
    public static class AttachedGateways extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachedPolicySetName")
        private String attachedPolicySetName;

        @com.aliyun.core.annotation.NameInMap("AttachedTime")
        private String attachedTime;

        @com.aliyun.core.annotation.NameInMap("EnforcementMode")
        private String enforcementMode;

        @com.aliyun.core.annotation.NameInMap("GatewayArn")
        private String gatewayArn;

        @com.aliyun.core.annotation.NameInMap("GatewayType")
        private String gatewayType;

        private AttachedGateways(Builder builder) {
            this.attachedPolicySetName = builder.attachedPolicySetName;
            this.attachedTime = builder.attachedTime;
            this.enforcementMode = builder.enforcementMode;
            this.gatewayArn = builder.gatewayArn;
            this.gatewayType = builder.gatewayType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttachedGateways create() {
            return builder().build();
        }

        /**
         * @return attachedPolicySetName
         */
        public String getAttachedPolicySetName() {
            return this.attachedPolicySetName;
        }

        /**
         * @return attachedTime
         */
        public String getAttachedTime() {
            return this.attachedTime;
        }

        /**
         * @return enforcementMode
         */
        public String getEnforcementMode() {
            return this.enforcementMode;
        }

        /**
         * @return gatewayArn
         */
        public String getGatewayArn() {
            return this.gatewayArn;
        }

        /**
         * @return gatewayType
         */
        public String getGatewayType() {
            return this.gatewayType;
        }

        public static final class Builder {
            private String attachedPolicySetName; 
            private String attachedTime; 
            private String enforcementMode; 
            private String gatewayArn; 
            private String gatewayType; 

            private Builder() {
            } 

            private Builder(AttachedGateways model) {
                this.attachedPolicySetName = model.attachedPolicySetName;
                this.attachedTime = model.attachedTime;
                this.enforcementMode = model.enforcementMode;
                this.gatewayArn = model.gatewayArn;
                this.gatewayType = model.gatewayType;
            } 

            /**
             * AttachedPolicySetName.
             */
            public Builder attachedPolicySetName(String attachedPolicySetName) {
                this.attachedPolicySetName = attachedPolicySetName;
                return this;
            }

            /**
             * AttachedTime.
             */
            public Builder attachedTime(String attachedTime) {
                this.attachedTime = attachedTime;
                return this;
            }

            /**
             * EnforcementMode.
             */
            public Builder enforcementMode(String enforcementMode) {
                this.enforcementMode = enforcementMode;
                return this;
            }

            /**
             * GatewayArn.
             */
            public Builder gatewayArn(String gatewayArn) {
                this.gatewayArn = gatewayArn;
                return this;
            }

            /**
             * GatewayType.
             */
            public Builder gatewayType(String gatewayType) {
                this.gatewayType = gatewayType;
                return this;
            }

            public AttachedGateways build() {
                return new AttachedGateways(this);
            } 

        } 

    }
}
