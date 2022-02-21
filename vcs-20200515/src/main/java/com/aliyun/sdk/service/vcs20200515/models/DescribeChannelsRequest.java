// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChannelsRequest} extends {@link RequestModel}
 *
 * <p>DescribeChannelsRequest</p>
 */
public class DescribeChannelsRequest extends Request {
    @Body
    @NameInMap("DeviceFilter")
    private String deviceFilter;

    @Body
    @NameInMap("DeviceStatus")
    private String deviceStatus;

    @Body
    @NameInMap("NvrId")
    @Validation(required = true)
    private String nvrId;

    @Body
    @NameInMap("PageNum")
    @Validation(required = true)
    private Long pageNum;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Long pageSize;

    @Body
    @NameInMap("ShowUnConfig")
    private Long showUnConfig;

    private DescribeChannelsRequest(Builder builder) {
        super(builder);
        this.deviceFilter = builder.deviceFilter;
        this.deviceStatus = builder.deviceStatus;
        this.nvrId = builder.nvrId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.showUnConfig = builder.showUnConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChannelsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceFilter
     */
    public String getDeviceFilter() {
        return this.deviceFilter;
    }

    /**
     * @return deviceStatus
     */
    public String getDeviceStatus() {
        return this.deviceStatus;
    }

    /**
     * @return nvrId
     */
    public String getNvrId() {
        return this.nvrId;
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
     * @return showUnConfig
     */
    public Long getShowUnConfig() {
        return this.showUnConfig;
    }

    public static final class Builder extends Request.Builder<DescribeChannelsRequest, Builder> {
        private String deviceFilter; 
        private String deviceStatus; 
        private String nvrId; 
        private Long pageNum; 
        private Long pageSize; 
        private Long showUnConfig; 

        private Builder() {
            super();
        } 

        private Builder(DescribeChannelsRequest response) {
            super(response);
            this.deviceFilter = response.deviceFilter;
            this.deviceStatus = response.deviceStatus;
            this.nvrId = response.nvrId;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.showUnConfig = response.showUnConfig;
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
         * DeviceStatus.
         */
        public Builder deviceStatus(String deviceStatus) {
            this.putBodyParameter("DeviceStatus", deviceStatus);
            this.deviceStatus = deviceStatus;
            return this;
        }

        /**
         * NvrId.
         */
        public Builder nvrId(String nvrId) {
            this.putBodyParameter("NvrId", nvrId);
            this.nvrId = nvrId;
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
         * ShowUnConfig.
         */
        public Builder showUnConfig(Long showUnConfig) {
            this.putBodyParameter("ShowUnConfig", showUnConfig);
            this.showUnConfig = showUnConfig;
            return this;
        }

        @Override
        public DescribeChannelsRequest build() {
            return new DescribeChannelsRequest(this);
        } 

    } 

}
