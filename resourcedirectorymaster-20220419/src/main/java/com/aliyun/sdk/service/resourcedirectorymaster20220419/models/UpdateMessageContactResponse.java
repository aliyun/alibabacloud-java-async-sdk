// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMessageContactResponse} extends {@link TeaModel}
 *
 * <p>UpdateMessageContactResponse</p>
 */
public class UpdateMessageContactResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMessageContactResponseBody body;

    private UpdateMessageContactResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMessageContactResponse create() {
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
    public UpdateMessageContactResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMessageContactResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMessageContactResponseBody body);

        @Override
        UpdateMessageContactResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMessageContactResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMessageContactResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMessageContactResponse response) {
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
        public Builder body(UpdateMessageContactResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMessageContactResponse build() {
            return new UpdateMessageContactResponse(this);
        } 

    } 

}
