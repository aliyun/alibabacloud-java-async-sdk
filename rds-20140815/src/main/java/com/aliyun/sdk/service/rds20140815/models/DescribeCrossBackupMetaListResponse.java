// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCrossBackupMetaListResponse} extends {@link TeaModel}
 *
 * <p>DescribeCrossBackupMetaListResponse</p>
 */
public class DescribeCrossBackupMetaListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCrossBackupMetaListResponseBody body;

    private DescribeCrossBackupMetaListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCrossBackupMetaListResponse create() {
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
    public DescribeCrossBackupMetaListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCrossBackupMetaListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCrossBackupMetaListResponseBody body);

        @Override
        DescribeCrossBackupMetaListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCrossBackupMetaListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCrossBackupMetaListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCrossBackupMetaListResponse response) {
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
        public Builder body(DescribeCrossBackupMetaListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCrossBackupMetaListResponse build() {
            return new DescribeCrossBackupMetaListResponse(this);
        } 

    } 

}
