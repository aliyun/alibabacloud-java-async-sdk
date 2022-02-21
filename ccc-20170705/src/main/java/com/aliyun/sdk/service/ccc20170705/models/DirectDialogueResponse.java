// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DirectDialogueResponse} extends {@link TeaModel}
 *
 * <p>DirectDialogueResponse</p>
 */
public class DirectDialogueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DirectDialogueResponseBody body;

    private DirectDialogueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DirectDialogueResponse create() {
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
    public DirectDialogueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DirectDialogueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DirectDialogueResponseBody body);

        @Override
        DirectDialogueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DirectDialogueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DirectDialogueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DirectDialogueResponse response) {
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
        public Builder body(DirectDialogueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DirectDialogueResponse build() {
            return new DirectDialogueResponse(this);
        } 

    } 

}
