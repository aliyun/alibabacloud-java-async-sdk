// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EndDialogueResponse} extends {@link TeaModel}
 *
 * <p>EndDialogueResponse</p>
 */
public class EndDialogueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EndDialogueResponseBody body;

    private EndDialogueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EndDialogueResponse create() {
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
    public EndDialogueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EndDialogueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EndDialogueResponseBody body);

        @Override
        EndDialogueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EndDialogueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EndDialogueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EndDialogueResponse response) {
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
        public Builder body(EndDialogueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EndDialogueResponse build() {
            return new EndDialogueResponse(this);
        } 

    } 

}
