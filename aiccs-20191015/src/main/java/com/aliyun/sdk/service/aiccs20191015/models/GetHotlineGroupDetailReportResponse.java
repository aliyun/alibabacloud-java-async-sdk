// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotlineGroupDetailReportResponse} extends {@link TeaModel}
 *
 * <p>GetHotlineGroupDetailReportResponse</p>
 */
public class GetHotlineGroupDetailReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHotlineGroupDetailReportResponseBody body;

    private GetHotlineGroupDetailReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHotlineGroupDetailReportResponse create() {
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
    public GetHotlineGroupDetailReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotlineGroupDetailReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHotlineGroupDetailReportResponseBody body);

        @Override
        GetHotlineGroupDetailReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotlineGroupDetailReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHotlineGroupDetailReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotlineGroupDetailReportResponse response) {
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
        public Builder body(GetHotlineGroupDetailReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotlineGroupDetailReportResponse build() {
            return new GetHotlineGroupDetailReportResponse(this);
        } 

    } 

}
