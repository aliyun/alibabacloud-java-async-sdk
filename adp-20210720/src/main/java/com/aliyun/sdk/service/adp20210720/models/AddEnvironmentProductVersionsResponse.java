// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddEnvironmentProductVersionsResponse} extends {@link TeaModel}
 *
 * <p>AddEnvironmentProductVersionsResponse</p>
 */
public class AddEnvironmentProductVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private AddEnvironmentProductVersionsResponseBody body;

    private AddEnvironmentProductVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddEnvironmentProductVersionsResponse create() {
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
    public AddEnvironmentProductVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddEnvironmentProductVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddEnvironmentProductVersionsResponseBody body);

        @Override
        AddEnvironmentProductVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddEnvironmentProductVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AddEnvironmentProductVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddEnvironmentProductVersionsResponse response) {
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
        public Builder body(AddEnvironmentProductVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddEnvironmentProductVersionsResponse build() {
            return new AddEnvironmentProductVersionsResponse(this);
        } 

    } 

}
