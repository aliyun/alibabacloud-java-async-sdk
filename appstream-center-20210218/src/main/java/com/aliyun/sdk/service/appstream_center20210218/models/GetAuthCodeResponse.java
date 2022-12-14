// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210218.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuthCodeResponse} extends {@link TeaModel}
 *
 * <p>GetAuthCodeResponse</p>
 */
public class GetAuthCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAuthCodeResponseBody body;

    private GetAuthCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAuthCodeResponse create() {
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
    public GetAuthCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAuthCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAuthCodeResponseBody body);

        @Override
        GetAuthCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAuthCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAuthCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAuthCodeResponse response) {
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
        public Builder body(GetAuthCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAuthCodeResponse build() {
            return new GetAuthCodeResponse(this);
        } 

    } 

}
