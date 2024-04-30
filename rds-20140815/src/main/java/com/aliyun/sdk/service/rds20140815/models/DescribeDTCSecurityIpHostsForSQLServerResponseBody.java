// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDTCSecurityIpHostsForSQLServerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDTCSecurityIpHostsForSQLServerResponseBody</p>
 */
public class DescribeDTCSecurityIpHostsForSQLServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("IpHostPairNum")
    private String ipHostPairNum;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDTCSecurityIpHostsForSQLServerResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.ipHostPairNum = builder.ipHostPairNum;
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDTCSecurityIpHostsForSQLServerResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return ipHostPairNum
     */
    public String getIpHostPairNum() {
        return this.ipHostPairNum;
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
        private String DBInstanceId; 
        private String ipHostPairNum; 
        private Items items; 
        private String requestId; 

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The number of distributed transaction whitelists.
         */
        public Builder ipHostPairNum(String ipHostPairNum) {
            this.ipHostPairNum = ipHostPairNum;
            return this;
        }

        /**
         * Details of distributed transaction whitelists.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDTCSecurityIpHostsForSQLServerResponseBody build() {
            return new DescribeDTCSecurityIpHostsForSQLServerResponseBody(this);
        } 

    } 

    public static class WhiteListGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityIpHosts")
        private String securityIpHosts;

        @com.aliyun.core.annotation.NameInMap("WhitelistGroupName")
        private String whitelistGroupName;

        private WhiteListGroups(Builder builder) {
            this.securityIpHosts = builder.securityIpHosts;
            this.whitelistGroupName = builder.whitelistGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteListGroups create() {
            return builder().build();
        }

        /**
         * @return securityIpHosts
         */
        public String getSecurityIpHosts() {
            return this.securityIpHosts;
        }

        /**
         * @return whitelistGroupName
         */
        public String getWhitelistGroupName() {
            return this.whitelistGroupName;
        }

        public static final class Builder {
            private String securityIpHosts; 
            private String whitelistGroupName; 

            /**
             * The IP address of the ECS instance and the hostname of the Windows computer. Format: `IP address,Hostname`. Multiple values are separated with semicolons (;).
             */
            public Builder securityIpHosts(String securityIpHosts) {
                this.securityIpHosts = securityIpHosts;
                return this;
            }

            /**
             * The name of the distributed transaction whitelist.
             */
            public Builder whitelistGroupName(String whitelistGroupName) {
                this.whitelistGroupName = whitelistGroupName;
                return this;
            }

            public WhiteListGroups build() {
                return new WhiteListGroups(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WhiteListGroups")
        private java.util.List < WhiteListGroups> whiteListGroups;

        private Items(Builder builder) {
            this.whiteListGroups = builder.whiteListGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return whiteListGroups
         */
        public java.util.List < WhiteListGroups> getWhiteListGroups() {
            return this.whiteListGroups;
        }

        public static final class Builder {
            private java.util.List < WhiteListGroups> whiteListGroups; 

            /**
             * WhiteListGroups.
             */
            public Builder whiteListGroups(java.util.List < WhiteListGroups> whiteListGroups) {
                this.whiteListGroups = whiteListGroups;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
