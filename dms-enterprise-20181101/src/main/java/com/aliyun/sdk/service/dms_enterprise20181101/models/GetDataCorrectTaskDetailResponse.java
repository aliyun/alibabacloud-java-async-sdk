// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataCorrectTaskDetailResponse} extends {@link TeaModel}
 *
 * <p>GetDataCorrectTaskDetailResponse</p>
 */
public class GetDataCorrectTaskDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDataCorrectTaskDetailResponseBody body;

    private GetDataCorrectTaskDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDataCorrectTaskDetailResponse create() {
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
    public GetDataCorrectTaskDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataCorrectTaskDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDataCorrectTaskDetailResponseBody body);

        @Override
        GetDataCorrectTaskDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataCorrectTaskDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDataCorrectTaskDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataCorrectTaskDetailResponse response) {
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
        public Builder body(GetDataCorrectTaskDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataCorrectTaskDetailResponse build() {
            return new GetDataCorrectTaskDetailResponse(this);
        } 

    } 

}
