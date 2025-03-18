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
 * {@link CreateClassicNetworkRequest} extends {@link RequestModel}
 *
 * <p>CreateClassicNetworkRequest</p>
 */
public class CreateClassicNetworkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CidrBlock")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkName")
    private String networkName;

    private CreateClassicNetworkRequest(Builder builder) {
        super(builder);
        this.cidrBlock = builder.cidrBlock;
        this.description = builder.description;
        this.ensRegionId = builder.ensRegionId;
        this.networkName = builder.networkName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClassicNetworkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cidrBlock
     */
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return networkName
     */
    public String getNetworkName() {
        return this.networkName;
    }

    public static final class Builder extends Request.Builder<CreateClassicNetworkRequest, Builder> {
        private String cidrBlock; 
        private String description; 
        private String ensRegionId; 
        private String networkName; 

        private Builder() {
            super();
        } 

        private Builder(CreateClassicNetworkRequest request) {
            super(request);
            this.cidrBlock = request.cidrBlock;
            this.description = request.description;
            this.ensRegionId = request.ensRegionId;
            this.networkName = request.networkName;
        } 

        /**
         * <p>The CIDR block of the network. You can use one of the following CIDR blocks or their subnets as the CIDR block of the network:</p>
         * <ul>
         * <li>10.0.0.0/8 (default)</li>
         * <li>172.16.0.0/12</li>
         * <li>192.168.0.0/16</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/16</p>
         */
        public Builder cidrBlock(String cidrBlock) {
            this.putQueryParameter("CidrBlock", cidrBlock);
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * <p>The description of the network. The name must be 2 to 256 characters in length. It must start with a letter but cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>This is my vswitch.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the edge node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu-xxxx-4</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The name of the network. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be 2 to 128 characters in length.</li>
         * <li>The name must start with a letter but cannot start with http:// or https://.</li>
         * <li>The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder networkName(String networkName) {
            this.putQueryParameter("NetworkName", networkName);
            this.networkName = networkName;
            return this;
        }

        @Override
        public CreateClassicNetworkRequest build() {
            return new CreateClassicNetworkRequest(this);
        } 

    } 

}
