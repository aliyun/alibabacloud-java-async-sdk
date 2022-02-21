// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySkillGroupOutboundNumbersResponse} extends {@link TeaModel}
 *
 * <p>ModifySkillGroupOutboundNumbersResponse</p>
 */
public class ModifySkillGroupOutboundNumbersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySkillGroupOutboundNumbersResponseBody body;

    private ModifySkillGroupOutboundNumbersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySkillGroupOutboundNumbersResponse create() {
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
    public ModifySkillGroupOutboundNumbersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySkillGroupOutboundNumbersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySkillGroupOutboundNumbersResponseBody body);

        @Override
        ModifySkillGroupOutboundNumbersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySkillGroupOutboundNumbersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySkillGroupOutboundNumbersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySkillGroupOutboundNumbersResponse response) {
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
        public Builder body(ModifySkillGroupOutboundNumbersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySkillGroupOutboundNumbersResponse build() {
            return new ModifySkillGroupOutboundNumbersResponse(this);
        } 

    } 

}
