// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeL2VipsByDomainResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeL2VipsByDomainResponseBody</p>
 */
public class DescribeL2VipsByDomainResponseBody extends TeaModel {
    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Vips")
    private Vips vips;

    private DescribeL2VipsByDomainResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.requestId = builder.requestId;
        this.vips = builder.vips;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeL2VipsByDomainResponseBody create() {
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

        public DescribeL2VipsByDomainResponseBody build() {
            return new DescribeL2VipsByDomainResponseBody(this);
        } 

    } 

    public static class Vips extends TeaModel {
        @NameInMap("Vip")
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
