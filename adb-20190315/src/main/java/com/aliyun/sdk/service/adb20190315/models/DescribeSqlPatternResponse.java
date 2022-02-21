// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSqlPatternResponse} extends {@link TeaModel}
 *
 * <p>DescribeSqlPatternResponse</p>
 */
public class DescribeSqlPatternResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSqlPatternResponseBody body;

    private DescribeSqlPatternResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSqlPatternResponse create() {
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
    public DescribeSqlPatternResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSqlPatternResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSqlPatternResponseBody body);

        @Override
        DescribeSqlPatternResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSqlPatternResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSqlPatternResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSqlPatternResponse response) {
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
        public Builder body(DescribeSqlPatternResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSqlPatternResponse build() {
            return new DescribeSqlPatternResponse(this);
        } 

    } 

}
