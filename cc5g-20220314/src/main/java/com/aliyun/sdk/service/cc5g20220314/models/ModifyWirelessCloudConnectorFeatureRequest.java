// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWirelessCloudConnectorFeatureRequest} extends {@link RequestModel}
 *
 * <p>ModifyWirelessCloudConnectorFeatureRequest</p>
 */
public class ModifyWirelessCloudConnectorFeatureRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("FeatureName")
    private String featureName;

    @Query
    @NameInMap("FeatureValue")
    private String featureValue;

    @Query
    @NameInMap("WirelessCloudConnectorId")
    @Validation(required = true)
    private String wirelessCloudConnectorId;

    private ModifyWirelessCloudConnectorFeatureRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.featureName = builder.featureName;
        this.featureValue = builder.featureValue;
        this.wirelessCloudConnectorId = builder.wirelessCloudConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWirelessCloudConnectorFeatureRequest create() {
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
     * @return featureName
     */
    public String getFeatureName() {
        return this.featureName;
    }

    /**
     * @return featureValue
     */
    public String getFeatureValue() {
        return this.featureValue;
    }

    /**
     * @return wirelessCloudConnectorId
     */
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

    public static final class Builder extends Request.Builder<ModifyWirelessCloudConnectorFeatureRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String featureName; 
        private String featureValue; 
        private String wirelessCloudConnectorId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWirelessCloudConnectorFeatureRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.featureName = request.featureName;
            this.featureValue = request.featureValue;
            this.wirelessCloudConnectorId = request.wirelessCloudConnectorId;
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
         * FeatureName.
         */
        public Builder featureName(String featureName) {
            this.putQueryParameter("FeatureName", featureName);
            this.featureName = featureName;
            return this;
        }

        /**
         * FeatureValue.
         */
        public Builder featureValue(String featureValue) {
            this.putQueryParameter("FeatureValue", featureValue);
            this.featureValue = featureValue;
            return this;
        }

        /**
         * WirelessCloudConnectorId.
         */
        public Builder wirelessCloudConnectorId(String wirelessCloudConnectorId) {
            this.putQueryParameter("WirelessCloudConnectorId", wirelessCloudConnectorId);
            this.wirelessCloudConnectorId = wirelessCloudConnectorId;
            return this;
        }

        @Override
        public ModifyWirelessCloudConnectorFeatureRequest build() {
            return new ModifyWirelessCloudConnectorFeatureRequest(this);
        } 

    } 

}
