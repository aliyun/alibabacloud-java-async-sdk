// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableTopologyResponse} extends {@link TeaModel}
 *
 * <p>GetTableTopologyResponse</p>
 */
public class GetTableTopologyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTableTopologyResponseBody body;

    private GetTableTopologyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTableTopologyResponse create() {
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
    public GetTableTopologyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTableTopologyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTableTopologyResponseBody body);

        @Override
        GetTableTopologyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTableTopologyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTableTopologyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTableTopologyResponse response) {
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
        public Builder body(GetTableTopologyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTableTopologyResponse build() {
            return new GetTableTopologyResponse(this);
        } 

    } 

}
