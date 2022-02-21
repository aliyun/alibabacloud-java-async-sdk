// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLiveDetectNotifyConfigResponse} extends {@link TeaModel}
 *
 * <p>AddLiveDetectNotifyConfigResponse</p>
 */
public class AddLiveDetectNotifyConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddLiveDetectNotifyConfigResponseBody body;

    private AddLiveDetectNotifyConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddLiveDetectNotifyConfigResponse create() {
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
    public AddLiveDetectNotifyConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddLiveDetectNotifyConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddLiveDetectNotifyConfigResponseBody body);

        @Override
        AddLiveDetectNotifyConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddLiveDetectNotifyConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddLiveDetectNotifyConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddLiveDetectNotifyConfigResponse response) {
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
        public Builder body(AddLiveDetectNotifyConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddLiveDetectNotifyConfigResponse build() {
            return new AddLiveDetectNotifyConfigResponse(this);
        } 

    } 

}
