// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportRecordResponse} extends {@link TeaModel}
 *
 * <p>ExportRecordResponse</p>
 */
public class ExportRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExportRecordResponseBody body;

    private ExportRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExportRecordResponse create() {
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
    public ExportRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExportRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExportRecordResponseBody body);

        @Override
        ExportRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExportRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExportRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExportRecordResponse response) {
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
        public Builder body(ExportRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExportRecordResponse build() {
            return new ExportRecordResponse(this);
        } 

    } 

}
