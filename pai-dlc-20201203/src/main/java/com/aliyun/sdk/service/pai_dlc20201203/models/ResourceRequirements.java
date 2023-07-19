// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResourceRequirements} extends {@link TeaModel}
 *
 * <p>ResourceRequirements</p>
 */
public class ResourceRequirements extends TeaModel {
    @NameInMap("Limits")
    private java.util.Map < String, String > limits;

    @NameInMap("Requests")
    private java.util.Map < String, String > requests;

    private ResourceRequirements(Builder builder) {
        this.limits = builder.limits;
        this.requests = builder.requests;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceRequirements create() {
        return builder().build();
    }

    /**
     * @return limits
     */
    public java.util.Map < String, String > getLimits() {
        return this.limits;
    }

    /**
     * @return requests
     */
    public java.util.Map < String, String > getRequests() {
        return this.requests;
    }

    public static final class Builder {
        private java.util.Map < String, String > limits; 
        private java.util.Map < String, String > requests; 

        /**
         * Limits.
         */
        public Builder limits(java.util.Map < String, String > limits) {
            this.limits = limits;
            return this;
        }

        /**
         * Requests.
         */
        public Builder requests(java.util.Map < String, String > requests) {
            this.requests = requests;
            return this;
        }

        public ResourceRequirements build() {
            return new ResourceRequirements(this);
        } 

    } 

}
