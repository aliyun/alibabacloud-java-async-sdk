// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPSMemberDataTypeCodeResponse} extends {@link TeaModel}
 *
 * <p>ListPSMemberDataTypeCodeResponse</p>
 */
public class ListPSMemberDataTypeCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPSMemberDataTypeCodeResponseBody body;

    private ListPSMemberDataTypeCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPSMemberDataTypeCodeResponse create() {
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
    public ListPSMemberDataTypeCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPSMemberDataTypeCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPSMemberDataTypeCodeResponseBody body);

        @Override
        ListPSMemberDataTypeCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPSMemberDataTypeCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPSMemberDataTypeCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPSMemberDataTypeCodeResponse response) {
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
        public Builder body(ListPSMemberDataTypeCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPSMemberDataTypeCodeResponse build() {
            return new ListPSMemberDataTypeCodeResponse(this);
        } 

    } 

}
