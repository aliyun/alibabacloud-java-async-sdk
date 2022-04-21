// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDNSServiceRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateDNSServiceRuleRequest</p>
 */
public class CreateDNSServiceRuleRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DNSServiceRuleDescription")
    private String DNSServiceRuleDescription;

    @Query
    @NameInMap("DNSServiceRuleName")
    private String DNSServiceRuleName;

    @Query
    @NameInMap("Destination")
    private String destination;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("IoTCloudConnectorId")
    @Validation(required = true)
    private String ioTCloudConnectorId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ServiceType")
    @Validation(required = true)
    private String serviceType;

    @Query
    @NameInMap("Source")
    @Validation(required = true)
    private String source;

    private CreateDNSServiceRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DNSServiceRuleDescription = builder.DNSServiceRuleDescription;
        this.DNSServiceRuleName = builder.DNSServiceRuleName;
        this.destination = builder.destination;
        this.dryRun = builder.dryRun;
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.regionId = builder.regionId;
        this.serviceType = builder.serviceType;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDNSServiceRuleRequest create() {
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
     * @return DNSServiceRuleDescription
     */
    public String getDNSServiceRuleDescription() {
        return this.DNSServiceRuleDescription;
    }

    /**
     * @return DNSServiceRuleName
     */
    public String getDNSServiceRuleName() {
        return this.DNSServiceRuleName;
    }

    /**
     * @return destination
     */
    public String getDestination() {
        return this.destination;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<CreateDNSServiceRuleRequest, Builder> {
        private String clientToken; 
        private String DNSServiceRuleDescription; 
        private String DNSServiceRuleName; 
        private String destination; 
        private Boolean dryRun; 
        private String ioTCloudConnectorId; 
        private String regionId; 
        private String serviceType; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(CreateDNSServiceRuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.DNSServiceRuleDescription = request.DNSServiceRuleDescription;
            this.DNSServiceRuleName = request.DNSServiceRuleName;
            this.destination = request.destination;
            this.dryRun = request.dryRun;
            this.ioTCloudConnectorId = request.ioTCloudConnectorId;
            this.regionId = request.regionId;
            this.serviceType = request.serviceType;
            this.source = request.source;
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
         * DNSServiceRuleDescription.
         */
        public Builder DNSServiceRuleDescription(String DNSServiceRuleDescription) {
            this.putQueryParameter("DNSServiceRuleDescription", DNSServiceRuleDescription);
            this.DNSServiceRuleDescription = DNSServiceRuleDescription;
            return this;
        }

        /**
         * DNSServiceRuleName.
         */
        public Builder DNSServiceRuleName(String DNSServiceRuleName) {
            this.putQueryParameter("DNSServiceRuleName", DNSServiceRuleName);
            this.DNSServiceRuleName = DNSServiceRuleName;
            return this;
        }

        /**
         * Destination.
         */
        public Builder destination(String destination) {
            this.putQueryParameter("Destination", destination);
            this.destination = destination;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ServiceType.
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public CreateDNSServiceRuleRequest build() {
            return new CreateDNSServiceRuleRequest(this);
        } 

    } 

}
