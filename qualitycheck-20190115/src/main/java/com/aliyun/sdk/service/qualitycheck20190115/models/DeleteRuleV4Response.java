// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRuleV4Response} extends {@link TeaModel}
 *
 * <p>DeleteRuleV4Response</p>
 */
public class DeleteRuleV4Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRuleV4ResponseBody body;

    private DeleteRuleV4Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRuleV4Response create() {
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
    public DeleteRuleV4ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRuleV4Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRuleV4ResponseBody body);

        @Override
        DeleteRuleV4Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRuleV4Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRuleV4ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRuleV4Response response) {
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
        public Builder body(DeleteRuleV4ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRuleV4Response build() {
            return new DeleteRuleV4Response(this);
        } 

    } 

}
