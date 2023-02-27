// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPhoneNumbersOfSkillGroupResponse} extends {@link TeaModel}
 *
 * <p>ListPhoneNumbersOfSkillGroupResponse</p>
 */
public class ListPhoneNumbersOfSkillGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPhoneNumbersOfSkillGroupResponseBody body;

    private ListPhoneNumbersOfSkillGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPhoneNumbersOfSkillGroupResponse create() {
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
    public ListPhoneNumbersOfSkillGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPhoneNumbersOfSkillGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPhoneNumbersOfSkillGroupResponseBody body);

        @Override
        ListPhoneNumbersOfSkillGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPhoneNumbersOfSkillGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPhoneNumbersOfSkillGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPhoneNumbersOfSkillGroupResponse response) {
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
        public Builder body(ListPhoneNumbersOfSkillGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPhoneNumbersOfSkillGroupResponse build() {
            return new ListPhoneNumbersOfSkillGroupResponse(this);
        } 

    } 

}
