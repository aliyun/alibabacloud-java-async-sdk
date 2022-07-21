// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSoundCodeScheduleResponse} extends {@link TeaModel}
 *
 * <p>CreateSoundCodeScheduleResponse</p>
 */
public class CreateSoundCodeScheduleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSoundCodeScheduleResponseBody body;

    private CreateSoundCodeScheduleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSoundCodeScheduleResponse create() {
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
    public CreateSoundCodeScheduleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSoundCodeScheduleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSoundCodeScheduleResponseBody body);

        @Override
        CreateSoundCodeScheduleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSoundCodeScheduleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSoundCodeScheduleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSoundCodeScheduleResponse response) {
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
        public Builder body(CreateSoundCodeScheduleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSoundCodeScheduleResponse build() {
            return new CreateSoundCodeScheduleResponse(this);
        } 

    } 

}
