// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosisDimensionsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosisDimensionsResponse</p>
 */
public class DescribeDiagnosisDimensionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDiagnosisDimensionsResponseBody body;

    private DescribeDiagnosisDimensionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDiagnosisDimensionsResponse create() {
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
    public DescribeDiagnosisDimensionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDiagnosisDimensionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDiagnosisDimensionsResponseBody body);

        @Override
        DescribeDiagnosisDimensionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDiagnosisDimensionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDiagnosisDimensionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDiagnosisDimensionsResponse response) {
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
        public Builder body(DescribeDiagnosisDimensionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDiagnosisDimensionsResponse build() {
            return new DescribeDiagnosisDimensionsResponse(this);
        } 

    } 

}
