// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveMgsApirestResponse} extends {@link TeaModel}
 *
 * <p>SaveMgsApirestResponse</p>
 */
public class SaveMgsApirestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveMgsApirestResponseBody body;

    private SaveMgsApirestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveMgsApirestResponse create() {
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
    public SaveMgsApirestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveMgsApirestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveMgsApirestResponseBody body);

        @Override
        SaveMgsApirestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveMgsApirestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveMgsApirestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveMgsApirestResponse response) {
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
        public Builder body(SaveMgsApirestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveMgsApirestResponse build() {
            return new SaveMgsApirestResponse(this);
        } 

    } 

}
