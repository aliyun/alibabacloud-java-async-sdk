// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBinlogFilesResponse} extends {@link TeaModel}
 *
 * <p>DescribeBinlogFilesResponse</p>
 */
public class DescribeBinlogFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBinlogFilesResponseBody body;

    private DescribeBinlogFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBinlogFilesResponse create() {
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
    public DescribeBinlogFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBinlogFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBinlogFilesResponseBody body);

        @Override
        DescribeBinlogFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBinlogFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBinlogFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBinlogFilesResponse response) {
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
        public Builder body(DescribeBinlogFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBinlogFilesResponse build() {
            return new DescribeBinlogFilesResponse(this);
        } 

    } 

}
