// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DeleteImageEventOperationRequest} extends {@link RequestModel}
 *
 * <p>DeleteImageEventOperationRequest</p>
 */
public class DeleteImageEventOperationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    private DeleteImageEventOperationRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteImageEventOperationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteImageEventOperationRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteImageEventOperationRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * <p>The primary key of the alert handling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1404656</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteImageEventOperationRequest build() {
            return new DeleteImageEventOperationRequest(this);
        } 

    } 

}
