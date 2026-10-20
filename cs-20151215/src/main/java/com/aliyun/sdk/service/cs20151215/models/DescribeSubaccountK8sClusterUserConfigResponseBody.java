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
 * {@link DescribeSubaccountK8sClusterUserConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSubaccountK8sClusterUserConfigResponseBody</p>
 */
public class DescribeSubaccountK8sClusterUserConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.NameInMap("expiration")
    private String expiration;

    private DescribeSubaccountK8sClusterUserConfigResponseBody(Builder builder) {
        this.config = builder.config;
        this.expiration = builder.expiration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSubaccountK8sClusterUserConfigResponseBody create() {
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

        private Builder(DescribeSubaccountK8sClusterUserConfigResponseBody model) {
            this.config = model.config;
            this.expiration = model.expiration;
        } 

        /**
         * <p>The KubeConfig of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apiVersion: v1\nclusters:\n- cluster:\n    server: <a href="https://114.55.xx.xx:6443%5C%5Cn">https://114.55.xx.xx:6443\\n</a>    certificate-authority-data: LS0tLS****</p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The expiration time of the KubeConfig. Format: UTC time in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2028-04-09T06:20:47Z</p>
         */
        public Builder expiration(String expiration) {
            this.expiration = expiration;
            return this;
        }

        public DescribeSubaccountK8sClusterUserConfigResponseBody build() {
            return new DescribeSubaccountK8sClusterUserConfigResponseBody(this);
        } 

    } 

}
