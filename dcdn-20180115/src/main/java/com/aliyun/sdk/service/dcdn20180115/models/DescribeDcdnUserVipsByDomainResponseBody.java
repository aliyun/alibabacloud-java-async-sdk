// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

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
 * {@link DescribeDcdnUserVipsByDomainResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnUserVipsByDomainResponseBody</p>
 */
public class DescribeDcdnUserVipsByDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Vips")
    private Vips vips;

    private DescribeDcdnUserVipsByDomainResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.requestId = builder.requestId;
        this.vips = builder.vips;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnUserVipsByDomainResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDcdnUserVipsByDomainResponseBody model) {
            this.domainName = model.domainName;
            this.requestId = model.requestId;
            this.vips = model.vips;
        } 

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>820E7900-5CA9-4AEF-B0DD-20ED5F64BE55</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of VIPs.</p>
         */
        public Builder vips(Vips vips) {
            this.vips = vips;
            return this;
        }

        public DescribeDcdnUserVipsByDomainResponseBody build() {
            return new DescribeDcdnUserVipsByDomainResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnUserVipsByDomainResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnUserVipsByDomainResponseBody</p>
     */
    public static class Vips extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Vip")
        private java.util.List<String> vip;

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
        public java.util.List<String> getVip() {
            return this.vip;
        }

        public static final class Builder {
            private java.util.List<String> vip; 

            private Builder() {
            } 

            private Builder(Vips model) {
                this.vip = model.vip;
            } 

            /**
             * Vip.
             */
            public Builder vip(java.util.List<String> vip) {
                this.vip = vip;
                return this;
            }

            public Vips build() {
                return new Vips(this);
            } 

        } 

    }
}
