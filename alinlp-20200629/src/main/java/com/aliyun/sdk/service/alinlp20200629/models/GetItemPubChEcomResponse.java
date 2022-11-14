// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetItemPubChEcomResponse} extends {@link TeaModel}
 *
 * <p>GetItemPubChEcomResponse</p>
 */
public class GetItemPubChEcomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetItemPubChEcomResponseBody body;

    private GetItemPubChEcomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetItemPubChEcomResponse create() {
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
    public GetItemPubChEcomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetItemPubChEcomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetItemPubChEcomResponseBody body);

        @Override
        GetItemPubChEcomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetItemPubChEcomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetItemPubChEcomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetItemPubChEcomResponse response) {
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
        public Builder body(GetItemPubChEcomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetItemPubChEcomResponse build() {
            return new GetItemPubChEcomResponse(this);
        } 

    } 

}
