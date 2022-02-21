// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountJobByConditionResponse} extends {@link TeaModel}
 *
 * <p>CountJobByConditionResponse</p>
 */
public class CountJobByConditionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CountJobByConditionResponseBody body;

    private CountJobByConditionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CountJobByConditionResponse create() {
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
    public CountJobByConditionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CountJobByConditionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CountJobByConditionResponseBody body);

        @Override
        CountJobByConditionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CountJobByConditionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CountJobByConditionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CountJobByConditionResponse response) {
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
        public Builder body(CountJobByConditionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CountJobByConditionResponse build() {
            return new CountJobByConditionResponse(this);
        } 

    } 

}
