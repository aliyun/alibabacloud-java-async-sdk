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
 * {@link GetInstanceIpWhitelistRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceIpWhitelistRequest</p>
 */
public class GetInstanceIpWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ipWhitelists")
    private java.util.List<String> ipWhitelists;

    private GetInstanceIpWhitelistRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ipWhitelists = builder.ipWhitelists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceIpWhitelistRequest create() {
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
     * @return ipWhitelists
     */
    public java.util.List<String> getIpWhitelists() {
        return this.ipWhitelists;
    }

    public static final class Builder extends Request.Builder<GetInstanceIpWhitelistRequest, Builder> {
        private String instanceId; 
        private java.util.List<String> ipWhitelists; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceIpWhitelistRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ipWhitelists = request.ipWhitelists;
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
         * <p>The  filter IP address whitelists.</p>
         */
        public Builder ipWhitelists(java.util.List<String> ipWhitelists) {
            String ipWhitelistsShrink = shrink(ipWhitelists, "ipWhitelists", "simple");
            this.putQueryParameter("ipWhitelists", ipWhitelistsShrink);
            this.ipWhitelists = ipWhitelists;
            return this;
        }

        @Override
        public GetInstanceIpWhitelistRequest build() {
            return new GetInstanceIpWhitelistRequest(this);
        } 

    } 

}
