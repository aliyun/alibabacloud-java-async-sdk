// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSoundCodeScheduleResponse} extends {@link TeaModel}
 *
 * <p>GetSoundCodeScheduleResponse</p>
 */
public class GetSoundCodeScheduleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSoundCodeScheduleResponseBody body;

    private GetSoundCodeScheduleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSoundCodeScheduleResponse create() {
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
    public GetSoundCodeScheduleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSoundCodeScheduleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSoundCodeScheduleResponseBody body);

        @Override
        GetSoundCodeScheduleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSoundCodeScheduleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSoundCodeScheduleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSoundCodeScheduleResponse response) {
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
        public Builder body(GetSoundCodeScheduleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSoundCodeScheduleResponse build() {
            return new GetSoundCodeScheduleResponse(this);
        } 

    } 

}
