// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpcsRequest} extends {@link RequestModel}
 *
 * <p>DescribeIpcsRequest</p>
 */
public class DescribeIpcsRequest extends Request {
    @Body
    @NameInMap("CorpIdList")
    private String corpIdList;

    @Body
    @NameInMap("DeviceFilter")
    private String deviceFilter;

    @Body
    @NameInMap("DeviceIdList")
    private String deviceIdList;

    @Body
    @NameInMap("DeviceStatus")
    private String deviceStatus;

    @Body
    @NameInMap("NvrIdList")
    private String nvrIdList;

    @Body
    @NameInMap("PageNum")
    @Validation(required = true)
    private Long pageNum;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Long pageSize;

    @Body
    @NameInMap("ParentDeviceType")
    private String parentDeviceType;

    private DescribeIpcsRequest(Builder builder) {
        super(builder);
        this.corpIdList = builder.corpIdList;
        this.deviceFilter = builder.deviceFilter;
        this.deviceIdList = builder.deviceIdList;
        this.deviceStatus = builder.deviceStatus;
        this.nvrIdList = builder.nvrIdList;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.parentDeviceType = builder.parentDeviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpcsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpIdList
     */
    public String getCorpIdList() {
        return this.corpIdList;
    }

    /**
     * @return deviceFilter
     */
    public String getDeviceFilter() {
        return this.deviceFilter;
    }

    /**
     * @return deviceIdList
     */
    public String getDeviceIdList() {
        return this.deviceIdList;
    }

    /**
     * @return deviceStatus
     */
    public String getDeviceStatus() {
        return this.deviceStatus;
    }

    /**
     * @return nvrIdList
     */
    public String getNvrIdList() {
        return this.nvrIdList;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return parentDeviceType
     */
    public String getParentDeviceType() {
        return this.parentDeviceType;
    }

    public static final class Builder extends Request.Builder<DescribeIpcsRequest, Builder> {
        private String corpIdList; 
        private String deviceFilter; 
        private String deviceIdList; 
        private String deviceStatus; 
        private String nvrIdList; 
        private Long pageNum; 
        private Long pageSize; 
        private String parentDeviceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIpcsRequest response) {
            super(response);
            this.corpIdList = response.corpIdList;
            this.deviceFilter = response.deviceFilter;
            this.deviceIdList = response.deviceIdList;
            this.deviceStatus = response.deviceStatus;
            this.nvrIdList = response.nvrIdList;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.parentDeviceType = response.parentDeviceType;
        } 

        /**
         * CorpIdList.
         */
        public Builder corpIdList(String corpIdList) {
            this.putBodyParameter("CorpIdList", corpIdList);
            this.corpIdList = corpIdList;
            return this;
        }

        /**
         * DeviceFilter.
         */
        public Builder deviceFilter(String deviceFilter) {
            this.putBodyParameter("DeviceFilter", deviceFilter);
            this.deviceFilter = deviceFilter;
            return this;
        }

        /**
         * DeviceIdList.
         */
        public Builder deviceIdList(String deviceIdList) {
            this.putBodyParameter("DeviceIdList", deviceIdList);
            this.deviceIdList = deviceIdList;
            return this;
        }

        /**
         * DeviceStatus.
         */
        public Builder deviceStatus(String deviceStatus) {
            this.putBodyParameter("DeviceStatus", deviceStatus);
            this.deviceStatus = deviceStatus;
            return this;
        }

        /**
         * NvrIdList.
         */
        public Builder nvrIdList(String nvrIdList) {
            this.putBodyParameter("NvrIdList", nvrIdList);
            this.nvrIdList = nvrIdList;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.putBodyParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ParentDeviceType.
         */
        public Builder parentDeviceType(String parentDeviceType) {
            this.putBodyParameter("ParentDeviceType", parentDeviceType);
            this.parentDeviceType = parentDeviceType;
            return this;
        }

        @Override
        public DescribeIpcsRequest build() {
            return new DescribeIpcsRequest(this);
        } 

    } 

}
