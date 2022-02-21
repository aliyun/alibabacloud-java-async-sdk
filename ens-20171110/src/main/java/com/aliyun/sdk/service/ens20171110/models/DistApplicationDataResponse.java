// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DistApplicationDataResponse} extends {@link TeaModel}
 *
 * <p>DistApplicationDataResponse</p>
 */
public class DistApplicationDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DistApplicationDataResponseBody body;

    private DistApplicationDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DistApplicationDataResponse create() {
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
    public DistApplicationDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DistApplicationDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DistApplicationDataResponseBody body);

        @Override
        DistApplicationDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DistApplicationDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DistApplicationDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DistApplicationDataResponse response) {
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
        public Builder body(DistApplicationDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DistApplicationDataResponse build() {
            return new DistApplicationDataResponse(this);
        } 

    } 

}
