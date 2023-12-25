// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterConfigResponseBody</p>
 */
public class DescribeDBClusterConfigResponseBody extends TeaModel {
    @NameInMap("Config")
    private String config;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterConfigResponseBody(Builder builder) {
        this.config = builder.config;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterConfigResponseBody create() {
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
         * The information about the parameter settings of the cluster.
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

        public DescribeDBClusterConfigResponseBody build() {
            return new DescribeDBClusterConfigResponseBody(this);
        } 

    } 

}
