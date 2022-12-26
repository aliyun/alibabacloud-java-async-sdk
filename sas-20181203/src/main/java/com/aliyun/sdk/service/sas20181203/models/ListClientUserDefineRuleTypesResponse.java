// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClientUserDefineRuleTypesResponse} extends {@link TeaModel}
 *
 * <p>ListClientUserDefineRuleTypesResponse</p>
 */
public class ListClientUserDefineRuleTypesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClientUserDefineRuleTypesResponseBody body;

    private ListClientUserDefineRuleTypesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClientUserDefineRuleTypesResponse create() {
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
    public ListClientUserDefineRuleTypesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClientUserDefineRuleTypesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClientUserDefineRuleTypesResponseBody body);

        @Override
        ListClientUserDefineRuleTypesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClientUserDefineRuleTypesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClientUserDefineRuleTypesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClientUserDefineRuleTypesResponse response) {
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
        public Builder body(ListClientUserDefineRuleTypesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClientUserDefineRuleTypesResponse build() {
            return new ListClientUserDefineRuleTypesResponse(this);
        } 

    } 

}
