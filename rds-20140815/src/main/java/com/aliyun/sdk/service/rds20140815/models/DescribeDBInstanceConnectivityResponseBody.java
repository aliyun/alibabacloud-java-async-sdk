// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceConnectivityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceConnectivityResponseBody</p>
 */
public class DescribeDBInstanceConnectivityResponseBody extends TeaModel {
    @NameInMap("ConnCheckErrorCode")
    private String connCheckErrorCode;

    @NameInMap("ConnCheckErrorMessage")
    private String connCheckErrorMessage;

    @NameInMap("ConnCheckResult")
    private String connCheckResult;

    @NameInMap("DbInstanceName")
    private String dbInstanceName;

    @NameInMap("RequestId")
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
         * The instance ID.
         */
        public Builder dbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }

        /**
         * The request ID.
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
