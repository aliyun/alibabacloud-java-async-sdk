// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNetworkAclEntryRequest} extends {@link RequestModel}
 *
 * <p>DeleteNetworkAclEntryRequest</p>
 */
public class DeleteNetworkAclEntryRequest extends Request {
    @Query
    @NameInMap("NetworkAclEntryId")
    private String networkAclEntryId;

    private DeleteNetworkAclEntryRequest(Builder builder) {
        super(builder);
        this.networkAclEntryId = builder.networkAclEntryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNetworkAclEntryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkAclEntryId
     */
    public String getNetworkAclEntryId() {
        return this.networkAclEntryId;
    }

    public static final class Builder extends Request.Builder<DeleteNetworkAclEntryRequest, Builder> {
        private String networkAclEntryId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNetworkAclEntryRequest request) {
            super(request);
            this.networkAclEntryId = request.networkAclEntryId;
        } 

        /**
         * NetworkAclEntryId.
         */
        public Builder networkAclEntryId(String networkAclEntryId) {
            this.putQueryParameter("NetworkAclEntryId", networkAclEntryId);
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }

        @Override
        public DeleteNetworkAclEntryRequest build() {
            return new DeleteNetworkAclEntryRequest(this);
        } 

    } 

}
