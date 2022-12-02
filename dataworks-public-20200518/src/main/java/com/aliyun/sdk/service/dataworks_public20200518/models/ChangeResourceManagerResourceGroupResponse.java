// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeResourceManagerResourceGroupResponse} extends {@link TeaModel}
 *
 * <p>ChangeResourceManagerResourceGroupResponse</p>
 */
public class ChangeResourceManagerResourceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChangeResourceManagerResourceGroupResponseBody body;

    private ChangeResourceManagerResourceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChangeResourceManagerResourceGroupResponse create() {
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
    public ChangeResourceManagerResourceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeResourceManagerResourceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChangeResourceManagerResourceGroupResponseBody body);

        @Override
        ChangeResourceManagerResourceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeResourceManagerResourceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChangeResourceManagerResourceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeResourceManagerResourceGroupResponse response) {
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
        public Builder body(ChangeResourceManagerResourceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeResourceManagerResourceGroupResponse build() {
            return new ChangeResourceManagerResourceGroupResponse(this);
        } 

    } 

}
