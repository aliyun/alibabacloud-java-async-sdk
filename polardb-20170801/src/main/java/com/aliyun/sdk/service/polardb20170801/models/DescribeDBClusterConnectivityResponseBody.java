// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterConnectivityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterConnectivityResponseBody</p>
 */
public class DescribeDBClusterConnectivityResponseBody extends TeaModel {
    @NameInMap("ConnCheckErrorCode")
    private String connCheckErrorCode;

    @NameInMap("ConnCheckErrorMessage")
    private String connCheckErrorMessage;

    @NameInMap("ConnCheckResult")
    private String connCheckResult;

    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("RequestId")
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
         * The error code for connection diagnosis. Valid values:
         * <p>
         * 
         * *   **SRC_IP_NOT_IN_USER_WHITELIST**: The source IP address is not added to the whitelist.
         * *   **CONNECTION_ABNORMAL**: The connection to the cluster is normal.
         */
        public Builder connCheckErrorCode(String connCheckErrorCode) {
            this.connCheckErrorCode = connCheckErrorCode;
            return this;
        }

        /**
         * The error message for connection diagnosis.
         */
        public Builder connCheckErrorMessage(String connCheckErrorMessage) {
            this.connCheckErrorMessage = connCheckErrorMessage;
            return this;
        }

        /**
         * The connection diagnosis result. Valid values:
         * <p>
         * 
         * *   **Success**
         * *   **Failed**
         */
        public Builder connCheckResult(String connCheckResult) {
            this.connCheckResult = connCheckResult;
            return this;
        }

        /**
         * The cluster ID.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The request ID.
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
