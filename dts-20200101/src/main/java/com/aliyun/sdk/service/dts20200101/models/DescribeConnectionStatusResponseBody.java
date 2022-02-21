// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConnectionStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConnectionStatusResponseBody</p>
 */
public class DescribeConnectionStatusResponseBody extends TeaModel {
    @NameInMap("DestinationConnectionStatus")
    private java.util.Map < String, ? > destinationConnectionStatus;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SourceConnectionStatus")
    private java.util.Map < String, ? > sourceConnectionStatus;

    @NameInMap("Success")
    private String success;

    private DescribeConnectionStatusResponseBody(Builder builder) {
        this.destinationConnectionStatus = builder.destinationConnectionStatus;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.requestId = builder.requestId;
        this.sourceConnectionStatus = builder.sourceConnectionStatus;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConnectionStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return destinationConnectionStatus
     */
    public java.util.Map < String, ? > getDestinationConnectionStatus() {
        return this.destinationConnectionStatus;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceConnectionStatus
     */
    public java.util.Map < String, ? > getSourceConnectionStatus() {
        return this.sourceConnectionStatus;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.Map < String, ? > destinationConnectionStatus; 
        private String errCode; 
        private String errMessage; 
        private String requestId; 
        private java.util.Map < String, ? > sourceConnectionStatus; 
        private String success; 

        /**
         * DestinationConnectionStatus.
         */
        public Builder destinationConnectionStatus(java.util.Map < String, ? > destinationConnectionStatus) {
            this.destinationConnectionStatus = destinationConnectionStatus;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
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
         * SourceConnectionStatus.
         */
        public Builder sourceConnectionStatus(java.util.Map < String, ? > sourceConnectionStatus) {
            this.sourceConnectionStatus = sourceConnectionStatus;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeConnectionStatusResponseBody build() {
            return new DescribeConnectionStatusResponseBody(this);
        } 

    } 

}
