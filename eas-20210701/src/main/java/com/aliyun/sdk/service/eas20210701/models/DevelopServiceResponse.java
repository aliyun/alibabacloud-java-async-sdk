// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DevelopServiceResponse} extends {@link TeaModel}
 *
 * <p>DevelopServiceResponse</p>
 */
public class DevelopServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DevelopServiceResponseBody body;

    private DevelopServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DevelopServiceResponse create() {
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
    public DevelopServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DevelopServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DevelopServiceResponseBody body);

        @Override
        DevelopServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DevelopServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DevelopServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DevelopServiceResponse response) {
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
        public Builder body(DevelopServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DevelopServiceResponse build() {
            return new DevelopServiceResponse(this);
        } 

    } 

}
