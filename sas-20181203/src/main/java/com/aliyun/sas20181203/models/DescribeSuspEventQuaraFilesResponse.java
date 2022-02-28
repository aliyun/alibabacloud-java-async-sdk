// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspEventQuaraFilesResponse} extends {@link TeaModel}
 *
 * <p>DescribeSuspEventQuaraFilesResponse</p>
 */
public class DescribeSuspEventQuaraFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSuspEventQuaraFilesResponseBody body;

    private DescribeSuspEventQuaraFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSuspEventQuaraFilesResponse create() {
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
    public DescribeSuspEventQuaraFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSuspEventQuaraFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSuspEventQuaraFilesResponseBody body);

        @Override
        DescribeSuspEventQuaraFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSuspEventQuaraFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSuspEventQuaraFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSuspEventQuaraFilesResponse response) {
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
        public Builder body(DescribeSuspEventQuaraFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSuspEventQuaraFilesResponse build() {
            return new DescribeSuspEventQuaraFilesResponse(this);
        } 

    } 

}
