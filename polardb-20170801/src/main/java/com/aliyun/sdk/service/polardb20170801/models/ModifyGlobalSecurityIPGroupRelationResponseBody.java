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
 * {@link ModifyGlobalSecurityIPGroupRelationResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyGlobalSecurityIPGroupRelationResponseBody</p>
 */
public class ModifyGlobalSecurityIPGroupRelationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("GlobalSecurityIPGroupRel")
    private java.util.List<GlobalSecurityIPGroupRel> globalSecurityIPGroupRel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyGlobalSecurityIPGroupRelationResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.globalSecurityIPGroupRel = builder.globalSecurityIPGroupRel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyGlobalSecurityIPGroupRelationResponseBody create() {
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
    public java.util.List<GlobalSecurityIPGroupRel> getGlobalSecurityIPGroupRel() {
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
        private java.util.List<GlobalSecurityIPGroupRel> globalSecurityIPGroupRel; 
        private String requestId; 

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-*****************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The details of the global IP whitelist template.</p>
         */
        public Builder globalSecurityIPGroupRel(java.util.List<GlobalSecurityIPGroupRel> globalSecurityIPGroupRel) {
            this.globalSecurityIPGroupRel = globalSecurityIPGroupRel;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9B7BFB11-C077-4FE3-B051-F69CEB******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyGlobalSecurityIPGroupRelationResponseBody build() {
            return new ModifyGlobalSecurityIPGroupRelationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyGlobalSecurityIPGroupRelationResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyGlobalSecurityIPGroupRelationResponseBody</p>
     */
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
             * <p>The IP address in the whitelist template.</p>
             * <blockquote>
             * <p> Separate multiple IP addresses with commas (,). You can add up to 1,000 IP addresses or CIDR blocks to all IP whitelists.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.1</p>
             */
            public Builder gIpList(String gIpList) {
                this.gIpList = gIpList;
                return this;
            }

            /**
             * <p>The name of the IP whitelist template. The name must meet the following requirements:</p>
             * <ul>
             * <li>The name can contain lowercase letters, digits, and underscores (_).</li>
             * <li>The name must start with a letter and end with a letter or a digit.</li>
             * <li>The name must be 2 to 120 characters in length.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test_123</p>
             */
            public Builder globalIgName(String globalIgName) {
                this.globalIgName = globalIgName;
                return this;
            }

            /**
             * <p>The ID of the IP whitelist template.</p>
             * 
             * <strong>example:</strong>
             * <p>g-zsldxfiwjmti0kcm****</p>
             */
            public Builder globalSecurityGroupId(String globalSecurityGroupId) {
                this.globalSecurityGroupId = globalSecurityGroupId;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
