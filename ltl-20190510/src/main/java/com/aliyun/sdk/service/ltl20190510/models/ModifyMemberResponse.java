// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMemberResponse} extends {@link TeaModel}
 *
 * <p>ModifyMemberResponse</p>
 */
public class ModifyMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyMemberResponseBody body;

    private ModifyMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyMemberResponse create() {
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
    public ModifyMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyMemberResponseBody body);

        @Override
        ModifyMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyMemberResponse response) {
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
        public Builder body(ModifyMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyMemberResponse build() {
            return new ModifyMemberResponse(this);
        } 

    } 

}
