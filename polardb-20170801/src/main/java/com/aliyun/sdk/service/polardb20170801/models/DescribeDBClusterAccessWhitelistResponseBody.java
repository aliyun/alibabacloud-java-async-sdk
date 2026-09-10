// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDBClusterAccessWhitelistResponseBody model) {
            this.DBClusterSecurityGroups = model.DBClusterSecurityGroups;
            this.items = model.items;
            this.requestId = model.requestId;
        } 

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

            private Builder() {
            } 

            private Builder(DBClusterSecurityGroup model) {
                this.securityGroupId = model.securityGroupId;
                this.securityGroupName = model.securityGroupName;
            } 

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
    /**
     * 
     * {@link DescribeDBClusterAccessWhitelistResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAccessWhitelistResponseBody</p>
     */
    public static class DBClusterSecurityGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterSecurityGroup")
        private java.util.List<DBClusterSecurityGroup> DBClusterSecurityGroup;

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
        public java.util.List<DBClusterSecurityGroup> getDBClusterSecurityGroup() {
            return this.DBClusterSecurityGroup;
        }

        public static final class Builder {
            private java.util.List<DBClusterSecurityGroup> DBClusterSecurityGroup; 

            private Builder() {
            } 

            private Builder(DBClusterSecurityGroups model) {
                this.DBClusterSecurityGroup = model.DBClusterSecurityGroup;
            } 

            /**
             * DBClusterSecurityGroup.
             */
            public Builder DBClusterSecurityGroup(java.util.List<DBClusterSecurityGroup> DBClusterSecurityGroup) {
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

            private Builder() {
            } 

            private Builder(DBClusterIPArray model) {
                this.DBClusterIPArrayAttribute = model.DBClusterIPArrayAttribute;
                this.DBClusterIPArrayName = model.DBClusterIPArrayName;
                this.securityIps = model.securityIps;
            } 

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
    /**
     * 
     * {@link DescribeDBClusterAccessWhitelistResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAccessWhitelistResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterIPArray")
        private java.util.List<DBClusterIPArray> DBClusterIPArray;

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
        public java.util.List<DBClusterIPArray> getDBClusterIPArray() {
            return this.DBClusterIPArray;
        }

        public static final class Builder {
            private java.util.List<DBClusterIPArray> DBClusterIPArray; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.DBClusterIPArray = model.DBClusterIPArray;
            } 

            /**
             * DBClusterIPArray.
             */
            public Builder DBClusterIPArray(java.util.List<DBClusterIPArray> DBClusterIPArray) {
                this.DBClusterIPArray = DBClusterIPArray;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
