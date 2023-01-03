// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpdsRequest} extends {@link RequestModel}
 *
 * <p>ListVpdsRequest</p>
 */
public class ListVpdsRequest extends Request {
    @Body
    @NameInMap("EnablePage")
    private Boolean enablePage;

    @Body
    @NameInMap("FilterErId")
    private String filterErId;

    @Body
    @NameInMap("ForSelect")
    private Boolean forSelect;

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
    @NameInMap("VpdId")
    private String vpdId;

    @Body
    @NameInMap("WithDependence")
    private Boolean withDependence;

    @Body
    @NameInMap("WithoutVcc")
    private Boolean withoutVcc;

    private ListVpdsRequest(Builder builder) {
        super(builder);
        this.enablePage = builder.enablePage;
        this.filterErId = builder.filterErId;
        this.forSelect = builder.forSelect;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.status = builder.status;
        this.vpdId = builder.vpdId;
        this.withDependence = builder.withDependence;
        this.withoutVcc = builder.withoutVcc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpdsRequest create() {
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
     * @return filterErId
     */
    public String getFilterErId() {
        return this.filterErId;
    }

    /**
     * @return forSelect
     */
    public Boolean getForSelect() {
        return this.forSelect;
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
     * @return vpdId
     */
    public String getVpdId() {
        return this.vpdId;
    }

    /**
     * @return withDependence
     */
    public Boolean getWithDependence() {
        return this.withDependence;
    }

    /**
     * @return withoutVcc
     */
    public Boolean getWithoutVcc() {
        return this.withoutVcc;
    }

    public static final class Builder extends Request.Builder<ListVpdsRequest, Builder> {
        private Boolean enablePage; 
        private String filterErId; 
        private Boolean forSelect; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String status; 
        private String vpdId; 
        private Boolean withDependence; 
        private Boolean withoutVcc; 

        private Builder() {
            super();
        } 

        private Builder(ListVpdsRequest request) {
            super(request);
            this.enablePage = request.enablePage;
            this.filterErId = request.filterErId;
            this.forSelect = request.forSelect;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.status = request.status;
            this.vpdId = request.vpdId;
            this.withDependence = request.withDependence;
            this.withoutVcc = request.withoutVcc;
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
         * 查询没有绑定过的vpd信息
         */
        public Builder filterErId(String filterErId) {
            this.putBodyParameter("FilterErId", filterErId);
            this.filterErId = filterErId;
            return this;
        }

        /**
         * 下拉框使用
         */
        public Builder forSelect(Boolean forSelect) {
            this.putBodyParameter("ForSelect", forSelect);
            this.forSelect = forSelect;
            return this;
        }

        /**
         * vpd名称
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
         * 地域id
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * vpd id
         */
        public Builder vpdId(String vpdId) {
            this.putBodyParameter("VpdId", vpdId);
            this.vpdId = vpdId;
            return this;
        }

        /**
         * 是否带依赖资源信息，建议分页查询的时候不查询依赖信息，删出的时候可以单独查询
         */
        public Builder withDependence(Boolean withDependence) {
            this.putBodyParameter("WithDependence", withDependence);
            this.withDependence = withDependence;
            return this;
        }

        /**
         * 查询没有vcc的vpd信息
         */
        public Builder withoutVcc(Boolean withoutVcc) {
            this.putBodyParameter("WithoutVcc", withoutVcc);
            this.withoutVcc = withoutVcc;
            return this;
        }

        @Override
        public ListVpdsRequest build() {
            return new ListVpdsRequest(this);
        } 

    } 

}
