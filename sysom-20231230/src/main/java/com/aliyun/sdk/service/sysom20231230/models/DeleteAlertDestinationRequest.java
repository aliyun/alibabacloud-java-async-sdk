// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link DeleteAlertDestinationRequest} extends {@link RequestModel}
 *
 * <p>DeleteAlertDestinationRequest</p>
 */
public class DeleteAlertDestinationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("id")
    private Integer id;

    private DeleteAlertDestinationRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAlertDestinationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteAlertDestinationRequest, Builder> {
        private Integer id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAlertDestinationRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * id.
         */
        public Builder id(Integer id) {
            this.putQueryParameter("id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteAlertDestinationRequest build() {
            return new DeleteAlertDestinationRequest(this);
        } 

    } 

}
