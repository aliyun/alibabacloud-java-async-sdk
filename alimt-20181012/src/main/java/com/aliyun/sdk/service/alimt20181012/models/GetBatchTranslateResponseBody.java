// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBatchTranslateResponseBody} extends {@link TeaModel}
 *
 * <p>GetBatchTranslateResponseBody</p>
 */
public class GetBatchTranslateResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TranslatedList")
    private java.util.List < java.util.Map<String, ?>> translatedList;

    private GetBatchTranslateResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.translatedList = builder.translatedList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBatchTranslateResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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

    /**
     * @return translatedList
     */
    public java.util.List < java.util.Map<String, ?>> getTranslatedList() {
        return this.translatedList;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private java.util.List < java.util.Map<String, ?>> translatedList; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * TranslatedList.
         */
        public Builder translatedList(java.util.List < java.util.Map<String, ?>> translatedList) {
            this.translatedList = translatedList;
            return this;
        }

        public GetBatchTranslateResponseBody build() {
            return new GetBatchTranslateResponseBody(this);
        } 

    } 

}
