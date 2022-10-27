// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserImageResponse} extends {@link TeaModel}
 *
 * <p>GetUserImageResponse</p>
 */
public class GetUserImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserImageResponseBody body;

    private GetUserImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserImageResponse create() {
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
    public GetUserImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserImageResponseBody body);

        @Override
        GetUserImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserImageResponse response) {
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
        public Builder body(GetUserImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserImageResponse build() {
            return new GetUserImageResponse(this);
        } 

    } 

}
