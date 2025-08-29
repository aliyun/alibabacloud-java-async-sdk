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
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

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
    @com.aliyun.core.annotation.NameInMap("ServerInstanceType")
    private String serverInstanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VirtualNodePoolId")
    private String virtualNodePoolId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WuyingServerIdList")
    private java.util.List<String> wuyingServerIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WuyingServerNameOrId")
    private String wuyingServerNameOrId;

    private ListWuyingServerRequest(Builder builder) {
        super(builder);
        this.addVirtualNodePoolStatusList = builder.addVirtualNodePoolStatusList;
        this.bizRegionId = builder.bizRegionId;
        this.chargeType = builder.chargeType;
        this.imageId = builder.imageId;
        this.officeSiteId = builder.officeSiteId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.serverInstanceType = builder.serverInstanceType;
        this.status = builder.status;
        this.virtualNodePoolId = builder.virtualNodePoolId;
        this.wuyingServerIdList = builder.wuyingServerIdList;
        this.wuyingServerNameOrId = builder.wuyingServerNameOrId;
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
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
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

    public static final class Builder extends Request.Builder<ListWuyingServerRequest, Builder> {
        private java.util.List<String> addVirtualNodePoolStatusList; 
        private String bizRegionId; 
        private String chargeType; 
        private String imageId; 
        private String officeSiteId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String serverInstanceType; 
        private String status; 
        private String virtualNodePoolId; 
        private java.util.List<String> wuyingServerIdList; 
        private String wuyingServerNameOrId; 

        private Builder() {
            super();
        } 

        private Builder(ListWuyingServerRequest request) {
            super(request);
            this.addVirtualNodePoolStatusList = request.addVirtualNodePoolStatusList;
            this.bizRegionId = request.bizRegionId;
            this.chargeType = request.chargeType;
            this.imageId = request.imageId;
            this.officeSiteId = request.officeSiteId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.serverInstanceType = request.serverInstanceType;
            this.status = request.status;
            this.virtualNodePoolId = request.virtualNodePoolId;
            this.wuyingServerIdList = request.wuyingServerIdList;
            this.wuyingServerNameOrId = request.wuyingServerNameOrId;
        } 

        /**
         * AddVirtualNodePoolStatusList.
         */
        public Builder addVirtualNodePoolStatusList(java.util.List<String> addVirtualNodePoolStatusList) {
            this.putBodyParameter("AddVirtualNodePoolStatusList", addVirtualNodePoolStatusList);
            this.addVirtualNodePoolStatusList = addVirtualNodePoolStatusList;
            return this;
        }

        /**
         * BizRegionId.
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putBodyParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * OfficeSiteId.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putBodyParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ServerInstanceType.
         */
        public Builder serverInstanceType(String serverInstanceType) {
            this.putBodyParameter("ServerInstanceType", serverInstanceType);
            this.serverInstanceType = serverInstanceType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * VirtualNodePoolId.
         */
        public Builder virtualNodePoolId(String virtualNodePoolId) {
            this.putBodyParameter("VirtualNodePoolId", virtualNodePoolId);
            this.virtualNodePoolId = virtualNodePoolId;
            return this;
        }

        /**
         * WuyingServerIdList.
         */
        public Builder wuyingServerIdList(java.util.List<String> wuyingServerIdList) {
            this.putBodyParameter("WuyingServerIdList", wuyingServerIdList);
            this.wuyingServerIdList = wuyingServerIdList;
            return this;
        }

        /**
         * WuyingServerNameOrId.
         */
        public Builder wuyingServerNameOrId(String wuyingServerNameOrId) {
            this.putBodyParameter("WuyingServerNameOrId", wuyingServerNameOrId);
            this.wuyingServerNameOrId = wuyingServerNameOrId;
            return this;
        }

        @Override
        public ListWuyingServerRequest build() {
            return new ListWuyingServerRequest(this);
        } 

    } 

}
