// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeVpcGrantRulesToEcrResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcGrantRulesToEcrResponseBody</p>
 */
public class DescribeVpcGrantRulesToEcrResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GrantRuleModels")
    private java.util.List<GrantRuleModels> grantRuleModels;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeVpcGrantRulesToEcrResponseBody(Builder builder) {
        this.grantRuleModels = builder.grantRuleModels;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcGrantRulesToEcrResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return grantRuleModels
     */
    public java.util.List<GrantRuleModels> getGrantRuleModels() {
        return this.grantRuleModels;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<GrantRuleModels> grantRuleModels; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeVpcGrantRulesToEcrResponseBody model) {
            this.grantRuleModels = model.grantRuleModels;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * GrantRuleModels.
         */
        public Builder grantRuleModels(java.util.List<GrantRuleModels> grantRuleModels) {
            this.grantRuleModels = grantRuleModels;
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
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeVpcGrantRulesToEcrResponseBody build() {
            return new DescribeVpcGrantRulesToEcrResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcGrantRulesToEcrResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcGrantRulesToEcrResponseBody</p>
     */
    public static class GrantRuleModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("EcrId")
        private String ecrId;

        @com.aliyun.core.annotation.NameInMap("EcrOwnerId")
        private Long ecrOwnerId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceUid")
        private Long instanceUid;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private GrantRuleModels(Builder builder) {
            this.creationTime = builder.creationTime;
            this.ecrId = builder.ecrId;
            this.ecrOwnerId = builder.ecrOwnerId;
            this.instanceId = builder.instanceId;
            this.instanceUid = builder.instanceUid;
            this.regionNo = builder.regionNo;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GrantRuleModels create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return ecrId
         */
        public String getEcrId() {
            return this.ecrId;
        }

        /**
         * @return ecrOwnerId
         */
        public Long getEcrOwnerId() {
            return this.ecrOwnerId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceUid
         */
        public Long getInstanceUid() {
            return this.instanceUid;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String creationTime; 
            private String ecrId; 
            private Long ecrOwnerId; 
            private String instanceId; 
            private Long instanceUid; 
            private String regionNo; 
            private String type; 

            private Builder() {
            } 

            private Builder(GrantRuleModels model) {
                this.creationTime = model.creationTime;
                this.ecrId = model.ecrId;
                this.ecrOwnerId = model.ecrOwnerId;
                this.instanceId = model.instanceId;
                this.instanceUid = model.instanceUid;
                this.regionNo = model.regionNo;
                this.type = model.type;
            } 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * EcrId.
             */
            public Builder ecrId(String ecrId) {
                this.ecrId = ecrId;
                return this;
            }

            /**
             * EcrOwnerId.
             */
            public Builder ecrOwnerId(Long ecrOwnerId) {
                this.ecrOwnerId = ecrOwnerId;
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
             * InstanceUid.
             */
            public Builder instanceUid(Long instanceUid) {
                this.instanceUid = instanceUid;
                return this;
            }

            /**
             * RegionNo.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public GrantRuleModels build() {
                return new GrantRuleModels(this);
            } 

        } 

    }
}
