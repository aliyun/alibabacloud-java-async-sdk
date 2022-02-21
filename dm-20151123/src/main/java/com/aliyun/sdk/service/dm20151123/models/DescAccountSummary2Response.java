// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescAccountSummary2Response} extends {@link TeaModel}
 *
 * <p>DescAccountSummary2Response</p>
 */
public class DescAccountSummary2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescAccountSummary2ResponseBody body;

    private DescAccountSummary2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescAccountSummary2Response create() {
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
    public DescAccountSummary2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescAccountSummary2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescAccountSummary2ResponseBody body);

        @Override
        DescAccountSummary2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescAccountSummary2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescAccountSummary2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescAccountSummary2Response response) {
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
        public Builder body(DescAccountSummary2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescAccountSummary2Response build() {
            return new DescAccountSummary2Response(this);
        } 

    } 

}
