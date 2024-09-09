// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ipWhitelist.
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
