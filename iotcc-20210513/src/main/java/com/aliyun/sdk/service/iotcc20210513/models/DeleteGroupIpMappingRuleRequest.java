// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGroupIpMappingRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteGroupIpMappingRuleRequest</p>
 */
public class DeleteGroupIpMappingRuleRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("GroupIpMappingRuleId")
    @Validation(required = true)
    private String groupIpMappingRuleId;

    @Query
    @NameInMap("IoTCloudConnectorGroupId")
    @Validation(required = true)
    private String ioTCloudConnectorGroupId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteGroupIpMappingRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.groupIpMappingRuleId = builder.groupIpMappingRuleId;
        this.ioTCloudConnectorGroupId = builder.ioTCloudConnectorGroupId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGroupIpMappingRuleRequest create() {
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
     * @return groupIpMappingRuleId
     */
    public String getGroupIpMappingRuleId() {
        return this.groupIpMappingRuleId;
    }

    /**
     * @return ioTCloudConnectorGroupId
     */
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteGroupIpMappingRuleRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String groupIpMappingRuleId; 
        private String ioTCloudConnectorGroupId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGroupIpMappingRuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.groupIpMappingRuleId = request.groupIpMappingRuleId;
            this.ioTCloudConnectorGroupId = request.ioTCloudConnectorGroupId;
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
         * GroupIpMappingRuleId.
         */
        public Builder groupIpMappingRuleId(String groupIpMappingRuleId) {
            this.putQueryParameter("GroupIpMappingRuleId", groupIpMappingRuleId);
            this.groupIpMappingRuleId = groupIpMappingRuleId;
            return this;
        }

        /**
         * IoTCloudConnectorGroupId.
         */
        public Builder ioTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
            this.putQueryParameter("IoTCloudConnectorGroupId", ioTCloudConnectorGroupId);
            this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
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
        public DeleteGroupIpMappingRuleRequest build() {
            return new DeleteGroupIpMappingRuleRequest(this);
        } 

    } 

}
