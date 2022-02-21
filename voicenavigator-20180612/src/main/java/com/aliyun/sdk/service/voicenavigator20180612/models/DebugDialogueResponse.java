// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DebugDialogueResponse} extends {@link TeaModel}
 *
 * <p>DebugDialogueResponse</p>
 */
public class DebugDialogueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DebugDialogueResponseBody body;

    private DebugDialogueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DebugDialogueResponse create() {
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
    public DebugDialogueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DebugDialogueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DebugDialogueResponseBody body);

        @Override
        DebugDialogueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DebugDialogueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DebugDialogueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DebugDialogueResponse response) {
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
        public Builder body(DebugDialogueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DebugDialogueResponse build() {
            return new DebugDialogueResponse(this);
        } 

    } 

}
