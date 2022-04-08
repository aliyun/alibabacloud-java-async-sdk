// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.address_purification20191118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAddressDivisionCodeResponse} extends {@link TeaModel}
 *
 * <p>GetAddressDivisionCodeResponse</p>
 */
public class GetAddressDivisionCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAddressDivisionCodeResponseBody body;

    private GetAddressDivisionCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAddressDivisionCodeResponse create() {
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
    public GetAddressDivisionCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAddressDivisionCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAddressDivisionCodeResponseBody body);

        @Override
        GetAddressDivisionCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAddressDivisionCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAddressDivisionCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAddressDivisionCodeResponse response) {
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
        public Builder body(GetAddressDivisionCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAddressDivisionCodeResponse build() {
            return new GetAddressDivisionCodeResponse(this);
        } 

    } 

}
