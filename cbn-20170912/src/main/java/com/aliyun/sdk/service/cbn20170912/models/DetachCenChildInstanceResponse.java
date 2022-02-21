// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachCenChildInstanceResponse} extends {@link TeaModel}
 *
 * <p>DetachCenChildInstanceResponse</p>
 */
public class DetachCenChildInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachCenChildInstanceResponseBody body;

    private DetachCenChildInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachCenChildInstanceResponse create() {
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
    public DetachCenChildInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachCenChildInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachCenChildInstanceResponseBody body);

        @Override
        DetachCenChildInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachCenChildInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachCenChildInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachCenChildInstanceResponse response) {
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
        public Builder body(DetachCenChildInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachCenChildInstanceResponse build() {
            return new DetachCenChildInstanceResponse(this);
        } 

    } 

}
