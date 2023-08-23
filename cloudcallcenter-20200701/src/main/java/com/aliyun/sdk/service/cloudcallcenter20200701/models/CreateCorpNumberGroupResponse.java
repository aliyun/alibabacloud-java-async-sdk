// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCorpNumberGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateCorpNumberGroupResponse</p>
 */
public class CreateCorpNumberGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCorpNumberGroupResponseBody body;

    private CreateCorpNumberGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCorpNumberGroupResponse create() {
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
    public CreateCorpNumberGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCorpNumberGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCorpNumberGroupResponseBody body);

        @Override
        CreateCorpNumberGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCorpNumberGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCorpNumberGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCorpNumberGroupResponse response) {
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
        public Builder body(CreateCorpNumberGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCorpNumberGroupResponse build() {
            return new CreateCorpNumberGroupResponse(this);
        } 

    } 

}
