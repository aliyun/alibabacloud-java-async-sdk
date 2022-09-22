// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkAclEntryRequest} extends {@link RequestModel}
 *
 * <p>CreateNetworkAclEntryRequest</p>
 */
public class CreateNetworkAclEntryRequest extends Request {
    @Query
    @NameInMap("CidrBlock")
    @Validation(required = true)
    private String cidrBlock;

    @Query
    @NameInMap("Description")
    @Validation(maxLength = 256)
    private String description;

    @Query
    @NameInMap("Direction")
    @Validation(required = true)
    private String direction;

    @Query
    @NameInMap("NetworkAclEntryName")
    @Validation(maxLength = 128)
    private String networkAclEntryName;

    @Query
    @NameInMap("NetworkAclId")
    @Validation(required = true)
    private String networkAclId;

    @Query
    @NameInMap("Policy")
    @Validation(required = true)
    private String policy;

    @Query
    @NameInMap("PortRange")
    @Validation(required = true)
    private String portRange;

    @Query
    @NameInMap("Priority")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer priority;

    @Query
    @NameInMap("Protocol")
    @Validation(required = true)
    private String protocol;

    private CreateNetworkAclEntryRequest(Builder builder) {
        super(builder);
        this.cidrBlock = builder.cidrBlock;
        this.description = builder.description;
        this.direction = builder.direction;
        this.networkAclEntryName = builder.networkAclEntryName;
        this.networkAclId = builder.networkAclId;
        this.policy = builder.policy;
        this.portRange = builder.portRange;
        this.priority = builder.priority;
        this.protocol = builder.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkAclEntryRequest create() {
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
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return networkAclEntryName
     */
    public String getNetworkAclEntryName() {
        return this.networkAclEntryName;
    }

    /**
     * @return networkAclId
     */
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return portRange
     */
    public String getPortRange() {
        return this.portRange;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    public static final class Builder extends Request.Builder<CreateNetworkAclEntryRequest, Builder> {
        private String cidrBlock; 
        private String description; 
        private String direction; 
        private String networkAclEntryName; 
        private String networkAclId; 
        private String policy; 
        private String portRange; 
        private Integer priority; 
        private String protocol; 

        private Builder() {
            super();
        } 

        private Builder(CreateNetworkAclEntryRequest request) {
            super(request);
            this.cidrBlock = request.cidrBlock;
            this.description = request.description;
            this.direction = request.direction;
            this.networkAclEntryName = request.networkAclEntryName;
            this.networkAclId = request.networkAclId;
            this.policy = request.policy;
            this.portRange = request.portRange;
            this.priority = request.priority;
            this.protocol = request.protocol;
        } 

        /**
         * CidrBlock.
         */
        public Builder cidrBlock(String cidrBlock) {
            this.putQueryParameter("CidrBlock", cidrBlock);
            this.cidrBlock = cidrBlock;
            return this;
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
         * Direction.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * NetworkAclEntryName.
         */
        public Builder networkAclEntryName(String networkAclEntryName) {
            this.putQueryParameter("NetworkAclEntryName", networkAclEntryName);
            this.networkAclEntryName = networkAclEntryName;
            return this;
        }

        /**
         * NetworkAclId.
         */
        public Builder networkAclId(String networkAclId) {
            this.putQueryParameter("NetworkAclId", networkAclId);
            this.networkAclId = networkAclId;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * PortRange.
         */
        public Builder portRange(String portRange) {
            this.putQueryParameter("PortRange", portRange);
            this.portRange = portRange;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        @Override
        public CreateNetworkAclEntryRequest build() {
            return new CreateNetworkAclEntryRequest(this);
        } 

    } 

}
