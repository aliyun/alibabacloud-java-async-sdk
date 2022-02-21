// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTranscodeTaskResponse} extends {@link TeaModel}
 *
 * <p>ListTranscodeTaskResponse</p>
 */
public class ListTranscodeTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTranscodeTaskResponseBody body;

    private ListTranscodeTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTranscodeTaskResponse create() {
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
    public ListTranscodeTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTranscodeTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTranscodeTaskResponseBody body);

        @Override
        ListTranscodeTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTranscodeTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTranscodeTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTranscodeTaskResponse response) {
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
        public Builder body(ListTranscodeTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTranscodeTaskResponse build() {
            return new ListTranscodeTaskResponse(this);
        } 

    } 

}
