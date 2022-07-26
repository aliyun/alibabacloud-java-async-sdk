// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MonthBillGetResponse} extends {@link TeaModel}
 *
 * <p>MonthBillGetResponse</p>
 */
public class MonthBillGetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MonthBillGetResponseBody body;

    private MonthBillGetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MonthBillGetResponse create() {
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
    public MonthBillGetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MonthBillGetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MonthBillGetResponseBody body);

        @Override
        MonthBillGetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MonthBillGetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MonthBillGetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MonthBillGetResponse response) {
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
        public Builder body(MonthBillGetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MonthBillGetResponse build() {
            return new MonthBillGetResponse(this);
        } 

    } 

}
