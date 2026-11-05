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
 * {@link DescribeLangfuseSecurityIPListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLangfuseSecurityIPListResponseBody</p>
 */
public class DescribeLangfuseSecurityIPListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLangfuseSecurityIPListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLangfuseSecurityIPListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLangfuseSecurityIPListResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2FED790E-FB61-4721-8C1C-07C627FA5A19</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLangfuseSecurityIPListResponseBody build() {
            return new DescribeLangfuseSecurityIPListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLangfuseSecurityIPListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLangfuseSecurityIPListResponseBody</p>
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

            private Builder() {
            } 

            private Builder(GroupItems model) {
                this.groupName = model.groupName;
                this.groupTag = model.groupTag;
                this.securityIPList = model.securityIPList;
                this.securityIPType = model.securityIPType;
                this.whitelistNetType = model.whitelistNetType;
            } 

            /**
             * <p>The name of the whitelist group.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The group tag.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder groupTag(String groupTag) {
                this.groupTag = groupTag;
                return this;
            }

            /**
             * <p>The list of IP addresses in the whitelist group.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.XX.XX</p>
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * <p>The IP address type. The value is fixed to IPv4. IPv6 is not supported.</p>
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
     * {@link DescribeLangfuseSecurityIPListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLangfuseSecurityIPListResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.DBInstanceID = model.DBInstanceID;
                this.DBInstanceName = model.DBInstanceName;
                this.groupItems = model.groupItems;
            } 

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>lfs-****</p>
             */
            public Builder DBInstanceID(Integer DBInstanceID) {
                this.DBInstanceID = DBInstanceID;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>lfs-****</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * <p>The whitelist group list.</p>
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
