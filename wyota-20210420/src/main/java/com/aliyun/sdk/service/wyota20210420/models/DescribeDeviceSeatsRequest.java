// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDeviceSeatsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDeviceSeatsRequest</p>
 */
public class DescribeDeviceSeatsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNo")
    private String serialNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNoList")
    private java.util.List < String > serialNoList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private String siteId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    private DescribeDeviceSeatsRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.serialNo = builder.serialNo;
        this.serialNoList = builder.serialNoList;
        this.siteId = builder.siteId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceSeatsRequest create() {
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
     * @return serialNo
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    /**
     * @return serialNoList
     */
    public java.util.List < String > getSerialNoList() {
        return this.serialNoList;
    }

    /**
     * @return siteId
     */
    public String getSiteId() {
        return this.siteId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<DescribeDeviceSeatsRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String serialNo; 
        private java.util.List < String > serialNoList; 
        private String siteId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDeviceSeatsRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.serialNo = request.serialNo;
            this.serialNoList = request.serialNoList;
            this.siteId = request.siteId;
            this.tenantId = request.tenantId;
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
         * SerialNo.
         */
        public Builder serialNo(String serialNo) {
            this.putBodyParameter("SerialNo", serialNo);
            this.serialNo = serialNo;
            return this;
        }

        /**
         * SerialNoList.
         */
        public Builder serialNoList(java.util.List < String > serialNoList) {
            this.putBodyParameter("SerialNoList", serialNoList);
            this.serialNoList = serialNoList;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(String siteId) {
            this.putBodyParameter("SiteId", siteId);
            this.siteId = siteId;
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

        @Override
        public DescribeDeviceSeatsRequest build() {
            return new DescribeDeviceSeatsRequest(this);
        } 

    } 

}
