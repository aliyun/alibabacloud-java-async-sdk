// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppInstanceGroupRequest} extends {@link RequestModel}
 *
 * <p>ListAppInstanceGroupRequest</p>
 */
public class ListAppInstanceGroupRequest extends Request {
    @Query
    @NameInMap("AppCenterImageId")
    private String appCenterImageId;

    @Query
    @NameInMap("AppInstanceGroupId")
    private String appInstanceGroupId;

    @Query
    @NameInMap("AppInstanceGroupName")
    private String appInstanceGroupName;

    @Query
    @NameInMap("BizRegionId")
    private String bizRegionId;

    @Query
    @NameInMap("NodeInstanceType")
    private String nodeInstanceType;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ProductType")
    @Validation(required = true)
    private String productType;

    @Body
    @NameInMap("Status")
    private java.util.List < String > status;

    private ListAppInstanceGroupRequest(Builder builder) {
        super(builder);
        this.appCenterImageId = builder.appCenterImageId;
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceGroupName = builder.appInstanceGroupName;
        this.bizRegionId = builder.bizRegionId;
        this.nodeInstanceType = builder.nodeInstanceType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productType = builder.productType;
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
     * @return status
     */
    public java.util.List < String > getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListAppInstanceGroupRequest, Builder> {
        private String appCenterImageId; 
        private String appInstanceGroupId; 
        private String appInstanceGroupName; 
        private String bizRegionId; 
        private String nodeInstanceType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productType; 
        private java.util.List < String > status; 

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
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
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
         * BizRegionId.
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * NodeInstanceType.
         */
        public Builder nodeInstanceType(String nodeInstanceType) {
            this.putQueryParameter("NodeInstanceType", nodeInstanceType);
            this.nodeInstanceType = nodeInstanceType;
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
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(java.util.List < String > status) {
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
