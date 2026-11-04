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
         * <p>The access group rules.</p>
         */
        public Builder accessRules(java.util.List<AccessRules> accessRules) {
            this.accessRules = accessRules;
            return this;
        }

        /**
         * <p>The token for the next page.</p>
         * <p>If a single query does not return all entries, a non-empty NextToken is returned. You can specify the NextToken in a subsequent query to continue the query.</p>
         * 
         * <strong>example:</strong>
         * <p>PtHVCBwpddbWVRCFe3wlB_-tOLtD4KSv3DzI7G6iywQSm69vY0lvOlDTzqVWqXWApvYQ2iUa8s4HbcFanMQfDIlds4da87_Ax4UJMva****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
             * <p>The ID of the access group.</p>
             * 
             * <strong>example:</strong>
             * <p>acg-e3755fb0-358d-4286-9942-8d461048****</p>
             */
            public Builder accessGroupId(String accessGroupId) {
                this.accessGroupId = accessGroupId;
                return this;
            }

            /**
             * <p>The ID of the access group rule.</p>
             * 
             * <strong>example:</strong>
             * <p>acr-c38028f0-f313-4385-9456-3501b1f5****</p>
             */
            public Builder accessRuleId(String accessRuleId) {
                this.accessRuleId = accessRuleId;
                return this;
            }

            /**
             * <p>The time when the access group rule was created. The time is displayed in UTC and follows the ISO 8601 standard. Example: 2022-04-18T08:02:09.986217Z.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-18T08:02:09.986217Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the access group rule.</p>
             * 
             * <strong>example:</strong>
             * <p>CIDR block of the log upload server</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The IP address or CIDR block of the authorized object.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.2.0/24</p>
             */
            public Builder networkSegment(String networkSegment) {
                this.networkSegment = networkSegment;
                return this;
            }

            /**
             * <p>The priority of the access group rule.</p>
             * <p>If an authorized object matches multiple rules, the rule with the highest priority takes effect.</p>
             * <p>Valid values: 1 to 100. A value of 1 indicates the highest priority.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The read and write permissions of the authorized object on the file system.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>RDWR: read and write</li>
             * <li>RDONLY: read-only</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RDWR</p>
             */
            public Builder RWAccessType(String RWAccessType) {
                this.RWAccessType = RWAccessType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
