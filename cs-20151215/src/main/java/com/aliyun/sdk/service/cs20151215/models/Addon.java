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
 * {@link Addon} extends {@link TeaModel}
 *
 * <p>Addon</p>
 */
public class Addon extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("disabled")
    private Boolean disabled;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private Addon(Builder builder) {
        this.config = builder.config;
        this.disabled = builder.disabled;
        this.name = builder.name;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Addon create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return disabled
     */
    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String config; 
        private Boolean disabled; 
        private String name; 
        private String version; 

        private Builder() {
        } 

        private Builder(Addon model) {
            this.config = model.config;
            this.disabled = model.disabled;
            this.name = model.name;
            this.version = model.version;
        } 

        /**
         * <p>The component configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;IngressSlbNetworkType\&quot;:\&quot;internet\&quot;}</p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * <p>Specifies whether to disable default installation. When a cluster is created, in addition to required components, additional components such as log components are installed by default. You can disable this default behavior and install these components later by calling the component installation API or through the console. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Disables default installation.</li>
         * <li><code>false</code>: Allows default installation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        /**
         * <p>The component name.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx-ingress-controller</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The component version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.9.3-aliyun.1</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public Addon build() {
            return new Addon(this);
        } 

    } 

}
