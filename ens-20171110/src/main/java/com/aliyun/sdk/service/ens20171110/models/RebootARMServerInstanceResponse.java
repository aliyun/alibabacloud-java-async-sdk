// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebootARMServerInstanceResponse} extends {@link TeaModel}
 *
 * <p>RebootARMServerInstanceResponse</p>
 */
public class RebootARMServerInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RebootARMServerInstanceResponseBody body;

    private RebootARMServerInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RebootARMServerInstanceResponse create() {
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
    public RebootARMServerInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RebootARMServerInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RebootARMServerInstanceResponseBody body);

        @Override
        RebootARMServerInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RebootARMServerInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RebootARMServerInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RebootARMServerInstanceResponse response) {
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
        public Builder body(RebootARMServerInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RebootARMServerInstanceResponse build() {
            return new RebootARMServerInstanceResponse(this);
        } 

    } 

}
