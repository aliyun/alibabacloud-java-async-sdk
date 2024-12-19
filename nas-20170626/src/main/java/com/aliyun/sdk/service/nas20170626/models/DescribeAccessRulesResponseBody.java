// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DescribeAccessRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessRulesResponseBody</p>
 */
public class DescribeAccessRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessRules")
    private AccessRules accessRules;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The rules in the permission group.</p>
         */
        public Builder accessRules(AccessRules accessRules) {
            this.accessRules = accessRules;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>86D89E82-4297-4343-8E1E-A2495B35****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAccessRulesResponseBody build() {
            return new DescribeAccessRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAccessRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccessRulesResponseBody</p>
     */
    public static class AccessRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessGroupName")
        private String accessGroupName;

        @com.aliyun.core.annotation.NameInMap("AccessRuleId")
        private String accessRuleId;

        @com.aliyun.core.annotation.NameInMap("FileSystemType")
        private String fileSystemType;

        @com.aliyun.core.annotation.NameInMap("Ipv6SourceCidrIp")
        private String ipv6SourceCidrIp;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("RWAccess")
        private String RWAccess;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        @com.aliyun.core.annotation.NameInMap("UserAccess")
        private String userAccess;

        private AccessRule(Builder builder) {
            this.accessGroupName = builder.accessGroupName;
            this.accessRuleId = builder.accessRuleId;
            this.fileSystemType = builder.fileSystemType;
            this.ipv6SourceCidrIp = builder.ipv6SourceCidrIp;
            this.priority = builder.priority;
            this.RWAccess = builder.RWAccess;
            this.regionId = builder.regionId;
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
         * @return accessGroupName
         */
        public String getAccessGroupName() {
            return this.accessGroupName;
        }

        /**
         * @return accessRuleId
         */
        public String getAccessRuleId() {
            return this.accessRuleId;
        }

        /**
         * @return fileSystemType
         */
        public String getFileSystemType() {
            return this.fileSystemType;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
            private String accessGroupName; 
            private String accessRuleId; 
            private String fileSystemType; 
            private String ipv6SourceCidrIp; 
            private Integer priority; 
            private String RWAccess; 
            private String regionId; 
            private String sourceCidrIp; 
            private String userAccess; 

            /**
             * <p>The name of the permission group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder accessGroupName(String accessGroupName) {
                this.accessGroupName = accessGroupName;
                return this;
            }

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder accessRuleId(String accessRuleId) {
                this.accessRuleId = accessRuleId;
                return this;
            }

            /**
             * <p>The type of the file system.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>standard: General-purpose File Storage NAS (NAS) file system</li>
             * <li>extreme: Extreme NAS file system</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder fileSystemType(String fileSystemType) {
                this.fileSystemType = fileSystemType;
                return this;
            }

            /**
             * <p>The IPv6 address or CIDR block of the authorized object.</p>
             * 
             * <strong>example:</strong>
             * <p>2001:250:6000::***</p>
             */
            public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
                this.ipv6SourceCidrIp = ipv6SourceCidrIp;
                return this;
            }

            /**
             * <p>The priority of the rule.</p>
             * <p>If multiple rules are attached to the authorized object, the rule with the highest priority takes effect.</p>
             * <p>Valid values: 1 to 100. The value 1 indicates the highest priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The access permissions of the authorized object on the file system.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>RDWR (default): the read and write permissions</li>
             * <li>RDONLY: the read-only permissions</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RDWR</p>
             */
            public Builder RWAccess(String RWAccess) {
                this.RWAccess = RWAccess;
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

            /**
             * <p>The IP address or CIDR block of the authorized object.</p>
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * <p>The access permissions for different types of users in the authorized object.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>no_squash: allows access from root users to the file system.</li>
             * <li>root_squash: grants root users the least permissions as the nobody user.</li>
             * <li>all_squash: grants all users the least permissions as the nobody user.</li>
             * </ul>
             * <p>The nobody user has the least permissions in Linux and can access only the public content of the file system. This ensures the security of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>no_squash</p>
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
    /**
     * 
     * {@link DescribeAccessRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccessRulesResponseBody</p>
     */
    public static class AccessRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessRule")
        private java.util.List<AccessRule> accessRule;

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
        public java.util.List<AccessRule> getAccessRule() {
            return this.accessRule;
        }

        public static final class Builder {
            private java.util.List<AccessRule> accessRule; 

            /**
             * AccessRule.
             */
            public Builder accessRule(java.util.List<AccessRule> accessRule) {
                this.accessRule = accessRule;
                return this;
            }

            public AccessRules build() {
                return new AccessRules(this);
            } 

        } 

    }
}
