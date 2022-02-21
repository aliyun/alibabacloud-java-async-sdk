// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSimilarEventScenariosResponse} extends {@link TeaModel}
 *
 * <p>DescribeSimilarEventScenariosResponse</p>
 */
public class DescribeSimilarEventScenariosResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSimilarEventScenariosResponseBody body;

    private DescribeSimilarEventScenariosResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSimilarEventScenariosResponse create() {
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
    public DescribeSimilarEventScenariosResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSimilarEventScenariosResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSimilarEventScenariosResponseBody body);

        @Override
        DescribeSimilarEventScenariosResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSimilarEventScenariosResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSimilarEventScenariosResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSimilarEventScenariosResponse response) {
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
        public Builder body(DescribeSimilarEventScenariosResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSimilarEventScenariosResponse build() {
            return new DescribeSimilarEventScenariosResponse(this);
        } 

    } 

}
