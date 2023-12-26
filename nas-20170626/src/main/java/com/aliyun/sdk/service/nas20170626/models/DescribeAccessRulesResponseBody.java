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
         * The rules in the permission group.
         */
        public Builder accessRules(AccessRules accessRules) {
            this.accessRules = accessRules;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of rules.
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
             * The ID of the rule.
             */
            public Builder accessRuleId(String accessRuleId) {
                this.accessRuleId = accessRuleId;
                return this;
            }

            /**
             * The IPv6 address or CIDR block of the authorized object.
             */
            public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
                this.ipv6SourceCidrIp = ipv6SourceCidrIp;
                return this;
            }

            /**
             * The priority of the rule.
             * <p>
             * 
             * If multiple rules are attached to the authorized object, the rule with the highest priority takes effect.
             * 
             * Valid values: 1 to 100. The value 1 indicates the highest priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The access permissions of the authorized object on the file system.
             * <p>
             * 
             * Valid values:
             * 
             * *   RDWR (default): the read and write permissions
             * *   RDONLY: the read-only permissions
             */
            public Builder RWAccess(String RWAccess) {
                this.RWAccess = RWAccess;
                return this;
            }

            /**
             * The IP address or CIDR block of the authorized object.
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * The access permissions for different types of users in the authorized object.
             * <p>
             * 
             * Valid values:
             * 
             * *   no_squash: allows access from root users to the file system.
             * *   root_squash: grants root users the least permissions as the nobody user.
             * *   all_squash: grants all users the least permissions as the nobody user.
             * 
             * The nobody user has the least permissions in Linux and can access only the public content of the file system. This ensures the security of the file system.
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
