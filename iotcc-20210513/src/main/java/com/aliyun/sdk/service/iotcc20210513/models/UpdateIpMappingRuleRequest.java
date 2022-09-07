// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIpMappingRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateIpMappingRuleRequest</p>
 */
public class UpdateIpMappingRuleRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DestinationIp")
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
    @NameInMap("IpMappingRuleId")
    @Validation(required = true)
    private String ipMappingRuleId;

    @Query
    @NameInMap("IpMappingRuleName")
    private String ipMappingRuleName;

    @Query
    @NameInMap("MappingIp")
    private String mappingIp;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private UpdateIpMappingRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.destinationIp = builder.destinationIp;
        this.dryRun = builder.dryRun;
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.ipMappingRuleDescription = builder.ipMappingRuleDescription;
        this.ipMappingRuleId = builder.ipMappingRuleId;
        this.ipMappingRuleName = builder.ipMappingRuleName;
        this.mappingIp = builder.mappingIp;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIpMappingRuleRequest create() {
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
     * @return ipMappingRuleId
     */
    public String getIpMappingRuleId() {
        return this.ipMappingRuleId;
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

    public static final class Builder extends Request.Builder<UpdateIpMappingRuleRequest, Builder> {
        private String clientToken; 
        private String destinationIp; 
        private Boolean dryRun; 
        private String ioTCloudConnectorId; 
        private String ipMappingRuleDescription; 
        private String ipMappingRuleId; 
        private String ipMappingRuleName; 
        private String mappingIp; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIpMappingRuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.destinationIp = request.destinationIp;
            this.dryRun = request.dryRun;
            this.ioTCloudConnectorId = request.ioTCloudConnectorId;
            this.ipMappingRuleDescription = request.ipMappingRuleDescription;
            this.ipMappingRuleId = request.ipMappingRuleId;
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
         * IpMappingRuleId.
         */
        public Builder ipMappingRuleId(String ipMappingRuleId) {
            this.putQueryParameter("IpMappingRuleId", ipMappingRuleId);
            this.ipMappingRuleId = ipMappingRuleId;
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
        public UpdateIpMappingRuleRequest build() {
            return new UpdateIpMappingRuleRequest(this);
        } 

    } 

}
