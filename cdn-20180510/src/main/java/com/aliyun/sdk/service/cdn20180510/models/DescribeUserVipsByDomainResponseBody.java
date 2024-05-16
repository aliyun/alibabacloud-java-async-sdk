// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserVipsByDomainResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserVipsByDomainResponseBody</p>
 */
public class DescribeUserVipsByDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Vips")
    private Vips vips;

    private DescribeUserVipsByDomainResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.requestId = builder.requestId;
        this.vips = builder.vips;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserVipsByDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vips
     */
    public Vips getVips() {
        return this.vips;
    }

    public static final class Builder {
        private String domainName; 
        private String requestId; 
        private Vips vips; 

        /**
         * The domain name.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of VIPs.
         */
        public Builder vips(Vips vips) {
            this.vips = vips;
            return this;
        }

        public DescribeUserVipsByDomainResponseBody build() {
            return new DescribeUserVipsByDomainResponseBody(this);
        } 

    } 

    public static class Vips extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Vip")
        private java.util.List < String > vip;

        private Vips(Builder builder) {
            this.vip = builder.vip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vips create() {
            return builder().build();
        }

        /**
         * @return vip
         */
        public java.util.List < String > getVip() {
            return this.vip;
        }

        public static final class Builder {
            private java.util.List < String > vip; 

            /**
             * Vip.
             */
            public Builder vip(java.util.List < String > vip) {
                this.vip = vip;
                return this;
            }

            public Vips build() {
                return new Vips(this);
            } 

        } 

    }
}
