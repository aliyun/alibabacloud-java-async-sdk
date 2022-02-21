// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserHdfsInfoResponse} extends {@link TeaModel}
 *
 * <p>AddUserHdfsInfoResponse</p>
 */
public class AddUserHdfsInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddUserHdfsInfoResponseBody body;

    private AddUserHdfsInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddUserHdfsInfoResponse create() {
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
    public AddUserHdfsInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddUserHdfsInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddUserHdfsInfoResponseBody body);

        @Override
        AddUserHdfsInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddUserHdfsInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddUserHdfsInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddUserHdfsInfoResponse response) {
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
        public Builder body(AddUserHdfsInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddUserHdfsInfoResponse build() {
            return new AddUserHdfsInfoResponse(this);
        } 

    } 

}
