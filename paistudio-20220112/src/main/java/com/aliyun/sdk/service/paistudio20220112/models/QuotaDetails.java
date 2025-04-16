// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link QuotaDetails} extends {@link TeaModel}
 *
 * <p>QuotaDetails</p>
 */
public class QuotaDetails extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActualMinQuota")
    private ResourceAmount actualMinQuota;

    @com.aliyun.core.annotation.NameInMap("AllocatedQuota")
    private ResourceAmount allocatedQuota;

    @com.aliyun.core.annotation.NameInMap("AncestorsAllocatedQuota")
    private ResourceAmount ancestorsAllocatedQuota;

    @com.aliyun.core.annotation.NameInMap("DescendantsAllocatedQuota")
    private ResourceAmount descendantsAllocatedQuota;

    @com.aliyun.core.annotation.NameInMap("DesiredMinQuota")
    private ResourceAmount desiredMinQuota;

    @com.aliyun.core.annotation.NameInMap("RequestedQuota")
    private ResourceAmount requestedQuota;

    @com.aliyun.core.annotation.NameInMap("SelfAllocatedQuota")
    private ResourceAmount selfAllocatedQuota;

    @com.aliyun.core.annotation.NameInMap("UsedQuota")
    private ResourceAmount usedQuota;

    private QuotaDetails(Builder builder) {
        this.actualMinQuota = builder.actualMinQuota;
        this.allocatedQuota = builder.allocatedQuota;
        this.ancestorsAllocatedQuota = builder.ancestorsAllocatedQuota;
        this.descendantsAllocatedQuota = builder.descendantsAllocatedQuota;
        this.desiredMinQuota = builder.desiredMinQuota;
        this.requestedQuota = builder.requestedQuota;
        this.selfAllocatedQuota = builder.selfAllocatedQuota;
        this.usedQuota = builder.usedQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuotaDetails create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actualMinQuota
     */
    public ResourceAmount getActualMinQuota() {
        return this.actualMinQuota;
    }

    /**
     * @return allocatedQuota
     */
    public ResourceAmount getAllocatedQuota() {
        return this.allocatedQuota;
    }

    /**
     * @return ancestorsAllocatedQuota
     */
    public ResourceAmount getAncestorsAllocatedQuota() {
        return this.ancestorsAllocatedQuota;
    }

    /**
     * @return descendantsAllocatedQuota
     */
    public ResourceAmount getDescendantsAllocatedQuota() {
        return this.descendantsAllocatedQuota;
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
     * @return selfAllocatedQuota
     */
    public ResourceAmount getSelfAllocatedQuota() {
        return this.selfAllocatedQuota;
    }

    /**
     * @return usedQuota
     */
    public ResourceAmount getUsedQuota() {
        return this.usedQuota;
    }

    public static final class Builder {
        private ResourceAmount actualMinQuota; 
        private ResourceAmount allocatedQuota; 
        private ResourceAmount ancestorsAllocatedQuota; 
        private ResourceAmount descendantsAllocatedQuota; 
        private ResourceAmount desiredMinQuota; 
        private ResourceAmount requestedQuota; 
        private ResourceAmount selfAllocatedQuota; 
        private ResourceAmount usedQuota; 

        private Builder() {
        } 

        private Builder(QuotaDetails model) {
            this.actualMinQuota = model.actualMinQuota;
            this.allocatedQuota = model.allocatedQuota;
            this.ancestorsAllocatedQuota = model.ancestorsAllocatedQuota;
            this.descendantsAllocatedQuota = model.descendantsAllocatedQuota;
            this.desiredMinQuota = model.desiredMinQuota;
            this.requestedQuota = model.requestedQuota;
            this.selfAllocatedQuota = model.selfAllocatedQuota;
            this.usedQuota = model.usedQuota;
        } 

        /**
         * ActualMinQuota.
         */
        public Builder actualMinQuota(ResourceAmount actualMinQuota) {
            this.actualMinQuota = actualMinQuota;
            return this;
        }

        /**
         * AllocatedQuota.
         */
        public Builder allocatedQuota(ResourceAmount allocatedQuota) {
            this.allocatedQuota = allocatedQuota;
            return this;
        }

        /**
         * AncestorsAllocatedQuota.
         */
        public Builder ancestorsAllocatedQuota(ResourceAmount ancestorsAllocatedQuota) {
            this.ancestorsAllocatedQuota = ancestorsAllocatedQuota;
            return this;
        }

        /**
         * DescendantsAllocatedQuota.
         */
        public Builder descendantsAllocatedQuota(ResourceAmount descendantsAllocatedQuota) {
            this.descendantsAllocatedQuota = descendantsAllocatedQuota;
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
         * SelfAllocatedQuota.
         */
        public Builder selfAllocatedQuota(ResourceAmount selfAllocatedQuota) {
            this.selfAllocatedQuota = selfAllocatedQuota;
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
