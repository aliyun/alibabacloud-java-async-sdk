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
 * {@link DescribeControlPolicyDomainResolveResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeControlPolicyDomainResolveResponseBody</p>
 */
public class DescribeControlPolicyDomainResolveResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResolveResult")
    private java.util.List<ResolveResult> resolveResult;

    private DescribeControlPolicyDomainResolveResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resolveResult = builder.resolveResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeControlPolicyDomainResolveResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resolveResult
     */
    public java.util.List<ResolveResult> getResolveResult() {
        return this.resolveResult;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ResolveResult> resolveResult; 

        private Builder() {
        } 

        private Builder(DescribeControlPolicyDomainResolveResponseBody model) {
            this.requestId = model.requestId;
            this.resolveResult = model.resolveResult;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResolveResult.
         */
        public Builder resolveResult(java.util.List<ResolveResult> resolveResult) {
            this.resolveResult = resolveResult;
            return this;
        }

        public DescribeControlPolicyDomainResolveResponseBody build() {
            return new DescribeControlPolicyDomainResolveResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeControlPolicyDomainResolveResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeControlPolicyDomainResolveResponseBody</p>
     */
    public static class ResolveResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("IpAddrList")
        private java.util.List<String> ipAddrList;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private Integer ipVersion;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private ResolveResult(Builder builder) {
            this.domain = builder.domain;
            this.ipAddrList = builder.ipAddrList;
            this.ipVersion = builder.ipVersion;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResolveResult create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return ipAddrList
         */
        public java.util.List<String> getIpAddrList() {
            return this.ipAddrList;
        }

        /**
         * @return ipVersion
         */
        public Integer getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String domain; 
            private java.util.List<String> ipAddrList; 
            private Integer ipVersion; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(ResolveResult model) {
                this.domain = model.domain;
                this.ipAddrList = model.ipAddrList;
                this.ipVersion = model.ipVersion;
                this.updateTime = model.updateTime;
            } 

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * IpAddrList.
             */
            public Builder ipAddrList(java.util.List<String> ipAddrList) {
                this.ipAddrList = ipAddrList;
                return this;
            }

            /**
             * IpVersion.
             */
            public Builder ipVersion(Integer ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ResolveResult build() {
                return new ResolveResult(this);
            } 

        } 

    }
}
