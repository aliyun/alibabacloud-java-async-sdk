// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkAclRequest} extends {@link RequestModel}
 *
 * <p>CreateNetworkAclRequest</p>
 */
public class CreateNetworkAclRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("NetworkAclName")
    private String networkAclName;

    private CreateNetworkAclRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.networkAclName = builder.networkAclName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkAclRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return networkAclName
     */
    public String getNetworkAclName() {
        return this.networkAclName;
    }

    public static final class Builder extends Request.Builder<CreateNetworkAclRequest, Builder> {
        private String description; 
        private String networkAclName; 

        private Builder() {
            super();
        } 

        private Builder(CreateNetworkAclRequest request) {
            super(request);
            this.description = request.description;
            this.networkAclName = request.networkAclName;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * NetworkAclName.
         */
        public Builder networkAclName(String networkAclName) {
            this.putQueryParameter("NetworkAclName", networkAclName);
            this.networkAclName = networkAclName;
            return this;
        }

        @Override
        public CreateNetworkAclRequest build() {
            return new CreateNetworkAclRequest(this);
        } 

    } 

}
