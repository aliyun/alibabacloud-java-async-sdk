// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClientUserDefineRulesResponse} extends {@link TeaModel}
 *
 * <p>ListClientUserDefineRulesResponse</p>
 */
public class ListClientUserDefineRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClientUserDefineRulesResponseBody body;

    private ListClientUserDefineRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClientUserDefineRulesResponse create() {
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
    public ListClientUserDefineRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClientUserDefineRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClientUserDefineRulesResponseBody body);

        @Override
        ListClientUserDefineRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClientUserDefineRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClientUserDefineRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClientUserDefineRulesResponse response) {
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
        public Builder body(ListClientUserDefineRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClientUserDefineRulesResponse build() {
            return new ListClientUserDefineRulesResponse(this);
        } 

    } 

}
