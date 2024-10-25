// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBClusterAccessWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterAccessWhitelistResponseBody</p>
 */
public class DescribeDBClusterAccessWhitelistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterSecurityGroups")
    private DBClusterSecurityGroups DBClusterSecurityGroups;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterAccessWhitelistResponseBody(Builder builder) {
        this.DBClusterSecurityGroups = builder.DBClusterSecurityGroups;
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterAccessWhitelistResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterSecurityGroups
     */
    public DBClusterSecurityGroups getDBClusterSecurityGroups() {
        return this.DBClusterSecurityGroups;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DBClusterSecurityGroups DBClusterSecurityGroups; 
        private Items items; 
        private String requestId; 

        /**
         * <p>The Elastic Compute Service (ECS) security groups that are associated with the cluster.</p>
         */
        public Builder DBClusterSecurityGroups(DBClusterSecurityGroups DBClusterSecurityGroups) {
            this.DBClusterSecurityGroups = DBClusterSecurityGroups;
            return this;
        }

        /**
         * <p>The details about the cluster.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>559E91A2-CDA3-4E9F-808B-29D738******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterAccessWhitelistResponseBody build() {
            return new DescribeDBClusterAccessWhitelistResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterAccessWhitelistResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAccessWhitelistResponseBody</p>
     */
    public static class DBClusterSecurityGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupName")
        private String securityGroupName;

        private DBClusterSecurityGroup(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupName = builder.securityGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBClusterSecurityGroup create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return securityGroupName
         */
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public static final class Builder {
            private String securityGroupId; 
            private String securityGroupName; 

            /**
             * <p>The ID of the ECS security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp**************</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The name of the ECS security group.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-********************</p>
             */
            public Builder securityGroupName(String securityGroupName) {
                this.securityGroupName = securityGroupName;
                return this;
            }

            public DBClusterSecurityGroup build() {
                return new DBClusterSecurityGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterAccessWhitelistResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAccessWhitelistResponseBody</p>
     */
    public static class DBClusterSecurityGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterSecurityGroup")
        private java.util.List < DBClusterSecurityGroup> DBClusterSecurityGroup;

        private DBClusterSecurityGroups(Builder builder) {
            this.DBClusterSecurityGroup = builder.DBClusterSecurityGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBClusterSecurityGroups create() {
            return builder().build();
        }

        /**
         * @return DBClusterSecurityGroup
         */
        public java.util.List < DBClusterSecurityGroup> getDBClusterSecurityGroup() {
            return this.DBClusterSecurityGroup;
        }

        public static final class Builder {
            private java.util.List < DBClusterSecurityGroup> DBClusterSecurityGroup; 

            /**
             * DBClusterSecurityGroup.
             */
            public Builder DBClusterSecurityGroup(java.util.List < DBClusterSecurityGroup> DBClusterSecurityGroup) {
                this.DBClusterSecurityGroup = DBClusterSecurityGroup;
                return this;
            }

            public DBClusterSecurityGroups build() {
                return new DBClusterSecurityGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterAccessWhitelistResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAccessWhitelistResponseBody</p>
     */
    public static class DBClusterIPArray extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterIPArrayAttribute")
        private String DBClusterIPArrayAttribute;

        @com.aliyun.core.annotation.NameInMap("DBClusterIPArrayName")
        private String DBClusterIPArrayName;

        @com.aliyun.core.annotation.NameInMap("SecurityIps")
        private String securityIps;

        private DBClusterIPArray(Builder builder) {
            this.DBClusterIPArrayAttribute = builder.DBClusterIPArrayAttribute;
            this.DBClusterIPArrayName = builder.DBClusterIPArrayName;
            this.securityIps = builder.securityIps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBClusterIPArray create() {
            return builder().build();
        }

        /**
         * @return DBClusterIPArrayAttribute
         */
        public String getDBClusterIPArrayAttribute() {
            return this.DBClusterIPArrayAttribute;
        }

        /**
         * @return DBClusterIPArrayName
         */
        public String getDBClusterIPArrayName() {
            return this.DBClusterIPArrayName;
        }

        /**
         * @return securityIps
         */
        public String getSecurityIps() {
            return this.securityIps;
        }

        public static final class Builder {
            private String DBClusterIPArrayAttribute; 
            private String DBClusterIPArrayName; 
            private String securityIps; 

            /**
             * <p>The attributes of the IP whitelist group. Set this parameter to <strong>hidden</strong> to hide the IP whitelist group in the console.</p>
             * <blockquote>
             * <ul>
             * <li>The IP whitelist group that has appeared in the console cannot be hidden.</li>
             * <li>This parameter can be specified only when the <strong>WhiteListType</strong> parameter is set to <strong>IP</strong>.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>hidden</p>
             */
            public Builder DBClusterIPArrayAttribute(String DBClusterIPArrayAttribute) {
                this.DBClusterIPArrayAttribute = DBClusterIPArrayAttribute;
                return this;
            }

            /**
             * <p>The name of the IP whitelist group. The group name must be 2 to 120 characters in length and consists of lowercase letters and digits. It must start with a letter, and end with a letter or a digit.</p>
             * <ul>
             * <li>If the specified whitelist group name does not exist, the whitelist group is created.</li>
             * <li>If the specified whitelist group name exists, the whitelist group is modified.</li>
             * <li>If you do not specify this parameter, the default group is modified.</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>You can create a maximum of 50 IP whitelist groups for a cluster.</li>
             * <li>This parameter can be specified only when the <strong>WhiteListType</strong> parameter is set to <strong>IP</strong>.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder DBClusterIPArrayName(String DBClusterIPArrayName) {
                this.DBClusterIPArrayName = DBClusterIPArrayName;
                return this;
            }

            /**
             * <p>The IP addresses or Classless Inter-Domain Routing (CIDR) blocks in the IP whitelist group. You can add 1,000 IP addresses or CIDR blocks to all the IP whitelist groups. Separate multiple IP addresses with commas (,). The following two formats are supported:</p>
             * <ul>
             * <li>IP addresses. Example: 10.23.12.24.</li>
             * <li>CIDR blocks. Example: 10.23.12.24/24. 24 indicates the length of the prefix of the CIDR block. The length is the range of 1 to 32.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter can be specified only when the <strong>WhiteListType</strong> parameter is set to <strong>IP</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>11.<em><strong>.</strong></em>.<em><strong>,11.</strong></em>.<em><strong>.</strong></em></p>
             */
            public Builder securityIps(String securityIps) {
                this.securityIps = securityIps;
                return this;
            }

            public DBClusterIPArray build() {
                return new DBClusterIPArray(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterAccessWhitelistResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAccessWhitelistResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterIPArray")
        private java.util.List < DBClusterIPArray> DBClusterIPArray;

        private Items(Builder builder) {
            this.DBClusterIPArray = builder.DBClusterIPArray;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return DBClusterIPArray
         */
        public java.util.List < DBClusterIPArray> getDBClusterIPArray() {
            return this.DBClusterIPArray;
        }

        public static final class Builder {
            private java.util.List < DBClusterIPArray> DBClusterIPArray; 

            /**
             * DBClusterIPArray.
             */
            public Builder DBClusterIPArray(java.util.List < DBClusterIPArray> DBClusterIPArray) {
                this.DBClusterIPArray = DBClusterIPArray;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
