// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddShareReportResponse} extends {@link TeaModel}
 *
 * <p>AddShareReportResponse</p>
 */
public class AddShareReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddShareReportResponseBody body;

    private AddShareReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddShareReportResponse create() {
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
    public AddShareReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddShareReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddShareReportResponseBody body);

        @Override
        AddShareReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddShareReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddShareReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddShareReportResponse response) {
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
        public Builder body(AddShareReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddShareReportResponse build() {
            return new AddShareReportResponse(this);
        } 

    } 

}
