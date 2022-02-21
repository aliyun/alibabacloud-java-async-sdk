// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConvertOfficeFormatResponse} extends {@link TeaModel}
 *
 * <p>ConvertOfficeFormatResponse</p>
 */
public class ConvertOfficeFormatResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConvertOfficeFormatResponseBody body;

    private ConvertOfficeFormatResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConvertOfficeFormatResponse create() {
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
    public ConvertOfficeFormatResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConvertOfficeFormatResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConvertOfficeFormatResponseBody body);

        @Override
        ConvertOfficeFormatResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConvertOfficeFormatResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConvertOfficeFormatResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConvertOfficeFormatResponse response) {
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
        public Builder body(ConvertOfficeFormatResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConvertOfficeFormatResponse build() {
            return new ConvertOfficeFormatResponse(this);
        } 

    } 

}
