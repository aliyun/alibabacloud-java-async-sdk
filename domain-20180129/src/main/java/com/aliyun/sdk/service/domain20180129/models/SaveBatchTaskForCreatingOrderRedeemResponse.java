// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBatchTaskForCreatingOrderRedeemResponse} extends {@link TeaModel}
 *
 * <p>SaveBatchTaskForCreatingOrderRedeemResponse</p>
 */
public class SaveBatchTaskForCreatingOrderRedeemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveBatchTaskForCreatingOrderRedeemResponseBody body;

    private SaveBatchTaskForCreatingOrderRedeemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveBatchTaskForCreatingOrderRedeemResponse create() {
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
    public SaveBatchTaskForCreatingOrderRedeemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveBatchTaskForCreatingOrderRedeemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveBatchTaskForCreatingOrderRedeemResponseBody body);

        @Override
        SaveBatchTaskForCreatingOrderRedeemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveBatchTaskForCreatingOrderRedeemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveBatchTaskForCreatingOrderRedeemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveBatchTaskForCreatingOrderRedeemResponse response) {
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
        public Builder body(SaveBatchTaskForCreatingOrderRedeemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveBatchTaskForCreatingOrderRedeemResponse build() {
            return new SaveBatchTaskForCreatingOrderRedeemResponse(this);
        } 

    } 

}
