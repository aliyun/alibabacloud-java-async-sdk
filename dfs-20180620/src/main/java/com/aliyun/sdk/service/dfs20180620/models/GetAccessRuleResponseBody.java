// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccessRuleResponseBody</p>
 */
public class GetAccessRuleResponseBody extends TeaModel {
    @NameInMap("AccessRule")
    private AccessRule accessRule;

    @NameInMap("RequestId")
    private String requestId;

    private GetAccessRuleResponseBody(Builder builder) {
        this.accessRule = builder.accessRule;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessRule
     */
    public AccessRule getAccessRule() {
        return this.accessRule;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccessRule accessRule; 
        private String requestId; 

        /**
         * AccessRule.
         */
        public Builder accessRule(AccessRule accessRule) {
            this.accessRule = accessRule;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccessRuleResponseBody build() {
            return new GetAccessRuleResponseBody(this);
        } 

    } 

    public static class AccessRule extends TeaModel {
        @NameInMap("AccessGroupId")
        private String accessGroupId;

        @NameInMap("AccessRuleId")
        private String accessRuleId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("NetworkSegment")
        private String networkSegment;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("RWAccessType")
        private String RWAccessType;

        @NameInMap("RegionId")
        private String regionId;

        private AccessRule(Builder builder) {
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

        public static AccessRule create() {
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

            public AccessRule build() {
                return new AccessRule(this);
            } 

        } 

    }
}
