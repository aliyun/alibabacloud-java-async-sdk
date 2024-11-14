// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.NameInMap("GroupItems")
    private java.util.List < GroupItems> groupItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSecurityIPListResponseBody(Builder builder) {
        this.DBInstanceName = builder.DBInstanceName;
        this.groupItems = builder.groupItems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityIPListResponseBody create() {
        return builder().build();
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
    public java.util.List < GroupItems> getGroupItems() {
        return this.groupItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBInstanceName; 
        private java.util.List < GroupItems> groupItems; 
        private String requestId; 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv****</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The details about each IP address whitelist returned.</p>
         */
        public Builder groupItems(java.util.List < GroupItems> groupItems) {
            this.groupItems = groupItems;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5CBE044D-4594-525D-AC65-E988553D853E</p>
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
        @com.aliyun.core.annotation.NameInMap("AecurityIPType")
        private String aecurityIPType;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupTag")
        private String groupTag;

        @com.aliyun.core.annotation.NameInMap("SecurityIPList")
        private String securityIPList;

        @com.aliyun.core.annotation.NameInMap("WhitelistNetType")
        private String whitelistNetType;

        private GroupItems(Builder builder) {
            this.aecurityIPType = builder.aecurityIPType;
            this.groupName = builder.groupName;
            this.groupTag = builder.groupTag;
            this.securityIPList = builder.securityIPList;
            this.whitelistNetType = builder.whitelistNetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupItems create() {
            return builder().build();
        }

        /**
         * @return aecurityIPType
         */
        public String getAecurityIPType() {
            return this.aecurityIPType;
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
         * @return whitelistNetType
         */
        public String getWhitelistNetType() {
            return this.whitelistNetType;
        }

        public static final class Builder {
            private String aecurityIPType; 
            private String groupName; 
            private String groupTag; 
            private String securityIPList; 
            private String whitelistNetType; 

            /**
             * <p>The IP address type. Valid values:</p>
             * <ul>
             * <li>ipv4</li>
             * <li>ipv6 (not supported)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ipv4</p>
             */
            public Builder aecurityIPType(String aecurityIPType) {
                this.aecurityIPType = aecurityIPType;
                return this;
            }

            /**
             * <p>The name of the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>group1</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The tag of the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder groupTag(String groupTag) {
                this.groupTag = groupTag;
                return this;
            }

            /**
             * <p>The IP addresses in the whitelist. Multiple IP addresses are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.XX.XX</p>
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
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
}
