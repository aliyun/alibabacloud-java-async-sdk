// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRecycleBinAttributeResponse} extends {@link TeaModel}
 *
 * <p>GetRecycleBinAttributeResponse</p>
 */
public class GetRecycleBinAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRecycleBinAttributeResponseBody body;

    private GetRecycleBinAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRecycleBinAttributeResponse create() {
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
    public GetRecycleBinAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRecycleBinAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRecycleBinAttributeResponseBody body);

        @Override
        GetRecycleBinAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRecycleBinAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRecycleBinAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRecycleBinAttributeResponse response) {
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
        public Builder body(GetRecycleBinAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRecycleBinAttributeResponse build() {
            return new GetRecycleBinAttributeResponse(this);
        } 

    } 

}
