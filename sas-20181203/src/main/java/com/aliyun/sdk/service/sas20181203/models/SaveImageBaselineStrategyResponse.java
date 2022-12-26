// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveImageBaselineStrategyResponse} extends {@link TeaModel}
 *
 * <p>SaveImageBaselineStrategyResponse</p>
 */
public class SaveImageBaselineStrategyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveImageBaselineStrategyResponseBody body;

    private SaveImageBaselineStrategyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveImageBaselineStrategyResponse create() {
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
    public SaveImageBaselineStrategyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveImageBaselineStrategyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveImageBaselineStrategyResponseBody body);

        @Override
        SaveImageBaselineStrategyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveImageBaselineStrategyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveImageBaselineStrategyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveImageBaselineStrategyResponse response) {
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
        public Builder body(SaveImageBaselineStrategyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveImageBaselineStrategyResponse build() {
            return new SaveImageBaselineStrategyResponse(this);
        } 

    } 

}
