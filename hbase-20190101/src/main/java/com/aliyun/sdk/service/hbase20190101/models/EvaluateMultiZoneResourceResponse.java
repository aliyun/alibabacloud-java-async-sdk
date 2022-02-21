// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EvaluateMultiZoneResourceResponse} extends {@link TeaModel}
 *
 * <p>EvaluateMultiZoneResourceResponse</p>
 */
public class EvaluateMultiZoneResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EvaluateMultiZoneResourceResponseBody body;

    private EvaluateMultiZoneResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EvaluateMultiZoneResourceResponse create() {
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
    public EvaluateMultiZoneResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EvaluateMultiZoneResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EvaluateMultiZoneResourceResponseBody body);

        @Override
        EvaluateMultiZoneResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EvaluateMultiZoneResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EvaluateMultiZoneResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EvaluateMultiZoneResourceResponse response) {
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
        public Builder body(EvaluateMultiZoneResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EvaluateMultiZoneResourceResponse build() {
            return new EvaluateMultiZoneResourceResponse(this);
        } 

    } 

}
