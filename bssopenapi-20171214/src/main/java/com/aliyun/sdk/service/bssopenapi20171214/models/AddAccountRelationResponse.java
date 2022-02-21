// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAccountRelationResponse} extends {@link TeaModel}
 *
 * <p>AddAccountRelationResponse</p>
 */
public class AddAccountRelationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddAccountRelationResponseBody body;

    private AddAccountRelationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddAccountRelationResponse create() {
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
    public AddAccountRelationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddAccountRelationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddAccountRelationResponseBody body);

        @Override
        AddAccountRelationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddAccountRelationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddAccountRelationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddAccountRelationResponse response) {
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
        public Builder body(AddAccountRelationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddAccountRelationResponse build() {
            return new AddAccountRelationResponse(this);
        } 

    } 

}
