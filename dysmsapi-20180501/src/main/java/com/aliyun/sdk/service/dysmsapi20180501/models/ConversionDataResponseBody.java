// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConversionDataResponseBody} extends {@link TeaModel}
 *
 * <p>ConversionDataResponseBody</p>
 */
public class ConversionDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResponseCode")
    private String responseCode;

    @NameInMap("ResponseDescription")
    private String responseDescription;

    private ConversionDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.responseCode = builder.responseCode;
        this.responseDescription = builder.responseDescription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConversionDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return responseCode
     */
    public String getResponseCode() {
        return this.responseCode;
    }

    /**
     * @return responseDescription
     */
    public String getResponseDescription() {
        return this.responseDescription;
    }

    public static final class Builder {
        private String requestId; 
        private String responseCode; 
        private String responseDescription; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status code. Returning OK means the request was successful. For other error codes, please refer to the [Error codes](~~180674~~) list.
         */
        public Builder responseCode(String responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        /**
         * The description of the status code.
         */
        public Builder responseDescription(String responseDescription) {
            this.responseDescription = responseDescription;
            return this;
        }

        public ConversionDataResponseBody build() {
            return new ConversionDataResponseBody(this);
        } 

    } 

}
