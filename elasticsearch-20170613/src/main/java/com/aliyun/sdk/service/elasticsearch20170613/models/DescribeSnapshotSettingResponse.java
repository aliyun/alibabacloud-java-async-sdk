// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnapshotSettingResponse} extends {@link TeaModel}
 *
 * <p>DescribeSnapshotSettingResponse</p>
 */
public class DescribeSnapshotSettingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSnapshotSettingResponseBody body;

    private DescribeSnapshotSettingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSnapshotSettingResponse create() {
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
    public DescribeSnapshotSettingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSnapshotSettingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSnapshotSettingResponseBody body);

        @Override
        DescribeSnapshotSettingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSnapshotSettingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSnapshotSettingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSnapshotSettingResponse response) {
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
        public Builder body(DescribeSnapshotSettingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSnapshotSettingResponse build() {
            return new DescribeSnapshotSettingResponse(this);
        } 

    } 

}
