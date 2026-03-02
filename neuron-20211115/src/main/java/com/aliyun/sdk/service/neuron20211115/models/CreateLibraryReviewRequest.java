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
 * {@link CreateLibraryReviewRequest} extends {@link RequestModel}
 *
 * <p>CreateLibraryReviewRequest</p>
 */
public class CreateLibraryReviewRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private LibraryReviewCreateCmd body;

    private CreateLibraryReviewRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLibraryReviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public LibraryReviewCreateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateLibraryReviewRequest, Builder> {
        private LibraryReviewCreateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CreateLibraryReviewRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(LibraryReviewCreateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateLibraryReviewRequest build() {
            return new CreateLibraryReviewRequest(this);
        } 

    } 

}
