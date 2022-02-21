// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCreditLabelActionResponse} extends {@link TeaModel}
 *
 * <p>SetCreditLabelActionResponse</p>
 */
public class SetCreditLabelActionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetCreditLabelActionResponseBody body;

    private SetCreditLabelActionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetCreditLabelActionResponse create() {
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
    public SetCreditLabelActionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetCreditLabelActionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetCreditLabelActionResponseBody body);

        @Override
        SetCreditLabelActionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetCreditLabelActionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetCreditLabelActionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetCreditLabelActionResponse response) {
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
        public Builder body(SetCreditLabelActionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetCreditLabelActionResponse build() {
            return new SetCreditLabelActionResponse(this);
        } 

    } 

}
