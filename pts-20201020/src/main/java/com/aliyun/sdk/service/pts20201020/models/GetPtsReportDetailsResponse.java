// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPtsReportDetailsResponse} extends {@link TeaModel}
 *
 * <p>GetPtsReportDetailsResponse</p>
 */
public class GetPtsReportDetailsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPtsReportDetailsResponseBody body;

    private GetPtsReportDetailsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPtsReportDetailsResponse create() {
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
    public GetPtsReportDetailsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPtsReportDetailsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPtsReportDetailsResponseBody body);

        @Override
        GetPtsReportDetailsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPtsReportDetailsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPtsReportDetailsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPtsReportDetailsResponse response) {
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
        public Builder body(GetPtsReportDetailsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPtsReportDetailsResponse build() {
            return new GetPtsReportDetailsResponse(this);
        } 

    } 

}
