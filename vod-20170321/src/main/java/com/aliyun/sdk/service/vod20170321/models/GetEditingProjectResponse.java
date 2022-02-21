// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEditingProjectResponse} extends {@link TeaModel}
 *
 * <p>GetEditingProjectResponse</p>
 */
public class GetEditingProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEditingProjectResponseBody body;

    private GetEditingProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEditingProjectResponse create() {
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
    public GetEditingProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEditingProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEditingProjectResponseBody body);

        @Override
        GetEditingProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEditingProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEditingProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEditingProjectResponse response) {
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
        public Builder body(GetEditingProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEditingProjectResponse build() {
            return new GetEditingProjectResponse(this);
        } 

    } 

}
