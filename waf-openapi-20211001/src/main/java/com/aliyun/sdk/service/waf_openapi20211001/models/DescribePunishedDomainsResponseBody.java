// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePunishedDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePunishedDomainsResponseBody</p>
 */
public class DescribePunishedDomainsResponseBody extends TeaModel {
    @NameInMap("PunishedDomains")
    private java.util.List < String > punishedDomains;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePunishedDomainsResponseBody(Builder builder) {
        this.punishedDomains = builder.punishedDomains;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePunishedDomainsResponseBody create() {
        return builder().build();
    }

    /**
     * @return punishedDomains
     */
    public java.util.List < String > getPunishedDomains() {
        return this.punishedDomains;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > punishedDomains; 
        private String requestId; 

        /**
         * The domain names that are penalized for failing to obtain an ICP filing.
         */
        public Builder punishedDomains(java.util.List < String > punishedDomains) {
            this.punishedDomains = punishedDomains;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePunishedDomainsResponseBody build() {
            return new DescribePunishedDomainsResponseBody(this);
        } 

    } 

}
