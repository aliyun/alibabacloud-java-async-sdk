// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFabricConsortiumMemberResponse} extends {@link TeaModel}
 *
 * <p>CreateFabricConsortiumMemberResponse</p>
 */
public class CreateFabricConsortiumMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFabricConsortiumMemberResponseBody body;

    private CreateFabricConsortiumMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFabricConsortiumMemberResponse create() {
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
    public CreateFabricConsortiumMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFabricConsortiumMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFabricConsortiumMemberResponseBody body);

        @Override
        CreateFabricConsortiumMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFabricConsortiumMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFabricConsortiumMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFabricConsortiumMemberResponse response) {
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
        public Builder body(CreateFabricConsortiumMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFabricConsortiumMemberResponse build() {
            return new CreateFabricConsortiumMemberResponse(this);
        } 

    } 

}
