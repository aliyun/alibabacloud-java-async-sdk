// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EipNotifyPaidResponse} extends {@link TeaModel}
 *
 * <p>EipNotifyPaidResponse</p>
 */
public class EipNotifyPaidResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EipNotifyPaidResponseBody body;

    private EipNotifyPaidResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EipNotifyPaidResponse create() {
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
    public EipNotifyPaidResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EipNotifyPaidResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EipNotifyPaidResponseBody body);

        @Override
        EipNotifyPaidResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EipNotifyPaidResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EipNotifyPaidResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EipNotifyPaidResponse response) {
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
        public Builder body(EipNotifyPaidResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EipNotifyPaidResponse build() {
            return new EipNotifyPaidResponse(this);
        } 

    } 

}
