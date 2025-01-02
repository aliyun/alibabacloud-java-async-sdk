// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeUserBuyVersionRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserBuyVersionRequest</p>
 */
public class DescribeUserBuyVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private DescribeUserBuyVersionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserBuyVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DescribeUserBuyVersionRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserBuyVersionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>Instance ID. If the Instance ID is provided, the query will be based on this ID. If not provided, the latest instance will be queried by default.</p>
         * 
         * <strong>example:</strong>
         * <p>cfw_elasticity_public_cn-*******</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DescribeUserBuyVersionRequest build() {
            return new DescribeUserBuyVersionRequest(this);
        } 

    } 

}
