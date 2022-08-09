// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAutoRechargeSwitchResponse} extends {@link TeaModel}
 *
 * <p>UpdateAutoRechargeSwitchResponse</p>
 */
public class UpdateAutoRechargeSwitchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAutoRechargeSwitchResponseBody body;

    private UpdateAutoRechargeSwitchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAutoRechargeSwitchResponse create() {
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
    public UpdateAutoRechargeSwitchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAutoRechargeSwitchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAutoRechargeSwitchResponseBody body);

        @Override
        UpdateAutoRechargeSwitchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAutoRechargeSwitchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAutoRechargeSwitchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAutoRechargeSwitchResponse response) {
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
        public Builder body(UpdateAutoRechargeSwitchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAutoRechargeSwitchResponse build() {
            return new UpdateAutoRechargeSwitchResponse(this);
        } 

    } 

}
