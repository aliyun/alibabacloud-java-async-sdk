// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConfigItemsResponse} extends {@link TeaModel}
 *
 * <p>UpdateConfigItemsResponse</p>
 */
public class UpdateConfigItemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateConfigItemsResponseBody body;

    private UpdateConfigItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateConfigItemsResponse create() {
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
    public UpdateConfigItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateConfigItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateConfigItemsResponseBody body);

        @Override
        UpdateConfigItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateConfigItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateConfigItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateConfigItemsResponse response) {
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
        public Builder body(UpdateConfigItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateConfigItemsResponse build() {
            return new UpdateConfigItemsResponse(this);
        } 

    } 

}
