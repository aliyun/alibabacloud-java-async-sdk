// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnL2VipsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnL2VipsResponseBody</p>
 */
public class DescribeDcdnL2VipsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Vips")
    private java.util.List < String > vips;

    private DescribeDcdnL2VipsResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.requestId = builder.requestId;
        this.vips = builder.vips;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnL2VipsResponseBody create() {
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
    public java.util.List < String > getVips() {
        return this.vips;
    }

    public static final class Builder {
        private String domainName; 
        private String requestId; 
        private java.util.List < String > vips; 

        /**
         * <p>The accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>820E7900-5CA9-4AEF-B0DD-20ED5F64BE55</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The virtual IP addresses (VIPs).</p>
         */
        public Builder vips(java.util.List < String > vips) {
            this.vips = vips;
            return this;
        }

        public DescribeDcdnL2VipsResponseBody build() {
            return new DescribeDcdnL2VipsResponseBody(this);
        } 

    } 

}
