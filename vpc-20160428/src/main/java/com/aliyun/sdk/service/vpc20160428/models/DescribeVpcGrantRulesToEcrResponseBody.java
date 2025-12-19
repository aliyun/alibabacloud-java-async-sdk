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
         * <p>The authorization information.</p>
         */
        public Builder grantRuleModels(java.util.List<GrantRuleModels> grantRuleModels) {
            this.grantRuleModels = grantRuleModels;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, there is no next page.</li>
         * </ul>
         * <hr>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The unique ID that Alibaba Cloud generates for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>66342E8E-5E87-5FF9-80C7-C3E3571A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of instances queried. If you specify the MaxResults and NextToken request parameters to perform a paged query, the value of the TotalCount response parameter is invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
             * <p>The creation time in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-09T02:14:51Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ECR ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecr-tz7w3chlaptxr2****</p>
             */
            public Builder ecrId(String ecrId) {
                this.ecrId = ecrId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the ECR belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>192732132151****</p>
             */
            public Builder ecrOwnerId(Long ecrOwnerId) {
                this.ecrOwnerId = ecrOwnerId;
                return this;
            }

            /**
             * <p>The ID of the network instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-wz9ek66wd7tl5xqpy****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>192745367151****</p>
             */
            public Builder instanceUid(Long instanceUid) {
                this.instanceUid = instanceUid;
                return this;
            }

            /**
             * <p>The ID of the region where the instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The type of instance. Valid values:</p>
             * <ul>
             * <li><strong>VBR</strong>: queries the permissions that are granted to a VBR.</li>
             * <li><strong>VPC</strong>: queries the permissions that are granted from a VPC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
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
