// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainResolveResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainResolveResponseBody</p>
 */
public class DescribeDomainResolveResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResolveResult")
    private ResolveResult resolveResult;

    private DescribeDomainResolveResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resolveResult = builder.resolveResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainResolveResponseBody create() {
        return builder().build();
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
    public ResolveResult getResolveResult() {
        return this.resolveResult;
    }

    public static final class Builder {
        private String requestId; 
        private ResolveResult resolveResult; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details about the DNS record of the domain name.
         */
        public Builder resolveResult(ResolveResult resolveResult) {
            this.resolveResult = resolveResult;
            return this;
        }

        public DescribeDomainResolveResponseBody build() {
            return new DescribeDomainResolveResponseBody(this);
        } 

    } 

    public static class ResolveResult extends TeaModel {
        @NameInMap("IpAddrs")
        private String ipAddrs;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private ResolveResult(Builder builder) {
            this.ipAddrs = builder.ipAddrs;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResolveResult create() {
            return builder().build();
        }

        /**
         * @return ipAddrs
         */
        public String getIpAddrs() {
            return this.ipAddrs;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String ipAddrs; 
            private Long updateTime; 

            /**
             * The IP address to which the domain name is resolved. Multiple IP addresses are separated by commas (,).
             */
            public Builder ipAddrs(String ipAddrs) {
                this.ipAddrs = ipAddrs;
                return this;
            }

            /**
             * The time when the domain name was resolved. The value of this parameter is a timestamp. Unit: seconds.
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
