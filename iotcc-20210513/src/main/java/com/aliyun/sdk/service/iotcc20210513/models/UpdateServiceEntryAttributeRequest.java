// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceEntryAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceEntryAttributeRequest</p>
 */
public class UpdateServiceEntryAttributeRequest extends Request {
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
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ServiceEntryDescription")
    private String serviceEntryDescription;

    @Query
    @NameInMap("ServiceEntryId")
    @Validation(required = true)
    private String serviceEntryId;

    @Query
    @NameInMap("ServiceEntryName")
    private String serviceEntryName;

    @Query
    @NameInMap("ServiceId")
    @Validation(required = true)
    private String serviceId;

    private UpdateServiceEntryAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.regionId = builder.regionId;
        this.serviceEntryDescription = builder.serviceEntryDescription;
        this.serviceEntryId = builder.serviceEntryId;
        this.serviceEntryName = builder.serviceEntryName;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceEntryAttributeRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceEntryDescription
     */
    public String getServiceEntryDescription() {
        return this.serviceEntryDescription;
    }

    /**
     * @return serviceEntryId
     */
    public String getServiceEntryId() {
        return this.serviceEntryId;
    }

    /**
     * @return serviceEntryName
     */
    public String getServiceEntryName() {
        return this.serviceEntryName;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    public static final class Builder extends Request.Builder<UpdateServiceEntryAttributeRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ioTCloudConnectorId; 
        private String regionId; 
        private String serviceEntryDescription; 
        private String serviceEntryId; 
        private String serviceEntryName; 
        private String serviceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceEntryAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ioTCloudConnectorId = request.ioTCloudConnectorId;
            this.regionId = request.regionId;
            this.serviceEntryDescription = request.serviceEntryDescription;
            this.serviceEntryId = request.serviceEntryId;
            this.serviceEntryName = request.serviceEntryName;
            this.serviceId = request.serviceId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ServiceEntryDescription.
         */
        public Builder serviceEntryDescription(String serviceEntryDescription) {
            this.putQueryParameter("ServiceEntryDescription", serviceEntryDescription);
            this.serviceEntryDescription = serviceEntryDescription;
            return this;
        }

        /**
         * ServiceEntryId.
         */
        public Builder serviceEntryId(String serviceEntryId) {
            this.putQueryParameter("ServiceEntryId", serviceEntryId);
            this.serviceEntryId = serviceEntryId;
            return this;
        }

        /**
         * ServiceEntryName.
         */
        public Builder serviceEntryName(String serviceEntryName) {
            this.putQueryParameter("ServiceEntryName", serviceEntryName);
            this.serviceEntryName = serviceEntryName;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public UpdateServiceEntryAttributeRequest build() {
            return new UpdateServiceEntryAttributeRequest(this);
        } 

    } 

}
