// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link SetDdosMaxBurstGbpsRequest} extends {@link RequestModel}
 *
 * <p>SetDdosMaxBurstGbpsRequest</p>
 */
public class SetDdosMaxBurstGbpsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxBurstGbps")
    @com.aliyun.core.annotation.Validation(required = true)
    private String maxBurstGbps;

    private SetDdosMaxBurstGbpsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.maxBurstGbps = builder.maxBurstGbps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDdosMaxBurstGbpsRequest create() {
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

    /**
     * @return maxBurstGbps
     */
    public String getMaxBurstGbps() {
        return this.maxBurstGbps;
    }

    public static final class Builder extends Request.Builder<SetDdosMaxBurstGbpsRequest, Builder> {
        private String instanceId; 
        private String maxBurstGbps; 

        private Builder() {
            super();
        } 

        private Builder(SetDdosMaxBurstGbpsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.maxBurstGbps = request.maxBurstGbps;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esa-site-ads11w</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder maxBurstGbps(String maxBurstGbps) {
            this.putQueryParameter("MaxBurstGbps", maxBurstGbps);
            this.maxBurstGbps = maxBurstGbps;
            return this;
        }

        @Override
        public SetDdosMaxBurstGbpsRequest build() {
            return new SetDdosMaxBurstGbpsRequest(this);
        } 

    } 

}
