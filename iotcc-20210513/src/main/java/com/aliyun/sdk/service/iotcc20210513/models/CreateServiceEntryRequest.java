// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceEntryRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceEntryRequest</p>
 */
public class CreateServiceEntryRequest extends Request {
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
    @NameInMap("ServiceEntryName")
    private String serviceEntryName;

    @Query
    @NameInMap("ServiceId")
    @Validation(required = true)
    private String serviceId;

    @Query
    @NameInMap("Target")
    @Validation(required = true)
    private String target;

    @Query
    @NameInMap("TargetType")
    @Validation(required = true)
    private String targetType;

    private CreateServiceEntryRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.regionId = builder.regionId;
        this.serviceEntryDescription = builder.serviceEntryDescription;
        this.serviceEntryName = builder.serviceEntryName;
        this.serviceId = builder.serviceId;
        this.target = builder.target;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceEntryRequest create() {
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

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<CreateServiceEntryRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ioTCloudConnectorId; 
        private String regionId; 
        private String serviceEntryDescription; 
        private String serviceEntryName; 
        private String serviceId; 
        private String target; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceEntryRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ioTCloudConnectorId = request.ioTCloudConnectorId;
            this.regionId = request.regionId;
            this.serviceEntryDescription = request.serviceEntryDescription;
            this.serviceEntryName = request.serviceEntryName;
            this.serviceId = request.serviceId;
            this.target = request.target;
            this.targetType = request.targetType;
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

        /**
         * Target.
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * TargetType.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public CreateServiceEntryRequest build() {
            return new CreateServiceEntryRequest(this);
        } 

    } 

}
