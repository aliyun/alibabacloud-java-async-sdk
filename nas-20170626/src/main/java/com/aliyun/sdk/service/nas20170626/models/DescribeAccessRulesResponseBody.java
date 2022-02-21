// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessRulesResponseBody</p>
 */
public class DescribeAccessRulesResponseBody extends TeaModel {
    @NameInMap("AccessRules")
    private AccessRules accessRules;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAccessRulesResponseBody(Builder builder) {
        this.accessRules = builder.accessRules;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessRules
     */
    public AccessRules getAccessRules() {
        return this.accessRules;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private AccessRules accessRules; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * AccessRules.
         */
        public Builder accessRules(AccessRules accessRules) {
            this.accessRules = accessRules;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        public DescribeAccessRulesResponseBody build() {
            return new DescribeAccessRulesResponseBody(this);
        } 

    } 

    public static class AccessRule extends TeaModel {
        @NameInMap("AccessRuleId")
        private String accessRuleId;

        @NameInMap("Ipv6SourceCidrIp")
        private String ipv6SourceCidrIp;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("RWAccess")
        private String RWAccess;

        @NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        @NameInMap("UserAccess")
        private String userAccess;

        private AccessRule(Builder builder) {
            this.accessRuleId = builder.accessRuleId;
            this.ipv6SourceCidrIp = builder.ipv6SourceCidrIp;
            this.priority = builder.priority;
            this.RWAccess = builder.RWAccess;
            this.sourceCidrIp = builder.sourceCidrIp;
            this.userAccess = builder.userAccess;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessRule create() {
            return builder().build();
        }

        /**
         * @return accessRuleId
         */
        public String getAccessRuleId() {
            return this.accessRuleId;
        }

        /**
         * @return ipv6SourceCidrIp
         */
        public String getIpv6SourceCidrIp() {
            return this.ipv6SourceCidrIp;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return RWAccess
         */
        public String getRWAccess() {
            return this.RWAccess;
        }

        /**
         * @return sourceCidrIp
         */
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        /**
         * @return userAccess
         */
        public String getUserAccess() {
            return this.userAccess;
        }

        public static final class Builder {
            private String accessRuleId; 
            private String ipv6SourceCidrIp; 
            private Integer priority; 
            private String RWAccess; 
            private String sourceCidrIp; 
            private String userAccess; 

            /**
             * AccessRuleId.
             */
            public Builder accessRuleId(String accessRuleId) {
                this.accessRuleId = accessRuleId;
                return this;
            }

            /**
             * Ipv6SourceCidrIp.
             */
            public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
                this.ipv6SourceCidrIp = ipv6SourceCidrIp;
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
             * RWAccess.
             */
            public Builder RWAccess(String RWAccess) {
                this.RWAccess = RWAccess;
                return this;
            }

            /**
             * SourceCidrIp.
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * UserAccess.
             */
            public Builder userAccess(String userAccess) {
                this.userAccess = userAccess;
                return this;
            }

            public AccessRule build() {
                return new AccessRule(this);
            } 

        } 

    }
    public static class AccessRules extends TeaModel {
        @NameInMap("AccessRule")
        private java.util.List < AccessRule> accessRule;

        private AccessRules(Builder builder) {
            this.accessRule = builder.accessRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessRules create() {
            return builder().build();
        }

        /**
         * @return accessRule
         */
        public java.util.List < AccessRule> getAccessRule() {
            return this.accessRule;
        }

        public static final class Builder {
            private java.util.List < AccessRule> accessRule; 

            /**
             * AccessRule.
             */
            public Builder accessRule(java.util.List < AccessRule> accessRule) {
                this.accessRule = accessRule;
                return this;
            }

            public AccessRules build() {
                return new AccessRules(this);
            } 

        } 

    }
}
