// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>GetOverviewResponseBody</p>
 */
public class GetOverviewResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private String data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private GetOverviewResponseBody(Builder builder) {
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

    public static GetOverviewResponseBody create() {
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
    public String getData() {
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * clusterNotFound
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * mse-200-021
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * mse-100-001
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * illegalRequest
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * You are not authorized to perform this operation.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * cluster not found
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetOverviewResponseBody build() {
            return new GetOverviewResponseBody(this);
        } 

    } 

}
