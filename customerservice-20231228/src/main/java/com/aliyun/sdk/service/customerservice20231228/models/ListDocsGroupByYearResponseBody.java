// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.customerservice20231228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDocsGroupByYearResponseBody} extends {@link TeaModel}
 *
 * <p>ListDocsGroupByYearResponseBody</p>
 */
public class ListDocsGroupByYearResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private java.util.Map < String, java.util.List<DataValue>> data;

    @NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("message")
    private String message;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private ListDocsGroupByYearResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDocsGroupByYearResponseBody create() {
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
    public java.util.Map < String, java.util.List<DataValue>> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private java.util.Map < String, java.util.List<DataValue>> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.Map < String, java.util.List<DataValue>> data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDocsGroupByYearResponseBody build() {
            return new ListDocsGroupByYearResponseBody(this);
        } 

    } 

}
