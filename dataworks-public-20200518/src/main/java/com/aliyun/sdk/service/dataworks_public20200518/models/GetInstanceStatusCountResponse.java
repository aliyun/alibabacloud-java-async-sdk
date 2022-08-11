// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceStatusCountResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceStatusCountResponse</p>
 */
public class GetInstanceStatusCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstanceStatusCountResponseBody body;

    private GetInstanceStatusCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInstanceStatusCountResponse create() {
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
    public GetInstanceStatusCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstanceStatusCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInstanceStatusCountResponseBody body);

        @Override
        GetInstanceStatusCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstanceStatusCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInstanceStatusCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstanceStatusCountResponse response) {
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
        public Builder body(GetInstanceStatusCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInstanceStatusCountResponse build() {
            return new GetInstanceStatusCountResponse(this);
        } 

    } 

}
