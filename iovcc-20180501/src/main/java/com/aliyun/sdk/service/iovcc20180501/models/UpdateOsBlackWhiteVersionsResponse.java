// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOsBlackWhiteVersionsResponse} extends {@link TeaModel}
 *
 * <p>UpdateOsBlackWhiteVersionsResponse</p>
 */
public class UpdateOsBlackWhiteVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateOsBlackWhiteVersionsResponseBody body;

    private UpdateOsBlackWhiteVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateOsBlackWhiteVersionsResponse create() {
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
    public UpdateOsBlackWhiteVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateOsBlackWhiteVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateOsBlackWhiteVersionsResponseBody body);

        @Override
        UpdateOsBlackWhiteVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateOsBlackWhiteVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateOsBlackWhiteVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateOsBlackWhiteVersionsResponse response) {
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
        public Builder body(UpdateOsBlackWhiteVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateOsBlackWhiteVersionsResponse build() {
            return new UpdateOsBlackWhiteVersionsResponse(this);
        } 

    } 

}
