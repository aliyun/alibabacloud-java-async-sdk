// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBgpGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateBgpGroupResponse</p>
 */
public class CreateBgpGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateBgpGroupResponseBody body;

    private CreateBgpGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateBgpGroupResponse create() {
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
    public CreateBgpGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateBgpGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateBgpGroupResponseBody body);

        @Override
        CreateBgpGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateBgpGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateBgpGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateBgpGroupResponse response) {
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
        public Builder body(CreateBgpGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateBgpGroupResponse build() {
            return new CreateBgpGroupResponse(this);
        } 

    } 

}
