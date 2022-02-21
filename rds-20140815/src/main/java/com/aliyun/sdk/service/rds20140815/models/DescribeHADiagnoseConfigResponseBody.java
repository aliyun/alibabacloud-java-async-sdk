// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHADiagnoseConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHADiagnoseConfigResponseBody</p>
 */
public class DescribeHADiagnoseConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TcpConnectionType")
    private String tcpConnectionType;

    private DescribeHADiagnoseConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tcpConnectionType = builder.tcpConnectionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHADiagnoseConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tcpConnectionType
     */
    public String getTcpConnectionType() {
        return this.tcpConnectionType;
    }

    public static final class Builder {
        private String requestId; 
        private String tcpConnectionType; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TcpConnectionType.
         */
        public Builder tcpConnectionType(String tcpConnectionType) {
            this.tcpConnectionType = tcpConnectionType;
            return this;
        }

        public DescribeHADiagnoseConfigResponseBody build() {
            return new DescribeHADiagnoseConfigResponseBody(this);
        } 

    } 

}
