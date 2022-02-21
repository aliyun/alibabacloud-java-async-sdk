// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindCorpGroupResponse} extends {@link TeaModel}
 *
 * <p>UnbindCorpGroupResponse</p>
 */
public class UnbindCorpGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnbindCorpGroupResponseBody body;

    private UnbindCorpGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnbindCorpGroupResponse create() {
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
    public UnbindCorpGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindCorpGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnbindCorpGroupResponseBody body);

        @Override
        UnbindCorpGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindCorpGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnbindCorpGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindCorpGroupResponse response) {
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
        public Builder body(UnbindCorpGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindCorpGroupResponse build() {
            return new UnbindCorpGroupResponse(this);
        } 

    } 

}
