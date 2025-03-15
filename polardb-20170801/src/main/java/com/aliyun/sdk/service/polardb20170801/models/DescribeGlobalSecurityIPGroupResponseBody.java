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
 * {@link DescribeGlobalSecurityIPGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGlobalSecurityIPGroupResponseBody</p>
 */
public class DescribeGlobalSecurityIPGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GlobalSecurityIPGroup")
    private java.util.List<GlobalSecurityIPGroup> globalSecurityIPGroup;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeGlobalSecurityIPGroupResponseBody(Builder builder) {
        this.globalSecurityIPGroup = builder.globalSecurityIPGroup;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGlobalSecurityIPGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return globalSecurityIPGroup
     */
    public java.util.List<GlobalSecurityIPGroup> getGlobalSecurityIPGroup() {
        return this.globalSecurityIPGroup;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<GlobalSecurityIPGroup> globalSecurityIPGroup; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeGlobalSecurityIPGroupResponseBody model) {
            this.globalSecurityIPGroup = model.globalSecurityIPGroup;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the global IP whitelist template.</p>
         */
        public Builder globalSecurityIPGroup(java.util.List<GlobalSecurityIPGroup> globalSecurityIPGroup) {
            this.globalSecurityIPGroup = globalSecurityIPGroup;
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

        public DescribeGlobalSecurityIPGroupResponseBody build() {
            return new DescribeGlobalSecurityIPGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGlobalSecurityIPGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalSecurityIPGroupResponseBody</p>
     */
    public static class GlobalSecurityIPGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstances")
        private java.util.List<String> DBInstances;

        @com.aliyun.core.annotation.NameInMap("GIpList")
        private String gIpList;

        @com.aliyun.core.annotation.NameInMap("GlobalIgName")
        private String globalIgName;

        @com.aliyun.core.annotation.NameInMap("GlobalSecurityGroupId")
        private String globalSecurityGroupId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private GlobalSecurityIPGroup(Builder builder) {
            this.DBInstances = builder.DBInstances;
            this.gIpList = builder.gIpList;
            this.globalIgName = builder.globalIgName;
            this.globalSecurityGroupId = builder.globalSecurityGroupId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalSecurityIPGroup create() {
            return builder().build();
        }

        /**
         * @return DBInstances
         */
        public java.util.List<String> getDBInstances() {
            return this.DBInstances;
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
            private java.util.List<String> DBInstances; 
            private String gIpList; 
            private String globalIgName; 
            private String globalSecurityGroupId; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(GlobalSecurityIPGroup model) {
                this.DBInstances = model.DBInstances;
                this.gIpList = model.gIpList;
                this.globalIgName = model.globalIgName;
                this.globalSecurityGroupId = model.globalSecurityGroupId;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The details of the clusters that are associated with the global IP address whitelist template.</p>
             */
            public Builder DBInstances(java.util.List<String> DBInstances) {
                this.DBInstances = DBInstances;
                return this;
            }

            /**
             * <p>The IP address in the global IP whitelist template.</p>
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
             * <p>The name of the global IP whitelist template. The name must meet the following requirements:</p>
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
             * <p>The ID of the global IP whitelist template.</p>
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

            public GlobalSecurityIPGroup build() {
                return new GlobalSecurityIPGroup(this);
            } 

        } 

    }
}
