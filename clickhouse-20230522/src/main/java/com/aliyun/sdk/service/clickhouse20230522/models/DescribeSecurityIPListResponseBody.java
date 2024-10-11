// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
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
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * GroupTag.
             */
            public Builder groupTag(String groupTag) {
                this.groupTag = groupTag;
                return this;
            }

            /**
             * SecurityIPList.
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * SecurityIPType.
             */
            public Builder securityIPType(String securityIPType) {
                this.securityIPType = securityIPType;
                return this;
            }

            /**
             * WhitelistNetType.
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
        private java.util.List < GroupItems> groupItems;

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
        public java.util.List < GroupItems> getGroupItems() {
            return this.groupItems;
        }

        public static final class Builder {
            private Integer DBInstanceID; 
            private String DBInstanceName; 
            private java.util.List < GroupItems> groupItems; 

            /**
             * DBInstanceID.
             */
            public Builder DBInstanceID(Integer DBInstanceID) {
                this.DBInstanceID = DBInstanceID;
                return this;
            }

            /**
             * DBInstanceName.
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * GroupItems.
             */
            public Builder groupItems(java.util.List < GroupItems> groupItems) {
                this.groupItems = groupItems;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
