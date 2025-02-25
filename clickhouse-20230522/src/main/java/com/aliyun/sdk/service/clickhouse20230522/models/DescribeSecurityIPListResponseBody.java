// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

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
 * {@link DescribeSecurityIPListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityIPListResponseBody</p>
 */
public class DescribeSecurityIPListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSecurityIPListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityIPListResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D0CEC6AC-7760-409A-A0D5-E6CD8660E9CC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSecurityIPListResponseBody build() {
            return new DescribeSecurityIPListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecurityIPListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityIPListResponseBody</p>
     */
    public static class GroupItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupTag")
        private String groupTag;

        @com.aliyun.core.annotation.NameInMap("SecurityIPList")
        private String securityIPList;

        @com.aliyun.core.annotation.NameInMap("SecurityIPType")
        private String securityIPType;

        @com.aliyun.core.annotation.NameInMap("WhitelistNetType")
        private String whitelistNetType;

        private GroupItems(Builder builder) {
            this.groupName = builder.groupName;
            this.groupTag = builder.groupTag;
            this.securityIPList = builder.securityIPList;
            this.securityIPType = builder.securityIPType;
            this.whitelistNetType = builder.whitelistNetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupItems create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return groupTag
         */
        public String getGroupTag() {
            return this.groupTag;
        }

        /**
         * @return securityIPList
         */
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        /**
         * @return securityIPType
         */
        public String getSecurityIPType() {
            return this.securityIPType;
        }

        /**
         * @return whitelistNetType
         */
        public String getWhitelistNetType() {
            return this.whitelistNetType;
        }

        public static final class Builder {
            private String groupName; 
            private String groupTag; 
            private String securityIPList; 
            private String securityIPType; 
            private String whitelistNetType; 

            /**
             * <p>The name of the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The tag of the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder groupTag(String groupTag) {
                this.groupTag = groupTag;
                return this;
            }

            /**
             * <p>The IP addresses and CIDR blocks in the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.XX.XX</p>
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * <p>The IP address type.</p>
             * 
             * <strong>example:</strong>
             * <p>ipv4</p>
             */
            public Builder securityIPType(String securityIPType) {
                this.securityIPType = securityIPType;
                return this;
            }

            /**
             * <p>The network type of the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>mix</p>
             */
            public Builder whitelistNetType(String whitelistNetType) {
                this.whitelistNetType = whitelistNetType;
                return this;
            }

            public GroupItems build() {
                return new GroupItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecurityIPListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityIPListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceID")
        private Integer DBInstanceID;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("GroupItems")
        private java.util.List<GroupItems> groupItems;

        private Data(Builder builder) {
            this.DBInstanceID = builder.DBInstanceID;
            this.DBInstanceName = builder.DBInstanceName;
            this.groupItems = builder.groupItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return DBInstanceID
         */
        public Integer getDBInstanceID() {
            return this.DBInstanceID;
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return groupItems
         */
        public java.util.List<GroupItems> getGroupItems() {
            return this.groupItems;
        }

        public static final class Builder {
            private Integer DBInstanceID; 
            private String DBInstanceName; 
            private java.util.List<GroupItems> groupItems; 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cc-bp100p4q1g9z3****</p>
             */
            public Builder DBInstanceID(Integer DBInstanceID) {
                this.DBInstanceID = DBInstanceID;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * <p>The details about the whitelists.</p>
             */
            public Builder groupItems(java.util.List<GroupItems> groupItems) {
                this.groupItems = groupItems;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
