// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DesignateWorkersResponse} extends {@link TeaModel}
 *
 * <p>DesignateWorkersResponse</p>
 */
public class DesignateWorkersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DesignateWorkersResponseBody body;

    private DesignateWorkersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DesignateWorkersResponse create() {
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
    public DesignateWorkersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DesignateWorkersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DesignateWorkersResponseBody body);

        @Override
        DesignateWorkersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DesignateWorkersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DesignateWorkersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DesignateWorkersResponse response) {
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
        public Builder body(DesignateWorkersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DesignateWorkersResponse build() {
            return new DesignateWorkersResponse(this);
        } 

    } 

}
