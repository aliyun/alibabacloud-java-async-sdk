// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EvaluateDedicatedHostInstanceResourceResponse} extends {@link TeaModel}
 *
 * <p>EvaluateDedicatedHostInstanceResourceResponse</p>
 */
public class EvaluateDedicatedHostInstanceResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EvaluateDedicatedHostInstanceResourceResponseBody body;

    private EvaluateDedicatedHostInstanceResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EvaluateDedicatedHostInstanceResourceResponse create() {
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
    public EvaluateDedicatedHostInstanceResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EvaluateDedicatedHostInstanceResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EvaluateDedicatedHostInstanceResourceResponseBody body);

        @Override
        EvaluateDedicatedHostInstanceResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EvaluateDedicatedHostInstanceResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EvaluateDedicatedHostInstanceResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EvaluateDedicatedHostInstanceResourceResponse response) {
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
        public Builder body(EvaluateDedicatedHostInstanceResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EvaluateDedicatedHostInstanceResourceResponse build() {
            return new EvaluateDedicatedHostInstanceResourceResponse(this);
        } 

    } 

}
