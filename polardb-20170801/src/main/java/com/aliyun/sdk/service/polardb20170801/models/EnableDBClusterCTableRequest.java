// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link EnableDBClusterCTableRequest} extends {@link RequestModel}
 *
 * <p>EnableDBClusterCTableRequest</p>
 */
public class EnableDBClusterCTableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    private EnableDBClusterCTableRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableDBClusterCTableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public static final class Builder extends Request.Builder<EnableDBClusterCTableRequest, Builder> {
        private String DBClusterId; 

        private Builder() {
            super();
        } 

        private Builder(EnableDBClusterCTableRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
        } 

        /**
         * <p>The ID of the database cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-xxx</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        @Override
        public EnableDBClusterCTableRequest build() {
            return new EnableDBClusterCTableRequest(this);
        } 

    } 

}
