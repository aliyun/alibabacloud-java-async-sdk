// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link IdpIdaas2SubConfig} extends {@link TeaModel}
 *
 * <p>IdpIdaas2SubConfig</p>
 */
public class IdpIdaas2SubConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.NameInMap("ClientSecret")
    private String clientSecret;

    @com.aliyun.core.annotation.NameInMap("EventAesKey")
    private String eventAesKey;

    @com.aliyun.core.annotation.NameInMap("EventLabel")
    private String eventLabel;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("PublicKeyEndpoint")
    private String publicKeyEndpoint;

    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("SamlMetadata")
    private String samlMetadata;

    private IdpIdaas2SubConfig(Builder builder) {
        this.applicationId = builder.applicationId;
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.eventAesKey = builder.eventAesKey;
        this.eventLabel = builder.eventLabel;
        this.instanceId = builder.instanceId;
        this.publicKeyEndpoint = builder.publicKeyEndpoint;
        this.region = builder.region;
        this.samlMetadata = builder.samlMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IdpIdaas2SubConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return clientSecret
     */
    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * @return eventAesKey
     */
    public String getEventAesKey() {
        return this.eventAesKey;
    }

    /**
     * @return eventLabel
     */
    public String getEventLabel() {
        return this.eventLabel;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return publicKeyEndpoint
     */
    public String getPublicKeyEndpoint() {
        return this.publicKeyEndpoint;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return samlMetadata
     */
    public String getSamlMetadata() {
        return this.samlMetadata;
    }

    public static final class Builder {
        private String applicationId; 
        private String clientId; 
        private String clientSecret; 
        private String eventAesKey; 
        private String eventLabel; 
        private String instanceId; 
        private String publicKeyEndpoint; 
        private String region; 
        private String samlMetadata; 

        private Builder() {
        } 

        private Builder(IdpIdaas2SubConfig model) {
            this.applicationId = model.applicationId;
            this.clientId = model.clientId;
            this.clientSecret = model.clientSecret;
            this.eventAesKey = model.eventAesKey;
            this.eventLabel = model.eventLabel;
            this.instanceId = model.instanceId;
            this.publicKeyEndpoint = model.publicKeyEndpoint;
            this.region = model.region;
            this.samlMetadata = model.samlMetadata;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * ClientSecret.
         */
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * EventAesKey.
         */
        public Builder eventAesKey(String eventAesKey) {
            this.eventAesKey = eventAesKey;
            return this;
        }

        /**
         * EventLabel.
         */
        public Builder eventLabel(String eventLabel) {
            this.eventLabel = eventLabel;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PublicKeyEndpoint.
         */
        public Builder publicKeyEndpoint(String publicKeyEndpoint) {
            this.publicKeyEndpoint = publicKeyEndpoint;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * SamlMetadata.
         */
        public Builder samlMetadata(String samlMetadata) {
            this.samlMetadata = samlMetadata;
            return this;
        }

        public IdpIdaas2SubConfig build() {
            return new IdpIdaas2SubConfig(this);
        } 

    } 

}
