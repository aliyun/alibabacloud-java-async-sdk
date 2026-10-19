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

    @com.aliyun.core.annotation.NameInMap("ForceEncryption")
    private String forceEncryption;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SSLExpiredTime")
    private String SSLExpiredTime;

    @com.aliyun.core.annotation.NameInMap("SSLStatus")
    private String SSLStatus;

    private DescribeDBInstanceSSLResponseBody(Builder builder) {
        this.certCommonName = builder.certCommonName;
        this.forceEncryption = builder.forceEncryption;
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
     * @return forceEncryption
     */
    public String getForceEncryption() {
        return this.forceEncryption;
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
        private String forceEncryption; 
        private String requestId; 
        private String SSLExpiredTime; 
        private String SSLStatus; 

        private Builder() {
        } 

        private Builder(DescribeDBInstanceSSLResponseBody model) {
            this.certCommonName = model.certCommonName;
            this.forceEncryption = model.forceEncryption;
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
         * <p>Specifies whether connections must be encrypted using SSL. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Connections must be encrypted using SSL.</p>
         * </li>
         * <li><p><strong>0</strong>: Connections do not need to be encrypted using SSL.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder forceEncryption(String forceEncryption) {
            this.forceEncryption = forceEncryption;
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
         * <p>The expiration time of the SSL certificate. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03-11T02:28:25Z</p>
         */
        public Builder SSLExpiredTime(String SSLExpiredTime) {
            this.SSLExpiredTime = SSLExpiredTime;
            return this;
        }

        /**
         * <p>The status of the SSL feature.</p>
         * <ul>
         * <li><p><strong>Open</strong>: The SSL feature is enabled.</p>
         * </li>
         * <li><p><strong>Closed</strong>: The SSL feature is disabled.</p>
         * </li>
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
