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
 * {@link ModifyGlobalSecurityIPGroupNameResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyGlobalSecurityIPGroupNameResponseBody</p>
 */
public class ModifyGlobalSecurityIPGroupNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GlobalSecurityIPGroup")
    private java.util.List<GlobalSecurityIPGroup> globalSecurityIPGroup;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyGlobalSecurityIPGroupNameResponseBody(Builder builder) {
        this.globalSecurityIPGroup = builder.globalSecurityIPGroup;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyGlobalSecurityIPGroupNameResponseBody create() {
        return builder().build();
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

        /**
         * <p>The global IP whitelist templates.</p>
         */
        public Builder globalSecurityIPGroup(java.util.List<GlobalSecurityIPGroup> globalSecurityIPGroup) {
            this.globalSecurityIPGroup = globalSecurityIPGroup;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F8CA8312-530A-413A-9129-F2BB32A8D404</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyGlobalSecurityIPGroupNameResponseBody build() {
            return new ModifyGlobalSecurityIPGroupNameResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyGlobalSecurityIPGroupNameResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyGlobalSecurityIPGroupNameResponseBody</p>
     */
    public static class GlobalSecurityIPGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GIpList")
        private String gIpList;

        @com.aliyun.core.annotation.NameInMap("GlobalIgName")
        private String globalIgName;

        @com.aliyun.core.annotation.NameInMap("GlobalSecurityGroupId")
        private String globalSecurityGroupId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private GlobalSecurityIPGroup(Builder builder) {
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
             * <p>The IP addresses in the whitelist template.</p>
             * <blockquote>
             * <p>Separate multiple IP addresses with commas (,). You can create up to 1,000 IP addresses or CIDR blocks for all IP address whitelists.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>222.70.197.187</p>
             */
            public Builder gIpList(String gIpList) {
                this.gIpList = gIpList;
                return this;
            }

            /**
             * <p>The name of the IP whitelist template.</p>
             * 
             * <strong>example:</strong>
             * <p>def</p>
             */
            public Builder globalIgName(String globalIgName) {
                this.globalIgName = globalIgName;
                return this;
            }

            /**
             * <p>The ID of the IP whitelist template.</p>
             * 
             * <strong>example:</strong>
             * <p>g-qiawi8ec1urcx9swoy37</p>
             */
            public Builder globalSecurityGroupId(String globalSecurityGroupId) {
                this.globalSecurityGroupId = globalSecurityGroupId;
                return this;
            }

            /**
             * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the most recent region list.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
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
