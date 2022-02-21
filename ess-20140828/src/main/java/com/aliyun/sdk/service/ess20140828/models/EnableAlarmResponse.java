// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableAlarmResponse} extends {@link TeaModel}
 *
 * <p>EnableAlarmResponse</p>
 */
public class EnableAlarmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableAlarmResponseBody body;

    private EnableAlarmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableAlarmResponse create() {
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
    public EnableAlarmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableAlarmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableAlarmResponseBody body);

        @Override
        EnableAlarmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableAlarmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableAlarmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableAlarmResponse response) {
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
        public Builder body(EnableAlarmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableAlarmResponse build() {
            return new EnableAlarmResponse(this);
        } 

    } 

}
