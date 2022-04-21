// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGroupDNSServiceRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteGroupDNSServiceRuleRequest</p>
 */
public class DeleteGroupDNSServiceRuleRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DNSServiceRuleId")
    @Validation(required = true)
    private String DNSServiceRuleId;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("IoTCloudConnectorGroupId")
    @Validation(required = true)
    private String ioTCloudConnectorGroupId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteGroupDNSServiceRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DNSServiceRuleId = builder.DNSServiceRuleId;
        this.dryRun = builder.dryRun;
        this.ioTCloudConnectorGroupId = builder.ioTCloudConnectorGroupId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGroupDNSServiceRuleRequest create() {
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
     * @return DNSServiceRuleId
     */
    public String getDNSServiceRuleId() {
        return this.DNSServiceRuleId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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

    public static final class Builder extends Request.Builder<DeleteGroupDNSServiceRuleRequest, Builder> {
        private String clientToken; 
        private String DNSServiceRuleId; 
        private Boolean dryRun; 
        private String ioTCloudConnectorGroupId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGroupDNSServiceRuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.DNSServiceRuleId = request.DNSServiceRuleId;
            this.dryRun = request.dryRun;
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
         * DNSServiceRuleId.
         */
        public Builder DNSServiceRuleId(String DNSServiceRuleId) {
            this.putQueryParameter("DNSServiceRuleId", DNSServiceRuleId);
            this.DNSServiceRuleId = DNSServiceRuleId;
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
        public DeleteGroupDNSServiceRuleRequest build() {
            return new DeleteGroupDNSServiceRuleRequest(this);
        } 

    } 

}
