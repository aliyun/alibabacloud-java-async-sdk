// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowTagGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateFlowTagGroupResponse</p>
 */
public class CreateFlowTagGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFlowTagGroupResponseBody body;

    private CreateFlowTagGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFlowTagGroupResponse create() {
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
    public CreateFlowTagGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFlowTagGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFlowTagGroupResponseBody body);

        @Override
        CreateFlowTagGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFlowTagGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFlowTagGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFlowTagGroupResponse response) {
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
        public Builder body(CreateFlowTagGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFlowTagGroupResponse build() {
            return new CreateFlowTagGroupResponse(this);
        } 

    } 

}
