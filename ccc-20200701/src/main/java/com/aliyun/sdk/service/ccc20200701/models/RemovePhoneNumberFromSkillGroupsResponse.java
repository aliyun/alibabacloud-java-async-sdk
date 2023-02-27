// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemovePhoneNumberFromSkillGroupsResponse} extends {@link TeaModel}
 *
 * <p>RemovePhoneNumberFromSkillGroupsResponse</p>
 */
public class RemovePhoneNumberFromSkillGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemovePhoneNumberFromSkillGroupsResponseBody body;

    private RemovePhoneNumberFromSkillGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemovePhoneNumberFromSkillGroupsResponse create() {
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
    public RemovePhoneNumberFromSkillGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemovePhoneNumberFromSkillGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemovePhoneNumberFromSkillGroupsResponseBody body);

        @Override
        RemovePhoneNumberFromSkillGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemovePhoneNumberFromSkillGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemovePhoneNumberFromSkillGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemovePhoneNumberFromSkillGroupsResponse response) {
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
        public Builder body(RemovePhoneNumberFromSkillGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemovePhoneNumberFromSkillGroupsResponse build() {
            return new RemovePhoneNumberFromSkillGroupsResponse(this);
        } 

    } 

}
