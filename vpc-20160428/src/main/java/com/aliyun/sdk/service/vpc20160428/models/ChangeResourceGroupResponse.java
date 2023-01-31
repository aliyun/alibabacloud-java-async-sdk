// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeResourceGroupResponse} extends {@link TeaModel}
 *
 * <p>ChangeResourceGroupResponse</p>
 */
public class ChangeResourceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChangeResourceGroupResponseBody body;

    private ChangeResourceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChangeResourceGroupResponse create() {
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
    public ChangeResourceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeResourceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChangeResourceGroupResponseBody body);

        @Override
        ChangeResourceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeResourceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChangeResourceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeResourceGroupResponse response) {
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
        public Builder body(ChangeResourceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeResourceGroupResponse build() {
            return new ChangeResourceGroupResponse(this);
        } 

    } 

}
