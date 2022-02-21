// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BeginDialogueResponse} extends {@link TeaModel}
 *
 * <p>BeginDialogueResponse</p>
 */
public class BeginDialogueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BeginDialogueResponseBody body;

    private BeginDialogueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BeginDialogueResponse create() {
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
    public BeginDialogueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BeginDialogueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BeginDialogueResponseBody body);

        @Override
        BeginDialogueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BeginDialogueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BeginDialogueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BeginDialogueResponse response) {
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
        public Builder body(BeginDialogueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BeginDialogueResponse build() {
            return new BeginDialogueResponse(this);
        } 

    } 

}
