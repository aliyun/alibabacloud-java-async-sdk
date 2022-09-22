// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkInsightsPathRequest} extends {@link RequestModel}
 *
 * <p>CreateNetworkInsightsPathRequest</p>
 */
public class CreateNetworkInsightsPathRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Destination")
    @Validation(required = true)
    private String destination;

    @Query
    @NameInMap("DestinationPort")
    private String destinationPort;

    @Query
    @NameInMap("DestinationType")
    @Validation(required = true)
    private String destinationType;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("NeedDiagnoseGuest")
    private Boolean needDiagnoseGuest;

    @Query
    @NameInMap("NetworkInsightsPathName")
    private String networkInsightsPathName;

    @Query
    @NameInMap("Protocol")
    private String protocol;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Source")
    @Validation(required = true)
    private String source;

    @Query
    @NameInMap("SourceType")
    @Validation(required = true)
    private String sourceType;

    private CreateNetworkInsightsPathRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.clientToken = builder.clientToken;
        this.destination = builder.destination;
        this.destinationPort = builder.destinationPort;
        this.destinationType = builder.destinationType;
        this.dryRun = builder.dryRun;
        this.needDiagnoseGuest = builder.needDiagnoseGuest;
        this.networkInsightsPathName = builder.networkInsightsPathName;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.source = builder.source;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkInsightsPathRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return destination
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * @return destinationPort
     */
    public String getDestinationPort() {
        return this.destinationPort;
    }

    /**
     * @return destinationType
     */
    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return needDiagnoseGuest
     */
    public Boolean getNeedDiagnoseGuest() {
        return this.needDiagnoseGuest;
    }

    /**
     * @return networkInsightsPathName
     */
    public String getNetworkInsightsPathName() {
        return this.networkInsightsPathName;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<CreateNetworkInsightsPathRequest, Builder> {
        private String sourceRegionId; 
        private String clientToken; 
        private String destination; 
        private String destinationPort; 
        private String destinationType; 
        private Boolean dryRun; 
        private Boolean needDiagnoseGuest; 
        private String networkInsightsPathName; 
        private String protocol; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String source; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(CreateNetworkInsightsPathRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.clientToken = request.clientToken;
            this.destination = request.destination;
            this.destinationPort = request.destinationPort;
            this.destinationType = request.destinationType;
            this.dryRun = request.dryRun;
            this.needDiagnoseGuest = request.needDiagnoseGuest;
            this.networkInsightsPathName = request.networkInsightsPathName;
            this.protocol = request.protocol;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.source = request.source;
            this.sourceType = request.sourceType;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
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
         * Destination.
         */
        public Builder destination(String destination) {
            this.putQueryParameter("Destination", destination);
            this.destination = destination;
            return this;
        }

        /**
         * DestinationPort.
         */
        public Builder destinationPort(String destinationPort) {
            this.putQueryParameter("DestinationPort", destinationPort);
            this.destinationPort = destinationPort;
            return this;
        }

        /**
         * DestinationType.
         */
        public Builder destinationType(String destinationType) {
            this.putQueryParameter("DestinationType", destinationType);
            this.destinationType = destinationType;
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
         * NeedDiagnoseGuest.
         */
        public Builder needDiagnoseGuest(Boolean needDiagnoseGuest) {
            this.putQueryParameter("NeedDiagnoseGuest", needDiagnoseGuest);
            this.needDiagnoseGuest = needDiagnoseGuest;
            return this;
        }

        /**
         * NetworkInsightsPathName.
         */
        public Builder networkInsightsPathName(String networkInsightsPathName) {
            this.putQueryParameter("NetworkInsightsPathName", networkInsightsPathName);
            this.networkInsightsPathName = networkInsightsPathName;
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
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

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public CreateNetworkInsightsPathRequest build() {
            return new CreateNetworkInsightsPathRequest(this);
        } 

    } 

}
