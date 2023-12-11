// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMetaCollectionResponse} extends {@link TeaModel}
 *
 * <p>UpdateMetaCollectionResponse</p>
 */
public class UpdateMetaCollectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMetaCollectionResponseBody body;

    private UpdateMetaCollectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMetaCollectionResponse create() {
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
    public UpdateMetaCollectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMetaCollectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMetaCollectionResponseBody body);

        @Override
        UpdateMetaCollectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMetaCollectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMetaCollectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMetaCollectionResponse response) {
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
        public Builder body(UpdateMetaCollectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMetaCollectionResponse build() {
            return new UpdateMetaCollectionResponse(this);
        } 

    } 

}
