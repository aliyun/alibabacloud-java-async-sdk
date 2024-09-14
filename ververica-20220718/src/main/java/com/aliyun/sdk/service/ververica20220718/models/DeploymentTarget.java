// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeploymentTarget} extends {@link TeaModel}
 *
 * <p>DeploymentTarget</p>
 */
public class DeploymentTarget extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("quota")
    private ResourceQuota quota;

    private DeploymentTarget(Builder builder) {
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.quota = builder.quota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeploymentTarget create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return quota
     */
    public ResourceQuota getQuota() {
        return this.quota;
    }

    public static final class Builder {
        private String name; 
        private String namespace; 
        private ResourceQuota quota; 

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * quota.
         */
        public Builder quota(ResourceQuota quota) {
            this.quota = quota;
            return this;
        }

        public DeploymentTarget build() {
            return new DeploymentTarget(this);
        } 

    } 

}
