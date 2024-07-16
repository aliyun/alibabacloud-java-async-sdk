// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWirelessCloudConnectorRequest} extends {@link RequestModel}
 *
 * <p>CreateWirelessCloudConnectorRequest</p>
 */
public class CreateWirelessCloudConnectorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ISP")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ISP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetLinks")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < NetLinks> netLinks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseCase")
    private String useCase;

    private CreateWirelessCloudConnectorRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.ISP = builder.ISP;
        this.name = builder.name;
        this.netLinks = builder.netLinks;
        this.regionId = builder.regionId;
        this.useCase = builder.useCase;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWirelessCloudConnectorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return ISP
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return netLinks
     */
    public java.util.List < NetLinks> getNetLinks() {
        return this.netLinks;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return useCase
     */
    public String getUseCase() {
        return this.useCase;
    }

    public static final class Builder extends Request.Builder<CreateWirelessCloudConnectorRequest, Builder> {
        private String businessType; 
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private String ISP; 
        private String name; 
        private java.util.List < NetLinks> netLinks; 
        private String regionId; 
        private String useCase; 

        private Builder() {
            super();
        } 

        private Builder(CreateWirelessCloudConnectorRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.ISP = request.ISP;
            this.name = request.name;
            this.netLinks = request.netLinks;
            this.regionId = request.regionId;
            this.useCase = request.useCase;
        } 

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * ISP.
         */
        public Builder ISP(String ISP) {
            this.putQueryParameter("ISP", ISP);
            this.ISP = ISP;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NetLinks.
         */
        public Builder netLinks(java.util.List < NetLinks> netLinks) {
            this.putQueryParameter("NetLinks", netLinks);
            this.netLinks = netLinks;
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
         * UseCase.
         */
        public Builder useCase(String useCase) {
            this.putQueryParameter("UseCase", useCase);
            this.useCase = useCase;
            return this;
        }

        @Override
        public CreateWirelessCloudConnectorRequest build() {
            return new CreateWirelessCloudConnectorRequest(this);
        } 

    } 

    public static class NetLinks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("APN")
        @com.aliyun.core.annotation.Validation(required = true)
        private String APN;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("VSwitchs")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < String > vSwitchs;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vpcId;

        private NetLinks(Builder builder) {
            this.APN = builder.APN;
            this.regionId = builder.regionId;
            this.vSwitchs = builder.vSwitchs;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetLinks create() {
            return builder().build();
        }

        /**
         * @return APN
         */
        public String getAPN() {
            return this.APN;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vSwitchs
         */
        public java.util.List < String > getVSwitchs() {
            return this.vSwitchs;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String APN; 
            private String regionId; 
            private java.util.List < String > vSwitchs; 
            private String vpcId; 

            /**
             * APN.
             */
            public Builder APN(String APN) {
                this.APN = APN;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * VSwitchs.
             */
            public Builder vSwitchs(java.util.List < String > vSwitchs) {
                this.vSwitchs = vSwitchs;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public NetLinks build() {
                return new NetLinks(this);
            } 

        } 

    }
}
