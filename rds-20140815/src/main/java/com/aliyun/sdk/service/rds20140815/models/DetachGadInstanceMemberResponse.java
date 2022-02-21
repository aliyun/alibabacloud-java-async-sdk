// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachGadInstanceMemberResponse} extends {@link TeaModel}
 *
 * <p>DetachGadInstanceMemberResponse</p>
 */
public class DetachGadInstanceMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachGadInstanceMemberResponseBody body;

    private DetachGadInstanceMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachGadInstanceMemberResponse create() {
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
    public DetachGadInstanceMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachGadInstanceMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachGadInstanceMemberResponseBody body);

        @Override
        DetachGadInstanceMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachGadInstanceMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachGadInstanceMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachGadInstanceMemberResponse response) {
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
        public Builder body(DetachGadInstanceMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachGadInstanceMemberResponse build() {
            return new DetachGadInstanceMemberResponse(this);
        } 

    } 

}
