// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEaiAllRequest} extends {@link RequestModel}
 *
 * <p>CreateEaiAllRequest</p>
 */
public class CreateEaiAllRequest extends Request {
    @Query
    @NameInMap("ClientImageId")
    @Validation(required = true)
    private String clientImageId;

    @Query
    @NameInMap("ClientInstanceName")
    private String clientInstanceName;

    @Query
    @NameInMap("ClientInstanceType")
    @Validation(required = true)
    private String clientInstanceType;

    @Query
    @NameInMap("ClientInternetMaxBandwidthIn")
    private Integer clientInternetMaxBandwidthIn;

    @Query
    @NameInMap("ClientInternetMaxBandwidthOut")
    private Integer clientInternetMaxBandwidthOut;

    @Query
    @NameInMap("ClientPassword")
    private String clientPassword;

    @Query
    @NameInMap("ClientSecurityGroupId")
    @Validation(required = true)
    private String clientSecurityGroupId;

    @Query
    @NameInMap("ClientSystemDiskCategory")
    private String clientSystemDiskCategory;

    @Query
    @NameInMap("ClientSystemDiskSize")
    private Integer clientSystemDiskSize;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ClientVSwitchId")
    @Validation(required = true)
    private String clientVSwitchId;

    @Query
    @NameInMap("ClientZoneId")
    private String clientZoneId;

