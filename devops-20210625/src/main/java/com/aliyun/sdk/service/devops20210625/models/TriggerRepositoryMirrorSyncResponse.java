// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TriggerRepositoryMirrorSyncResponse} extends {@link TeaModel}
 *
 * <p>TriggerRepositoryMirrorSyncResponse</p>
 */
public class TriggerRepositoryMirrorSyncResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TriggerRepositoryMirrorSyncResponseBody body;

    private TriggerRepositoryMirrorSyncResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TriggerRepositoryMirrorSyncResponse create() {
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
    public TriggerRepositoryMirrorSyncResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TriggerRepositoryMirrorSyncResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TriggerRepositoryMirrorSyncResponseBody body);

        @Override
        TriggerRepositoryMirrorSyncResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TriggerRepositoryMirrorSyncResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TriggerRepositoryMirrorSyncResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TriggerRepositoryMirrorSyncResponse response) {
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
        public Builder body(TriggerRepositoryMirrorSyncResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TriggerRepositoryMirrorSyncResponse build() {
            return new TriggerRepositoryMirrorSyncResponse(this);
        } 

    } 

}
