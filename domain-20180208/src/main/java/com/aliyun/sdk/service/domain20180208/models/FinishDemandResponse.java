// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FinishDemandResponse} extends {@link TeaModel}
 *
 * <p>FinishDemandResponse</p>
 */
public class FinishDemandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FinishDemandResponseBody body;

    private FinishDemandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FinishDemandResponse create() {
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
    public FinishDemandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FinishDemandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FinishDemandResponseBody body);

        @Override
        FinishDemandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FinishDemandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FinishDemandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FinishDemandResponse response) {
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
        public Builder body(FinishDemandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FinishDemandResponse build() {
            return new FinishDemandResponse(this);
        } 

    } 

}
