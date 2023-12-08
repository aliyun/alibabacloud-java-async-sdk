// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterConfigInXMLResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterConfigInXMLResponseBody</p>
 */
public class DescribeDBClusterConfigInXMLResponseBody extends TeaModel {
    @NameInMap("Config")
    private String config;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterConfigInXMLResponseBody(Builder builder) {
        this.config = builder.config;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterConfigInXMLResponseBody create() {
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
         * Config.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterConfigInXMLResponseBody build() {
            return new DescribeDBClusterConfigInXMLResponseBody(this);
        } 

    } 

}
