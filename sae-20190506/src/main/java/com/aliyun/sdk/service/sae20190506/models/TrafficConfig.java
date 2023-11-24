// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrafficConfig} extends {@link TeaModel}
 *
 * <p>TrafficConfig</p>
 */
public class TrafficConfig extends TeaModel {
    @NameInMap("additionalVersionWeight")
    private java.util.Map < String, Float > additionalVersionWeight;

    @NameInMap("createdTime")
    private String createdTime;

    @NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("resolvePolicy")
    private String resolvePolicy;

    @NameInMap("routePolicy")
    private RoutePolicy routePolicy;

    @NameInMap("versionId")
    private String versionId;

    private TrafficConfig(Builder builder) {
        this.additionalVersionWeight = builder.additionalVersionWeight;
        this.createdTime = builder.createdTime;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.requestId = builder.requestId;
        this.resolvePolicy = builder.resolvePolicy;
        this.routePolicy = builder.routePolicy;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrafficConfig create() {
        return builder().build();
    }

    /**
     * @return additionalVersionWeight
     */
    public java.util.Map < String, Float > getAdditionalVersionWeight() {
        return this.additionalVersionWeight;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String createdTime; 
        private String lastModifiedTime; 
        private String requestId; 
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
         * createdTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * lastModifiedTime.
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public TrafficConfig build() {
            return new TrafficConfig(this);
        } 

    } 

}
