// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFileInfoResponse} extends {@link TeaModel}
 *
 * <p>AddFileInfoResponse</p>
 */
public class AddFileInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddFileInfoResponseBody body;

    private AddFileInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddFileInfoResponse create() {
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
    public AddFileInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddFileInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddFileInfoResponseBody body);

        @Override
        AddFileInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddFileInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddFileInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddFileInfoResponse response) {
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
        public Builder body(AddFileInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddFileInfoResponse build() {
            return new AddFileInfoResponse(this);
        } 

    } 

}
