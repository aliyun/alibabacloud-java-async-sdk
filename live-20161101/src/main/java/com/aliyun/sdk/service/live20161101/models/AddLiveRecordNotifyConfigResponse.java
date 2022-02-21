// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLiveRecordNotifyConfigResponse} extends {@link TeaModel}
 *
 * <p>AddLiveRecordNotifyConfigResponse</p>
 */
public class AddLiveRecordNotifyConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddLiveRecordNotifyConfigResponseBody body;

    private AddLiveRecordNotifyConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddLiveRecordNotifyConfigResponse create() {
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
    public AddLiveRecordNotifyConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddLiveRecordNotifyConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddLiveRecordNotifyConfigResponseBody body);

        @Override
        AddLiveRecordNotifyConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddLiveRecordNotifyConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddLiveRecordNotifyConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddLiveRecordNotifyConfigResponse response) {
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
        public Builder body(AddLiveRecordNotifyConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddLiveRecordNotifyConfigResponse build() {
            return new AddLiveRecordNotifyConfigResponse(this);
        } 

    } 

}
