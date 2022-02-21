// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SdkGenerateByGroupResponse} extends {@link TeaModel}
 *
 * <p>SdkGenerateByGroupResponse</p>
 */
public class SdkGenerateByGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SdkGenerateByGroupResponseBody body;

    private SdkGenerateByGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SdkGenerateByGroupResponse create() {
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
    public SdkGenerateByGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SdkGenerateByGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SdkGenerateByGroupResponseBody body);

        @Override
        SdkGenerateByGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SdkGenerateByGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SdkGenerateByGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SdkGenerateByGroupResponse response) {
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
        public Builder body(SdkGenerateByGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SdkGenerateByGroupResponse build() {
            return new SdkGenerateByGroupResponse(this);
        } 

    } 

}
