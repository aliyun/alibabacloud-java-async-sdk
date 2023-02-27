// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPhoneNumberToSkillGroupsResponse} extends {@link TeaModel}
 *
 * <p>AddPhoneNumberToSkillGroupsResponse</p>
 */
public class AddPhoneNumberToSkillGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddPhoneNumberToSkillGroupsResponseBody body;

    private AddPhoneNumberToSkillGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddPhoneNumberToSkillGroupsResponse create() {
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
    public AddPhoneNumberToSkillGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddPhoneNumberToSkillGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddPhoneNumberToSkillGroupsResponseBody body);

        @Override
        AddPhoneNumberToSkillGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddPhoneNumberToSkillGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddPhoneNumberToSkillGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddPhoneNumberToSkillGroupsResponse response) {
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
        public Builder body(AddPhoneNumberToSkillGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddPhoneNumberToSkillGroupsResponse build() {
            return new AddPhoneNumberToSkillGroupsResponse(this);
        } 

    } 

}
