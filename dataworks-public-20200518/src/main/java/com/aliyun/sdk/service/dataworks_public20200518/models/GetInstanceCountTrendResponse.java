// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceCountTrendResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceCountTrendResponse</p>
 */
public class GetInstanceCountTrendResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstanceCountTrendResponseBody body;

    private GetInstanceCountTrendResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInstanceCountTrendResponse create() {
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
    public GetInstanceCountTrendResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstanceCountTrendResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInstanceCountTrendResponseBody body);

        @Override
        GetInstanceCountTrendResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstanceCountTrendResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInstanceCountTrendResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstanceCountTrendResponse response) {
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
        public Builder body(GetInstanceCountTrendResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInstanceCountTrendResponse build() {
            return new GetInstanceCountTrendResponse(this);
        } 

    } 

}
