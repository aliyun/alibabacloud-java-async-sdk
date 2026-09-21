// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListWuyingServerRequest} extends {@link RequestModel}
 *
 * <p>ListWuyingServerRequest</p>
 */
public class ListWuyingServerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AddVirtualNodePoolStatusList")
    private java.util.List<String> addVirtualNodePoolStatusList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizType")
    private Integer bizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateTimeEnd")
    private String createTimeEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateTimeStart")
    private String createTimeStart;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExpiredTimeEnd")
    private String expiredTimeEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExpiredTimeStart")
    private String expiredTimeStart;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceIp")
    private String networkInterfaceIp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServerInstanceType")
    private String serverInstanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List<String> users;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VirtualNodePoolId")
    private String virtualNodePoolId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WuyingServerIdList")
    private java.util.List<String> wuyingServerIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WuyingServerNameOrId")
    private String wuyingServerNameOrId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private ListWuyingServerRequest(Builder builder) {
        super(builder);
        this.addVirtualNodePoolStatusList = builder.addVirtualNodePoolStatusList;
        this.bizRegionId = builder.bizRegionId;
        this.bizType = builder.bizType;
        this.chargeType = builder.chargeType;
        this.createTimeEnd = builder.createTimeEnd;
        this.createTimeStart = builder.createTimeStart;
        this.expiredTimeEnd = builder.expiredTimeEnd;
        this.expiredTimeStart = builder.expiredTimeStart;
        this.imageId = builder.imageId;
        this.networkInterfaceIp = builder.networkInterfaceIp;
        this.officeSiteId = builder.officeSiteId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productType = builder.productType;
        this.serverInstanceType = builder.serverInstanceType;
        this.status = builder.status;
        this.users = builder.users;
        this.virtualNodePoolId = builder.virtualNodePoolId;
        this.wuyingServerIdList = builder.wuyingServerIdList;
        this.wuyingServerNameOrId = builder.wuyingServerNameOrId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWuyingServerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addVirtualNodePoolStatusList
     */
    public java.util.List<String> getAddVirtualNodePoolStatusList() {
        return this.addVirtualNodePoolStatusList;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return createTimeEnd
     */
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    /**
     * @return createTimeStart
     */
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    /**
     * @return expiredTimeEnd
     */
    public String getExpiredTimeEnd() {
        return this.expiredTimeEnd;
    }

    /**
     * @return expiredTimeStart
     */
    public String getExpiredTimeStart() {
        return this.expiredTimeStart;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return networkInterfaceIp
     */
    public String getNetworkInterfaceIp() {
        return this.networkInterfaceIp;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return serverInstanceType
     */
    public String getServerInstanceType() {
        return this.serverInstanceType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return users
     */
    public java.util.List<String> getUsers() {
        return this.users;
    }

    /**
     * @return virtualNodePoolId
     */
    public String getVirtualNodePoolId() {
        return this.virtualNodePoolId;
    }

    /**
     * @return wuyingServerIdList
     */
    public java.util.List<String> getWuyingServerIdList() {
        return this.wuyingServerIdList;
    }

    /**
     * @return wuyingServerNameOrId
     */
    public String getWuyingServerNameOrId() {
        return this.wuyingServerNameOrId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<ListWuyingServerRequest, Builder> {
        private java.util.List<String> addVirtualNodePoolStatusList; 
        private String bizRegionId; 
        private Integer bizType; 
        private String chargeType; 
        private String createTimeEnd; 
        private String createTimeStart; 
        private String expiredTimeEnd; 
        private String expiredTimeStart; 
        private String imageId; 
        private String networkInterfaceIp; 
        private String officeSiteId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productType; 
        private String serverInstanceType; 
        private String status; 
        private java.util.List<String> users; 
        private String virtualNodePoolId; 
        private java.util.List<String> wuyingServerIdList; 
        private String wuyingServerNameOrId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(ListWuyingServerRequest request) {
            super(request);
            this.addVirtualNodePoolStatusList = request.addVirtualNodePoolStatusList;
            this.bizRegionId = request.bizRegionId;
            this.bizType = request.bizType;
            this.chargeType = request.chargeType;
            this.createTimeEnd = request.createTimeEnd;
            this.createTimeStart = request.createTimeStart;
            this.expiredTimeEnd = request.expiredTimeEnd;
            this.expiredTimeStart = request.expiredTimeStart;
            this.imageId = request.imageId;
            this.networkInterfaceIp = request.networkInterfaceIp;
            this.officeSiteId = request.officeSiteId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
            this.serverInstanceType = request.serverInstanceType;
            this.status = request.status;
            this.users = request.users;
            this.virtualNodePoolId = request.virtualNodePoolId;
            this.wuyingServerIdList = request.wuyingServerIdList;
            this.wuyingServerNameOrId = request.wuyingServerNameOrId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The list of statuses for joining a virtual node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder addVirtualNodePoolStatusList(java.util.List<String> addVirtualNodePoolStatusList) {
            this.putBodyParameter("AddVirtualNodePoolStatusList", addVirtualNodePoolStatusList);
            this.addVirtualNodePoolStatusList = addVirtualNodePoolStatusList;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putBodyParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The business type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizType(Integer bizType) {
            this.putBodyParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The billing type.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The end time of the creation time range, in ISO 8601 format. This time point is exclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-01T00:00:00Z</p>
         */
        public Builder createTimeEnd(String createTimeEnd) {
            this.putBodyParameter("CreateTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * <p>The start time of the creation time range, in ISO 8601 format. This time point is inclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-01T00:00:00Z</p>
         */
        public Builder createTimeStart(String createTimeStart) {
            this.putBodyParameter("CreateTimeStart", createTimeStart);
            this.createTimeStart = createTimeStart;
            return this;
        }

        /**
         * <p>The end time of the expiration time range, in ISO 8601 format. This time point is exclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-01T00:00:00Z</p>
         */
        public Builder expiredTimeEnd(String expiredTimeEnd) {
            this.putBodyParameter("ExpiredTimeEnd", expiredTimeEnd);
            this.expiredTimeEnd = expiredTimeEnd;
            return this;
        }

        /**
         * <p>The start time of the expiration time range, in ISO 8601 format. This time point is inclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-01T00:00:00Z</p>
         */
        public Builder expiredTimeStart(String expiredTimeStart) {
            this.putBodyParameter("ExpiredTimeStart", expiredTimeStart);
            this.expiredTimeStart = expiredTimeStart;
            return this;
        }

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>img-bp13mu****</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The internal IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.31.1.1</p>
         */
        public Builder networkInterfaceIp(String networkInterfaceIp) {
            this.putBodyParameter("NetworkInterfaceIp", networkInterfaceIp);
            this.networkInterfaceIp = networkInterfaceIp;
            return this;
        }

        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-172301****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putBodyParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The product type.</p>
         * 
         * <strong>example:</strong>
         * <p>wuying_server</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The workstation instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>eds.proworkstation_flagship_elite.32c64g.48g1x</p>
         */
        public Builder serverInstanceType(String serverInstanceType) {
            this.putBodyParameter("ServerInstanceType", serverInstanceType);
            this.serverInstanceType = serverInstanceType;
            return this;
        }

        /**
         * <p>The workstation status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The list of authorized users.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        public Builder users(java.util.List<String> users) {
            this.putBodyParameter("Users", users);
            this.users = users;
            return this;
        }

        /**
         * <p>The virtual node pool ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vnp-bp1234567890abcde</p>
         */
        public Builder virtualNodePoolId(String virtualNodePoolId) {
            this.putBodyParameter("VirtualNodePoolId", virtualNodePoolId);
            this.virtualNodePoolId = virtualNodePoolId;
            return this;
        }

        /**
         * <p>The list of workstation IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder wuyingServerIdList(java.util.List<String> wuyingServerIdList) {
            this.putBodyParameter("WuyingServerIdList", wuyingServerIdList);
            this.wuyingServerIdList = wuyingServerIdList;
            return this;
        }

        /**
         * <p>The workstation name or workstation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleServerName</p>
         */
        public Builder wuyingServerNameOrId(String wuyingServerNameOrId) {
            this.putBodyParameter("WuyingServerNameOrId", wuyingServerNameOrId);
            this.wuyingServerNameOrId = wuyingServerNameOrId;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public ListWuyingServerRequest build() {
            return new ListWuyingServerRequest(this);
        } 

    } 

}
