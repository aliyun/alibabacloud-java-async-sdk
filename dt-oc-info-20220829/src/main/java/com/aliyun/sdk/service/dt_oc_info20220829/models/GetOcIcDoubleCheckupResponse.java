// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcDoubleCheckupResponse} extends {@link TeaModel}
 *
 * <p>GetOcIcDoubleCheckupResponse</p>
 */
public class GetOcIcDoubleCheckupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcIcDoubleCheckupResponseBody body;

    private GetOcIcDoubleCheckupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcIcDoubleCheckupResponse create() {
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
    public GetOcIcDoubleCheckupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcIcDoubleCheckupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcIcDoubleCheckupResponseBody body);

        @Override
        GetOcIcDoubleCheckupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcIcDoubleCheckupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcIcDoubleCheckupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcIcDoubleCheckupResponse response) {
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
        public Builder body(GetOcIcDoubleCheckupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcIcDoubleCheckupResponse build() {
            return new GetOcIcDoubleCheckupResponse(this);
        } 

    } 

}
