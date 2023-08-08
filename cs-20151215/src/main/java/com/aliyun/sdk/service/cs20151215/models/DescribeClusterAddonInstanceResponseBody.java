// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterAddonInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterAddonInstanceResponseBody</p>
 */
public class DescribeClusterAddonInstanceResponseBody extends TeaModel {
    @NameInMap("config")
    private String config;

    @NameInMap("name")
    private String name;

    @NameInMap("state")
    private String state;

    @NameInMap("version")
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

        /**
         * config.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * state.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * version.
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
