// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeClusterSecurityInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterSecurityInfoResponseBody</p>
 */
public class DescribeClusterSecurityInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClusterSecurityInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterSecurityInfoResponseBody create() {
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

        public DescribeClusterSecurityInfoResponseBody build() {
            return new DescribeClusterSecurityInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterSecurityInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterSecurityInfoResponseBody</p>
     */
    public static class SecurityIpGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("SecurityIps")
        private String securityIps;

        private SecurityIpGroups(Builder builder) {
            this.groupName = builder.groupName;
            this.securityIps = builder.securityIps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityIpGroups create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return securityIps
         */
        public String getSecurityIps() {
            return this.securityIps;
        }

        public static final class Builder {
            private String groupName; 
            private String securityIps; 

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * SecurityIps.
             */
            public Builder securityIps(String securityIps) {
                this.securityIps = securityIps;
                return this;
            }

            public SecurityIpGroups build() {
                return new SecurityIpGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterSecurityInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterSecurityInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityIpGroups")
        private java.util.List < SecurityIpGroups> securityIpGroups;

        private Data(Builder builder) {
            this.securityIpGroups = builder.securityIpGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return securityIpGroups
         */
        public java.util.List < SecurityIpGroups> getSecurityIpGroups() {
            return this.securityIpGroups;
        }

        public static final class Builder {
            private java.util.List < SecurityIpGroups> securityIpGroups; 

            /**
             * SecurityIpGroups.
             */
            public Builder securityIpGroups(java.util.List < SecurityIpGroups> securityIpGroups) {
                this.securityIpGroups = securityIpGroups;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
