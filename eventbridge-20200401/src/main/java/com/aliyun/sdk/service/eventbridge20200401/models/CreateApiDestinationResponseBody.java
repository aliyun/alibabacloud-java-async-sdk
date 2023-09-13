// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link CreateApiDestinationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApiDestinationResponseBody</p>
 */
public class CreateApiDestinationResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Date")
    private Date date;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private CreateApiDestinationResponseBody(Builder builder) {
        this.code = builder.code;
        this.date = builder.date;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApiDestinationResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return date
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Date date; 
        private String message; 
        private String requestId; 

        /**
         * The returned response code. The value Success indicates that the request is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned if the API destination is created.
         */
        public Builder date(Date date) {
            this.date = date;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateApiDestinationResponseBody build() {
            return new CreateApiDestinationResponseBody(this);
        } 

    } 

    public static class Date extends TeaModel {
        @NameInMap("ApiDestinationName")
        private String apiDestinationName;

        private Date(Builder builder) {
            this.apiDestinationName = builder.apiDestinationName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Date create() {
            return builder().build();
        }

        /**
         * @return apiDestinationName
         */
        public String getApiDestinationName() {
            return this.apiDestinationName;
        }

        public static final class Builder {
            private String apiDestinationName; 

            /**
             * The name of the API destination.
             */
            public Builder apiDestinationName(String apiDestinationName) {
                this.apiDestinationName = apiDestinationName;
                return this;
            }

            public Date build() {
                return new Date(this);
            } 

        } 

    }
}
