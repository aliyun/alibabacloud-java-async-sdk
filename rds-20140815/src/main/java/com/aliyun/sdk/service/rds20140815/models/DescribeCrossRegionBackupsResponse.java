// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCrossRegionBackupsResponse} extends {@link TeaModel}
 *
 * <p>DescribeCrossRegionBackupsResponse</p>
 */
public class DescribeCrossRegionBackupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCrossRegionBackupsResponseBody body;

    private DescribeCrossRegionBackupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCrossRegionBackupsResponse create() {
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
    public DescribeCrossRegionBackupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCrossRegionBackupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCrossRegionBackupsResponseBody body);

        @Override
        DescribeCrossRegionBackupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCrossRegionBackupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCrossRegionBackupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCrossRegionBackupsResponse response) {
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
        public Builder body(DescribeCrossRegionBackupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCrossRegionBackupsResponse build() {
            return new DescribeCrossRegionBackupsResponse(this);
        } 

    } 

}
