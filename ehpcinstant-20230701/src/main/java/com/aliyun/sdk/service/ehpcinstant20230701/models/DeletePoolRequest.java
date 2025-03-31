// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link DeletePoolRequest} extends {@link RequestModel}
 *
 * <p>DeletePoolRequest</p>
 */
public class DeletePoolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoolName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String poolName;

    private DeletePoolRequest(Builder builder) {
        super(builder);
        this.poolName = builder.poolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePoolRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return poolName
     */
    public String getPoolName() {
        return this.poolName;
    }

    public static final class Builder extends Request.Builder<DeletePoolRequest, Builder> {
        private String poolName; 

        private Builder() {
            super();
        } 

        private Builder(DeletePoolRequest request) {
            super(request);
            this.poolName = request.poolName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PoolTest</p>
         */
        public Builder poolName(String poolName) {
            this.putQueryParameter("PoolName", poolName);
            this.poolName = poolName;
            return this;
        }

        @Override
        public DeletePoolRequest build() {
            return new DeletePoolRequest(this);
        } 

    } 

}
