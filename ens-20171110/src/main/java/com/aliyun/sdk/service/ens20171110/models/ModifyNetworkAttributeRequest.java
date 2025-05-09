// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link ModifyNetworkAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyNetworkAttributeRequest</p>
 */
public class ModifyNetworkAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 256, minLength = 2)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkName")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 2)
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
         * <p>The description of the network.</p>
         * <p>The description must be 2 to 256 characters in length. It must start with a letter but cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>this is my first network</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the network.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>n-****</p>
         */
        public Builder networkId(String networkId) {
            this.putQueryParameter("NetworkId", networkId);
            this.networkId = networkId;
            return this;
        }

        /**
         * <p>The name of the network. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be 2 to 128 characters in length</li>
         * <li>It must start with a letter but cannot start with http:// or https://.</li>
         * <li>The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
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
