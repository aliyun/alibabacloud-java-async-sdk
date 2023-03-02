// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20150303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RpcNoDefaultErrorCodeApiRequest} extends {@link RequestModel}
 *
 * <p>RpcNoDefaultErrorCodeApiRequest</p>
 */
public class RpcNoDefaultErrorCodeApiRequest extends Request {
    @Query
    @NameInMap("Code")
    private String code;

    @Query
    @NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @Query
    @NameInMap("Message")
    private String message;

    @Query
    @NameInMap("Success")
    private String success;

    private RpcNoDefaultErrorCodeApiRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RpcNoDefaultErrorCodeApiRequest create() {
        return builder().build();
    }

    @Override
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
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder extends Request.Builder<RpcNoDefaultErrorCodeApiRequest, Builder> {
        private String code; 
        private String httpStatusCode; 
        private String message; 
        private String success; 

        private Builder() {
            super();
        } 

        private Builder(RpcNoDefaultErrorCodeApiRequest request) {
            super(request);
            this.code = request.code;
            this.httpStatusCode = request.httpStatusCode;
            this.message = request.message;
            this.success = request.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.putQueryParameter("HttpStatusCode", httpStatusCode);
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.putQueryParameter("Success", success);
            this.success = success;
            return this;
        }

        @Override
        public RpcNoDefaultErrorCodeApiRequest build() {
            return new RpcNoDefaultErrorCodeApiRequest(this);
        } 

    } 

}
