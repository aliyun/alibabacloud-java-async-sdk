// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link DeleteInstanceIpWhitelistRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstanceIpWhitelistRequest</p>
 */
public class DeleteInstanceIpWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ipWhitelist")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipWhitelist;

    private DeleteInstanceIpWhitelistRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ipWhitelist = builder.ipWhitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceIpWhitelistRequest create() {
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
     * @return ipWhitelist
     */
    public String getIpWhitelist() {
        return this.ipWhitelist;
    }

    public static final class Builder extends Request.Builder<DeleteInstanceIpWhitelistRequest, Builder> {
        private String instanceId; 
        private String ipWhitelist; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInstanceIpWhitelistRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ipWhitelist = request.ipWhitelist;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The IP address whitelist.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        public Builder ipWhitelist(String ipWhitelist) {
            this.putQueryParameter("ipWhitelist", ipWhitelist);
            this.ipWhitelist = ipWhitelist;
            return this;
        }

        @Override
        public DeleteInstanceIpWhitelistRequest build() {
            return new DeleteInstanceIpWhitelistRequest(this);
        } 

    } 

}
