// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainPropertyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainPropertyResponseBody</p>
 */
public class DescribeDcdnDomainPropertyResponseBody extends TeaModel {
    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("Protocol")
    private String protocol;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnDomainPropertyResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.protocol = builder.protocol;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainPropertyResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String domainName; 
        private String protocol; 
        private String requestId; 

        /**
         * The accelerated domain name.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * The protocol. Valid values:
         * <p>
         * 
         * *   **udp**
         * *   **tcp**
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnDomainPropertyResponseBody build() {
            return new DescribeDcdnDomainPropertyResponseBody(this);
        } 

    } 

}
