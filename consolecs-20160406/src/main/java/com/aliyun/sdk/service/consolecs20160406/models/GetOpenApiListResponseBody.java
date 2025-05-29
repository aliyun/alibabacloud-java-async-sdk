// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.consolecs20160406.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetOpenApiListResponseBody} extends {@link TeaModel}
 *
 * <p>GetOpenApiListResponseBody</p>
 */
public class GetOpenApiListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OpenApiString")
    private String openApiString;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetOpenApiListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.openApiString = builder.openApiString;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpenApiListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return openApiString
     */
    public String getOpenApiString() {
        return this.openApiString;
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
        private String message; 
        private String openApiString; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetOpenApiListResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.openApiString = model.openApiString;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
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
         * OpenApiString.
         */
        public Builder openApiString(String openApiString) {
            this.openApiString = openApiString;
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

        public GetOpenApiListResponseBody build() {
            return new GetOpenApiListResponseBody(this);
        } 

    } 

}
