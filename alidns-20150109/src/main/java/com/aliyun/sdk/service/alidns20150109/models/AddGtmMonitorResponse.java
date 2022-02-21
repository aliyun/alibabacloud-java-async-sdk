// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGtmMonitorResponse} extends {@link TeaModel}
 *
 * <p>AddGtmMonitorResponse</p>
 */
public class AddGtmMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddGtmMonitorResponseBody body;

    private AddGtmMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddGtmMonitorResponse create() {
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
    public AddGtmMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddGtmMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddGtmMonitorResponseBody body);

        @Override
        AddGtmMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddGtmMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddGtmMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddGtmMonitorResponse response) {
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
        public Builder body(AddGtmMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddGtmMonitorResponse build() {
            return new AddGtmMonitorResponse(this);
        } 

    } 

}
