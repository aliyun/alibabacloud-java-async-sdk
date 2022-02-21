// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGtmMonitorResponse} extends {@link TeaModel}
 *
 * <p>UpdateGtmMonitorResponse</p>
 */
public class UpdateGtmMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateGtmMonitorResponseBody body;

    private UpdateGtmMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateGtmMonitorResponse create() {
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
    public UpdateGtmMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateGtmMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateGtmMonitorResponseBody body);

        @Override
        UpdateGtmMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateGtmMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateGtmMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateGtmMonitorResponse response) {
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
        public Builder body(UpdateGtmMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateGtmMonitorResponse build() {
            return new UpdateGtmMonitorResponse(this);
        } 

    } 

}
