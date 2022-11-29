// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetReleaseResponse} extends {@link TeaModel}
 *
 * <p>GetReleaseResponse</p>
 */
public class GetReleaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private Release body;

    private GetReleaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetReleaseResponse create() {
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
    public Release getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetReleaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(Release body);

        @Override
        GetReleaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetReleaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Release body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetReleaseResponse response) {
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
        public Builder body(Release body) {
            this.body = body;
            return this;
        }

        @Override
        public GetReleaseResponse build() {
            return new GetReleaseResponse(this);
        } 

    } 

}
