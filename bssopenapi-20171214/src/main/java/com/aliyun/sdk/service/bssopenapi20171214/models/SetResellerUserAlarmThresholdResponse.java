// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetResellerUserAlarmThresholdResponse} extends {@link TeaModel}
 *
 * <p>SetResellerUserAlarmThresholdResponse</p>
 */
public class SetResellerUserAlarmThresholdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetResellerUserAlarmThresholdResponseBody body;

    private SetResellerUserAlarmThresholdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetResellerUserAlarmThresholdResponse create() {
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
    public SetResellerUserAlarmThresholdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetResellerUserAlarmThresholdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetResellerUserAlarmThresholdResponseBody body);

        @Override
        SetResellerUserAlarmThresholdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetResellerUserAlarmThresholdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetResellerUserAlarmThresholdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetResellerUserAlarmThresholdResponse response) {
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
        public Builder body(SetResellerUserAlarmThresholdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetResellerUserAlarmThresholdResponse build() {
            return new SetResellerUserAlarmThresholdResponse(this);
        } 

    } 

}
