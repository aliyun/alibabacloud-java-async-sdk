// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSubnetsRequest} extends {@link RequestModel}
 *
 * <p>ListSubnetsRequest</p>
 */
public class ListSubnetsRequest extends Request {
    @Body
    @NameInMap("EnablePage")
    private Boolean enablePage;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Status")
    private String status;

    @Body
    @NameInMap("SubnetId")
    private String subnetId;

    @Body
    @NameInMap("Type")
    private String type;

    @Body
    @NameInMap("VpdId")
    private String vpdId;

    @Body
    @NameInMap("ZoneId")
    private String zoneId;

    private ListSubnetsRequest(Builder builder) {
        super(builder);
        this.enablePage = builder.enablePage;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.status = builder.status;
        this.subnetId = builder.subnetId;
        this.type = builder.type;
        this.vpdId = builder.vpdId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubnetsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enablePage
     */
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subnetId
     */
    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vpdId
     */
    public String getVpdId() {
        return this.vpdId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<ListSubnetsRequest, Builder> {
        private Boolean enablePage; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String status; 
        private String subnetId; 
        private String type; 
        private String vpdId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(ListSubnetsRequest request) {
            super(request);
            this.enablePage = request.enablePage;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.status = request.status;
            this.subnetId = request.subnetId;
            this.type = request.type;
            this.vpdId = request.vpdId;
            this.zoneId = request.zoneId;
        } 

        /**
         * EnablePage.
         */
        public Builder enablePage(Boolean enablePage) {
            this.putBodyParameter("EnablePage", enablePage);
            this.enablePage = enablePage;
            return this;
        }

        /**
         * Subnet名称
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
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
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 状态
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Subnet ID
         */
        public Builder subnetId(String subnetId) {
            this.putBodyParameter("SubnetId", subnetId);
            this.subnetId = subnetId;
            return this;
        }

        /**
         * 类型
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * 所属Vpd ID
         */
        public Builder vpdId(String vpdId) {
            this.putBodyParameter("VpdId", vpdId);
            this.vpdId = vpdId;
            return this;
        }

        /**
         * 可用区
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public ListSubnetsRequest build() {
            return new ListSubnetsRequest(this);
        } 

    } 

}
