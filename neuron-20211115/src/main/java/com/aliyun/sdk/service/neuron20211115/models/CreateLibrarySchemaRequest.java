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
 * {@link CreateLibrarySchemaRequest} extends {@link RequestModel}
 *
 * <p>CreateLibrarySchemaRequest</p>
 */
public class CreateLibrarySchemaRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private LibrarySchema body;

    private CreateLibrarySchemaRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLibrarySchemaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public LibrarySchema getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateLibrarySchemaRequest, Builder> {
        private LibrarySchema body; 

        private Builder() {
            super();
        } 

        private Builder(CreateLibrarySchemaRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(LibrarySchema body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateLibrarySchemaRequest build() {
            return new CreateLibrarySchemaRequest(this);
        } 

    } 

}
