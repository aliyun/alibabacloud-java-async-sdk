// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateQualityRuleResponse} extends {@link TeaModel}
 *
 * <p>UpdateQualityRuleResponse</p>
 */
public class UpdateQualityRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateQualityRuleResponseBody body;

    private UpdateQualityRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateQualityRuleResponse create() {
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
    public UpdateQualityRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateQualityRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateQualityRuleResponseBody body);

        @Override
        UpdateQualityRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateQualityRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateQualityRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateQualityRuleResponse response) {
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
        public Builder body(UpdateQualityRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateQualityRuleResponse build() {
            return new UpdateQualityRuleResponse(this);
        } 

    } 

}
