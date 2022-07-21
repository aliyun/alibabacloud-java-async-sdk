// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSoundCodeScheduleResponse} extends {@link TeaModel}
 *
 * <p>UpdateSoundCodeScheduleResponse</p>
 */
public class UpdateSoundCodeScheduleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSoundCodeScheduleResponseBody body;

    private UpdateSoundCodeScheduleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSoundCodeScheduleResponse create() {
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
    public UpdateSoundCodeScheduleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSoundCodeScheduleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSoundCodeScheduleResponseBody body);

        @Override
        UpdateSoundCodeScheduleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSoundCodeScheduleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSoundCodeScheduleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSoundCodeScheduleResponse response) {
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
        public Builder body(UpdateSoundCodeScheduleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSoundCodeScheduleResponse build() {
            return new UpdateSoundCodeScheduleResponse(this);
        } 

    } 

}
