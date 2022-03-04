// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterUserKubeconfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterUserKubeconfigResponseBody</p>
 */
public class DescribeClusterUserKubeconfigResponseBody extends TeaModel {
    @NameInMap("config")
    private String config;

    @NameInMap("expiration")
    private String expiration;

    private DescribeClusterUserKubeconfigResponseBody(Builder builder) {
        this.config = builder.config;
        this.expiration = builder.expiration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterUserKubeconfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return expiration
     */
    public String getExpiration() {
        return this.expiration;
    }

    public static final class Builder {
        private String config; 
        private String expiration; 

        /**
         * The cluster access configuration. For more information about how to view cluster access configurations, see [configure cluster credentials](~~ 86494 ~~).
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * The expiration time of kubeconfig. Format: UTC time in RFC3339 format.
         */
        public Builder expiration(String expiration) {
            this.expiration = expiration;
            return this;
        }

        public DescribeClusterUserKubeconfigResponseBody build() {
            return new DescribeClusterUserKubeconfigResponseBody(this);
        } 

    } 

}
