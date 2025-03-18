// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link ContainerdConfig} extends {@link TeaModel}
 *
 * <p>ContainerdConfig</p>
 */
public class ContainerdConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("insecureRegistries")
    private java.util.List<String> insecureRegistries;

    @com.aliyun.core.annotation.NameInMap("registryMirrors")
    private java.util.List<String> registryMirrors;

    private ContainerdConfig(Builder builder) {
        this.insecureRegistries = builder.insecureRegistries;
        this.registryMirrors = builder.registryMirrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContainerdConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return insecureRegistries
     */
    public java.util.List<String> getInsecureRegistries() {
        return this.insecureRegistries;
    }

    /**
     * @return registryMirrors
     */
    public java.util.List<String> getRegistryMirrors() {
        return this.registryMirrors;
    }

    public static final class Builder {
        private java.util.List<String> insecureRegistries; 
        private java.util.List<String> registryMirrors; 

        private Builder() {
        } 

        private Builder(ContainerdConfig model) {
            this.insecureRegistries = model.insecureRegistries;
            this.registryMirrors = model.registryMirrors;
        } 

        /**
         * insecureRegistries.
         */
        public Builder insecureRegistries(java.util.List<String> insecureRegistries) {
            this.insecureRegistries = insecureRegistries;
            return this;
        }

        /**
         * registryMirrors.
         */
        public Builder registryMirrors(java.util.List<String> registryMirrors) {
            this.registryMirrors = registryMirrors;
            return this;
        }

        public ContainerdConfig build() {
            return new ContainerdConfig(this);
        } 

    } 

}
