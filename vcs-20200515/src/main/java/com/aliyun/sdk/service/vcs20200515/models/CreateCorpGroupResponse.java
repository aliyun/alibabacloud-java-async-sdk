// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCorpGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateCorpGroupResponse</p>
 */
public class CreateCorpGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCorpGroupResponseBody body;

    private CreateCorpGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCorpGroupResponse create() {
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
    public CreateCorpGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCorpGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCorpGroupResponseBody body);

        @Override
        CreateCorpGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCorpGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCorpGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCorpGroupResponse response) {
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
        public Builder body(CreateCorpGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCorpGroupResponse build() {
            return new CreateCorpGroupResponse(this);
        } 

    } 

}
