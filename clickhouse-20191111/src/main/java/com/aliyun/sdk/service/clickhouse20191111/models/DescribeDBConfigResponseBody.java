// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBConfigResponseBody</p>
 */
public class DescribeDBConfigResponseBody extends TeaModel {
    @NameInMap("Config")
    private String config;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBConfigResponseBody(Builder builder) {
        this.config = builder.config;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String config; 
        private String requestId; 

        /**
         * The configuration information about the cluster.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBConfigResponseBody build() {
            return new DescribeDBConfigResponseBody(this);
        } 

    } 

}
