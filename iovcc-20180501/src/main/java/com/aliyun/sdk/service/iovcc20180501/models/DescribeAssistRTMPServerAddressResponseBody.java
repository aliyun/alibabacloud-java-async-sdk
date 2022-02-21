// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAssistRTMPServerAddressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAssistRTMPServerAddressResponseBody</p>
 */
public class DescribeAssistRTMPServerAddressResponseBody extends TeaModel {
    @NameInMap("OTP")
    private String OTP;

    @NameInMap("RTMPServer")
    private String RTMPServer;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAssistRTMPServerAddressResponseBody(Builder builder) {
        this.OTP = builder.OTP;
        this.RTMPServer = builder.RTMPServer;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssistRTMPServerAddressResponseBody create() {
        return builder().build();
    }

    /**
     * @return OTP
     */
    public String getOTP() {
        return this.OTP;
    }

    /**
     * @return RTMPServer
     */
    public String getRTMPServer() {
        return this.RTMPServer;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String OTP; 
        private String RTMPServer; 
        private String requestId; 

        /**
         * OTP.
         */
        public Builder OTP(String OTP) {
            this.OTP = OTP;
            return this;
        }

        /**
         * RTMPServer.
         */
        public Builder RTMPServer(String RTMPServer) {
            this.RTMPServer = RTMPServer;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAssistRTMPServerAddressResponseBody build() {
            return new DescribeAssistRTMPServerAddressResponseBody(this);
        } 

    } 

}
