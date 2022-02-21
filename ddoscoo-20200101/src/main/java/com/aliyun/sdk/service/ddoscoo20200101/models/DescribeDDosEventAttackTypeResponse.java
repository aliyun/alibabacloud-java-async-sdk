// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDDosEventAttackTypeResponse} extends {@link TeaModel}
 *
 * <p>DescribeDDosEventAttackTypeResponse</p>
 */
public class DescribeDDosEventAttackTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDDosEventAttackTypeResponseBody body;

    private DescribeDDosEventAttackTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDDosEventAttackTypeResponse create() {
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
    public DescribeDDosEventAttackTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDDosEventAttackTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDDosEventAttackTypeResponseBody body);

        @Override
        DescribeDDosEventAttackTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDDosEventAttackTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDDosEventAttackTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDDosEventAttackTypeResponse response) {
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
        public Builder body(DescribeDDosEventAttackTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDDosEventAttackTypeResponse build() {
            return new DescribeDDosEventAttackTypeResponse(this);
        } 

    } 

}
