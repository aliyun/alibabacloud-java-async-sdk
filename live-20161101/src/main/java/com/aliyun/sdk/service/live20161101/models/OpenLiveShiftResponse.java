// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenLiveShiftResponse} extends {@link TeaModel}
 *
 * <p>OpenLiveShiftResponse</p>
 */
public class OpenLiveShiftResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenLiveShiftResponseBody body;

    private OpenLiveShiftResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenLiveShiftResponse create() {
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
    public OpenLiveShiftResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenLiveShiftResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenLiveShiftResponseBody body);

        @Override
        OpenLiveShiftResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenLiveShiftResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenLiveShiftResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenLiveShiftResponse response) {
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
        public Builder body(OpenLiveShiftResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenLiveShiftResponse build() {
            return new OpenLiveShiftResponse(this);
        } 

    } 

}
