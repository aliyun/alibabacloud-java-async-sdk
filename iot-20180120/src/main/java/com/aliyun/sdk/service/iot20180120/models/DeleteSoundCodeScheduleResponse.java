// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSoundCodeScheduleResponse} extends {@link TeaModel}
 *
 * <p>DeleteSoundCodeScheduleResponse</p>
 */
public class DeleteSoundCodeScheduleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSoundCodeScheduleResponseBody body;

    private DeleteSoundCodeScheduleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSoundCodeScheduleResponse create() {
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
    public DeleteSoundCodeScheduleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSoundCodeScheduleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSoundCodeScheduleResponseBody body);

        @Override
        DeleteSoundCodeScheduleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSoundCodeScheduleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSoundCodeScheduleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSoundCodeScheduleResponse response) {
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
        public Builder body(DeleteSoundCodeScheduleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSoundCodeScheduleResponse build() {
            return new DeleteSoundCodeScheduleResponse(this);
        } 

    } 

}
