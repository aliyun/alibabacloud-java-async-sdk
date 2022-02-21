// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindCorpGroupResponse} extends {@link TeaModel}
 *
 * <p>BindCorpGroupResponse</p>
 */
public class BindCorpGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindCorpGroupResponseBody body;

    private BindCorpGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindCorpGroupResponse create() {
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
    public BindCorpGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindCorpGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindCorpGroupResponseBody body);

        @Override
        BindCorpGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindCorpGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindCorpGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindCorpGroupResponse response) {
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
        public Builder body(BindCorpGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindCorpGroupResponse build() {
            return new BindCorpGroupResponse(this);
        } 

    } 

}
