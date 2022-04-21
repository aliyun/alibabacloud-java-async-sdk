// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenameDBCollectionResponse} extends {@link TeaModel}
 *
 * <p>RenameDBCollectionResponse</p>
 */
public class RenameDBCollectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RenameDBCollectionResponseBody body;

    private RenameDBCollectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RenameDBCollectionResponse create() {
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
    public RenameDBCollectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RenameDBCollectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RenameDBCollectionResponseBody body);

        @Override
        RenameDBCollectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RenameDBCollectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RenameDBCollectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RenameDBCollectionResponse response) {
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
        public Builder body(RenameDBCollectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RenameDBCollectionResponse build() {
            return new RenameDBCollectionResponse(this);
        } 

    } 

}
