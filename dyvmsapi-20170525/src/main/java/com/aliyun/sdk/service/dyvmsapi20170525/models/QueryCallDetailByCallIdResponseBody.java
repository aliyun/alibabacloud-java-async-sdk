// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCallDetailByCallIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCallDetailByCallIdResponseBody</p>
 */
public class QueryCallDetailByCallIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private String data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private QueryCallDetailByCallIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCallDetailByCallIdResponseBody create() {
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
         * *   The value OK indicates that the request was successful.
         * *   For more information about other response codes, see [API error codes](~~112502~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the call, in the JSON format.
         * <p>
         * 
         * *   **caller**: the calling number.
         * *   **startDate**: the time when the call was started.
         * *   **stateDesc**: the description of the call state.
         * *   **duration**: the call duration. Unit: seconds. The value **0** indicates that the user was not connected.
         * *   **callerShowNumber**: the calling number displayed to the called party.
         * *   **gmtCreate**: the time when the call request was received.
         * *   **state**: the call state. The call state is returned by the Internet service provider (ISP) in real time. For more information about call states, see [ISP-returned error codes](~~55085~~).
         * *   **endDate**: the time when the call was ended.
         * *   **calleeShowNumber**: the number displayed to the called party.
         * *   **callee**: the called number.
         * *   **aRingTime**: the time when Line A started to ring, in the yyyy-MM-dd HH:mm:ss format.
         * *   **aEndTime**: the time when ringing on Line A ended, in the yyyy-MM-dd HH:mm:ss format.
         * *   **bRingTime**: the time when Line B started to ring, in the yyyy-MM-dd HH:mm:ss format.
         * *   **bEndTime**: the time when ringing on Line B ended, in the yyyy-MM-dd HH:mm:ss format.
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

        public QueryCallDetailByCallIdResponseBody build() {
            return new QueryCallDetailByCallIdResponseBody(this);
        } 

    } 

}
