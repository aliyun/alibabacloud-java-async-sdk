// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAntChainMemberResponse} extends {@link TeaModel}
 *
 * <p>UpdateAntChainMemberResponse</p>
 */
public class UpdateAntChainMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAntChainMemberResponseBody body;

    private UpdateAntChainMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAntChainMemberResponse create() {
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
    public UpdateAntChainMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAntChainMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAntChainMemberResponseBody body);

        @Override
        UpdateAntChainMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAntChainMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAntChainMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAntChainMemberResponse response) {
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
        public Builder body(UpdateAntChainMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAntChainMemberResponse build() {
            return new UpdateAntChainMemberResponse(this);
        } 

    } 

}
