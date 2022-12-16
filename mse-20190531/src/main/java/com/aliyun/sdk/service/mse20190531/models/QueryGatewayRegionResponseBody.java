// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryGatewayRegionResponseBody} extends {@link TeaModel}
 *
 * <p>QueryGatewayRegionResponseBody</p>
 */
public class QueryGatewayRegionResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < String > data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryGatewayRegionResponseBody(Builder builder) {
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

    public static QueryGatewayRegionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < String > getData() {
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
        private Integer code; 
        private java.util.List < String > data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The request is processed successfully.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * - `true`: The request is successful. 
         * - `false`: The request fails.
         */
        public Builder data(java.util.List < String > data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The data structure.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status code returned.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryGatewayRegionResponseBody build() {
            return new QueryGatewayRegionResponseBody(this);
        } 

    } 

}
