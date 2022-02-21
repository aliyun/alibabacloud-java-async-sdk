// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRichTextResponse} extends {@link TeaModel}
 *
 * <p>UpdateRichTextResponse</p>
 */
public class UpdateRichTextResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateRichTextResponseBody body;

    private UpdateRichTextResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateRichTextResponse create() {
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
    public UpdateRichTextResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateRichTextResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateRichTextResponseBody body);

        @Override
        UpdateRichTextResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateRichTextResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateRichTextResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateRichTextResponse response) {
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
        public Builder body(UpdateRichTextResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateRichTextResponse build() {
            return new UpdateRichTextResponse(this);
        } 

    } 

}
