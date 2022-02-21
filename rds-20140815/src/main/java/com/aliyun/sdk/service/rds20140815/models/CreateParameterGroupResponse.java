// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateParameterGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateParameterGroupResponse</p>
 */
public class CreateParameterGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateParameterGroupResponseBody body;

    private CreateParameterGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateParameterGroupResponse create() {
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
    public CreateParameterGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateParameterGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateParameterGroupResponseBody body);

        @Override
        CreateParameterGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateParameterGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateParameterGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateParameterGroupResponse response) {
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
        public Builder body(CreateParameterGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateParameterGroupResponse build() {
            return new CreateParameterGroupResponse(this);
        } 

    } 

}
