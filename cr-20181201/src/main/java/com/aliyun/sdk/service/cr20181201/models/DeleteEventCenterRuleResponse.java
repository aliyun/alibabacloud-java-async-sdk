// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEventCenterRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteEventCenterRuleResponse</p>
 */
public class DeleteEventCenterRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteEventCenterRuleResponseBody body;

    private DeleteEventCenterRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteEventCenterRuleResponse create() {
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
    public DeleteEventCenterRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEventCenterRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteEventCenterRuleResponseBody body);

        @Override
        DeleteEventCenterRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEventCenterRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteEventCenterRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEventCenterRuleResponse response) {
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
        public Builder body(DeleteEventCenterRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEventCenterRuleResponse build() {
            return new DeleteEventCenterRuleResponse(this);
        } 

    } 

}
