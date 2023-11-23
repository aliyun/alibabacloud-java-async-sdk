// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuotaDetails} extends {@link TeaModel}
 *
 * <p>QuotaDetails</p>
 */
public class QuotaDetails extends TeaModel {
    @NameInMap("ActualMinQuota")
    private ResourceAmount actualMinQuota;

    @NameInMap("DesiredMinQuota")
    private ResourceAmount desiredMinQuota;

    @NameInMap("RequestedQuota")
    private ResourceAmount requestedQuota;

    @NameInMap("UsedQuota")
    private ResourceAmount usedQuota;

    private QuotaDetails(Builder builder) {
        this.actualMinQuota = builder.actualMinQuota;
        this.desiredMinQuota = builder.desiredMinQuota;
        this.requestedQuota = builder.requestedQuota;
        this.usedQuota = builder.usedQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuotaDetails create() {
        return builder().build();
    }

    /**
     * @return actualMinQuota
     */
    public ResourceAmount getActualMinQuota() {
        return this.actualMinQuota;
    }

    /**
     * @return desiredMinQuota
     */
    public ResourceAmount getDesiredMinQuota() {
        return this.desiredMinQuota;
    }

    /**
     * @return requestedQuota
     */
    public ResourceAmount getRequestedQuota() {
        return this.requestedQuota;
    }

    /**
     * @return usedQuota
     */
    public ResourceAmount getUsedQuota() {
        return this.usedQuota;
    }

    public static final class Builder {
        private ResourceAmount actualMinQuota; 
        private ResourceAmount desiredMinQuota; 
        private ResourceAmount requestedQuota; 
        private ResourceAmount usedQuota; 

        /**
         * ActualMinQuota.
         */
        public Builder actualMinQuota(ResourceAmount actualMinQuota) {
            this.actualMinQuota = actualMinQuota;
            return this;
        }

        /**
         * DesiredMinQuota.
         */
        public Builder desiredMinQuota(ResourceAmount desiredMinQuota) {
            this.desiredMinQuota = desiredMinQuota;
            return this;
        }

        /**
         * RequestedQuota.
         */
        public Builder requestedQuota(ResourceAmount requestedQuota) {
            this.requestedQuota = requestedQuota;
            return this;
        }

        /**
         * UsedQuota.
         */
        public Builder usedQuota(ResourceAmount usedQuota) {
            this.usedQuota = usedQuota;
            return this;
        }

        public QuotaDetails build() {
            return new QuotaDetails(this);
        } 

    } 

}
