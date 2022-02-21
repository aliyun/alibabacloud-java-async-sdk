// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCrossRegionLogBackupFilesResponse} extends {@link TeaModel}
 *
 * <p>DescribeCrossRegionLogBackupFilesResponse</p>
 */
public class DescribeCrossRegionLogBackupFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCrossRegionLogBackupFilesResponseBody body;

    private DescribeCrossRegionLogBackupFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCrossRegionLogBackupFilesResponse create() {
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
    public DescribeCrossRegionLogBackupFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCrossRegionLogBackupFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCrossRegionLogBackupFilesResponseBody body);

        @Override
        DescribeCrossRegionLogBackupFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCrossRegionLogBackupFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCrossRegionLogBackupFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCrossRegionLogBackupFilesResponse response) {
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
        public Builder body(DescribeCrossRegionLogBackupFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCrossRegionLogBackupFilesResponse build() {
            return new DescribeCrossRegionLogBackupFilesResponse(this);
        } 

    } 

}
