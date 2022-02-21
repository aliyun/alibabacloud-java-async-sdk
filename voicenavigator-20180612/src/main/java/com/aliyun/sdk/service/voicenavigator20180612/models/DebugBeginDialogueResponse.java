// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DebugBeginDialogueResponse} extends {@link TeaModel}
 *
 * <p>DebugBeginDialogueResponse</p>
 */
public class DebugBeginDialogueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DebugBeginDialogueResponseBody body;

    private DebugBeginDialogueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DebugBeginDialogueResponse create() {
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
    public DebugBeginDialogueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DebugBeginDialogueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DebugBeginDialogueResponseBody body);

        @Override
        DebugBeginDialogueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DebugBeginDialogueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DebugBeginDialogueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DebugBeginDialogueResponse response) {
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
        public Builder body(DebugBeginDialogueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DebugBeginDialogueResponse build() {
            return new DebugBeginDialogueResponse(this);
        } 

    } 

}
