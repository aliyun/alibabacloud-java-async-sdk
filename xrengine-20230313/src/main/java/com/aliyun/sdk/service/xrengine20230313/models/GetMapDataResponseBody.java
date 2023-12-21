// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMapDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetMapDataResponseBody</p>
 */
public class GetMapDataResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < java.util.Map<String, ?>> data;

    @NameInMap("ErrorName")
    private String errorName;

    @NameInMap("HttpCode")
    private Integer httpCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetMapDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorName = builder.errorName;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMapDataResponseBody create() {
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
    public java.util.List < java.util.Map<String, ?>> getData() {
        return this.data;
    }

    /**
     * @return errorName
     */
    public String getErrorName() {
        return this.errorName;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < java.util.Map<String, ?>> data; 
        private String errorName; 
        private Integer httpCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < java.util.Map<String, ?>> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorName.
         */
        public Builder errorName(String errorName) {
            this.errorName = errorName;
            return this;
        }

        /**
         * HttpCode.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMapDataResponseBody build() {
            return new GetMapDataResponseBody(this);
        } 

    } 

}
