// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMosaicsResponse} extends {@link TeaModel}
 *
 * <p>AddMosaicsResponse</p>
 */
public class AddMosaicsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddMosaicsResponseBody body;

    private AddMosaicsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddMosaicsResponse create() {
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
    public AddMosaicsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddMosaicsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddMosaicsResponseBody body);

        @Override
        AddMosaicsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddMosaicsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddMosaicsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddMosaicsResponse response) {
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
        public Builder body(AddMosaicsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddMosaicsResponse build() {
            return new AddMosaicsResponse(this);
        } 

    } 

}
