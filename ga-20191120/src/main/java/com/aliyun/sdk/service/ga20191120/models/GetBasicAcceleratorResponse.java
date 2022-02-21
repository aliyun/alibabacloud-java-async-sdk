// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBasicAcceleratorResponse} extends {@link TeaModel}
 *
 * <p>GetBasicAcceleratorResponse</p>
 */
public class GetBasicAcceleratorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBasicAcceleratorResponseBody body;

    private GetBasicAcceleratorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBasicAcceleratorResponse create() {
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
    public GetBasicAcceleratorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBasicAcceleratorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBasicAcceleratorResponseBody body);

        @Override
        GetBasicAcceleratorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBasicAcceleratorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBasicAcceleratorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBasicAcceleratorResponse response) {
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
        public Builder body(GetBasicAcceleratorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBasicAcceleratorResponse build() {
            return new GetBasicAcceleratorResponse(this);
        } 

    } 

}
