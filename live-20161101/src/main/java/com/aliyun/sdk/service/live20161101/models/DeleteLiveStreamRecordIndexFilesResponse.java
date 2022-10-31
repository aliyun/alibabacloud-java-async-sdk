// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveStreamRecordIndexFilesResponse} extends {@link TeaModel}
 *
 * <p>DeleteLiveStreamRecordIndexFilesResponse</p>
 */
public class DeleteLiveStreamRecordIndexFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLiveStreamRecordIndexFilesResponseBody body;

    private DeleteLiveStreamRecordIndexFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLiveStreamRecordIndexFilesResponse create() {
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
    public DeleteLiveStreamRecordIndexFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLiveStreamRecordIndexFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLiveStreamRecordIndexFilesResponseBody body);

        @Override
        DeleteLiveStreamRecordIndexFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLiveStreamRecordIndexFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLiveStreamRecordIndexFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLiveStreamRecordIndexFilesResponse response) {
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
        public Builder body(DeleteLiveStreamRecordIndexFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLiveStreamRecordIndexFilesResponse build() {
            return new DeleteLiveStreamRecordIndexFilesResponse(this);
        } 

    } 

}
