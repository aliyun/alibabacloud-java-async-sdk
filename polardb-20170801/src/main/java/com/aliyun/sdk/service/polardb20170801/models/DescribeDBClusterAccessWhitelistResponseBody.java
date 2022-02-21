// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterAccessWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterAccessWhitelistResponseBody</p>
 */
public class DescribeDBClusterAccessWhitelistResponseBody extends TeaModel {
    @NameInMap("DBClusterSecurityGroups")
    private DBClusterSecurityGroups DBClusterSecurityGroups;

    @NameInMap("Items")
    private Items items;

    @NameInMap("RequestId")
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
         * DBClusterSecurityGroups.
         */
        public Builder DBClusterSecurityGroups(DBClusterSecurityGroups DBClusterSecurityGroups) {
            this.DBClusterSecurityGroups = DBClusterSecurityGroups;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterAccessWhitelistResponseBody build() {
            return new DescribeDBClusterAccessWhitelistResponseBody(this);
        } 

    } 

    public static class DBClusterSecurityGroup extends TeaModel {
        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("SecurityGroupName")
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
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * SecurityGroupName.
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
    public static class DBClusterSecurityGroups extends TeaModel {
        @NameInMap("DBClusterSecurityGroup")
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
    public static class DBClusterIPArray extends TeaModel {
        @NameInMap("DBClusterIPArrayAttribute")
        private String DBClusterIPArrayAttribute;

        @NameInMap("DBClusterIPArrayName")
        private String DBClusterIPArrayName;

        @NameInMap("SecurityIps")
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
             * DBClusterIPArrayAttribute.
             */
            public Builder DBClusterIPArrayAttribute(String DBClusterIPArrayAttribute) {
                this.DBClusterIPArrayAttribute = DBClusterIPArrayAttribute;
                return this;
            }

            /**
             * DBClusterIPArrayName.
             */
            public Builder DBClusterIPArrayName(String DBClusterIPArrayName) {
                this.DBClusterIPArrayName = DBClusterIPArrayName;
                return this;
            }

            /**
             * SecurityIps.
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
    public static class Items extends TeaModel {
        @NameInMap("DBClusterIPArray")
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
