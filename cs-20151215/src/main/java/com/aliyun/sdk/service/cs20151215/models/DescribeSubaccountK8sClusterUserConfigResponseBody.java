// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
         * <p>The cluster kubeconfig file. For more information about the content of the kubeconfig file, see <a href="https://help.aliyun.com/document_detail/86494.html">Configure cluster credentials</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apiVersion: v1****</p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The expiration date of the kubeconfig file. The value is the UTC time displayed in RFC3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-10T09:56:17Z</p>
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
