// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CarApplyModifyResponse} extends {@link TeaModel}
 *
 * <p>CarApplyModifyResponse</p>
 */
public class CarApplyModifyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CarApplyModifyResponseBody body;

    private CarApplyModifyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CarApplyModifyResponse create() {
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
    public CarApplyModifyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CarApplyModifyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CarApplyModifyResponseBody body);

        @Override
        CarApplyModifyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CarApplyModifyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CarApplyModifyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CarApplyModifyResponse response) {
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
        public Builder body(CarApplyModifyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CarApplyModifyResponse build() {
            return new CarApplyModifyResponse(this);
        } 

    } 

}
