// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBInstanceConnectivityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceConnectivityResponseBody</p>
 */
public class DescribeDBInstanceConnectivityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConnCheckErrorCode")
    private String connCheckErrorCode;

    @com.aliyun.core.annotation.NameInMap("ConnCheckErrorMessage")
    private String connCheckErrorMessage;

    @com.aliyun.core.annotation.NameInMap("ConnCheckResult")
    private String connCheckResult;

    @com.aliyun.core.annotation.NameInMap("DbInstanceName")
    private String dbInstanceName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceConnectivityResponseBody(Builder builder) {
        this.connCheckErrorCode = builder.connCheckErrorCode;
        this.connCheckErrorMessage = builder.connCheckErrorMessage;
        this.connCheckResult = builder.connCheckResult;
        this.dbInstanceName = builder.dbInstanceName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceConnectivityResponseBody create() {
        return builder().build();
    }

    /**
     * @return connCheckErrorCode
     */
    public String getConnCheckErrorCode() {
        return this.connCheckErrorCode;
    }

    /**
     * @return connCheckErrorMessage
     */
    public String getConnCheckErrorMessage() {
        return this.connCheckErrorMessage;
    }

    /**
     * @return connCheckResult
     */
    public String getConnCheckResult() {
        return this.connCheckResult;
    }

    /**
     * @return dbInstanceName
     */
    public String getDbInstanceName() {
        return this.dbInstanceName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String connCheckErrorCode; 
        private String connCheckErrorMessage; 
        private String connCheckResult; 
        private String dbInstanceName; 
        private String requestId; 

        /**
         * <p>The error code for connection diagnosis. Valid values:</p>
         * <ul>
         * <li><strong>SRC_IP_NOT_IN_USER_WHITELIST</strong>: The source IP address is not added to the whitelist.</li>
         * <li><strong>CONNECTION_ABNORMAL</strong>: The connection to the cluster is normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SRC_IP_NOT_IN_USER_WHITELIST</p>
         */
        public Builder connCheckErrorCode(String connCheckErrorCode) {
            this.connCheckErrorCode = connCheckErrorCode;
            return this;
        }

        /**
         * <p>The error message for connection diagnosis.</p>
         * 
         * <strong>example:</strong>
         * <p>Src ip:39.106.64.59 not in user whitelist</p>
         */
        public Builder connCheckErrorMessage(String connCheckErrorMessage) {
            this.connCheckErrorMessage = connCheckErrorMessage;
            return this;
        }

        /**
         * <p>The connection diagnosis result. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong></li>
         * <li><strong>Failed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Failed</p>
         */
        public Builder connCheckResult(String connCheckResult) {
            this.connCheckResult = connCheckResult;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze2za3is7baay1w4</p>
         */
        public Builder dbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D880212A-F21F-5722-8422-BD06B2874CC3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceConnectivityResponseBody build() {
            return new DescribeDBInstanceConnectivityResponseBody(this);
        } 

    } 

}
