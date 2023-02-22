// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MonthBillConfirmResponse} extends {@link TeaModel}
 *
 * <p>MonthBillConfirmResponse</p>
 */
public class MonthBillConfirmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MonthBillConfirmResponseBody body;

    private MonthBillConfirmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MonthBillConfirmResponse create() {
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
    public MonthBillConfirmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MonthBillConfirmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MonthBillConfirmResponseBody body);

        @Override
        MonthBillConfirmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MonthBillConfirmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MonthBillConfirmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MonthBillConfirmResponse response) {
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
        public Builder body(MonthBillConfirmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MonthBillConfirmResponse build() {
            return new MonthBillConfirmResponse(this);
        } 

    } 

}
