// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNvrsRequest} extends {@link RequestModel}
 *
 * <p>DescribeNvrsRequest</p>
 */
public class DescribeNvrsRequest extends Request {
    @Body
    @NameInMap("CorpIdList")
    private String corpIdList;

    @Body
    @NameInMap("DeviceFilter")
    private String deviceFilter;

    @Body
    @NameInMap("NvrDeviceIdList")
    private String nvrDeviceIdList;

    @Body
    @NameInMap("PageNum")
    @Validation(required = true)
    private Long pageNum;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Long pageSize;

    private DescribeNvrsRequest(Builder builder) {
        super(builder);
        this.corpIdList = builder.corpIdList;
        this.deviceFilter = builder.deviceFilter;
        this.nvrDeviceIdList = builder.nvrDeviceIdList;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNvrsRequest create() {
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
     * @return nvrDeviceIdList
     */
    public String getNvrDeviceIdList() {
        return this.nvrDeviceIdList;
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

    public static final class Builder extends Request.Builder<DescribeNvrsRequest, Builder> {
        private String corpIdList; 
        private String deviceFilter; 
        private String nvrDeviceIdList; 
        private Long pageNum; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNvrsRequest response) {
            super(response);
            this.corpIdList = response.corpIdList;
            this.deviceFilter = response.deviceFilter;
            this.nvrDeviceIdList = response.nvrDeviceIdList;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
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
         * NvrDeviceIdList.
         */
        public Builder nvrDeviceIdList(String nvrDeviceIdList) {
            this.putBodyParameter("NvrDeviceIdList", nvrDeviceIdList);
            this.nvrDeviceIdList = nvrDeviceIdList;
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

        @Override
        public DescribeNvrsRequest build() {
            return new DescribeNvrsRequest(this);
        } 

    } 

}
