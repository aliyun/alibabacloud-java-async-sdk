// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchModifyDcdnWafRulesResponse} extends {@link TeaModel}
 *
 * <p>BatchModifyDcdnWafRulesResponse</p>
 */
public class BatchModifyDcdnWafRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchModifyDcdnWafRulesResponseBody body;

    private BatchModifyDcdnWafRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchModifyDcdnWafRulesResponse create() {
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
    public BatchModifyDcdnWafRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchModifyDcdnWafRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchModifyDcdnWafRulesResponseBody body);

        @Override
        BatchModifyDcdnWafRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchModifyDcdnWafRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchModifyDcdnWafRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchModifyDcdnWafRulesResponse response) {
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
        public Builder body(BatchModifyDcdnWafRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchModifyDcdnWafRulesResponse build() {
            return new BatchModifyDcdnWafRulesResponse(this);
        } 

    } 

}
