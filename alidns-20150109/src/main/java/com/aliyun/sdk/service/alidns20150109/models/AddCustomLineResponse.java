// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCustomLineResponse} extends {@link TeaModel}
 *
 * <p>AddCustomLineResponse</p>
 */
public class AddCustomLineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddCustomLineResponseBody body;

    private AddCustomLineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddCustomLineResponse create() {
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
     * @return body
     */
    public AddCustomLineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCustomLineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddCustomLineResponseBody body);

        @Override
        AddCustomLineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCustomLineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddCustomLineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCustomLineResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(AddCustomLineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCustomLineResponse build() {
            return new AddCustomLineResponse(this);
        } 

    } 

}
