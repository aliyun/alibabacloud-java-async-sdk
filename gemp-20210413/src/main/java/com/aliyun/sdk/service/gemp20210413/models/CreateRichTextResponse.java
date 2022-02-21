// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRichTextResponse} extends {@link TeaModel}
 *
 * <p>CreateRichTextResponse</p>
 */
public class CreateRichTextResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRichTextResponseBody body;

    private CreateRichTextResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRichTextResponse create() {
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
    public CreateRichTextResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRichTextResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRichTextResponseBody body);

        @Override
        CreateRichTextResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRichTextResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRichTextResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRichTextResponse response) {
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
        public Builder body(CreateRichTextResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRichTextResponse build() {
            return new CreateRichTextResponse(this);
        } 

    } 

}
