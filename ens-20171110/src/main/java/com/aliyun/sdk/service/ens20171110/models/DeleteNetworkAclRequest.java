// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteNetworkAclRequest} extends {@link RequestModel}
 *
 * <p>DeleteNetworkAclRequest</p>
 */
public class DeleteNetworkAclRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkAclId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkAclId;

    private DeleteNetworkAclRequest(Builder builder) {
        super(builder);
        this.networkAclId = builder.networkAclId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNetworkAclRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkAclId
     */
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    public static final class Builder extends Request.Builder<DeleteNetworkAclRequest, Builder> {
        private String networkAclId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNetworkAclRequest request) {
            super(request);
            this.networkAclId = request.networkAclId;
        } 

        /**
         * <p>The ID of the network ACL.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nacl-bp1lhl0taikrbgnh****</p>
         */
        public Builder networkAclId(String networkAclId) {
            this.putQueryParameter("NetworkAclId", networkAclId);
            this.networkAclId = networkAclId;
            return this;
        }

        @Override
        public DeleteNetworkAclRequest build() {
            return new DeleteNetworkAclRequest(this);
        } 

    } 

}
