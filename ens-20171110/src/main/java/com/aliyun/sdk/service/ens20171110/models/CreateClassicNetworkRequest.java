// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClassicNetworkRequest} extends {@link RequestModel}
 *
 * <p>CreateClassicNetworkRequest</p>
 */
public class CreateClassicNetworkRequest extends Request {
    @Query
    @NameInMap("CidrBlock")
    @Validation(required = true)
    private String cidrBlock;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EnsRegionId")
    @Validation(required = true)
    private String ensRegionId;

    @Query
    @NameInMap("NetworkName")
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
         * The CIDR block of the network. You can use one of the following CIDR blocks or their subnets as the CIDR block of the network:
         * <p>
         * 
         * *   10.0.0.0/8 (default)
         * *   172.16.0.0/12
         * *   192.168.0.0/16
         */
        public Builder cidrBlock(String cidrBlock) {
            this.putQueryParameter("CidrBlock", cidrBlock);
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * The description of the listener. The description is **1** to **80** characters in length.
         * <p>
         * 
         * >  The value cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the edge node.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * The name of the network. The name must meet the following requirements:
         * <p>
         * 
         * *   The name must be 2 to 128 characters in length.
         * *   The name must start with a letter but cannot start with http:// or https://.
         * *   The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
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
