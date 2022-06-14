// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIoTCloudConnectorRequest} extends {@link RequestModel}
 *
 * <p>CreateIoTCloudConnectorRequest</p>
 */
public class CreateIoTCloudConnectorRequest extends Request {
    @Query
    @NameInMap("APN")
    private String APN;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("ISP")
    @Validation(required = true)
    private String ISP;

    @Query
    @NameInMap("IoTCloudConnectorDescription")
    private String ioTCloudConnectorDescription;

    @Query
    @NameInMap("IoTCloudConnectorName")
    private String ioTCloudConnectorName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceUid")
    private Long resourceUid;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("WildcardDomainEnabled")
    private Boolean wildcardDomainEnabled;

    private CreateIoTCloudConnectorRequest(Builder builder) {
        super(builder);
        this.APN = builder.APN;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ISP = builder.ISP;
        this.ioTCloudConnectorDescription = builder.ioTCloudConnectorDescription;
        this.ioTCloudConnectorName = builder.ioTCloudConnectorName;
        this.regionId = builder.regionId;
        this.resourceUid = builder.resourceUid;
        this.type = builder.type;
        this.wildcardDomainEnabled = builder.wildcardDomainEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIoTCloudConnectorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return APN
     */
    public String getAPN() {
        return this.APN;
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
     * @return ISP
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * @return ioTCloudConnectorDescription
     */
    public String getIoTCloudConnectorDescription() {
        return this.ioTCloudConnectorDescription;
    }

    /**
     * @return ioTCloudConnectorName
     */
    public String getIoTCloudConnectorName() {
        return this.ioTCloudConnectorName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceUid
     */
    public Long getResourceUid() {
        return this.resourceUid;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return wildcardDomainEnabled
     */
    public Boolean getWildcardDomainEnabled() {
        return this.wildcardDomainEnabled;
    }

    public static final class Builder extends Request.Builder<CreateIoTCloudConnectorRequest, Builder> {
        private String APN; 
        private String clientToken; 
        private Boolean dryRun; 
        private String ISP; 
        private String ioTCloudConnectorDescription; 
        private String ioTCloudConnectorName; 
        private String regionId; 
        private Long resourceUid; 
        private String type; 
        private Boolean wildcardDomainEnabled; 

        private Builder() {
            super();
        } 

        private Builder(CreateIoTCloudConnectorRequest request) {
            super(request);
            this.APN = request.APN;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ISP = request.ISP;
            this.ioTCloudConnectorDescription = request.ioTCloudConnectorDescription;
            this.ioTCloudConnectorName = request.ioTCloudConnectorName;
            this.regionId = request.regionId;
            this.resourceUid = request.resourceUid;
            this.type = request.type;
            this.wildcardDomainEnabled = request.wildcardDomainEnabled;
        } 

        /**
         * APN.
         */
        public Builder APN(String APN) {
            this.putQueryParameter("APN", APN);
            this.APN = APN;
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
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * ISP.
         */
        public Builder ISP(String ISP) {
            this.putQueryParameter("ISP", ISP);
            this.ISP = ISP;
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
         * IoTCloudConnectorName.
         */
        public Builder ioTCloudConnectorName(String ioTCloudConnectorName) {
            this.putQueryParameter("IoTCloudConnectorName", ioTCloudConnectorName);
            this.ioTCloudConnectorName = ioTCloudConnectorName;
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
         * ResourceUid.
         */
        public Builder resourceUid(Long resourceUid) {
            this.putQueryParameter("ResourceUid", resourceUid);
            this.resourceUid = resourceUid;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
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
        public CreateIoTCloudConnectorRequest build() {
            return new CreateIoTCloudConnectorRequest(this);
        } 

    } 

}
