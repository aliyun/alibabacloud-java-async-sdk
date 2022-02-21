// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeUsedCarInvoiceResponseBody} extends {@link TeaModel}
 *
 * <p>RecognizeUsedCarInvoiceResponseBody</p>
 */
public class RecognizeUsedCarInvoiceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private String data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private RecognizeUsedCarInvoiceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeUsedCarInvoiceResponseBody create() {
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
         * 错误码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 返回数据
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * 错误提示
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求唯一 ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RecognizeUsedCarInvoiceResponseBody build() {
            return new RecognizeUsedCarInvoiceResponseBody(this);
        } 

    } 

}
