// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIpMappingRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteIpMappingRuleRequest</p>
 */
public class DeleteIpMappingRuleRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("IoTCloudConnectorId")
    @Validation(required = true)
    private String ioTCloudConnectorId;

    @Query
    @NameInMap("IpMappingRuleId")
    @Validation(required = true)
    private String ipMappingRuleId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteIpMappingRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.ipMappingRuleId = builder.ipMappingRuleId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIpMappingRuleRequest create() {
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
     * @return ipMappingRuleId
     */
    public String getIpMappingRuleId() {
        return this.ipMappingRuleId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteIpMappingRuleRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ioTCloudConnectorId; 
        private String ipMappingRuleId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIpMappingRuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ioTCloudConnectorId = request.ioTCloudConnectorId;
            this.ipMappingRuleId = request.ipMappingRuleId;
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
         * IpMappingRuleId.
         */
        public Builder ipMappingRuleId(String ipMappingRuleId) {
            this.putQueryParameter("IpMappingRuleId", ipMappingRuleId);
            this.ipMappingRuleId = ipMappingRuleId;
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
        public DeleteIpMappingRuleRequest build() {
            return new DeleteIpMappingRuleRequest(this);
        } 

    } 

}
