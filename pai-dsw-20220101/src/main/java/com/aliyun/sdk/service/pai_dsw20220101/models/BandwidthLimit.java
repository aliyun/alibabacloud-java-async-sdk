// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link BandwidthLimit} extends {@link TeaModel}
 *
 * <p>BandwidthLimit</p>
 */
public class BandwidthLimit extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EgressRate")
    private String egressRate;

    @com.aliyun.core.annotation.NameInMap("EgressWhitelists")
    private java.util.List<String> egressWhitelists;

    @com.aliyun.core.annotation.NameInMap("IngressRate")
    private String ingressRate;

    @com.aliyun.core.annotation.NameInMap("IngressWhitelists")
    private java.util.List<String> ingressWhitelists;

    private BandwidthLimit(Builder builder) {
        this.egressRate = builder.egressRate;
        this.egressWhitelists = builder.egressWhitelists;
        this.ingressRate = builder.ingressRate;
        this.ingressWhitelists = builder.ingressWhitelists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BandwidthLimit create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return egressRate
     */
    public String getEgressRate() {
        return this.egressRate;
    }

    /**
     * @return egressWhitelists
     */
    public java.util.List<String> getEgressWhitelists() {
        return this.egressWhitelists;
    }

    /**
     * @return ingressRate
     */
    public String getIngressRate() {
        return this.ingressRate;
    }

    /**
     * @return ingressWhitelists
     */
    public java.util.List<String> getIngressWhitelists() {
        return this.ingressWhitelists;
    }

    public static final class Builder {
        private String egressRate; 
        private java.util.List<String> egressWhitelists; 
        private String ingressRate; 
        private java.util.List<String> ingressWhitelists; 

        private Builder() {
        } 

        private Builder(BandwidthLimit model) {
            this.egressRate = model.egressRate;
            this.egressWhitelists = model.egressWhitelists;
            this.ingressRate = model.ingressRate;
            this.ingressWhitelists = model.ingressWhitelists;
        } 

        /**
         * EgressRate.
         */
        public Builder egressRate(String egressRate) {
            this.egressRate = egressRate;
            return this;
        }

        /**
         * EgressWhitelists.
         */
        public Builder egressWhitelists(java.util.List<String> egressWhitelists) {
            this.egressWhitelists = egressWhitelists;
            return this;
        }

        /**
         * IngressRate.
         */
        public Builder ingressRate(String ingressRate) {
            this.ingressRate = ingressRate;
            return this;
        }

        /**
         * IngressWhitelists.
         */
        public Builder ingressWhitelists(java.util.List<String> ingressWhitelists) {
            this.ingressWhitelists = ingressWhitelists;
            return this;
        }

        public BandwidthLimit build() {
            return new BandwidthLimit(this);
        } 

    } 

}
