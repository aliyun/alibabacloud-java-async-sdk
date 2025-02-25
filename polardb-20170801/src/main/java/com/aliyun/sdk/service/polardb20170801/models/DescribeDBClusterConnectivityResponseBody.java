// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeDBClusterConnectivityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterConnectivityResponseBody</p>
 */
public class DescribeDBClusterConnectivityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConnCheckErrorCode")
    private String connCheckErrorCode;

    @com.aliyun.core.annotation.NameInMap("ConnCheckErrorMessage")
    private String connCheckErrorMessage;

    @com.aliyun.core.annotation.NameInMap("ConnCheckResult")
    private String connCheckResult;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterConnectivityResponseBody(Builder builder) {
        this.connCheckErrorCode = builder.connCheckErrorCode;
        this.connCheckErrorMessage = builder.connCheckErrorMessage;
        this.connCheckResult = builder.connCheckResult;
        this.DBClusterId = builder.DBClusterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterConnectivityResponseBody create() {
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
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
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
        private String DBClusterId; 
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
         * <p>Src ip:192.<em><strong>.</strong></em>.1 not in user whitelist</p>
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
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-xxxxxxxxxxxxx</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>73A85BAF-1039-4CDE-A83F-1A140F******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterConnectivityResponseBody build() {
            return new DescribeDBClusterConnectivityResponseBody(this);
        } 

    } 

}
