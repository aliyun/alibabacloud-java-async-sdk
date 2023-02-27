// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddNumbersToSkillGroupResponse} extends {@link TeaModel}
 *
 * <p>AddNumbersToSkillGroupResponse</p>
 */
public class AddNumbersToSkillGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddNumbersToSkillGroupResponseBody body;

    private AddNumbersToSkillGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddNumbersToSkillGroupResponse create() {
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
    public AddNumbersToSkillGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddNumbersToSkillGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddNumbersToSkillGroupResponseBody body);

        @Override
        AddNumbersToSkillGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddNumbersToSkillGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddNumbersToSkillGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddNumbersToSkillGroupResponse response) {
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
        public Builder body(AddNumbersToSkillGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddNumbersToSkillGroupResponse build() {
            return new AddNumbersToSkillGroupResponse(this);
        } 

    } 

}
