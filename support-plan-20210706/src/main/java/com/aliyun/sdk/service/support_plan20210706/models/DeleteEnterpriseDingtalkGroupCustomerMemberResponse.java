// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEnterpriseDingtalkGroupCustomerMemberResponse} extends {@link TeaModel}
 *
 * <p>DeleteEnterpriseDingtalkGroupCustomerMemberResponse</p>
 */
public class DeleteEnterpriseDingtalkGroupCustomerMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody body;

    private DeleteEnterpriseDingtalkGroupCustomerMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteEnterpriseDingtalkGroupCustomerMemberResponse create() {
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
    public DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEnterpriseDingtalkGroupCustomerMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody body);

        @Override
        DeleteEnterpriseDingtalkGroupCustomerMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEnterpriseDingtalkGroupCustomerMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEnterpriseDingtalkGroupCustomerMemberResponse response) {
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
        public Builder body(DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEnterpriseDingtalkGroupCustomerMemberResponse build() {
            return new DeleteEnterpriseDingtalkGroupCustomerMemberResponse(this);
        } 

    } 

}
