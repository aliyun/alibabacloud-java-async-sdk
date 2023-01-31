// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBaseStrategyPeriodResponse} extends {@link TeaModel}
 *
 * <p>SaveBaseStrategyPeriodResponse</p>
 */
public class SaveBaseStrategyPeriodResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveBaseStrategyPeriodResponseBody body;

    private SaveBaseStrategyPeriodResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveBaseStrategyPeriodResponse create() {
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
    public SaveBaseStrategyPeriodResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveBaseStrategyPeriodResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveBaseStrategyPeriodResponseBody body);

        @Override
        SaveBaseStrategyPeriodResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveBaseStrategyPeriodResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveBaseStrategyPeriodResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveBaseStrategyPeriodResponse response) {
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
        public Builder body(SaveBaseStrategyPeriodResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveBaseStrategyPeriodResponse build() {
            return new SaveBaseStrategyPeriodResponse(this);
        } 

    } 

}
