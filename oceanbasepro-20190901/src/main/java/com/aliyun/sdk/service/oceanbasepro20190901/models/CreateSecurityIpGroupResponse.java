// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSecurityIpGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateSecurityIpGroupResponse</p>
 */
public class CreateSecurityIpGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSecurityIpGroupResponseBody body;

    private CreateSecurityIpGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSecurityIpGroupResponse create() {
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
    public CreateSecurityIpGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSecurityIpGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSecurityIpGroupResponseBody body);

        @Override
        CreateSecurityIpGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSecurityIpGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSecurityIpGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSecurityIpGroupResponse response) {
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
        public Builder body(CreateSecurityIpGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSecurityIpGroupResponse build() {
            return new CreateSecurityIpGroupResponse(this);
        } 

    } 

}
