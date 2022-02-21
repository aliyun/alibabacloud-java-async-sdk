// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNewBargeInSwitchResponse} extends {@link TeaModel}
 *
 * <p>UpdateNewBargeInSwitchResponse</p>
 */
public class UpdateNewBargeInSwitchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateNewBargeInSwitchResponseBody body;

    private UpdateNewBargeInSwitchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateNewBargeInSwitchResponse create() {
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
    public UpdateNewBargeInSwitchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateNewBargeInSwitchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateNewBargeInSwitchResponseBody body);

        @Override
        UpdateNewBargeInSwitchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateNewBargeInSwitchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateNewBargeInSwitchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateNewBargeInSwitchResponse response) {
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
        public Builder body(UpdateNewBargeInSwitchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateNewBargeInSwitchResponse build() {
            return new UpdateNewBargeInSwitchResponse(this);
        } 

    } 

}
