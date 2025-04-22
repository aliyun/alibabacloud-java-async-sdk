// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

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
 * {@link ListAccessRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccessRulesResponseBody</p>
 */
public class ListAccessRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessRules")
    private java.util.List<AccessRules> accessRules;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAccessRulesResponseBody(Builder builder) {
        this.accessRules = builder.accessRules;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessRules
     */
    public java.util.List<AccessRules> getAccessRules() {
        return this.accessRules;
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
        private java.util.List<AccessRules> accessRules; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListAccessRulesResponseBody model) {
            this.accessRules = model.accessRules;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * AccessRules.
         */
        public Builder accessRules(java.util.List<AccessRules> accessRules) {
            this.accessRules = accessRules;
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

        public ListAccessRulesResponseBody build() {
            return new ListAccessRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAccessRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccessRulesResponseBody</p>
     */
    public static class AccessRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessGroupId")
        private String accessGroupId;

        @com.aliyun.core.annotation.NameInMap("AccessRuleId")
        private String accessRuleId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("NetworkSegment")
        private String networkSegment;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("RWAccessType")
        private String RWAccessType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private AccessRules(Builder builder) {
            this.accessGroupId = builder.accessGroupId;
            this.accessRuleId = builder.accessRuleId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.networkSegment = builder.networkSegment;
            this.priority = builder.priority;
            this.RWAccessType = builder.RWAccessType;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessRules create() {
            return builder().build();
        }

        /**
         * @return accessGroupId
         */
        public String getAccessGroupId() {
            return this.accessGroupId;
        }

        /**
         * @return accessRuleId
         */
        public String getAccessRuleId() {
            return this.accessRuleId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return networkSegment
         */
        public String getNetworkSegment() {
            return this.networkSegment;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return RWAccessType
         */
        public String getRWAccessType() {
            return this.RWAccessType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String accessGroupId; 
            private String accessRuleId; 
            private String createTime; 
            private String description; 
            private String networkSegment; 
            private Integer priority; 
            private String RWAccessType; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(AccessRules model) {
                this.accessGroupId = model.accessGroupId;
                this.accessRuleId = model.accessRuleId;
                this.createTime = model.createTime;
                this.description = model.description;
                this.networkSegment = model.networkSegment;
                this.priority = model.priority;
                this.RWAccessType = model.RWAccessType;
                this.regionId = model.regionId;
            } 

            /**
             * AccessGroupId.
             */
            public Builder accessGroupId(String accessGroupId) {
                this.accessGroupId = accessGroupId;
                return this;
            }

            /**
             * AccessRuleId.
             */
            public Builder accessRuleId(String accessRuleId) {
                this.accessRuleId = accessRuleId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
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
             * NetworkSegment.
             */
            public Builder networkSegment(String networkSegment) {
                this.networkSegment = networkSegment;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * RWAccessType.
             */
            public Builder RWAccessType(String RWAccessType) {
                this.RWAccessType = RWAccessType;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public AccessRules build() {
                return new AccessRules(this);
            } 

        } 

    }
}
