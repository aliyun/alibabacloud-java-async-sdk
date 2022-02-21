// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddBlackWhiteListResponse} extends {@link TeaModel}
 *
 * <p>AddBlackWhiteListResponse</p>
 */
public class AddBlackWhiteListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddBlackWhiteListResponseBody body;

    private AddBlackWhiteListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddBlackWhiteListResponse create() {
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
    public AddBlackWhiteListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddBlackWhiteListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddBlackWhiteListResponseBody body);

        @Override
        AddBlackWhiteListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddBlackWhiteListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddBlackWhiteListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddBlackWhiteListResponse response) {
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
        public Builder body(AddBlackWhiteListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddBlackWhiteListResponse build() {
            return new AddBlackWhiteListResponse(this);
        } 

    } 

}
