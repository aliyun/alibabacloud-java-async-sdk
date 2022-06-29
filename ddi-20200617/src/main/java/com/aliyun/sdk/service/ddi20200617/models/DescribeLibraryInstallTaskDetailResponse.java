// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLibraryInstallTaskDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeLibraryInstallTaskDetailResponse</p>
 */
public class DescribeLibraryInstallTaskDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLibraryInstallTaskDetailResponseBody body;

    private DescribeLibraryInstallTaskDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLibraryInstallTaskDetailResponse create() {
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
    public DescribeLibraryInstallTaskDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLibraryInstallTaskDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLibraryInstallTaskDetailResponseBody body);

        @Override
        DescribeLibraryInstallTaskDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLibraryInstallTaskDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLibraryInstallTaskDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLibraryInstallTaskDetailResponse response) {
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
        public Builder body(DescribeLibraryInstallTaskDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLibraryInstallTaskDetailResponse build() {
            return new DescribeLibraryInstallTaskDetailResponse(this);
        } 

    } 

}
