// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAlarmResponse} extends {@link TeaModel}
 *
 * <p>CreateAlarmResponse</p>
 */
public class CreateAlarmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAlarmResponseBody body;

    private CreateAlarmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAlarmResponse create() {
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
    public CreateAlarmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAlarmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAlarmResponseBody body);

        @Override
        CreateAlarmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAlarmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAlarmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAlarmResponse response) {
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
        public Builder body(CreateAlarmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAlarmResponse build() {
            return new CreateAlarmResponse(this);
        } 

    } 

}
