// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductComponentVersionResponse} extends {@link TeaModel}
 *
 * <p>GetProductComponentVersionResponse</p>
 */
public class GetProductComponentVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private GetProductComponentVersionResponseBody body;

    private GetProductComponentVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetProductComponentVersionResponse create() {
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
    public GetProductComponentVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetProductComponentVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetProductComponentVersionResponseBody body);

        @Override
        GetProductComponentVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetProductComponentVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetProductComponentVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetProductComponentVersionResponse response) {
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
        public Builder body(GetProductComponentVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetProductComponentVersionResponse build() {
            return new GetProductComponentVersionResponse(this);
        } 

    } 

}
