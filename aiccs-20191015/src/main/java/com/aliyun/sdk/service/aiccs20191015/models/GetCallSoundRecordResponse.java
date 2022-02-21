// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCallSoundRecordResponse} extends {@link TeaModel}
 *
 * <p>GetCallSoundRecordResponse</p>
 */
public class GetCallSoundRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCallSoundRecordResponseBody body;

    private GetCallSoundRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCallSoundRecordResponse create() {
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
    public GetCallSoundRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCallSoundRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCallSoundRecordResponseBody body);

        @Override
        GetCallSoundRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCallSoundRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCallSoundRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCallSoundRecordResponse response) {
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
        public Builder body(GetCallSoundRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCallSoundRecordResponse build() {
            return new GetCallSoundRecordResponse(this);
        } 

    } 

}
