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
 * {@link DescribeClusterV2UserKubeconfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterV2UserKubeconfigResponseBody</p>
 */
public class DescribeClusterV2UserKubeconfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("config")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    public static final class Builder {
        private String config; 

        private Builder() {
        } 

        private Builder(DescribeClusterV2UserKubeconfigResponseBody model) {
            this.config = model.config;
        } 

        /**
         * config.
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
