// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateApplicationTrafficConfigInput} extends {@link TeaModel}
 *
 * <p>UpdateApplicationTrafficConfigInput</p>
 */
public class UpdateApplicationTrafficConfigInput extends TeaModel {
    @NameInMap("additionalVersionWeight")
    private java.util.Map < String, Float > additionalVersionWeight;

    @NameInMap("resolvePolicy")
    private String resolvePolicy;

    @NameInMap("routePolicy")
    private RoutePolicy routePolicy;

    @NameInMap("versionId")
    @Validation(maxLength = 10, minLength = 1)
    private String versionId;

    private UpdateApplicationTrafficConfigInput(Builder builder) {
        this.additionalVersionWeight = builder.additionalVersionWeight;
        this.resolvePolicy = builder.resolvePolicy;
        this.routePolicy = builder.routePolicy;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationTrafficConfigInput create() {
        return builder().build();
    }

    /**
     * @return additionalVersionWeight
     */
    public java.util.Map < String, Float > getAdditionalVersionWeight() {
        return this.additionalVersionWeight;
    }

    /**
     * @return resolvePolicy
     */
    public String getResolvePolicy() {
        return this.resolvePolicy;
    }

    /**
     * @return routePolicy
     */
    public RoutePolicy getRoutePolicy() {
        return this.routePolicy;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder {
        private java.util.Map < String, Float > additionalVersionWeight; 
        private String resolvePolicy; 
        private RoutePolicy routePolicy; 
        private String versionId; 

        /**
         * additionalVersionWeight.
         */
        public Builder additionalVersionWeight(java.util.Map < String, Float > additionalVersionWeight) {
            this.additionalVersionWeight = additionalVersionWeight;
            return this;
        }

        /**
         * resolvePolicy.
         */
        public Builder resolvePolicy(String resolvePolicy) {
            this.resolvePolicy = resolvePolicy;
            return this;
        }

        /**
         * routePolicy.
         */
        public Builder routePolicy(RoutePolicy routePolicy) {
            this.routePolicy = routePolicy;
            return this;
        }

        /**
         * versionId.
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        public UpdateApplicationTrafficConfigInput build() {
            return new UpdateApplicationTrafficConfigInput(this);
        } 

    } 

}
