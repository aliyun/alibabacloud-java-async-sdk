// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNetworkAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyNetworkAttributeRequest</p>
 */
public class ModifyNetworkAttributeRequest extends Request {
    @Query
    @NameInMap("Description")
    @Validation(maxLength = 256, minLength = 2)
    private String description;

    @Query
    @NameInMap("NetworkId")
    @Validation(required = true)
    private String networkId;

    @Query
    @NameInMap("NetworkName")
    @Validation(maxLength = 128, minLength = 2)
    private String networkName;

    private ModifyNetworkAttributeRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.networkId = builder.networkId;
        this.networkName = builder.networkName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNetworkAttributeRequest create() {
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
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * @return networkName
     */
    public String getNetworkName() {
        return this.networkName;
    }

    public static final class Builder extends Request.Builder<ModifyNetworkAttributeRequest, Builder> {
        private String description; 
        private String networkId; 
        private String networkName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNetworkAttributeRequest request) {
            super(request);
            this.description = request.description;
            this.networkId = request.networkId;
            this.networkName = request.networkName;
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
         * NetworkId.
         */
        public Builder networkId(String networkId) {
            this.putQueryParameter("NetworkId", networkId);
            this.networkId = networkId;
            return this;
        }

        /**
         * NetworkName.
         */
        public Builder networkName(String networkName) {
            this.putQueryParameter("NetworkName", networkName);
            this.networkName = networkName;
            return this;
        }

        @Override
        public ModifyNetworkAttributeRequest build() {
            return new ModifyNetworkAttributeRequest(this);
        } 

    } 

}
