// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SychDbfsRecordResponse} extends {@link TeaModel}
 *
 * <p>SychDbfsRecordResponse</p>
 */
public class SychDbfsRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SychDbfsRecordResponseBody body;

    private SychDbfsRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SychDbfsRecordResponse create() {
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
    public SychDbfsRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SychDbfsRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SychDbfsRecordResponseBody body);

        @Override
        SychDbfsRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SychDbfsRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SychDbfsRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SychDbfsRecordResponse response) {
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
        public Builder body(SychDbfsRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SychDbfsRecordResponse build() {
            return new SychDbfsRecordResponse(this);
        } 

    } 

}
