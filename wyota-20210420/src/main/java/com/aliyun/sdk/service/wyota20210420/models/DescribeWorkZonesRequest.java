// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWorkZonesRequest} extends {@link RequestModel}
 *
 * <p>DescribeWorkZonesRequest</p>
 */
public class DescribeWorkZonesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneIdList")
    private java.util.List < String > zoneIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneNameList")
    private java.util.List < String > zoneNameList;

    private DescribeWorkZonesRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.tenantId = builder.tenantId;
        this.zoneIdList = builder.zoneIdList;
        this.zoneNameList = builder.zoneNameList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWorkZonesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return zoneIdList
     */
    public java.util.List < String > getZoneIdList() {
        return this.zoneIdList;
    }

    /**
     * @return zoneNameList
     */
    public java.util.List < String > getZoneNameList() {
        return this.zoneNameList;
    }

    public static final class Builder extends Request.Builder<DescribeWorkZonesRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String tenantId; 
        private java.util.List < String > zoneIdList; 
        private java.util.List < String > zoneNameList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWorkZonesRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.tenantId = request.tenantId;
            this.zoneIdList = request.zoneIdList;
            this.zoneNameList = request.zoneNameList;
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
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * ZoneIdList.
         */
        public Builder zoneIdList(java.util.List < String > zoneIdList) {
            this.putBodyParameter("ZoneIdList", zoneIdList);
            this.zoneIdList = zoneIdList;
            return this;
        }

        /**
         * ZoneNameList.
         */
        public Builder zoneNameList(java.util.List < String > zoneNameList) {
            this.putBodyParameter("ZoneNameList", zoneNameList);
            this.zoneNameList = zoneNameList;
            return this;
        }

        @Override
        public DescribeWorkZonesRequest build() {
            return new DescribeWorkZonesRequest(this);
        } 

    } 

}
