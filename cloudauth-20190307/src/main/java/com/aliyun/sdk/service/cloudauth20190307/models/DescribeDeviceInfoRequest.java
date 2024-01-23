// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeviceInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDeviceInfoRequest</p>
 */
public class DescribeDeviceInfoRequest extends Request {
    @Query
    @NameInMap("BizType")
    private String bizType;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("DeviceId")
    private String deviceId;

    @Query
    @NameInMap("ExpiredEndDay")
    private String expiredEndDay;

    @Query
    @NameInMap("ExpiredStartDay")
    private String expiredStartDay;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("UserDeviceId")
    private String userDeviceId;

    private DescribeDeviceInfoRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.currentPage = builder.currentPage;
        this.deviceId = builder.deviceId;
        this.expiredEndDay = builder.expiredEndDay;
        this.expiredStartDay = builder.expiredStartDay;
        this.pageSize = builder.pageSize;
        this.userDeviceId = builder.userDeviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return expiredEndDay
     */
    public String getExpiredEndDay() {
        return this.expiredEndDay;
    }

    /**
     * @return expiredStartDay
     */
    public String getExpiredStartDay() {
        return this.expiredStartDay;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return userDeviceId
     */
    public String getUserDeviceId() {
        return this.userDeviceId;
    }

    public static final class Builder extends Request.Builder<DescribeDeviceInfoRequest, Builder> {
        private String bizType; 
        private Integer currentPage; 
        private String deviceId; 
        private String expiredEndDay; 
        private String expiredStartDay; 
        private Integer pageSize; 
        private String userDeviceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDeviceInfoRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.currentPage = request.currentPage;
            this.deviceId = request.deviceId;
            this.expiredEndDay = request.expiredEndDay;
            this.expiredStartDay = request.expiredStartDay;
            this.pageSize = request.pageSize;
            this.userDeviceId = request.userDeviceId;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * ExpiredEndDay.
         */
        public Builder expiredEndDay(String expiredEndDay) {
            this.putQueryParameter("ExpiredEndDay", expiredEndDay);
            this.expiredEndDay = expiredEndDay;
            return this;
        }

        /**
         * ExpiredStartDay.
         */
        public Builder expiredStartDay(String expiredStartDay) {
            this.putQueryParameter("ExpiredStartDay", expiredStartDay);
            this.expiredStartDay = expiredStartDay;
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
         * UserDeviceId.
         */
        public Builder userDeviceId(String userDeviceId) {
            this.putQueryParameter("UserDeviceId", userDeviceId);
            this.userDeviceId = userDeviceId;
            return this;
        }

        @Override
        public DescribeDeviceInfoRequest build() {
            return new DescribeDeviceInfoRequest(this);
        } 

    } 

}
