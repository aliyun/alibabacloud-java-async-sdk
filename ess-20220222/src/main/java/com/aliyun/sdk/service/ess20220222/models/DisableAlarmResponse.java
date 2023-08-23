// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableAlarmResponse} extends {@link TeaModel}
 *
 * <p>DisableAlarmResponse</p>
 */
public class DisableAlarmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableAlarmResponseBody body;

    private DisableAlarmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableAlarmResponse create() {
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
    public DisableAlarmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableAlarmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableAlarmResponseBody body);

        @Override
        DisableAlarmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableAlarmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableAlarmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableAlarmResponse response) {
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
        public Builder body(DisableAlarmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableAlarmResponse build() {
            return new DisableAlarmResponse(this);
        } 

    } 

}
