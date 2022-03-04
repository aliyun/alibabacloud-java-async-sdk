// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterV2UserKubeconfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterV2UserKubeconfigResponseBody</p>
 */
public class DescribeClusterV2UserKubeconfigResponseBody extends TeaModel {
    @NameInMap("config")
    private String config;

    private DescribeClusterV2UserKubeconfigResponseBody(Builder builder) {
        this.config = builder.config;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterV2UserKubeconfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    public static final class Builder {
        private String config; 

        /**
         * kubeconfig内容。
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        public DescribeClusterV2UserKubeconfigResponseBody build() {
            return new DescribeClusterV2UserKubeconfigResponseBody(this);
        } 

    } 

}
