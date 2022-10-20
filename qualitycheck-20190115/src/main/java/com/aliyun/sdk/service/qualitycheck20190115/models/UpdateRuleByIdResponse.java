// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRuleByIdResponse} extends {@link TeaModel}
 *
 * <p>UpdateRuleByIdResponse</p>
 */
public class UpdateRuleByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateRuleByIdResponseBody body;

    private UpdateRuleByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateRuleByIdResponse create() {
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
    public UpdateRuleByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateRuleByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateRuleByIdResponseBody body);

        @Override
        UpdateRuleByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateRuleByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateRuleByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateRuleByIdResponse response) {
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
        public Builder body(UpdateRuleByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateRuleByIdResponse build() {
            return new UpdateRuleByIdResponse(this);
        } 

    } 

}
