// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAssistWSServerAddressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAssistWSServerAddressResponseBody</p>
 */
public class DescribeAssistWSServerAddressResponseBody extends TeaModel {
    @NameInMap("OTP")
    private String OTP;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WsServer")
    private String wsServer;

    private DescribeAssistWSServerAddressResponseBody(Builder builder) {
        this.OTP = builder.OTP;
        this.requestId = builder.requestId;
        this.wsServer = builder.wsServer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssistWSServerAddressResponseBody create() {
        return builder().build();
    }

    /**
     * @return OTP
     */
    public String getOTP() {
        return this.OTP;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return wsServer
     */
    public String getWsServer() {
        return this.wsServer;
    }

    public static final class Builder {
        private String OTP; 
        private String requestId; 
        private String wsServer; 

        /**
         * OTP.
         */
        public Builder OTP(String OTP) {
            this.OTP = OTP;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WsServer.
         */
        public Builder wsServer(String wsServer) {
            this.wsServer = wsServer;
            return this;
        }

        public DescribeAssistWSServerAddressResponseBody build() {
            return new DescribeAssistWSServerAddressResponseBody(this);
        } 

    } 

}
