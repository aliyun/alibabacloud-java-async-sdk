// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MonitorCallResponse} extends {@link TeaModel}
 *
 * <p>MonitorCallResponse</p>
 */
public class MonitorCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MonitorCallResponseBody body;

    private MonitorCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MonitorCallResponse create() {
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
    public MonitorCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MonitorCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MonitorCallResponseBody body);

        @Override
        MonitorCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MonitorCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MonitorCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MonitorCallResponse response) {
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
        public Builder body(MonitorCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MonitorCallResponse build() {
            return new MonitorCallResponse(this);
        } 

    } 

}
