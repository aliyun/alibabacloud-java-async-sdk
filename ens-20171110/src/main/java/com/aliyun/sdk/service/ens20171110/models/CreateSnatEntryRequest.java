// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSnatEntryRequest} extends {@link RequestModel}
 *
 * <p>CreateSnatEntryRequest</p>
 */
public class CreateSnatEntryRequest extends Request {
    @Query
    @NameInMap("NatGatewayId")
    @Validation(required = true)
    private String natGatewayId;

    @Query
    @NameInMap("SnatEntryName")
    private String snatEntryName;

    @Query
    @NameInMap("SnatIp")
    @Validation(required = true)
    private String snatIp;

    @Query
    @NameInMap("SourceCIDR")
    private String sourceCIDR;

    @Query
    @NameInMap("SourceNetworkId")
    private String sourceNetworkId;

    @Query
    @NameInMap("SourceVSwitchId")
    private String sourceVSwitchId;

    private CreateSnatEntryRequest(Builder builder) {
        super(builder);
        this.natGatewayId = builder.natGatewayId;
        this.snatEntryName = builder.snatEntryName;
        this.snatIp = builder.snatIp;
        this.sourceCIDR = builder.sourceCIDR;
        this.sourceNetworkId = builder.sourceNetworkId;
        this.sourceVSwitchId = builder.sourceVSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSnatEntryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return snatEntryName
     */
    public String getSnatEntryName() {
        return this.snatEntryName;
    }

    /**
     * @return snatIp
     */
    public String getSnatIp() {
        return this.snatIp;
    }

    /**
     * @return sourceCIDR
     */
    public String getSourceCIDR() {
        return this.sourceCIDR;
    }

    /**
     * @return sourceNetworkId
     */
    public String getSourceNetworkId() {
        return this.sourceNetworkId;
    }

    /**
     * @return sourceVSwitchId
     */
    public String getSourceVSwitchId() {
        return this.sourceVSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateSnatEntryRequest, Builder> {
        private String natGatewayId; 
        private String snatEntryName; 
        private String snatIp; 
        private String sourceCIDR; 
        private String sourceNetworkId; 
        private String sourceVSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSnatEntryRequest request) {
            super(request);
            this.natGatewayId = request.natGatewayId;
            this.snatEntryName = request.snatEntryName;
            this.snatIp = request.snatIp;
            this.sourceCIDR = request.sourceCIDR;
            this.sourceNetworkId = request.sourceNetworkId;
            this.sourceVSwitchId = request.sourceVSwitchId;
        } 

        /**
         * NatGatewayId.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * SnatEntryName.
         */
        public Builder snatEntryName(String snatEntryName) {
            this.putQueryParameter("SnatEntryName", snatEntryName);
            this.snatEntryName = snatEntryName;
            return this;
        }

        /**
         * SnatIp.
         */
        public Builder snatIp(String snatIp) {
            this.putQueryParameter("SnatIp", snatIp);
            this.snatIp = snatIp;
            return this;
        }

        /**
         * SourceCIDR.
         */
        public Builder sourceCIDR(String sourceCIDR) {
            this.putQueryParameter("SourceCIDR", sourceCIDR);
            this.sourceCIDR = sourceCIDR;
            return this;
        }

        /**
         * SourceNetworkId.
         */
        public Builder sourceNetworkId(String sourceNetworkId) {
            this.putQueryParameter("SourceNetworkId", sourceNetworkId);
            this.sourceNetworkId = sourceNetworkId;
            return this;
        }

        /**
         * SourceVSwitchId.
         */
        public Builder sourceVSwitchId(String sourceVSwitchId) {
            this.putQueryParameter("SourceVSwitchId", sourceVSwitchId);
            this.sourceVSwitchId = sourceVSwitchId;
            return this;
        }

        @Override
        public CreateSnatEntryRequest build() {
            return new CreateSnatEntryRequest(this);
        } 

    } 

}
