// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableDBTopologyResponse} extends {@link TeaModel}
 *
 * <p>GetTableDBTopologyResponse</p>
 */
public class GetTableDBTopologyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTableDBTopologyResponseBody body;

    private GetTableDBTopologyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTableDBTopologyResponse create() {
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
    public GetTableDBTopologyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTableDBTopologyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTableDBTopologyResponseBody body);

        @Override
        GetTableDBTopologyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTableDBTopologyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTableDBTopologyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTableDBTopologyResponse response) {
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
        public Builder body(GetTableDBTopologyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTableDBTopologyResponse build() {
            return new GetTableDBTopologyResponse(this);
        } 

    } 

}
