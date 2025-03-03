// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link GetConnectionRequest} extends {@link RequestModel}
 *
 * <p>GetConnectionRequest</p>
 */
public class GetConnectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionName;

    private GetConnectionRequest(Builder builder) {
        super(builder);
        this.connectionName = builder.connectionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConnectionRequest create() {
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

    public static final class Builder extends Request.Builder<GetConnectionRequest, Builder> {
        private String connectionName; 

        private Builder() {
            super();
        } 

        private Builder(GetConnectionRequest request) {
            super(request);
            this.connectionName = request.connectionName;
        } 

        /**
         * <p>The connection name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>connection-name</p>
         */
        public Builder connectionName(String connectionName) {
            this.putQueryParameter("ConnectionName", connectionName);
            this.connectionName = connectionName;
            return this;
        }

        @Override
        public GetConnectionRequest build() {
            return new GetConnectionRequest(this);
        } 

    } 

}
