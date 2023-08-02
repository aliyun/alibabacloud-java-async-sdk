// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpsertCollectionDataResponse} extends {@link TeaModel}
 *
 * <p>UpsertCollectionDataResponse</p>
 */
public class UpsertCollectionDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpsertCollectionDataResponseBody body;

    private UpsertCollectionDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpsertCollectionDataResponse create() {
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
    public UpsertCollectionDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpsertCollectionDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpsertCollectionDataResponseBody body);

        @Override
        UpsertCollectionDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpsertCollectionDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpsertCollectionDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpsertCollectionDataResponse response) {
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
        public Builder body(UpsertCollectionDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpsertCollectionDataResponse build() {
            return new UpsertCollectionDataResponse(this);
        } 

    } 

}
