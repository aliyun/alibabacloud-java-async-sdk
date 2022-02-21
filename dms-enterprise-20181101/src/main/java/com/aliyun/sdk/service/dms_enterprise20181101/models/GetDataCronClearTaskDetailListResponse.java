// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataCronClearTaskDetailListResponse} extends {@link TeaModel}
 *
 * <p>GetDataCronClearTaskDetailListResponse</p>
 */
public class GetDataCronClearTaskDetailListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDataCronClearTaskDetailListResponseBody body;

    private GetDataCronClearTaskDetailListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDataCronClearTaskDetailListResponse create() {
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
    public GetDataCronClearTaskDetailListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataCronClearTaskDetailListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDataCronClearTaskDetailListResponseBody body);

        @Override
        GetDataCronClearTaskDetailListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataCronClearTaskDetailListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDataCronClearTaskDetailListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataCronClearTaskDetailListResponse response) {
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
        public Builder body(GetDataCronClearTaskDetailListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataCronClearTaskDetailListResponse build() {
            return new GetDataCronClearTaskDetailListResponse(this);
        } 

    } 

}
