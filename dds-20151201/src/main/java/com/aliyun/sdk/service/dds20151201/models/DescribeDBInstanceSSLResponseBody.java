// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeDBInstanceSSLResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceSSLResponseBody</p>
 */
public class DescribeDBInstanceSSLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertCommonName")
    private String certCommonName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SSLExpiredTime")
    private String SSLExpiredTime;

    @com.aliyun.core.annotation.NameInMap("SSLStatus")
    private String SSLStatus;

    private DescribeDBInstanceSSLResponseBody(Builder builder) {
        this.certCommonName = builder.certCommonName;
        this.requestId = builder.requestId;
        this.SSLExpiredTime = builder.SSLExpiredTime;
        this.SSLStatus = builder.SSLStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceSSLResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certCommonName
     */
    public String getCertCommonName() {
        return this.certCommonName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SSLExpiredTime
     */
    public String getSSLExpiredTime() {
        return this.SSLExpiredTime;
    }

    /**
     * @return SSLStatus
     */
    public String getSSLStatus() {
        return this.SSLStatus;
    }

    public static final class Builder {
        private String certCommonName; 
        private String requestId; 
        private String SSLExpiredTime; 
        private String SSLStatus; 

        private Builder() {
        } 

        private Builder(DescribeDBInstanceSSLResponseBody model) {
            this.certCommonName = model.certCommonName;
            this.requestId = model.requestId;
            this.SSLExpiredTime = model.SSLExpiredTime;
            this.SSLStatus = model.SSLStatus;
        } 

        /**
         * <p>The name of the SSL certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bpxxxxxxxx.mongodb.rds.aliyuncs.com</p>
         */
        public Builder certCommonName(String certCommonName) {
            this.certCommonName = certCommonName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36BB1BC2-789C-4BBA-A519-C5B388E4B0D4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time when the SSL certificate expires. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in Coordinated Universal Time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03-11T02:28:25Z</p>
         */
        public Builder SSLExpiredTime(String SSLExpiredTime) {
            this.SSLExpiredTime = SSLExpiredTime;
            return this;
        }

        /**
         * <p>The status of the SSL feature. Valid values:</p>
         * <ul>
         * <li><strong>Open</strong>: The SSL feature is enabled.</li>
         * <li><strong>Closed</strong>: The SSL feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        public Builder SSLStatus(String SSLStatus) {
            this.SSLStatus = SSLStatus;
            return this;
        }

        public DescribeDBInstanceSSLResponseBody build() {
            return new DescribeDBInstanceSSLResponseBody(this);
        } 

    } 

}
