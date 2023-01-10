// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAliasResponseBody} extends {@link TeaModel}
 *
 * <p>GetAliasResponseBody</p>
 */
public class GetAliasResponseBody extends TeaModel {
    @NameInMap("additionalVersionWeight")
    private java.util.Map < String, Float > additionalVersionWeight;

    @NameInMap("aliasName")
    private String aliasName;

    @NameInMap("createdTime")
    private String createdTime;

    @NameInMap("description")
    private String description;

    @NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @NameInMap("resolvePolicy")
    private String resolvePolicy;

    @NameInMap("routePolicy")
    private RoutePolicy routePolicy;

    @NameInMap("versionId")
    private String versionId;

    private GetAliasResponseBody(Builder builder) {
        this.additionalVersionWeight = builder.additionalVersionWeight;
        this.aliasName = builder.aliasName;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.resolvePolicy = builder.resolvePolicy;
        this.routePolicy = builder.routePolicy;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAliasResponseBody create() {
        return builder().build();
    }

    /**
     * @return additionalVersionWeight
     */
    public java.util.Map < String, Float > getAdditionalVersionWeight() {
        return this.additionalVersionWeight;
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
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
        private String aliasName; 
        private String createdTime; 
        private String description; 
        private String lastModifiedTime; 
        private String resolvePolicy; 
        private RoutePolicy routePolicy; 
        private String versionId; 

        /**
         * The canary release version to which the alias points and the weight of the canary release version. 
         * <p>
         * 
         * - The canary release version takes effect only when the function is invoked. 
         * - The value consists of a version number and the corresponding weight. For example, 2:0.05 indicates that when a function is invoked, Version 2 is the canary release version, 5% of the traffic is distributed to the canary release version, and 95% of the traffic is distributed to the major version.
         */
        public Builder additionalVersionWeight(java.util.Map < String, Float > additionalVersionWeight) {
            this.additionalVersionWeight = additionalVersionWeight;
            return this;
        }

        /**
         * The name of the alias.
         */
        public Builder aliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }

        /**
         * The time when the alias was created.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * The description of the alias.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The time when the alias was last modified.
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * The canary release mode. Valid values:
         * <p>
         * 
         * - **Random**: random canary release. This is the default value.
         * - **Content**: rule-based canary release.
         */
        public Builder resolvePolicy(String resolvePolicy) {
            this.resolvePolicy = resolvePolicy;
            return this;
        }

        /**
         * Canary release rule. The traffic that meets the conditions of the canary release rule is diverted to the canary release instances.
         */
        public Builder routePolicy(RoutePolicy routePolicy) {
            this.routePolicy = routePolicy;
            return this;
        }

        /**
         * The version to which the alias points.
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        public GetAliasResponseBody build() {
            return new GetAliasResponseBody(this);
        } 

    } 

}
