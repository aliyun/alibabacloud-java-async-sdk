// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOptionValueForProjectResponse} extends {@link TeaModel}
 *
 * <p>GetOptionValueForProjectResponse</p>
 */
public class GetOptionValueForProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOptionValueForProjectResponseBody body;

    private GetOptionValueForProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOptionValueForProjectResponse create() {
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
    public GetOptionValueForProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOptionValueForProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOptionValueForProjectResponseBody body);

        @Override
        GetOptionValueForProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOptionValueForProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOptionValueForProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOptionValueForProjectResponse response) {
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
        public Builder body(GetOptionValueForProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOptionValueForProjectResponse build() {
            return new GetOptionValueForProjectResponse(this);
        } 

    } 

}
