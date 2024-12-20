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
 * {@link GetPoolRequest} extends {@link RequestModel}
 *
 * <p>GetPoolRequest</p>
 */
public class GetPoolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoolName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String poolName;

    private GetPoolRequest(Builder builder) {
        super(builder);
        this.poolName = builder.poolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPoolRequest create() {
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

    public static final class Builder extends Request.Builder<GetPoolRequest, Builder> {
        private String poolName; 

        private Builder() {
            super();
        } 

        private Builder(GetPoolRequest request) {
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
        public GetPoolRequest build() {
            return new GetPoolRequest(this);
        } 

    } 

}
