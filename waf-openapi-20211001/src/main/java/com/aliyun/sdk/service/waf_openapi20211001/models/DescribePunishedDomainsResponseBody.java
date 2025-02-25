// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribePunishedDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePunishedDomainsResponseBody</p>
 */
public class DescribePunishedDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PunishedDomains")
    private java.util.List<String> punishedDomains;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<String> getPunishedDomains() {
        return this.punishedDomains;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> punishedDomains; 
        private String requestId; 

        /**
         * <p>The domain names that are penalized for failing to obtain an ICP filing.</p>
         */
        public Builder punishedDomains(java.util.List<String> punishedDomains) {
            this.punishedDomains = punishedDomains;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B1F4D802-55A1-5D53-A247-7E79****85E7</p>
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
