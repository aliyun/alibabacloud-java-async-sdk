// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDdosEventResponse} extends {@link TeaModel}
 *
 * <p>DescribeDdosEventResponse</p>
 */
public class DescribeDdosEventResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDdosEventResponseBody body;

    private DescribeDdosEventResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDdosEventResponse create() {
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
    public DescribeDdosEventResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDdosEventResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDdosEventResponseBody body);

        @Override
        DescribeDdosEventResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDdosEventResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDdosEventResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDdosEventResponse response) {
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
        public Builder body(DescribeDdosEventResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDdosEventResponse build() {
            return new DescribeDdosEventResponse(this);
        } 

    } 

}
