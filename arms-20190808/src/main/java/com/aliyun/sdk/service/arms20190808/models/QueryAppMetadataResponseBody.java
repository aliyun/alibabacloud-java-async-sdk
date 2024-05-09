// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAppMetadataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAppMetadataResponseBody</p>
 */
public class QueryAppMetadataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.Map < String, ? > data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryAppMetadataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAppMetadataResponseBody create() {
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
    public java.util.Map < String, ? > getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private java.util.Map < String, ? > data; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code returned for the request. Valid values:
         * <p>
         * 
         * *   2XX: The request is successful.
         * *   3XX: A redirection message is returned.
         * *   4XX: The request is invalid.
         * *   5XX: A server error occurs.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The returned struct.
         */
        public Builder data(java.util.Map < String, ? > data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   `true`: The call was successful.
         * *   `false`: The call failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAppMetadataResponseBody build() {
            return new QueryAppMetadataResponseBody(this);
        } 

    } 

}
