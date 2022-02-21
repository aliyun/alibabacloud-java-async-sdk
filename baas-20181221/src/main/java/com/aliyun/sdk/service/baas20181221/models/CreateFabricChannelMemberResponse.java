// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFabricChannelMemberResponse} extends {@link TeaModel}
 *
 * <p>CreateFabricChannelMemberResponse</p>
 */
public class CreateFabricChannelMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFabricChannelMemberResponseBody body;

    private CreateFabricChannelMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFabricChannelMemberResponse create() {
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
    public CreateFabricChannelMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFabricChannelMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFabricChannelMemberResponseBody body);

        @Override
        CreateFabricChannelMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFabricChannelMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFabricChannelMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFabricChannelMemberResponse response) {
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
        public Builder body(CreateFabricChannelMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFabricChannelMemberResponse build() {
            return new CreateFabricChannelMemberResponse(this);
        } 

    } 

}
