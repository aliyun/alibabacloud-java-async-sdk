// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFlowTagGroupResponse} extends {@link TeaModel}
 *
 * <p>UpdateFlowTagGroupResponse</p>
 */
public class UpdateFlowTagGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateFlowTagGroupResponseBody body;

    private UpdateFlowTagGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateFlowTagGroupResponse create() {
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
    public UpdateFlowTagGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateFlowTagGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateFlowTagGroupResponseBody body);

        @Override
        UpdateFlowTagGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateFlowTagGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateFlowTagGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateFlowTagGroupResponse response) {
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
        public Builder body(UpdateFlowTagGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateFlowTagGroupResponse build() {
            return new UpdateFlowTagGroupResponse(this);
        } 

    } 

}