    @Query
    @NameInMap("EaiInstanceType")
    @Validation(required = true)
    private String eaiInstanceType;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateEaiAllRequest(Builder builder) {
        super(builder);
        this.clientImageId = builder.clientImageId;
        this.clientInstanceName = builder.clientInstanceName;
        this.clientInstanceType = builder.clientInstanceType;
        this.clientInternetMaxBandwidthIn = builder.clientInternetMaxBandwidthIn;
        this.clientInternetMaxBandwidthOut = builder.clientInternetMaxBandwidthOut;
        this.clientPassword = builder.clientPassword;
        this.clientSecurityGroupId = builder.clientSecurityGroupId;
        this.clientSystemDiskCategory = builder.clientSystemDiskCategory;
        this.clientSystemDiskSize = builder.clientSystemDiskSize;
        this.clientToken = builder.clientToken;
        this.clientVSwitchId = builder.clientVSwitchId;
        this.clientZoneId = builder.clientZoneId;
        this.eaiInstanceType = builder.eaiInstanceType;
        this.instanceName = builder.instanceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEaiAllRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientImageId
     */
    public String getClientImageId() {
        return this.clientImageId;
    }

    /**
     * @return clientInstanceName
     */
    public String getClientInstanceName() {
        return this.clientInstanceName;
    }

    /**
     * @return clientInstanceType
     */
    public String getClientInstanceType() {
        return this.clientInstanceType;
    }

    /**
     * @return clientInternetMaxBandwidthIn
     */
    public Integer getClientInternetMaxBandwidthIn() {
        return this.clientInternetMaxBandwidthIn;
    }

    /**
     * @return clientInternetMaxBandwidthOut
     */
    public Integer getClientInternetMaxBandwidthOut() {
        return this.clientInternetMaxBandwidthOut;
    }

    /**
     * @return clientPassword
     */
    public String getClientPassword() {
        return this.clientPassword;
    }

    /**
     * @return clientSecurityGroupId
     */
    public String getClientSecurityGroupId() {
        return this.clientSecurityGroupId;
    }

    /**
     * @return clientSystemDiskCategory
     */
    public String getClientSystemDiskCategory() {
        return this.clientSystemDiskCategory;
    }

    /**
     * @return clientSystemDiskSize
     */
    public Integer getClientSystemDiskSize() {
        return this.clientSystemDiskSize;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clientVSwitchId
     */
    public String getClientVSwitchId() {
        return this.clientVSwitchId;
    }

    /**
     * @return clientZoneId
     */
    public String getClientZoneId() {
        return this.clientZoneId;
    }

    /**
     * @return eaiInstanceType
     */
    public String getEaiInstanceType() {
        return this.eaiInstanceType;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateEaiAllRequest, Builder> {
        private String clientImageId; 
        private String clientInstanceName; 
        private String clientInstanceType; 
        private Integer clientInternetMaxBandwidthIn; 
        private Integer clientInternetMaxBandwidthOut; 
        private String clientPassword; 
        private String clientSecurityGroupId; 
        private String clientSystemDiskCategory; 
        private Integer clientSystemDiskSize; 
        private String clientToken; 
        private String clientVSwitchId; 
        private String clientZoneId; 
        private String eaiInstanceType; 
        private String instanceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateEaiAllRequest response) {
            super(response);
            this.clientImageId = response.clientImageId;
            this.clientInstanceName = response.clientInstanceName;
            this.clientInstanceType = response.clientInstanceType;
            this.clientInternetMaxBandwidthIn = response.clientInternetMaxBandwidthIn;
            this.clientInternetMaxBandwidthOut = response.clientInternetMaxBandwidthOut;
            this.clientPassword = response.clientPassword;
            this.clientSecurityGroupId = response.clientSecurityGroupId;
            this.clientSystemDiskCategory = response.clientSystemDiskCategory;
            this.clientSystemDiskSize = response.clientSystemDiskSize;
            this.clientToken = response.clientToken;
            this.clientVSwitchId = response.clientVSwitchId;
            this.clientZoneId = response.clientZoneId;
            this.eaiInstanceType = response.eaiInstanceType;
            this.instanceName = response.instanceName;
            this.regionId = response.regionId;
        } 

        /**
         * ClientImageId.
         */
        public Builder clientImageId(String clientImageId) {
            this.putQueryParameter("ClientImageId", clientImageId);
            this.clientImageId = clientImageId;
            return this;
        }

        /**
         * ClientInstanceName.
         */
        public Builder clientInstanceName(String clientInstanceName) {
            this.putQueryParameter("ClientInstanceName", clientInstanceName);
            this.clientInstanceName = clientInstanceName;
            return this;
        }

        /**
         * ClientInstanceType.
         */
        public Builder clientInstanceType(String clientInstanceType) {
            this.putQueryParameter("ClientInstanceType", clientInstanceType);
            this.clientInstanceType = clientInstanceType;
            return this;
        }

        /**
         * ClientInternetMaxBandwidthIn.
         */
        public Builder clientInternetMaxBandwidthIn(Integer clientInternetMaxBandwidthIn) {
            this.putQueryParameter("ClientInternetMaxBandwidthIn", clientInternetMaxBandwidthIn);
            this.clientInternetMaxBandwidthIn = clientInternetMaxBandwidthIn;
            return this;
        }

        /**
         * ClientInternetMaxBandwidthOut.
         */
        public Builder clientInternetMaxBandwidthOut(Integer clientInternetMaxBandwidthOut) {
            this.putQueryParameter("ClientInternetMaxBandwidthOut", clientInternetMaxBandwidthOut);
            this.clientInternetMaxBandwidthOut = clientInternetMaxBandwidthOut;
            return this;
        }

        /**
         * ClientPassword.
         */
        public Builder clientPassword(String clientPassword) {
            this.putQueryParameter("ClientPassword", clientPassword);
            this.clientPassword = clientPassword;
            return this;
        }

        /**
         * ClientSecurityGroupId.
         */
        public Builder clientSecurityGroupId(String clientSecurityGroupId) {
            this.putQueryParameter("ClientSecurityGroupId", clientSecurityGroupId);
            this.clientSecurityGroupId = clientSecurityGroupId;
            return this;
        }

        /**
         * ClientSystemDiskCategory.
         */
        public Builder clientSystemDiskCategory(String clientSystemDiskCategory) {
            this.putQueryParameter("ClientSystemDiskCategory", clientSystemDiskCategory);
            this.clientSystemDiskCategory = clientSystemDiskCategory;
            return this;
        }

        /**
         * ClientSystemDiskSize.
         */
        public Builder clientSystemDiskSize(Integer clientSystemDiskSize) {
            this.putQueryParameter("ClientSystemDiskSize", clientSystemDiskSize);
            this.clientSystemDiskSize = clientSystemDiskSize;
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
         * ClientVSwitchId.
         */
        public Builder clientVSwitchId(String clientVSwitchId) {
            this.putQueryParameter("ClientVSwitchId", clientVSwitchId);
            this.clientVSwitchId = clientVSwitchId;
            return this;
        }

        /**
         * ClientZoneId.
         */
        public Builder clientZoneId(String clientZoneId) {
            this.putQueryParameter("ClientZoneId", clientZoneId);
            this.clientZoneId = clientZoneId;
            return this;
        }

        /**
         * EaiInstanceType.
         */
        public Builder eaiInstanceType(String eaiInstanceType) {
            this.putQueryParameter("EaiInstanceType", eaiInstanceType);
            this.eaiInstanceType = eaiInstanceType;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
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
        public CreateEaiAllRequest build() {
            return new CreateEaiAllRequest(this);
        } 

    } 

}
