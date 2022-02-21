// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SchedulePodResponse} extends {@link TeaModel}
 *
 * <p>SchedulePodResponse</p>
 */
public class SchedulePodResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SchedulePodResponseBody body;

    private SchedulePodResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SchedulePodResponse create() {
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
    public SchedulePodResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SchedulePodResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SchedulePodResponseBody body);

        @Override
        SchedulePodResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SchedulePodResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SchedulePodResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SchedulePodResponse response) {
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
        public Builder body(SchedulePodResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SchedulePodResponse build() {
            return new SchedulePodResponse(this);
        } 

    } 

}
