// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRichTextResponse} extends {@link TeaModel}
 *
 * <p>GetRichTextResponse</p>
 */
public class GetRichTextResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRichTextResponseBody body;

    private GetRichTextResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRichTextResponse create() {
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
    public GetRichTextResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRichTextResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRichTextResponseBody body);

        @Override
        GetRichTextResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRichTextResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRichTextResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRichTextResponse response) {
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
        public Builder body(GetRichTextResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRichTextResponse build() {
            return new GetRichTextResponse(this);
        } 

    } 

}
