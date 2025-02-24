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
 * {@link ListAppInstanceGroupRequest} extends {@link RequestModel}
 *
 * <p>ListAppInstanceGroupRequest</p>
 */
public class ListAppInstanceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCenterImageId")
    private String appCenterImageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
    private String appInstanceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupName")
    private String appInstanceGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeInstanceType")
    private String nodeInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @Deprecated
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private java.util.List<String> status;

    private ListAppInstanceGroupRequest(Builder builder) {
        super(builder);
        this.appCenterImageId = builder.appCenterImageId;
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceGroupName = builder.appInstanceGroupName;
        this.bizRegionId = builder.bizRegionId;
        this.nodeInstanceType = builder.nodeInstanceType;
        this.officeSiteId = builder.officeSiteId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productType = builder.productType;
        this.regionId = builder.regionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppInstanceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCenterImageId
     */
    public String getAppCenterImageId() {
        return this.appCenterImageId;
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return appInstanceGroupName
     */
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return nodeInstanceType
     */
    public String getNodeInstanceType() {
        return this.nodeInstanceType;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListAppInstanceGroupRequest, Builder> {
        private String appCenterImageId; 
        private String appInstanceGroupId; 
        private String appInstanceGroupName; 
        private String bizRegionId; 
        private String nodeInstanceType; 
        private String officeSiteId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productType; 
        private String regionId; 
        private java.util.List<String> status; 

        private Builder() {
            super();
        } 

        private Builder(ListAppInstanceGroupRequest request) {
            super(request);
            this.appCenterImageId = request.appCenterImageId;
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.appInstanceGroupName = request.appInstanceGroupName;
            this.bizRegionId = request.bizRegionId;
            this.nodeInstanceType = request.nodeInstanceType;
            this.officeSiteId = request.officeSiteId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
            this.regionId = request.regionId;
            this.status = request.status;
        } 

        /**
         * AppCenterImageId.
         */
        public Builder appCenterImageId(String appCenterImageId) {
            this.putQueryParameter("AppCenterImageId", appCenterImageId);
            this.appCenterImageId = appCenterImageId;
            return this;
        }

        /**
         * AppInstanceGroupId.
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putQueryParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * AppInstanceGroupName.
         */
        public Builder appInstanceGroupName(String appInstanceGroupName) {
            this.putQueryParameter("AppInstanceGroupName", appInstanceGroupName);
            this.appInstanceGroupName = appInstanceGroupName;
            return this;
        }

        /**
         * <p>The ID of the region where the delivery group resides. For information about the supported regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Limits</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>cn-shanghai: China (Shanghai)</li>
         * <li>cn-hangzhou: China (Hangzhou)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The ID of the resource specification that you purchase. You can call the <a href="~~ListNodeInstanceType~~">ListNodeInstanceType</a> operation to obtain the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>appstreaming.vgpu.4c8g.2g</p>
         */
        public Builder nodeInstanceType(String nodeInstanceType) {
            this.putQueryParameter("NodeInstanceType", nodeInstanceType);
            this.nodeInstanceType = nodeInstanceType;
            return this;
        }

        /**
         * OfficeSiteId.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(java.util.List<String> status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListAppInstanceGroupRequest build() {
            return new ListAppInstanceGroupRequest(this);
        } 

    } 

}
