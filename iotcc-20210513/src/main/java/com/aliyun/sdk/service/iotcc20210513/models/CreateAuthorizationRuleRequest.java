// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAuthorizationRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateAuthorizationRuleRequest</p>
 */
public class CreateAuthorizationRuleRequest extends Request {
    @Query
    @NameInMap("AuthorizationRuleDescription")
    private String authorizationRuleDescription;

    @Query
    @NameInMap("AuthorizationRuleName")
    private String authorizationRuleName;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Destination")
    @Validation(required = true)
    private String destination;

    @Query
    @NameInMap("DestinationType")
    @Validation(required = true)
    private String destinationType;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("IoTCloudConnectorId")
    @Validation(required = true)
    private String ioTCloudConnectorId;

    @Query
    @NameInMap("Policy")
    @Validation(required = true)
    private String policy;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SourceCidrs")
    @Validation(required = true)
    private java.util.List < String > sourceCidrs;

    private CreateAuthorizationRuleRequest(Builder builder) {
        super(builder);
        this.authorizationRuleDescription = builder.authorizationRuleDescription;
        this.authorizationRuleName = builder.authorizationRuleName;
        this.clientToken = builder.clientToken;
        this.destination = builder.destination;
        this.destinationType = builder.destinationType;
        this.dryRun = builder.dryRun;
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.policy = builder.policy;
        this.regionId = builder.regionId;
        this.sourceCidrs = builder.sourceCidrs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAuthorizationRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationRuleDescription
     */
    public String getAuthorizationRuleDescription() {
        return this.authorizationRuleDescription;
    }

    /**
     * @return authorizationRuleName
     */
    public String getAuthorizationRuleName() {
        return this.authorizationRuleName;
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
     * @return ioTCloudConnectorId
     */
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sourceCidrs
     */
    public java.util.List < String > getSourceCidrs() {
        return this.sourceCidrs;
    }

    public static final class Builder extends Request.Builder<CreateAuthorizationRuleRequest, Builder> {
        private String authorizationRuleDescription; 
        private String authorizationRuleName; 
        private String clientToken; 
        private String destination; 
        private String destinationType; 
        private Boolean dryRun; 
        private String ioTCloudConnectorId; 
        private String policy; 
        private String regionId; 
        private java.util.List < String > sourceCidrs; 

        private Builder() {
            super();
        } 

        private Builder(CreateAuthorizationRuleRequest request) {
            super(request);
            this.authorizationRuleDescription = request.authorizationRuleDescription;
            this.authorizationRuleName = request.authorizationRuleName;
            this.clientToken = request.clientToken;
            this.destination = request.destination;
            this.destinationType = request.destinationType;
            this.dryRun = request.dryRun;
            this.ioTCloudConnectorId = request.ioTCloudConnectorId;
            this.policy = request.policy;
            this.regionId = request.regionId;
            this.sourceCidrs = request.sourceCidrs;
        } 

        /**
         * AuthorizationRuleDescription.
         */
        public Builder authorizationRuleDescription(String authorizationRuleDescription) {
            this.putQueryParameter("AuthorizationRuleDescription", authorizationRuleDescription);
            this.authorizationRuleDescription = authorizationRuleDescription;
            return this;
        }

        /**
         * AuthorizationRuleName.
         */
        public Builder authorizationRuleName(String authorizationRuleName) {
            this.putQueryParameter("AuthorizationRuleName", authorizationRuleName);
            this.authorizationRuleName = authorizationRuleName;
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
         * IoTCloudConnectorId.
         */
        public Builder ioTCloudConnectorId(String ioTCloudConnectorId) {
            this.putQueryParameter("IoTCloudConnectorId", ioTCloudConnectorId);
            this.ioTCloudConnectorId = ioTCloudConnectorId;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
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
         * SourceCidrs.
         */
        public Builder sourceCidrs(java.util.List < String > sourceCidrs) {
            this.putQueryParameter("SourceCidrs", sourceCidrs);
            this.sourceCidrs = sourceCidrs;
            return this;
        }

        @Override
        public CreateAuthorizationRuleRequest build() {
            return new CreateAuthorizationRuleRequest(this);
        } 

    } 

}
