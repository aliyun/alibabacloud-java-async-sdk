// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDevicesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDevicesRequest</p>
 */
public class DescribeDevicesRequest extends Request {
    @Body
    @NameInMap("CorpIdList")
    private String corpIdList;

    @Body
    @NameInMap("DeviceIdList")
    private String deviceIdList;

    @Body
    @NameInMap("PageNum")
    @Validation(required = true, maximum = 100000)
    private Integer pageNum;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 200, minimum = 1)
    private Integer pageSize;

    private DescribeDevicesRequest(Builder builder) {
        super(builder);
        this.corpIdList = builder.corpIdList;
        this.deviceIdList = builder.deviceIdList;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDevicesRequest create() {
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
     * @return deviceIdList
     */
    public String getDeviceIdList() {
        return this.deviceIdList;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeDevicesRequest, Builder> {
        private String corpIdList; 
        private String deviceIdList; 
        private Integer pageNum; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDevicesRequest response) {
            super(response);
            this.corpIdList = response.corpIdList;
            this.deviceIdList = response.deviceIdList;
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
         * DeviceIdList.
         */
        public Builder deviceIdList(String deviceIdList) {
            this.putBodyParameter("DeviceIdList", deviceIdList);
            this.deviceIdList = deviceIdList;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putBodyParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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

        @Override
        public DescribeDevicesRequest build() {
            return new DescribeDevicesRequest(this);
        } 

    } 

}
