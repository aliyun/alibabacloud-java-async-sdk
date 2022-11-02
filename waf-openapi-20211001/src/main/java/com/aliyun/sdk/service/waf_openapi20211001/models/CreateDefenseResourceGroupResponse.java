// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDefenseResourceGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateDefenseResourceGroupResponse</p>
 */
public class CreateDefenseResourceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDefenseResourceGroupResponseBody body;

    private CreateDefenseResourceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDefenseResourceGroupResponse create() {
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
    public CreateDefenseResourceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDefenseResourceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDefenseResourceGroupResponseBody body);

        @Override
        CreateDefenseResourceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDefenseResourceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDefenseResourceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDefenseResourceGroupResponse response) {
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
        public Builder body(CreateDefenseResourceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDefenseResourceGroupResponse build() {
            return new CreateDefenseResourceGroupResponse(this);
        } 

    } 

}
