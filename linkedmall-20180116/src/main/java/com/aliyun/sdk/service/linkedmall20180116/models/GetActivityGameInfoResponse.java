// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetActivityGameInfoResponse} extends {@link TeaModel}
 *
 * <p>GetActivityGameInfoResponse</p>
 */
public class GetActivityGameInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private GetActivityGameInfoResponseBody body;

    private GetActivityGameInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetActivityGameInfoResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public GetActivityGameInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetActivityGameInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetActivityGameInfoResponseBody body);

        @Override
        GetActivityGameInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetActivityGameInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetActivityGameInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetActivityGameInfoResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(GetActivityGameInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetActivityGameInfoResponse build() {
            return new GetActivityGameInfoResponse(this);
        } 

    } 

}
