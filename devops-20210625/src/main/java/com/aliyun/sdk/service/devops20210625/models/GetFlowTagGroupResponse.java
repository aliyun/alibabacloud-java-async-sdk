// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFlowTagGroupResponse} extends {@link TeaModel}
 *
 * <p>GetFlowTagGroupResponse</p>
 */
public class GetFlowTagGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFlowTagGroupResponseBody body;

    private GetFlowTagGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFlowTagGroupResponse create() {
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
    public GetFlowTagGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFlowTagGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFlowTagGroupResponseBody body);

        @Override
        GetFlowTagGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFlowTagGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFlowTagGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFlowTagGroupResponse response) {
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
        public Builder body(GetFlowTagGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFlowTagGroupResponse build() {
            return new GetFlowTagGroupResponse(this);
        } 

    } 

}
