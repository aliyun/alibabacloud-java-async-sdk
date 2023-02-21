// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcCoreTeamsResponse} extends {@link TeaModel}
 *
 * <p>GetOcCoreTeamsResponse</p>
 */
public class GetOcCoreTeamsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcCoreTeamsResponseBody body;

    private GetOcCoreTeamsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcCoreTeamsResponse create() {
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
    public GetOcCoreTeamsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcCoreTeamsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcCoreTeamsResponseBody body);

        @Override
        GetOcCoreTeamsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcCoreTeamsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcCoreTeamsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcCoreTeamsResponse response) {
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
        public Builder body(GetOcCoreTeamsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcCoreTeamsResponse build() {
            return new GetOcCoreTeamsResponse(this);
        } 

    } 

}
