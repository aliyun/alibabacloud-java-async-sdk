// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHADiagnoseConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHADiagnoseConfigResponseBody</p>
 */
public class DescribeHADiagnoseConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TcpConnectionType")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>06B220E2-EAC5-4DBE-A1FC-1B62DB6A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The availability check method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>LONG</strong>: Alibaba Cloud uses persistent connections to check the availability of the instance.</li>
         * <li><strong>SHORT</strong>: Alibaba Cloud uses short-lived connections to check the availability of the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LONG</p>
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
