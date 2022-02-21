// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConstantsResponse} extends {@link TeaModel}
 *
 * <p>UpdateConstantsResponse</p>
 */
public class UpdateConstantsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateConstantsResponseBody body;

    private UpdateConstantsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateConstantsResponse create() {
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
    public UpdateConstantsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateConstantsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateConstantsResponseBody body);

        @Override
        UpdateConstantsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateConstantsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateConstantsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateConstantsResponse response) {
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
        public Builder body(UpdateConstantsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateConstantsResponse build() {
            return new UpdateConstantsResponse(this);
        } 

    } 

}
