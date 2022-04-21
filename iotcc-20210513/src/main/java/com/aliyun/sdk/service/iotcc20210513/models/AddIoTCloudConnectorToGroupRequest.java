// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddIoTCloudConnectorToGroupRequest} extends {@link RequestModel}
 *
 * <p>AddIoTCloudConnectorToGroupRequest</p>
 */
public class AddIoTCloudConnectorToGroupRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("IoTCloudConnectorGroupId")
    @Validation(required = true)
    private String ioTCloudConnectorGroupId;

    @Query
    @NameInMap("IoTCloudConnectorId")
    @Validation(required = true)
    private java.util.List < String > ioTCloudConnectorId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private AddIoTCloudConnectorToGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ioTCloudConnectorGroupId = builder.ioTCloudConnectorGroupId;
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddIoTCloudConnectorToGroupRequest create() {
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
     * @return ioTCloudConnectorGroupId
     */
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
    }

    /**
     * @return ioTCloudConnectorId
     */
    public java.util.List < String > getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AddIoTCloudConnectorToGroupRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ioTCloudConnectorGroupId; 
        private java.util.List < String > ioTCloudConnectorId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddIoTCloudConnectorToGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ioTCloudConnectorGroupId = request.ioTCloudConnectorGroupId;
            this.ioTCloudConnectorId = request.ioTCloudConnectorId;
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
         * IoTCloudConnectorGroupId.
         */
        public Builder ioTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
            this.putQueryParameter("IoTCloudConnectorGroupId", ioTCloudConnectorGroupId);
            this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
            return this;
        }

        /**
         * IoTCloudConnectorId.
         */
        public Builder ioTCloudConnectorId(java.util.List < String > ioTCloudConnectorId) {
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

        @Override
        public AddIoTCloudConnectorToGroupRequest build() {
            return new AddIoTCloudConnectorToGroupRequest(this);
        } 

    } 

}
