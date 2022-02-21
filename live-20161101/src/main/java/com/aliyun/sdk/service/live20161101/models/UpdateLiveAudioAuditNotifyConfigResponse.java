// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLiveAudioAuditNotifyConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateLiveAudioAuditNotifyConfigResponse</p>
 */
public class UpdateLiveAudioAuditNotifyConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateLiveAudioAuditNotifyConfigResponseBody body;

    private UpdateLiveAudioAuditNotifyConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateLiveAudioAuditNotifyConfigResponse create() {
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
    public UpdateLiveAudioAuditNotifyConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateLiveAudioAuditNotifyConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateLiveAudioAuditNotifyConfigResponseBody body);

        @Override
        UpdateLiveAudioAuditNotifyConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateLiveAudioAuditNotifyConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateLiveAudioAuditNotifyConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateLiveAudioAuditNotifyConfigResponse response) {
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
        public Builder body(UpdateLiveAudioAuditNotifyConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateLiveAudioAuditNotifyConfigResponse build() {
            return new UpdateLiveAudioAuditNotifyConfigResponse(this);
        } 

    } 

}
