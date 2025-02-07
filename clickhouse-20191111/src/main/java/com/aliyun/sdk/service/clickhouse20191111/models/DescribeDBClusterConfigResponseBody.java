// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

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
 * {@link DescribeDBClusterConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterConfigResponseBody</p>
 */
public class DescribeDBClusterConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information about the parameter settings of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>[ { &quot;name&quot;: &quot;keep_alive_timeout&quot;, &quot;defaultValue&quot;: 300, &quot;currentValue&quot;: 300, &quot;restart&quot;: true, &quot;valueRange&quot;: &quot;&gt;0&quot;, &quot;desc&quot;: &quot;The number of seconds that ClickHouse waits for incoming requests before closing the connection.&quot; }, ... ,{ &quot;name&quot;: &quot;max_partition_size_to_drop&quot;, &quot;defaultValue&quot;: 0, &quot;currentValue&quot;: 0, &quot;restart&quot;: true, &quot;valueRange&quot;: &quot;&gt;=0&quot;, &quot;desc&quot;: &quot;If the size of a MergeTree partition exceeds max_partition_size_to_drop (in bytes), you can’t delete it using a DROP query.&quot; } ]</p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9A23C87D-87DF-4DA0-A50E-CB13F4F7923D</p>
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
