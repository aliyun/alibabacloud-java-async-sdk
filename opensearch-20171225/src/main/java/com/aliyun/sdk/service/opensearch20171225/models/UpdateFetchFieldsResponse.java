// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFetchFieldsResponse} extends {@link TeaModel}
 *
 * <p>UpdateFetchFieldsResponse</p>
 */
public class UpdateFetchFieldsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateFetchFieldsResponseBody body;

    private UpdateFetchFieldsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateFetchFieldsResponse create() {
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
    public UpdateFetchFieldsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateFetchFieldsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateFetchFieldsResponseBody body);

        @Override
        UpdateFetchFieldsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateFetchFieldsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateFetchFieldsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateFetchFieldsResponse response) {
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
        public Builder body(UpdateFetchFieldsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateFetchFieldsResponse build() {
            return new UpdateFetchFieldsResponse(this);
        } 

    } 

}
