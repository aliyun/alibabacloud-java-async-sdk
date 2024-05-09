// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConsumerChannelResponseBody} extends {@link TeaModel}
 *
 * <p>CreateConsumerChannelResponseBody</p>
 */
public class CreateConsumerChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConsumerGroupID")
    private String consumerGroupID;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private CreateConsumerChannelResponseBody(Builder builder) {
        this.consumerGroupID = builder.consumerGroupID;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConsumerChannelResponseBody create() {
        return builder().build();
    }

    /**
     * @return consumerGroupID
     */
    public String getConsumerGroupID() {
        return this.consumerGroupID;
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
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String consumerGroupID; 
        private String errCode; 
        private String errMessage; 
        private String httpStatusCode; 
        private String requestId; 
        private String success; 

        /**
         * The ID of the consumer group. You can specify this parameter on a downstream client when you consume tracked data.
         */
        public Builder consumerGroupID(String consumerGroupID) {
            this.consumerGroupID = consumerGroupID;
            return this;
        }

        /**
         * The error code returned if the call failed.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error message returned if the call failed.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call was successful.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreateConsumerChannelResponseBody build() {
            return new CreateConsumerChannelResponseBody(this);
        } 

    } 

}
