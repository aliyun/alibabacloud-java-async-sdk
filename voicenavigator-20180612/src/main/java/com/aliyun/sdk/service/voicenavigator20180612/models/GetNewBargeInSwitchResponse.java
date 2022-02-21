// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNewBargeInSwitchResponse} extends {@link TeaModel}
 *
 * <p>GetNewBargeInSwitchResponse</p>
 */
public class GetNewBargeInSwitchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetNewBargeInSwitchResponseBody body;

    private GetNewBargeInSwitchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetNewBargeInSwitchResponse create() {
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
    public GetNewBargeInSwitchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetNewBargeInSwitchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetNewBargeInSwitchResponseBody body);

        @Override
        GetNewBargeInSwitchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetNewBargeInSwitchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetNewBargeInSwitchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetNewBargeInSwitchResponse response) {
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
        public Builder body(GetNewBargeInSwitchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetNewBargeInSwitchResponse build() {
            return new GetNewBargeInSwitchResponse(this);
        } 

    } 

}
