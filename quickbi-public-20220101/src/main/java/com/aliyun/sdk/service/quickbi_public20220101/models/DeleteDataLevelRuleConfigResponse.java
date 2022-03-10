// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataLevelRuleConfigResponse} extends {@link TeaModel}
 *
 * <p>DeleteDataLevelRuleConfigResponse</p>
 */
public class DeleteDataLevelRuleConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDataLevelRuleConfigResponseBody body;

    private DeleteDataLevelRuleConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDataLevelRuleConfigResponse create() {
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
    public DeleteDataLevelRuleConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDataLevelRuleConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDataLevelRuleConfigResponseBody body);

        @Override
        DeleteDataLevelRuleConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDataLevelRuleConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDataLevelRuleConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDataLevelRuleConfigResponse response) {
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
        public Builder body(DeleteDataLevelRuleConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDataLevelRuleConfigResponse build() {
            return new DeleteDataLevelRuleConfigResponse(this);
        } 

    } 

}
