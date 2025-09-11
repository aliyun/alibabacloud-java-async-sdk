// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeDBClusterSSLResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterSSLResponseBody</p>
 */
public class DescribeDBClusterSSLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConnectionString")
    private String connectionString;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SSLEnabled")
    private Boolean SSLEnabled;

    private DescribeDBClusterSSLResponseBody(Builder builder) {
        this.connectionString = builder.connectionString;
        this.expireTime = builder.expireTime;
        this.requestId = builder.requestId;
        this.SSLEnabled = builder.SSLEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterSSLResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionString
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SSLEnabled
     */
    public Boolean getSSLEnabled() {
        return this.SSLEnabled;
    }

    public static final class Builder {
        private String connectionString; 
        private String expireTime; 
        private String requestId; 
        private Boolean SSLEnabled; 

        private Builder() {
        } 

        private Builder(DescribeDBClusterSSLResponseBody model) {
            this.connectionString = model.connectionString;
            this.expireTime = model.expireTime;
            this.requestId = model.requestId;
            this.SSLEnabled = model.SSLEnabled;
        } 

        /**
         * ConnectionString.
         */
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SSLEnabled.
         */
        public Builder SSLEnabled(Boolean SSLEnabled) {
            this.SSLEnabled = SSLEnabled;
            return this;
        }

        public DescribeDBClusterSSLResponseBody build() {
            return new DescribeDBClusterSSLResponseBody(this);
        } 

    } 

}
