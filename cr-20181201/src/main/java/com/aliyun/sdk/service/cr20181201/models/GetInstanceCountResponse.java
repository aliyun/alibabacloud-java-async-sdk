// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceCountResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceCountResponse</p>
 */
public class GetInstanceCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstanceCountResponseBody body;

    private GetInstanceCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInstanceCountResponse create() {
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
    public GetInstanceCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstanceCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInstanceCountResponseBody body);

        @Override
        GetInstanceCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstanceCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInstanceCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstanceCountResponse response) {
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
        public Builder body(GetInstanceCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInstanceCountResponse build() {
            return new GetInstanceCountResponse(this);
        } 

    } 

}
