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
 * {@link CreateLibraryRequest} extends {@link RequestModel}
 *
 * <p>CreateLibraryRequest</p>
 */
public class CreateLibraryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private LibraryCreateCmd body;

    private CreateLibraryRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLibraryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public LibraryCreateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateLibraryRequest, Builder> {
        private LibraryCreateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CreateLibraryRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(LibraryCreateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateLibraryRequest build() {
            return new CreateLibraryRequest(this);
        } 

    } 

}
