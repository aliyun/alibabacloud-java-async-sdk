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
 * {@link DescribeClusterUserKubeconfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterUserKubeconfigResponseBody</p>
 */
public class DescribeClusterUserKubeconfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("expiration")
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
     * @return expiration
     */
    public String getExpiration() {
        return this.expiration;
    }

    public static final class Builder {
        private String config; 
        private String expiration; 

        private Builder() {
        } 

        private Builder(DescribeClusterUserKubeconfigResponseBody model) {
            this.config = model.config;
            this.expiration = model.expiration;
        } 

        /**
         * <p>The kubeconfig file of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>apiVersion: v1****</p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The expiration time of the kubeconfig file. Format: the UTC time in the RFC3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-10T09:56:17Z</p>
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
