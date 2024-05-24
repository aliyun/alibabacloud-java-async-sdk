// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRepositoryRequest} extends {@link RequestModel}
 *
 * <p>CreateRepositoryRequest</p>
 */
public class CreateRepositoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private Repository body;

    private CreateRepositoryRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepositoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public Repository getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateRepositoryRequest, Builder> {
        private Repository body; 

        private Builder() {
            super();
        } 

        private Builder(CreateRepositoryRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(Repository body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateRepositoryRequest build() {
            return new CreateRepositoryRequest(this);
        } 

    } 

}
