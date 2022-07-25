// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSubSceneSeqResponse} extends {@link TeaModel}
 *
 * <p>UpdateSubSceneSeqResponse</p>
 */
public class UpdateSubSceneSeqResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSubSceneSeqResponseBody body;

    private UpdateSubSceneSeqResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSubSceneSeqResponse create() {
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
    public UpdateSubSceneSeqResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSubSceneSeqResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSubSceneSeqResponseBody body);

        @Override
        UpdateSubSceneSeqResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSubSceneSeqResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSubSceneSeqResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSubSceneSeqResponse response) {
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
        public Builder body(UpdateSubSceneSeqResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSubSceneSeqResponse build() {
            return new UpdateSubSceneSeqResponse(this);
        } 

    } 

}
