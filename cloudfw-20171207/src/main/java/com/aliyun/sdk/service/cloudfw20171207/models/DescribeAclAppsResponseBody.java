// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeAclAppsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAclAppsResponseBody</p>
 */
public class DescribeAclAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclApps")
    private java.util.List<AclApps> aclApps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeAclAppsResponseBody(Builder builder) {
        this.aclApps = builder.aclApps;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAclAppsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclApps
     */
    public java.util.List<AclApps> getAclApps() {
        return this.aclApps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AclApps> aclApps; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAclAppsResponseBody model) {
            this.aclApps = model.aclApps;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * AclApps.
         */
        public Builder aclApps(java.util.List<AclApps> aclApps) {
            this.aclApps = aclApps;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAclAppsResponseBody build() {
            return new DescribeAclAppsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAclAppsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAclAppsResponseBody</p>
     */
    public static class AclApps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private Integer appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Popular")
        private Integer popular;

        @com.aliyun.core.annotation.NameInMap("Protocols")
        private java.util.List<String> protocols;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private Integer riskLevel;

        @com.aliyun.core.annotation.NameInMap("SupportFqdn")
        private Integer supportFqdn;

        private AclApps(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.popular = builder.popular;
            this.protocols = builder.protocols;
            this.riskLevel = builder.riskLevel;
            this.supportFqdn = builder.supportFqdn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclApps create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Integer getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return popular
         */
        public Integer getPopular() {
            return this.popular;
        }

        /**
         * @return protocols
         */
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

        /**
         * @return riskLevel
         */
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return supportFqdn
         */
        public Integer getSupportFqdn() {
            return this.supportFqdn;
        }

        public static final class Builder {
            private Integer appId; 
            private String appName; 
            private Integer popular; 
            private java.util.List<String> protocols; 
            private Integer riskLevel; 
            private Integer supportFqdn; 

            private Builder() {
            } 

            private Builder(AclApps model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.popular = model.popular;
                this.protocols = model.protocols;
                this.riskLevel = model.riskLevel;
                this.supportFqdn = model.supportFqdn;
            } 

            /**
             * AppId.
             */
            public Builder appId(Integer appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * Popular.
             */
            public Builder popular(Integer popular) {
                this.popular = popular;
                return this;
            }

            /**
             * Protocols.
             */
            public Builder protocols(java.util.List<String> protocols) {
                this.protocols = protocols;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * SupportFqdn.
             */
            public Builder supportFqdn(Integer supportFqdn) {
                this.supportFqdn = supportFqdn;
                return this;
            }

            public AclApps build() {
                return new AclApps(this);
            } 

        } 

    }
}
