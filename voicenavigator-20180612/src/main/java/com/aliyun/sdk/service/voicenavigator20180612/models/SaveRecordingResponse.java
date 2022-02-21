// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveRecordingResponse} extends {@link TeaModel}
 *
 * <p>SaveRecordingResponse</p>
 */
public class SaveRecordingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveRecordingResponseBody body;

    private SaveRecordingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveRecordingResponse create() {
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
    public SaveRecordingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveRecordingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveRecordingResponseBody body);

        @Override
        SaveRecordingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveRecordingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveRecordingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveRecordingResponse response) {
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
        public Builder body(SaveRecordingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveRecordingResponse build() {
            return new SaveRecordingResponse(this);
        } 

    } 

}
