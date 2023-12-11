// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMetaTableResponse} extends {@link TeaModel}
 *
 * <p>UpdateMetaTableResponse</p>
 */
public class UpdateMetaTableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMetaTableResponseBody body;

    private UpdateMetaTableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMetaTableResponse create() {
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
    public UpdateMetaTableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMetaTableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMetaTableResponseBody body);

        @Override
        UpdateMetaTableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMetaTableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMetaTableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMetaTableResponse response) {
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
        public Builder body(UpdateMetaTableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMetaTableResponse build() {
            return new UpdateMetaTableResponse(this);
        } 

    } 

}
