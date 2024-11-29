// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateIPv6TranslatorEntryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIPv6TranslatorEntryResponseBody</p>
 */
public class CreateIPv6TranslatorEntryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ipv6TranslatorEntryId")
    private String ipv6TranslatorEntryId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateIPv6TranslatorEntryResponseBody(Builder builder) {
        this.ipv6TranslatorEntryId = builder.ipv6TranslatorEntryId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIPv6TranslatorEntryResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipv6TranslatorEntryId
     */
    public String getIpv6TranslatorEntryId() {
        return this.ipv6TranslatorEntryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ipv6TranslatorEntryId; 
        private String requestId; 

        /**
         * <p>The ID of the IPv6 Translation Service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv6transentry-xxxxxxxx</p>
         */
        public Builder ipv6TranslatorEntryId(String ipv6TranslatorEntryId) {
            this.ipv6TranslatorEntryId = ipv6TranslatorEntryId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DCE5D25-FFC9-492A-8371-12A4E0EE2E05</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIPv6TranslatorEntryResponseBody build() {
            return new CreateIPv6TranslatorEntryResponseBody(this);
        } 

    } 

}
