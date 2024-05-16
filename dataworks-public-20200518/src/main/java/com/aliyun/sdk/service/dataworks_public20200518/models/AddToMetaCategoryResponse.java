// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddToMetaCategoryResponse} extends {@link TeaModel}
 *
 * <p>AddToMetaCategoryResponse</p>
 */
public class AddToMetaCategoryResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AddToMetaCategoryResponseBody body;

    private AddToMetaCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddToMetaCategoryResponse create() {
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
    public AddToMetaCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddToMetaCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddToMetaCategoryResponseBody body);

        @Override
        AddToMetaCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddToMetaCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AddToMetaCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddToMetaCategoryResponse response) {
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
        public Builder body(AddToMetaCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddToMetaCategoryResponse build() {
            return new AddToMetaCategoryResponse(this);
        } 

    } 

}
