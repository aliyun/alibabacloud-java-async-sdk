// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScriptRecordingResponse} extends {@link TeaModel}
 *
 * <p>ListScriptRecordingResponse</p>
 */
public class ListScriptRecordingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListScriptRecordingResponseBody body;

    private ListScriptRecordingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListScriptRecordingResponse create() {
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
    public ListScriptRecordingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListScriptRecordingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListScriptRecordingResponseBody body);

        @Override
        ListScriptRecordingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListScriptRecordingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListScriptRecordingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListScriptRecordingResponse response) {
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
        public Builder body(ListScriptRecordingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListScriptRecordingResponse build() {
            return new ListScriptRecordingResponse(this);
        } 

    } 

}
