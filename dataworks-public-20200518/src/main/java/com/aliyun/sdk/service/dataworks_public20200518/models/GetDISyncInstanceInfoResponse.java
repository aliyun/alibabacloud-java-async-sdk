// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDISyncInstanceInfoResponse} extends {@link TeaModel}
 *
 * <p>GetDISyncInstanceInfoResponse</p>
 */
public class GetDISyncInstanceInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDISyncInstanceInfoResponseBody body;

    private GetDISyncInstanceInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDISyncInstanceInfoResponse create() {
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
    public GetDISyncInstanceInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDISyncInstanceInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDISyncInstanceInfoResponseBody body);

        @Override
        GetDISyncInstanceInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDISyncInstanceInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDISyncInstanceInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDISyncInstanceInfoResponse response) {
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
        public Builder body(GetDISyncInstanceInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDISyncInstanceInfoResponse build() {
            return new GetDISyncInstanceInfoResponse(this);
        } 

    } 

}
