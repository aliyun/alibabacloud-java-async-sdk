// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModelVersionResponse} extends {@link TeaModel}
 *
 * <p>GetModelVersionResponse</p>
 */
public class GetModelVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetModelVersionResponseBody body;

    private GetModelVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetModelVersionResponse create() {
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
    public GetModelVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetModelVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetModelVersionResponseBody body);

        @Override
        GetModelVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetModelVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetModelVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetModelVersionResponse response) {
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
        public Builder body(GetModelVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetModelVersionResponse build() {
            return new GetModelVersionResponse(this);
        } 

    } 

}
