// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIoTCloudConnectorAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateIoTCloudConnectorAttributeRequest</p>
 */
public class UpdateIoTCloudConnectorAttributeRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("IoTCloudConnectorDescription")
    private String ioTCloudConnectorDescription;

    @Query
    @NameInMap("IoTCloudConnectorId")
    @Validation(required = true)
    private String ioTCloudConnectorId;

    @Query
    @NameInMap("IoTCloudConnectorName")
    private String ioTCloudConnectorName;

    @Query
    @NameInMap("Mode")
    private String mode;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("WildcardDomainEnabled")
    private Boolean wildcardDomainEnabled;

    private UpdateIoTCloudConnectorAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ioTCloudConnectorDescription = builder.ioTCloudConnectorDescription;
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.ioTCloudConnectorName = builder.ioTCloudConnectorName;
        this.mode = builder.mode;
        this.regionId = builder.regionId;
        this.wildcardDomainEnabled = builder.wildcardDomainEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIoTCloudConnectorAttributeRequest create() {
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
     * @return ioTCloudConnectorDescription
     */
    public String getIoTCloudConnectorDescription() {
        return this.ioTCloudConnectorDescription;
    }

    /**
     * @return ioTCloudConnectorId
     */
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    /**
     * @return ioTCloudConnectorName
     */
    public String getIoTCloudConnectorName() {
        return this.ioTCloudConnectorName;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return wildcardDomainEnabled
     */
    public Boolean getWildcardDomainEnabled() {
        return this.wildcardDomainEnabled;
    }

    public static final class Builder extends Request.Builder<UpdateIoTCloudConnectorAttributeRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ioTCloudConnectorDescription; 
        private String ioTCloudConnectorId; 
        private String ioTCloudConnectorName; 
        private String mode; 
        private String regionId; 
        private Boolean wildcardDomainEnabled; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIoTCloudConnectorAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ioTCloudConnectorDescription = request.ioTCloudConnectorDescription;
            this.ioTCloudConnectorId = request.ioTCloudConnectorId;
            this.ioTCloudConnectorName = request.ioTCloudConnectorName;
            this.mode = request.mode;
            this.regionId = request.regionId;
            this.wildcardDomainEnabled = request.wildcardDomainEnabled;
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
         * IoTCloudConnectorDescription.
         */
        public Builder ioTCloudConnectorDescription(String ioTCloudConnectorDescription) {
            this.putQueryParameter("IoTCloudConnectorDescription", ioTCloudConnectorDescription);
            this.ioTCloudConnectorDescription = ioTCloudConnectorDescription;
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
         * IoTCloudConnectorName.
         */
        public Builder ioTCloudConnectorName(String ioTCloudConnectorName) {
            this.putQueryParameter("IoTCloudConnectorName", ioTCloudConnectorName);
            this.ioTCloudConnectorName = ioTCloudConnectorName;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
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
         * WildcardDomainEnabled.
         */
        public Builder wildcardDomainEnabled(Boolean wildcardDomainEnabled) {
            this.putQueryParameter("WildcardDomainEnabled", wildcardDomainEnabled);
            this.wildcardDomainEnabled = wildcardDomainEnabled;
            return this;
        }

        @Override
        public UpdateIoTCloudConnectorAttributeRequest build() {
            return new UpdateIoTCloudConnectorAttributeRequest(this);
        } 

    } 

}
