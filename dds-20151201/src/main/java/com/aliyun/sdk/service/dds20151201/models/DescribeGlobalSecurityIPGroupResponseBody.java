// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
         * <p>The global IP whitelist templates.</p>
         */
        public Builder globalSecurityIPGroup(java.util.List<GlobalSecurityIPGroup> globalSecurityIPGroup) {
            this.globalSecurityIPGroup = globalSecurityIPGroup;
            return this;
        }

        /**
         * <p>The unique ID of the request. If the request fails, provide this ID for technical support to troubleshoot the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>72651AF9-7897-41A7-8B67-6C15C7F26A0A</p>
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
             * <p>The instances associated with the global whitelist template.</p>
             */
            public Builder DBInstances(java.util.List<String> DBInstances) {
                this.DBInstances = DBInstances;
                return this;
            }

            /**
             * <p>The IP addresses in the whitelist template.</p>
             * <blockquote>
             * <p>Separate multiple IP addresses with commas (,). You can create up to 1,000 IP addresses or CIDR blocks for all IP address whitelists.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>117.12.202.19</p>
             */
            public Builder gIpList(String gIpList) {
                this.gIpList = gIpList;
                return this;
            }

            /**
             * <p>The name of the IP whitelist template.</p>
             * 
             * <strong>example:</strong>
             * <p>dev_baoxian_k8s_bj</p>
             */
            public Builder globalIgName(String globalIgName) {
                this.globalIgName = globalIgName;
                return this;
            }

            /**
             * <p>The ID of the IP whitelist template.</p>
             * 
             * <strong>example:</strong>
             * <p>g-sdgwqyp4f5j1x3qk7yvm</p>
             */
            public Builder globalSecurityGroupId(String globalSecurityGroupId) {
                this.globalSecurityGroupId = globalSecurityGroupId;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
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
