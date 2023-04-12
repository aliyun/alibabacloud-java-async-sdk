// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMessageContactResponse} extends {@link TeaModel}
 *
 * <p>AddMessageContactResponse</p>
 */
public class AddMessageContactResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddMessageContactResponseBody body;

    private AddMessageContactResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddMessageContactResponse create() {
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
    public AddMessageContactResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddMessageContactResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddMessageContactResponseBody body);

        @Override
        AddMessageContactResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddMessageContactResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddMessageContactResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddMessageContactResponse response) {
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
        public Builder body(AddMessageContactResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddMessageContactResponse build() {
            return new AddMessageContactResponse(this);
        } 

    } 

}
