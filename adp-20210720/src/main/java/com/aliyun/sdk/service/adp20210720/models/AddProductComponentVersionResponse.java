// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddProductComponentVersionResponse} extends {@link TeaModel}
 *
 * <p>AddProductComponentVersionResponse</p>
 */
public class AddProductComponentVersionResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private AddProductComponentVersionResponseBody body;

    private AddProductComponentVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddProductComponentVersionResponse create() {
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
    public AddProductComponentVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddProductComponentVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddProductComponentVersionResponseBody body);

        @Override
        AddProductComponentVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddProductComponentVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AddProductComponentVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddProductComponentVersionResponse response) {
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
        public Builder body(AddProductComponentVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddProductComponentVersionResponse build() {
            return new AddProductComponentVersionResponse(this);
        } 

    } 

}
