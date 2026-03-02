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
 * {@link UpdateLibraryRequest} extends {@link RequestModel}
 *
 * <p>UpdateLibraryRequest</p>
 */
public class UpdateLibraryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private LibraryUpdateCmd body;

    private UpdateLibraryRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLibraryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public LibraryUpdateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateLibraryRequest, Builder> {
        private LibraryUpdateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLibraryRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(LibraryUpdateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateLibraryRequest build() {
            return new UpdateLibraryRequest(this);
        } 

    } 

}
