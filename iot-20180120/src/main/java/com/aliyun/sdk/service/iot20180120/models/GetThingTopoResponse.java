// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetThingTopoResponse} extends {@link TeaModel}
 *
 * <p>GetThingTopoResponse</p>
 */
public class GetThingTopoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetThingTopoResponseBody body;

    private GetThingTopoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetThingTopoResponse create() {
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
    public GetThingTopoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetThingTopoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetThingTopoResponseBody body);

        @Override
        GetThingTopoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetThingTopoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetThingTopoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetThingTopoResponse response) {
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
        public Builder body(GetThingTopoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetThingTopoResponse build() {
            return new GetThingTopoResponse(this);
        } 

    } 

}
