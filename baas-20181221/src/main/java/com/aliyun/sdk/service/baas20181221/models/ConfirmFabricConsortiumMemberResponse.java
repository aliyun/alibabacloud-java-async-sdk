// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmFabricConsortiumMemberResponse} extends {@link TeaModel}
 *
 * <p>ConfirmFabricConsortiumMemberResponse</p>
 */
public class ConfirmFabricConsortiumMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfirmFabricConsortiumMemberResponseBody body;

    private ConfirmFabricConsortiumMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfirmFabricConsortiumMemberResponse create() {
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
    public ConfirmFabricConsortiumMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfirmFabricConsortiumMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfirmFabricConsortiumMemberResponseBody body);

        @Override
        ConfirmFabricConsortiumMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfirmFabricConsortiumMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfirmFabricConsortiumMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfirmFabricConsortiumMemberResponse response) {
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
        public Builder body(ConfirmFabricConsortiumMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfirmFabricConsortiumMemberResponse build() {
            return new ConfirmFabricConsortiumMemberResponse(this);
        } 

    } 

}
