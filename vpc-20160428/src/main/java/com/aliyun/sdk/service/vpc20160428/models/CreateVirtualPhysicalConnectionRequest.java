// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVirtualPhysicalConnectionRequest} extends {@link RequestModel}
 *
 * <p>CreateVirtualPhysicalConnectionRequest</p>
 */
public class CreateVirtualPhysicalConnectionRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OrderMode")
    @Validation(required = true)
    private String orderMode;

    @Query
    @NameInMap("PhysicalConnectionId")
    @Validation(required = true)
    private String physicalConnectionId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Spec")
    @Validation(required = true)
    private String spec;

    @Query
    @NameInMap("Token")
    private String token;

    @Query
    @NameInMap("VlanId")
    @Validation(required = true)
    private Long vlanId;

    @Query
    @NameInMap("VpconnAliUid")
    @Validation(required = true)
    private Long vpconnAliUid;

    private CreateVirtualPhysicalConnectionRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.name = builder.name;
        this.orderMode = builder.orderMode;
        this.physicalConnectionId = builder.physicalConnectionId;
        this.regionId = builder.regionId;
        this.spec = builder.spec;
        this.token = builder.token;
        this.vlanId = builder.vlanId;
        this.vpconnAliUid = builder.vpconnAliUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVirtualPhysicalConnectionRequest create() {
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return orderMode
     */
    public String getOrderMode() {
        return this.orderMode;
    }

    /**
     * @return physicalConnectionId
     */
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return vlanId
     */
    public Long getVlanId() {
        return this.vlanId;
    }

    /**
     * @return vpconnAliUid
     */
    public Long getVpconnAliUid() {
        return this.vpconnAliUid;
    }

    public static final class Builder extends Request.Builder<CreateVirtualPhysicalConnectionRequest, Builder> {
        private String description; 
        private Boolean dryRun; 
        private String name; 
        private String orderMode; 
        private String physicalConnectionId; 
        private String regionId; 
        private String spec; 
        private String token; 
        private Long vlanId; 
        private Long vpconnAliUid; 

        private Builder() {
            super();
        } 

        private Builder(CreateVirtualPhysicalConnectionRequest response) {
            super(response);
            this.description = response.description;
            this.dryRun = response.dryRun;
            this.name = response.name;
            this.orderMode = response.orderMode;
            this.physicalConnectionId = response.physicalConnectionId;
            this.regionId = response.regionId;
            this.spec = response.spec;
            this.token = response.token;
            this.vlanId = response.vlanId;
            this.vpconnAliUid = response.vpconnAliUid;
        } 

        /**
         * Vpconn的description
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DryRun
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Vpconn的name
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * vpconn的支付方
         */
        public Builder orderMode(String orderMode) {
            this.putQueryParameter("OrderMode", orderMode);
            this.orderMode = orderMode;
            return this;
        }

        /**
         * Vpconn的主Pconn
         */
        public Builder physicalConnectionId(String physicalConnectionId) {
            this.putQueryParameter("PhysicalConnectionId", physicalConnectionId);
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * vpconn规格
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * 幂等Token
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * vpconn的VlanID
         */
        public Builder vlanId(Long vlanId) {
            this.putQueryParameter("VlanId", vlanId);
            this.vlanId = vlanId;
            return this;
        }

        /**
         * Vpconn拥有者
         */
        public Builder vpconnAliUid(Long vpconnAliUid) {
            this.putQueryParameter("VpconnAliUid", vpconnAliUid);
            this.vpconnAliUid = vpconnAliUid;
            return this;
        }

        @Override
        public CreateVirtualPhysicalConnectionRequest build() {
            return new CreateVirtualPhysicalConnectionRequest(this);
        } 

    } 

}
