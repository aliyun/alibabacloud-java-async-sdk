// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMessageContactResponse} extends {@link TeaModel}
 *
 * <p>GetMessageContactResponse</p>
 */
public class GetMessageContactResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMessageContactResponseBody body;

    private GetMessageContactResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMessageContactResponse create() {
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
    public GetMessageContactResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMessageContactResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMessageContactResponseBody body);

        @Override
        GetMessageContactResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMessageContactResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMessageContactResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMessageContactResponse response) {
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
        public Builder body(GetMessageContactResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMessageContactResponse build() {
            return new GetMessageContactResponse(this);
        } 

    } 

}
