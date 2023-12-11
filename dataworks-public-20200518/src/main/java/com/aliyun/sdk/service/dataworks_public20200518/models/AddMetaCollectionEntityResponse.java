// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMetaCollectionEntityResponse} extends {@link TeaModel}
 *
 * <p>AddMetaCollectionEntityResponse</p>
 */
public class AddMetaCollectionEntityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddMetaCollectionEntityResponseBody body;

    private AddMetaCollectionEntityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddMetaCollectionEntityResponse create() {
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
    public AddMetaCollectionEntityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddMetaCollectionEntityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddMetaCollectionEntityResponseBody body);

        @Override
        AddMetaCollectionEntityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddMetaCollectionEntityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddMetaCollectionEntityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddMetaCollectionEntityResponse response) {
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
        public Builder body(AddMetaCollectionEntityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddMetaCollectionEntityResponse build() {
            return new AddMetaCollectionEntityResponse(this);
        } 

    } 

}
