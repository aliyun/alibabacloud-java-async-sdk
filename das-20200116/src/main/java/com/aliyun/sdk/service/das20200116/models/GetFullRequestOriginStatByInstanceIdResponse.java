// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFullRequestOriginStatByInstanceIdResponse} extends {@link TeaModel}
 *
 * <p>GetFullRequestOriginStatByInstanceIdResponse</p>
 */
public class GetFullRequestOriginStatByInstanceIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFullRequestOriginStatByInstanceIdResponseBody body;

    private GetFullRequestOriginStatByInstanceIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFullRequestOriginStatByInstanceIdResponse create() {
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
    public GetFullRequestOriginStatByInstanceIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFullRequestOriginStatByInstanceIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFullRequestOriginStatByInstanceIdResponseBody body);

        @Override
        GetFullRequestOriginStatByInstanceIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFullRequestOriginStatByInstanceIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFullRequestOriginStatByInstanceIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFullRequestOriginStatByInstanceIdResponse response) {
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
        public Builder body(GetFullRequestOriginStatByInstanceIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFullRequestOriginStatByInstanceIdResponse build() {
            return new GetFullRequestOriginStatByInstanceIdResponse(this);
        } 

    } 

}
