// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link DeleteConnectionRequest} extends {@link RequestModel}
 *
 * <p>DeleteConnectionRequest</p>
 */
public class DeleteConnectionRequest extends Request {
    @Query
    @NameInMap("ConnectionName")
    @Validation(required = true)
    private String connectionName;

    private DeleteConnectionRequest(Builder builder) {
        super(builder);
        this.connectionName = builder.connectionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConnectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionName
     */
    public String getConnectionName() {
        return this.connectionName;
    }

    public static final class Builder extends Request.Builder<DeleteConnectionRequest, Builder> {
        private String connectionName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConnectionRequest request) {
            super(request);
            this.connectionName = request.connectionName;
        } 

        /**
         * The name of the connection that you want to delete.
         */
        public Builder connectionName(String connectionName) {
            this.putQueryParameter("ConnectionName", connectionName);
            this.connectionName = connectionName;
            return this;
        }

        @Override
        public DeleteConnectionRequest build() {
            return new DeleteConnectionRequest(this);
        } 

    } 

}
