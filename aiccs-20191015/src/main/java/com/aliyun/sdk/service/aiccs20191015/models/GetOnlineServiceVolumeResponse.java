// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOnlineServiceVolumeResponse} extends {@link TeaModel}
 *
 * <p>GetOnlineServiceVolumeResponse</p>
 */
public class GetOnlineServiceVolumeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOnlineServiceVolumeResponseBody body;

    private GetOnlineServiceVolumeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOnlineServiceVolumeResponse create() {
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
    public GetOnlineServiceVolumeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOnlineServiceVolumeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOnlineServiceVolumeResponseBody body);

        @Override
        GetOnlineServiceVolumeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOnlineServiceVolumeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOnlineServiceVolumeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOnlineServiceVolumeResponse response) {
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
        public Builder body(GetOnlineServiceVolumeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOnlineServiceVolumeResponse build() {
            return new GetOnlineServiceVolumeResponse(this);
        } 

    } 

}
