// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
         * <p>The endpoint that is protected by SSL encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>am-d7oualxo05x4o5be872***.ads.aliyuncs.com</p>
         */
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        /**
         * <p>The time when the SSL certificate expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-11T08:16:43Z</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>348303D8-6F42-5141-9B00-A6EECA1E37B6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
