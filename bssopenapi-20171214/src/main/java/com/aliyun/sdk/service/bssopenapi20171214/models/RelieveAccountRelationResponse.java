// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RelieveAccountRelationResponse} extends {@link TeaModel}
 *
 * <p>RelieveAccountRelationResponse</p>
 */
public class RelieveAccountRelationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RelieveAccountRelationResponseBody body;

    private RelieveAccountRelationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RelieveAccountRelationResponse create() {
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
    public RelieveAccountRelationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RelieveAccountRelationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RelieveAccountRelationResponseBody body);

        @Override
        RelieveAccountRelationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RelieveAccountRelationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RelieveAccountRelationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RelieveAccountRelationResponse response) {
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
        public Builder body(RelieveAccountRelationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RelieveAccountRelationResponse build() {
            return new RelieveAccountRelationResponse(this);
        } 

    } 

}
