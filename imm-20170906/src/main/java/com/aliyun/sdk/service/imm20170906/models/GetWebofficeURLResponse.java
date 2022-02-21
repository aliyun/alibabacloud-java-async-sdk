// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWebofficeURLResponse} extends {@link TeaModel}
 *
 * <p>GetWebofficeURLResponse</p>
 */
public class GetWebofficeURLResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWebofficeURLResponseBody body;

    private GetWebofficeURLResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWebofficeURLResponse create() {
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
    public GetWebofficeURLResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWebofficeURLResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWebofficeURLResponseBody body);

        @Override
        GetWebofficeURLResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWebofficeURLResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWebofficeURLResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWebofficeURLResponse response) {
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
        public Builder body(GetWebofficeURLResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWebofficeURLResponse build() {
            return new GetWebofficeURLResponse(this);
        } 

    } 

}
