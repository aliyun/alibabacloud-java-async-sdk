// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIpMappingRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateIpMappingRuleRequest</p>
 */
public class CreateIpMappingRuleRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DestinationIp")
    @Validation(required = true)
    private String destinationIp;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("IoTCloudConnectorId")
    @Validation(required = true)
    private String ioTCloudConnectorId;

    @Query
    @NameInMap("IpMappingRuleDescription")
    private String ipMappingRuleDescription;

    @Query
    @NameInMap("IpMappingRuleName")
    private String ipMappingRuleName;

    @Query
    @NameInMap("MappingIp")
    @Validation(required = true)
    private String mappingIp;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateIpMappingRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.destinationIp = builder.destinationIp;
        this.dryRun = builder.dryRun;
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.ipMappingRuleDescription = builder.ipMappingRuleDescription;
        this.ipMappingRuleName = builder.ipMappingRuleName;
        this.mappingIp = builder.mappingIp;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpMappingRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return destinationIp
     */
    public String getDestinationIp() {
        return this.destinationIp;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ioTCloudConnectorId
     */
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    /**
     * @return ipMappingRuleDescription
     */
    public String getIpMappingRuleDescription() {
        return this.ipMappingRuleDescription;
    }

    /**
     * @return ipMappingRuleName
     */
    public String getIpMappingRuleName() {
        return this.ipMappingRuleName;
    }

    /**
     * @return mappingIp
     */
    public String getMappingIp() {
        return this.mappingIp;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateIpMappingRuleRequest, Builder> {
        private String clientToken; 
        private String destinationIp; 
        private Boolean dryRun; 
        private String ioTCloudConnectorId; 
        private String ipMappingRuleDescription; 
        private String ipMappingRuleName; 
        private String mappingIp; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateIpMappingRuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.destinationIp = request.destinationIp;
            this.dryRun = request.dryRun;
            this.ioTCloudConnectorId = request.ioTCloudConnectorId;
            this.ipMappingRuleDescription = request.ipMappingRuleDescription;
            this.ipMappingRuleName = request.ipMappingRuleName;
            this.mappingIp = request.mappingIp;
            this.regionId = request.regionId;
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
         * DestinationIp.
         */
        public Builder destinationIp(String destinationIp) {
            this.putQueryParameter("DestinationIp", destinationIp);
            this.destinationIp = destinationIp;
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
         * IoTCloudConnectorId.
         */
        public Builder ioTCloudConnectorId(String ioTCloudConnectorId) {
            this.putQueryParameter("IoTCloudConnectorId", ioTCloudConnectorId);
            this.ioTCloudConnectorId = ioTCloudConnectorId;
            return this;
        }

        /**
         * IpMappingRuleDescription.
         */
        public Builder ipMappingRuleDescription(String ipMappingRuleDescription) {
            this.putQueryParameter("IpMappingRuleDescription", ipMappingRuleDescription);
            this.ipMappingRuleDescription = ipMappingRuleDescription;
            return this;
        }

        /**
         * IpMappingRuleName.
         */
        public Builder ipMappingRuleName(String ipMappingRuleName) {
            this.putQueryParameter("IpMappingRuleName", ipMappingRuleName);
            this.ipMappingRuleName = ipMappingRuleName;
            return this;
        }

        /**
         * MappingIp.
         */
        public Builder mappingIp(String mappingIp) {
            this.putQueryParameter("MappingIp", mappingIp);
            this.mappingIp = mappingIp;
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

        @Override
        public CreateIpMappingRuleRequest build() {
            return new CreateIpMappingRuleRequest(this);
        } 

    } 

}
