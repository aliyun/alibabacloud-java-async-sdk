// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeDbInstanceConnectivityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDbInstanceConnectivityResponseBody</p>
 */
public class DescribeDbInstanceConnectivityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConnCheckErrorCode")
    private String connCheckErrorCode;

    @com.aliyun.core.annotation.NameInMap("ConnCheckErrorMessage")
    private String connCheckErrorMessage;

    @com.aliyun.core.annotation.NameInMap("ConnCheckResult")
    private String connCheckResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDbInstanceConnectivityResponseBody(Builder builder) {
        this.connCheckErrorCode = builder.connCheckErrorCode;
        this.connCheckErrorMessage = builder.connCheckErrorMessage;
        this.connCheckResult = builder.connCheckResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDbInstanceConnectivityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String connCheckErrorCode; 
        private String connCheckErrorMessage; 
        private String connCheckResult; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDbInstanceConnectivityResponseBody model) {
            this.connCheckErrorCode = model.connCheckErrorCode;
            this.connCheckErrorMessage = model.connCheckErrorMessage;
            this.connCheckResult = model.connCheckResult;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The error code for connection diagnosis. Valid values:</p>
         * <ul>
         * <li><strong>SRC_IP_NOT_IN_USER_WHITELIST</strong>: The source IP address is not added to the whitelist.</li>
         * <li><strong>CONNECTION_ABNORMAL</strong>: The connection to the instance is normal.</li>
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
         * <p>Src ip:172.28.134.96 not in user whitelist</p>
         */
        public Builder connCheckErrorMessage(String connCheckErrorMessage) {
            this.connCheckErrorMessage = connCheckErrorMessage;
            return this;
        }

        /**
         * <p>The connection check result. Valid values:</p>
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2BE6E619-A657-42E3-AD2D-18F8428A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDbInstanceConnectivityResponseBody build() {
            return new DescribeDbInstanceConnectivityResponseBody(this);
        } 

    } 

}
