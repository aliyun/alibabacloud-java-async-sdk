// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNVRChannelDeviceRequest} extends {@link RequestModel}
 *
 * <p>ListNVRChannelDeviceRequest</p>
 */
public class ListNVRChannelDeviceRequest extends Request {
    @Body
    @NameInMap("DeviceCode")
    @Validation(required = true)
    private String deviceCode;

    @Body
    @NameInMap("IsPage")
    @Validation(required = true)
    private String isPage;

    @Body
    @NameInMap("PageNum")
    private String pageNum;

    @Body
    @NameInMap("PageSize")
    private String pageSize;

    private ListNVRChannelDeviceRequest(Builder builder) {
        super(builder);
        this.deviceCode = builder.deviceCode;
        this.isPage = builder.isPage;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNVRChannelDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceCode
     */
    public String getDeviceCode() {
        return this.deviceCode;
    }

    /**
     * @return isPage
     */
    public String getIsPage() {
        return this.isPage;
    }

    /**
     * @return pageNum
     */
    public String getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListNVRChannelDeviceRequest, Builder> {
        private String deviceCode; 
        private String isPage; 
        private String pageNum; 
        private String pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListNVRChannelDeviceRequest response) {
            super(response);
            this.deviceCode = response.deviceCode;
            this.isPage = response.isPage;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
        } 

        /**
         * DeviceCode.
         */
        public Builder deviceCode(String deviceCode) {
            this.putBodyParameter("DeviceCode", deviceCode);
            this.deviceCode = deviceCode;
            return this;
        }

        /**
         * IsPage.
         */
        public Builder isPage(String isPage) {
            this.putBodyParameter("IsPage", isPage);
            this.isPage = isPage;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(String pageNum) {
            this.putBodyParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListNVRChannelDeviceRequest build() {
            return new ListNVRChannelDeviceRequest(this);
        } 

    } 

}
