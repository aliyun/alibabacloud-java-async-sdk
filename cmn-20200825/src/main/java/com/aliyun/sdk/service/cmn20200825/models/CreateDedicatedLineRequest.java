// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDedicatedLineRequest} extends {@link RequestModel}
 *
 * <p>CreateDedicatedLineRequest</p>
 */
public class CreateDedicatedLineRequest extends Request {
    @Body
    @NameInMap("Bandwidth")
    @Validation(required = true, maximum = 3000000, minimum = 1)
    private Integer bandwidth;

    @Body
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Body
    @NameInMap("Contact")
    private String contact;

    @Body
    @NameInMap("DedicatedLineGateway")
    private String dedicatedLineGateway;

    @Body
    @NameInMap("DedicatedLineIp")
    private String dedicatedLineIp;

    @Body
    @NameInMap("DedicatedLineRole")
    @Validation(required = true)
    private String dedicatedLineRole;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("DeviceId")
    private String deviceId;

    @Body
    @NameInMap("DevicePort")
    private String devicePort;

    @Body
    @NameInMap("ExpirationDate")
    private String expirationDate;

    @Body
    @NameInMap("ExtAttributes")
    private String extAttributes;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Isp")
    private String isp;

    @Body
    @NameInMap("IspFormId")
    private String ispFormId;

    @Body
    @NameInMap("IspId")
    private String ispId;

    @Body
    @NameInMap("Keyword")
    private String keyword;

    @Body
    @NameInMap("OnlineDate")
    private String onlineDate;

    @Body
    @NameInMap("Phone")
    private String phone;

    @Body
    @NameInMap("PhysicalSpaceId")
    @Validation(required = true)
    private String physicalSpaceId;

    private CreateDedicatedLineRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.clientToken = builder.clientToken;
        this.contact = builder.contact;
        this.dedicatedLineGateway = builder.dedicatedLineGateway;
        this.dedicatedLineIp = builder.dedicatedLineIp;
        this.dedicatedLineRole = builder.dedicatedLineRole;
        this.description = builder.description;
        this.deviceId = builder.deviceId;
        this.devicePort = builder.devicePort;
        this.expirationDate = builder.expirationDate;
        this.extAttributes = builder.extAttributes;
        this.instanceId = builder.instanceId;
        this.isp = builder.isp;
        this.ispFormId = builder.ispFormId;
        this.ispId = builder.ispId;
        this.keyword = builder.keyword;
        this.onlineDate = builder.onlineDate;
        this.phone = builder.phone;
        this.physicalSpaceId = builder.physicalSpaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDedicatedLineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return contact
     */
    public String getContact() {
        return this.contact;
    }

    /**
     * @return dedicatedLineGateway
     */
    public String getDedicatedLineGateway() {
        return this.dedicatedLineGateway;
    }

    /**
     * @return dedicatedLineIp
     */
    public String getDedicatedLineIp() {
        return this.dedicatedLineIp;
    }

    /**
     * @return dedicatedLineRole
     */
    public String getDedicatedLineRole() {
        return this.dedicatedLineRole;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return devicePort
     */
    public String getDevicePort() {
        return this.devicePort;
    }

    /**
     * @return expirationDate
     */
    public String getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * @return extAttributes
     */
    public String getExtAttributes() {
        return this.extAttributes;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return ispFormId
     */
    public String getIspFormId() {
        return this.ispFormId;
    }

    /**
     * @return ispId
     */
    public String getIspId() {
        return this.ispId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return onlineDate
     */
    public String getOnlineDate() {
        return this.onlineDate;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return physicalSpaceId
     */
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    public static final class Builder extends Request.Builder<CreateDedicatedLineRequest, Builder> {
        private Integer bandwidth; 
        private String clientToken; 
        private String contact; 
        private String dedicatedLineGateway; 
        private String dedicatedLineIp; 
        private String dedicatedLineRole; 
        private String description; 
        private String deviceId; 
        private String devicePort; 
        private String expirationDate; 
        private String extAttributes; 
        private String instanceId; 
        private String isp; 
        private String ispFormId; 
        private String ispId; 
        private String keyword; 
        private String onlineDate; 
        private String phone; 
        private String physicalSpaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDedicatedLineRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.clientToken = request.clientToken;
            this.contact = request.contact;
            this.dedicatedLineGateway = request.dedicatedLineGateway;
            this.dedicatedLineIp = request.dedicatedLineIp;
            this.dedicatedLineRole = request.dedicatedLineRole;
            this.description = request.description;
            this.deviceId = request.deviceId;
            this.devicePort = request.devicePort;
            this.expirationDate = request.expirationDate;
            this.extAttributes = request.extAttributes;
            this.instanceId = request.instanceId;
            this.isp = request.isp;
            this.ispFormId = request.ispFormId;
            this.ispId = request.ispId;
            this.keyword = request.keyword;
            this.onlineDate = request.onlineDate;
            this.phone = request.phone;
            this.physicalSpaceId = request.physicalSpaceId;
        } 

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putBodyParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Contact.
         */
        public Builder contact(String contact) {
            this.putBodyParameter("Contact", contact);
            this.contact = contact;
            return this;
        }

        /**
         * DedicatedLineGateway.
         */
        public Builder dedicatedLineGateway(String dedicatedLineGateway) {
            this.putBodyParameter("DedicatedLineGateway", dedicatedLineGateway);
            this.dedicatedLineGateway = dedicatedLineGateway;
            return this;
        }

        /**
         * DedicatedLineIp.
         */
        public Builder dedicatedLineIp(String dedicatedLineIp) {
            this.putBodyParameter("DedicatedLineIp", dedicatedLineIp);
            this.dedicatedLineIp = dedicatedLineIp;
            return this;
        }

        /**
         * DedicatedLineRole.
         */
        public Builder dedicatedLineRole(String dedicatedLineRole) {
            this.putBodyParameter("DedicatedLineRole", dedicatedLineRole);
            this.dedicatedLineRole = dedicatedLineRole;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putBodyParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * DevicePort.
         */
        public Builder devicePort(String devicePort) {
            this.putBodyParameter("DevicePort", devicePort);
            this.devicePort = devicePort;
            return this;
        }

        /**
         * ExpirationDate.
         */
        public Builder expirationDate(String expirationDate) {
            this.putBodyParameter("ExpirationDate", expirationDate);
            this.expirationDate = expirationDate;
            return this;
        }

        /**
         * ExtAttributes.
         */
        public Builder extAttributes(String extAttributes) {
            this.putBodyParameter("ExtAttributes", extAttributes);
            this.extAttributes = extAttributes;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Isp.
         */
        public Builder isp(String isp) {
            this.putBodyParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * IspFormId.
         */
        public Builder ispFormId(String ispFormId) {
            this.putBodyParameter("IspFormId", ispFormId);
            this.ispFormId = ispFormId;
            return this;
        }

        /**
         * IspId.
         */
        public Builder ispId(String ispId) {
            this.putBodyParameter("IspId", ispId);
            this.ispId = ispId;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * OnlineDate.
         */
        public Builder onlineDate(String onlineDate) {
            this.putBodyParameter("OnlineDate", onlineDate);
            this.onlineDate = onlineDate;
            return this;
        }

        /**
         * Phone.
         */
        public Builder phone(String phone) {
            this.putBodyParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * PhysicalSpaceId.
         */
        public Builder physicalSpaceId(String physicalSpaceId) {
            this.putBodyParameter("PhysicalSpaceId", physicalSpaceId);
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }

        @Override
        public CreateDedicatedLineRequest build() {
            return new CreateDedicatedLineRequest(this);
        } 

    } 

}
