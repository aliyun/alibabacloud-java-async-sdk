// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGlobalSecurityIPGroupRelationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGlobalSecurityIPGroupRelationResponseBody</p>
 */
public class DescribeGlobalSecurityIPGroupRelationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("GlobalSecurityIPGroupRel")
    private java.util.List < GlobalSecurityIPGroupRel> globalSecurityIPGroupRel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeGlobalSecurityIPGroupRelationResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.globalSecurityIPGroupRel = builder.globalSecurityIPGroupRel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGlobalSecurityIPGroupRelationResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return globalSecurityIPGroupRel
     */
    public java.util.List < GlobalSecurityIPGroupRel> getGlobalSecurityIPGroupRel() {
        return this.globalSecurityIPGroupRel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBClusterId; 
        private java.util.List < GlobalSecurityIPGroupRel> globalSecurityIPGroupRel; 
        private String requestId; 

        /**
         * The instance ID.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The information about the associated global IP whitelist template.
         */
        public Builder globalSecurityIPGroupRel(java.util.List < GlobalSecurityIPGroupRel> globalSecurityIPGroupRel) {
            this.globalSecurityIPGroupRel = globalSecurityIPGroupRel;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGlobalSecurityIPGroupRelationResponseBody build() {
            return new DescribeGlobalSecurityIPGroupRelationResponseBody(this);
        } 

    } 

    public static class GlobalSecurityIPGroupRel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GIpList")
        private String gIpList;

        @com.aliyun.core.annotation.NameInMap("GlobalIgName")
        private String globalIgName;

        @com.aliyun.core.annotation.NameInMap("GlobalSecurityGroupId")
        private String globalSecurityGroupId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private GlobalSecurityIPGroupRel(Builder builder) {
            this.gIpList = builder.gIpList;
            this.globalIgName = builder.globalIgName;
            this.globalSecurityGroupId = builder.globalSecurityGroupId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalSecurityIPGroupRel create() {
            return builder().build();
        }

        /**
         * @return gIpList
         */
        public String getGIpList() {
            return this.gIpList;
        }

        /**
         * @return globalIgName
         */
        public String getGlobalIgName() {
            return this.globalIgName;
        }

        /**
         * @return globalSecurityGroupId
         */
        public String getGlobalSecurityGroupId() {
            return this.globalSecurityGroupId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String gIpList; 
            private String globalIgName; 
            private String globalSecurityGroupId; 
            private String regionId; 

            /**
             * The IP address in the IP whitelist template.
             * <p>
             * 
             * >  Multiple IP addresses are separated by commas (,).
             */
            public Builder gIpList(String gIpList) {
                this.gIpList = gIpList;
                return this;
            }

            /**
             * The name of the IP whitelist template.
             */
            public Builder globalIgName(String globalIgName) {
                this.globalIgName = globalIgName;
                return this;
            }

            /**
             * The ID of the IP whitelist template.
             */
            public Builder globalSecurityGroupId(String globalSecurityGroupId) {
                this.globalSecurityGroupId = globalSecurityGroupId;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public GlobalSecurityIPGroupRel build() {
                return new GlobalSecurityIPGroupRel(this);
            } 

        } 

    }
}
