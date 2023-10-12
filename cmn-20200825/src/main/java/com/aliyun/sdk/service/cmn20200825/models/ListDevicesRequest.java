// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDevicesRequest} extends {@link RequestModel}
 *
 * <p>ListDevicesRequest</p>
 */
public class ListDevicesRequest extends Request {
    @Query
    @NameInMap("CalculateAmount")
    private Boolean calculateAmount;

    @Query
    @NameInMap("DeviceFormId")
    private String deviceFormId;

    @Query
    @NameInMap("DeviceFormName")
    private String deviceFormName;

    @Query
    @NameInMap("DeviceIds")
    private java.util.List < String > deviceIds;

    @Query
    @NameInMap("ExtAttributes")
    private String extAttributes;

    @Query
    @NameInMap("HostName")
    private java.util.List < String > hostName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Ip")
    private java.util.List < String > ip;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("Mac")
    private java.util.List < String > mac;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100000)
    private Integer maxResults;

    @Query
    @NameInMap("Model")
    private java.util.List < String > model;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PhysicalSpaceId")
    private String physicalSpaceId;

    @Query
    @NameInMap("PhysicalSpaceIds")
    private java.util.List < String > physicalSpaceIds;

    @Query
    @NameInMap("SecurityDomain")
    private java.util.List < String > securityDomain;

    @Query
    @NameInMap("ServiceStatus")
    private java.util.List < String > serviceStatus;

    @Query
    @NameInMap("Sn")
    private java.util.List < String > sn;

    @Query
    @NameInMap("Vendor")
    private java.util.List < String > vendor;

    private ListDevicesRequest(Builder builder) {
        super(builder);
        this.calculateAmount = builder.calculateAmount;
        this.deviceFormId = builder.deviceFormId;
        this.deviceFormName = builder.deviceFormName;
        this.deviceIds = builder.deviceIds;
        this.extAttributes = builder.extAttributes;
        this.hostName = builder.hostName;
        this.instanceId = builder.instanceId;
        this.ip = builder.ip;
        this.keyword = builder.keyword;
        this.mac = builder.mac;
        this.maxResults = builder.maxResults;
        this.model = builder.model;
        this.nextToken = builder.nextToken;
        this.physicalSpaceId = builder.physicalSpaceId;
        this.physicalSpaceIds = builder.physicalSpaceIds;
        this.securityDomain = builder.securityDomain;
        this.serviceStatus = builder.serviceStatus;
        this.sn = builder.sn;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calculateAmount
     */
    public Boolean getCalculateAmount() {
        return this.calculateAmount;
    }

    /**
     * @return deviceFormId
     */
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

    /**
     * @return deviceFormName
     */
    public String getDeviceFormName() {
        return this.deviceFormName;
    }

    /**
     * @return deviceIds
     */
    public java.util.List < String > getDeviceIds() {
        return this.deviceIds;
    }

    /**
     * @return extAttributes
     */
    public String getExtAttributes() {
        return this.extAttributes;
    }

    /**
     * @return hostName
     */
    public java.util.List < String > getHostName() {
        return this.hostName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ip
     */
    public java.util.List < String > getIp() {
        return this.ip;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return mac
     */
    public java.util.List < String > getMac() {
        return this.mac;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return model
     */
    public java.util.List < String > getModel() {
        return this.model;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return physicalSpaceId
     */
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    /**
     * @return physicalSpaceIds
     */
    public java.util.List < String > getPhysicalSpaceIds() {
        return this.physicalSpaceIds;
    }

    /**
     * @return securityDomain
     */
    public java.util.List < String > getSecurityDomain() {
        return this.securityDomain;
    }

    /**
     * @return serviceStatus
     */
    public java.util.List < String > getServiceStatus() {
        return this.serviceStatus;
    }

    /**
     * @return sn
     */
    public java.util.List < String > getSn() {
        return this.sn;
    }

    /**
     * @return vendor
     */
    public java.util.List < String > getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<ListDevicesRequest, Builder> {
        private Boolean calculateAmount; 
        private String deviceFormId; 
        private String deviceFormName; 
        private java.util.List < String > deviceIds; 
        private String extAttributes; 
        private java.util.List < String > hostName; 
        private String instanceId; 
        private java.util.List < String > ip; 
        private String keyword; 
        private java.util.List < String > mac; 
        private Integer maxResults; 
        private java.util.List < String > model; 
        private String nextToken; 
        private String physicalSpaceId; 
        private java.util.List < String > physicalSpaceIds; 
        private java.util.List < String > securityDomain; 
        private java.util.List < String > serviceStatus; 
        private java.util.List < String > sn; 
        private java.util.List < String > vendor; 

        private Builder() {
            super();
        } 

        private Builder(ListDevicesRequest request) {
            super(request);
            this.calculateAmount = request.calculateAmount;
            this.deviceFormId = request.deviceFormId;
            this.deviceFormName = request.deviceFormName;
            this.deviceIds = request.deviceIds;
            this.extAttributes = request.extAttributes;
            this.hostName = request.hostName;
            this.instanceId = request.instanceId;
            this.ip = request.ip;
            this.keyword = request.keyword;
            this.mac = request.mac;
            this.maxResults = request.maxResults;
            this.model = request.model;
            this.nextToken = request.nextToken;
            this.physicalSpaceId = request.physicalSpaceId;
            this.physicalSpaceIds = request.physicalSpaceIds;
            this.securityDomain = request.securityDomain;
            this.serviceStatus = request.serviceStatus;
            this.sn = request.sn;
            this.vendor = request.vendor;
        } 

        /**
         * CalculateAmount.
         */
        public Builder calculateAmount(Boolean calculateAmount) {
            this.putQueryParameter("CalculateAmount", calculateAmount);
            this.calculateAmount = calculateAmount;
            return this;
        }

        /**
         * DeviceFormId.
         */
        public Builder deviceFormId(String deviceFormId) {
            this.putQueryParameter("DeviceFormId", deviceFormId);
            this.deviceFormId = deviceFormId;
            return this;
        }

        /**
         * DeviceFormName.
         */
        public Builder deviceFormName(String deviceFormName) {
            this.putQueryParameter("DeviceFormName", deviceFormName);
            this.deviceFormName = deviceFormName;
            return this;
        }

        /**
         * DeviceIds.
         */
        public Builder deviceIds(java.util.List < String > deviceIds) {
            String deviceIdsShrink = shrink(deviceIds, "DeviceIds", "json");
            this.putQueryParameter("DeviceIds", deviceIdsShrink);
            this.deviceIds = deviceIds;
            return this;
        }

        /**
         * ExtAttributes.
         */
        public Builder extAttributes(String extAttributes) {
            this.putQueryParameter("ExtAttributes", extAttributes);
            this.extAttributes = extAttributes;
            return this;
        }

        /**
         * HostName.
         */
        public Builder hostName(java.util.List < String > hostName) {
            String hostNameShrink = shrink(hostName, "HostName", "json");
            this.putQueryParameter("HostName", hostNameShrink);
            this.hostName = hostName;
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
         * Ip.
         */
        public Builder ip(java.util.List < String > ip) {
            String ipShrink = shrink(ip, "Ip", "json");
            this.putQueryParameter("Ip", ipShrink);
            this.ip = ip;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * Mac.
         */
        public Builder mac(java.util.List < String > mac) {
            String macShrink = shrink(mac, "Mac", "json");
            this.putQueryParameter("Mac", macShrink);
            this.mac = mac;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(java.util.List < String > model) {
            String modelShrink = shrink(model, "Model", "json");
            this.putQueryParameter("Model", modelShrink);
            this.model = model;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PhysicalSpaceId.
         */
        public Builder physicalSpaceId(String physicalSpaceId) {
            this.putQueryParameter("PhysicalSpaceId", physicalSpaceId);
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }

        /**
         * PhysicalSpaceIds.
         */
        public Builder physicalSpaceIds(java.util.List < String > physicalSpaceIds) {
            String physicalSpaceIdsShrink = shrink(physicalSpaceIds, "PhysicalSpaceIds", "json");
            this.putQueryParameter("PhysicalSpaceIds", physicalSpaceIdsShrink);
            this.physicalSpaceIds = physicalSpaceIds;
            return this;
        }

        /**
         * SecurityDomain.
         */
        public Builder securityDomain(java.util.List < String > securityDomain) {
            String securityDomainShrink = shrink(securityDomain, "SecurityDomain", "json");
            this.putQueryParameter("SecurityDomain", securityDomainShrink);
            this.securityDomain = securityDomain;
            return this;
        }

        /**
         * ServiceStatus.
         */
        public Builder serviceStatus(java.util.List < String > serviceStatus) {
            String serviceStatusShrink = shrink(serviceStatus, "ServiceStatus", "json");
            this.putQueryParameter("ServiceStatus", serviceStatusShrink);
            this.serviceStatus = serviceStatus;
            return this;
        }

        /**
         * Sn.
         */
        public Builder sn(java.util.List < String > sn) {
            String snShrink = shrink(sn, "Sn", "json");
            this.putQueryParameter("Sn", snShrink);
            this.sn = sn;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(java.util.List < String > vendor) {
            String vendorShrink = shrink(vendor, "Vendor", "json");
            this.putQueryParameter("Vendor", vendorShrink);
            this.vendor = vendor;
            return this;
        }

        @Override
        public ListDevicesRequest build() {
            return new ListDevicesRequest(this);
        } 

    } 

}
