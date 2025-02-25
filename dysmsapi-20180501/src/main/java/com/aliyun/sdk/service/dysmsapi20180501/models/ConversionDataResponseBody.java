// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ConversionDataResponseBody} extends {@link TeaModel}
 *
 * <p>ConversionDataResponseBody</p>
 */
public class ConversionDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResponseCode")
    private String responseCode;

    @com.aliyun.core.annotation.NameInMap("ResponseDescription")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F655A8D5-B967-440B-8683-DAD6FF8D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Status code. Returning OK means the request was successful. For other error codes, please refer to the <a href="https://help.aliyun.com/document_detail/180674.html">Error codes</a> list.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder responseCode(String responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
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
