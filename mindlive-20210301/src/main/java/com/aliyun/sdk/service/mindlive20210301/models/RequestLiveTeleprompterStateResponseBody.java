// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestLiveTeleprompterStateResponseBody} extends {@link TeaModel}
 *
 * <p>RequestLiveTeleprompterStateResponseBody</p>
 */
public class RequestLiveTeleprompterStateResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private RequestLiveTeleprompterStateResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestLiveTeleprompterStateResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RequestLiveTeleprompterStateResponseBody build() {
            return new RequestLiveTeleprompterStateResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Display")
        private Boolean display;

        private Data(Builder builder) {
            this.display = builder.display;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public Boolean getDisplay() {
            return this.display;
        }

        public static final class Builder {
            private Boolean display; 

            /**
             * Display.
             */
            public Builder display(Boolean display) {
                this.display = display;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
