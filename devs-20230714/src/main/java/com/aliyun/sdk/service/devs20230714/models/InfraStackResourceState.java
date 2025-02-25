// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InfraStackResourceState} extends {@link TeaModel}
 *
 * <p>InfraStackResourceState</p>
 */
public class InfraStackResourceState extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("resourceDrifts")
    private java.util.List < ResourceDrift > resourceDrifts;

    @com.aliyun.core.annotation.NameInMap("resources")
    private java.util.List < ResourceDetail > resources;

    private InfraStackResourceState(Builder builder) {
        this.resourceDrifts = builder.resourceDrifts;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InfraStackResourceState create() {
        return builder().build();
    }

    /**
     * @return resourceDrifts
     */
    public java.util.List < ResourceDrift > getResourceDrifts() {
        return this.resourceDrifts;
    }

    /**
     * @return resources
     */
    public java.util.List < ResourceDetail > getResources() {
        return this.resources;
    }

    public static final class Builder {
        private java.util.List < ResourceDrift > resourceDrifts; 
        private java.util.List < ResourceDetail > resources; 

        /**
         * resourceDrifts.
         */
        public Builder resourceDrifts(java.util.List < ResourceDrift > resourceDrifts) {
            this.resourceDrifts = resourceDrifts;
            return this;
        }

        /**
         * resources.
         */
        public Builder resources(java.util.List < ResourceDetail > resources) {
            this.resources = resources;
            return this;
        }

        public InfraStackResourceState build() {
            return new InfraStackResourceState(this);
        } 

    } 

}
