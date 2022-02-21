// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateZoneRemarkResponse} extends {@link TeaModel}
 *
 * <p>UpdateZoneRemarkResponse</p>
 */
public class UpdateZoneRemarkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateZoneRemarkResponseBody body;

    private UpdateZoneRemarkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateZoneRemarkResponse create() {
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
    public UpdateZoneRemarkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateZoneRemarkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateZoneRemarkResponseBody body);

        @Override
        UpdateZoneRemarkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateZoneRemarkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateZoneRemarkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateZoneRemarkResponse response) {
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
        public Builder body(UpdateZoneRemarkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateZoneRemarkResponse build() {
            return new UpdateZoneRemarkResponse(this);
        } 

    } 

}
