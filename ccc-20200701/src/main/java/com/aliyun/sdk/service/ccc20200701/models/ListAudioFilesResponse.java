// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAudioFilesResponse} extends {@link TeaModel}
 *
 * <p>ListAudioFilesResponse</p>
 */
public class ListAudioFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAudioFilesResponseBody body;

    private ListAudioFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAudioFilesResponse create() {
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
    public ListAudioFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAudioFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAudioFilesResponseBody body);

        @Override
        ListAudioFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAudioFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAudioFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAudioFilesResponse response) {
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
        public Builder body(ListAudioFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAudioFilesResponse build() {
            return new ListAudioFilesResponse(this);
        } 

    } 

}
