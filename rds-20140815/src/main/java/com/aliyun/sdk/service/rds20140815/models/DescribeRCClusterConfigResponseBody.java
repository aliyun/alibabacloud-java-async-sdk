// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCClusterConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCClusterConfigResponseBody</p>
 */
public class DescribeRCClusterConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("Expiration")
    private String expiration;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRCClusterConfigResponseBody(Builder builder) {
        this.config = builder.config;
        this.expiration = builder.expiration;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCClusterConfigResponseBody create() {
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String config; 
        private String expiration; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRCClusterConfigResponseBody model) {
            this.config = model.config;
            this.expiration = model.expiration;
            this.requestId = model.requestId;
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

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E9DD55F4-1A5F-48CA-BA57-DFB3CA8C4C34</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRCClusterConfigResponseBody build() {
            return new DescribeRCClusterConfigResponseBody(this);
        } 

    } 

}
