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
         * kubeconfig内容。
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * kubeconfig过期时间。格式：RFC3339 格式的 UTC 时间。
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
