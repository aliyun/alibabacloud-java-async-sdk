// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddVirtualNumberRelationResponseBody} extends {@link TeaModel}
 *
 * <p>AddVirtualNumberRelationResponseBody</p>
 */
public class AddVirtualNumberRelationResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private String data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private AddVirtualNumberRelationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddVirtualNumberRelationResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
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
        private String data; 
        private String message; 
        private String requestId; 

        /**
         * The response code.
         * <p>
         * 
         * *   The value 200 indicates that the request was successful.
         * *   For more information about other response codes, see [API error codes](~~112502~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The numbers that failed to be associated.
         * <p>
         * 
         * > If all numbers are associated, no value is returned for this parameter.
         */
        public Builder data(String data) {
            this.data = data;
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

        public AddVirtualNumberRelationResponseBody build() {
            return new AddVirtualNumberRelationResponseBody(this);
        } 

    } 

}
