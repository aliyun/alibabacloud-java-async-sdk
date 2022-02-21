// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSynonymsDictsResponse} extends {@link TeaModel}
 *
 * <p>UpdateSynonymsDictsResponse</p>
 */
public class UpdateSynonymsDictsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSynonymsDictsResponseBody body;

    private UpdateSynonymsDictsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSynonymsDictsResponse create() {
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
    public UpdateSynonymsDictsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSynonymsDictsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSynonymsDictsResponseBody body);

        @Override
        UpdateSynonymsDictsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSynonymsDictsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSynonymsDictsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSynonymsDictsResponse response) {
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
        public Builder body(UpdateSynonymsDictsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSynonymsDictsResponse build() {
            return new UpdateSynonymsDictsResponse(this);
        } 

    } 

}
