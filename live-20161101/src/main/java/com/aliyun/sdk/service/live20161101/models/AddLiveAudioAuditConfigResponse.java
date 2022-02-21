// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLiveAudioAuditConfigResponse} extends {@link TeaModel}
 *
 * <p>AddLiveAudioAuditConfigResponse</p>
 */
public class AddLiveAudioAuditConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddLiveAudioAuditConfigResponseBody body;

    private AddLiveAudioAuditConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddLiveAudioAuditConfigResponse create() {
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
    public AddLiveAudioAuditConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddLiveAudioAuditConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddLiveAudioAuditConfigResponseBody body);

        @Override
        AddLiveAudioAuditConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddLiveAudioAuditConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddLiveAudioAuditConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddLiveAudioAuditConfigResponse response) {
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
        public Builder body(AddLiveAudioAuditConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddLiveAudioAuditConfigResponse build() {
            return new AddLiveAudioAuditConfigResponse(this);
        } 

    } 

}
