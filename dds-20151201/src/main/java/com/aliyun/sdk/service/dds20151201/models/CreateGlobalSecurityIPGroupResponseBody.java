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
 * {@link CreateGlobalSecurityIPGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGlobalSecurityIPGroupResponseBody</p>
 */
public class CreateGlobalSecurityIPGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GlobalSecurityIPGroup")
    private java.util.List<GlobalSecurityIPGroup> globalSecurityIPGroup;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateGlobalSecurityIPGroupResponseBody(Builder builder) {
        this.globalSecurityIPGroup = builder.globalSecurityIPGroup;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGlobalSecurityIPGroupResponseBody create() {
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

        private Builder(CreateGlobalSecurityIPGroupResponseBody model) {
            this.globalSecurityIPGroup = model.globalSecurityIPGroup;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IP whitelist templates.</p>
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

        public CreateGlobalSecurityIPGroupResponseBody build() {
            return new CreateGlobalSecurityIPGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateGlobalSecurityIPGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateGlobalSecurityIPGroupResponseBody</p>
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

            private Builder() {
            } 

            private Builder(GlobalSecurityIPGroup model) {
                this.gIpList = model.gIpList;
                this.globalIgName = model.globalIgName;
                this.globalSecurityGroupId = model.globalSecurityGroupId;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The IP addresses in the whitelist template.</p>
             * <blockquote>
             * <p>Separate multiple IP addresses with commas (,). You can create up to 1,000 IP addresses or CIDR blocks for all IP address whitelists.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>111.207.194.217,61.149.7.154</p>
             */
            public Builder gIpList(String gIpList) {
                this.gIpList = gIpList;
                return this;
            }

            /**
             * <p>The name of the IP whitelist template. The name must meet the following requirements:</p>
             * <ul>
             * <li>It can contain lowercase letters, digits, and underscores (_).</li>
             * <li>It must start with a letter and end with a letter or digit.</li>
             * <li>It must be 2 to 120 characters in length.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>developer</p>
             */
            public Builder globalIgName(String globalIgName) {
                this.globalIgName = globalIgName;
                return this;
            }

            /**
             * <p>The ID of the IP whitelist template.</p>
             * 
             * <strong>example:</strong>
             * <p>g-2ifynl1jfkdlhhxgva3q</p>
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
