// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateRepoForkRequest} extends {@link RequestModel}
 *
 * <p>CreateRepoForkRequest</p>
 */
public class CreateRepoForkRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private ReposForkCreateCmd body;

    private CreateRepoForkRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoForkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public ReposForkCreateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateRepoForkRequest, Builder> {
        private ReposForkCreateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CreateRepoForkRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(ReposForkCreateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateRepoForkRequest build() {
            return new CreateRepoForkRequest(this);
        } 

    } 

}
