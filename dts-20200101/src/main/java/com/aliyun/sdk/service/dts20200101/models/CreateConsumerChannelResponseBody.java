// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConsumerChannelResponseBody} extends {@link TeaModel}
 *
 * <p>CreateConsumerChannelResponseBody</p>
 */
public class CreateConsumerChannelResponseBody extends TeaModel {
    @NameInMap("ConsumerGroupID")
    private String consumerGroupID;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * ConsumerGroupID.
         */
        public Builder consumerGroupID(String consumerGroupID) {
            this.consumerGroupID = consumerGroupID;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Success.
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
