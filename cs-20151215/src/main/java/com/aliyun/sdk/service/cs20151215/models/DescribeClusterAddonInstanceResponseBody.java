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
 * {@link DescribeClusterAddonInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterAddonInstanceResponseBody</p>
 */
public class DescribeClusterAddonInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private DescribeClusterAddonInstanceResponseBody(Builder builder) {
        this.config = builder.config;
        this.name = builder.name;
        this.state = builder.state;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterAddonInstanceResponseBody create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String config; 
        private String name; 
        private String state; 
        private String version; 

        private Builder() {
        } 

        private Builder(DescribeClusterAddonInstanceResponseBody model) {
            this.config = model.config;
            this.name = model.name;
            this.state = model.state;
            this.version = model.version;
        } 

        /**
         * <p>The configuration of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NetworkPolicy&quot;:&quot;true&quot;}</p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The name of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>terway-eniip</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The status of the component. Valid values:</p>
         * <ul>
         * <li>initial: The component is being installed.</li>
         * <li>active: The component has been installed.</li>
         * <li>unhealthy: The component is in an abnormal state.</li>
         * <li>upgrading: The component is undergoing an upgrade.</li>
         * <li>updating: Component configuration changes are being applied.</li>
         * <li>deleting: The component is being uninstalled.</li>
         * <li>deleted: The component has been deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The version of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.4.3</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public DescribeClusterAddonInstanceResponseBody build() {
            return new DescribeClusterAddonInstanceResponseBody(this);
        } 

    } 

}
