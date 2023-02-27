// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportDoNotCallNumbersResponse} extends {@link TeaModel}
 *
 * <p>ExportDoNotCallNumbersResponse</p>
 */
public class ExportDoNotCallNumbersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExportDoNotCallNumbersResponseBody body;

    private ExportDoNotCallNumbersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExportDoNotCallNumbersResponse create() {
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
    public ExportDoNotCallNumbersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExportDoNotCallNumbersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExportDoNotCallNumbersResponseBody body);

        @Override
        ExportDoNotCallNumbersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExportDoNotCallNumbersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExportDoNotCallNumbersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExportDoNotCallNumbersResponse response) {
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
        public Builder body(ExportDoNotCallNumbersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExportDoNotCallNumbersResponse build() {
            return new ExportDoNotCallNumbersResponse(this);
        } 

    } 

}
