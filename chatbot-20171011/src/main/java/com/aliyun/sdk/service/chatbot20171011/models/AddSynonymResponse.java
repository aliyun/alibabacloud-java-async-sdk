// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSynonymResponse} extends {@link TeaModel}
 *
 * <p>AddSynonymResponse</p>
 */
public class AddSynonymResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddSynonymResponseBody body;

    private AddSynonymResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddSynonymResponse create() {
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
    public AddSynonymResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddSynonymResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddSynonymResponseBody body);

        @Override
        AddSynonymResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddSynonymResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddSynonymResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddSynonymResponse response) {
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
        public Builder body(AddSynonymResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddSynonymResponse build() {
            return new AddSynonymResponse(this);
        } 

    } 

}
