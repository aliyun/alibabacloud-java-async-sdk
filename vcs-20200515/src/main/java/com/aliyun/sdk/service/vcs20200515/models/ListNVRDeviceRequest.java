// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNVRDeviceRequest} extends {@link RequestModel}
 *
 * <p>ListNVRDeviceRequest</p>
 */
public class ListNVRDeviceRequest extends Request {
    @Body
    @NameInMap("CorpIdList")
    private String corpIdList;

    @Body
    @NameInMap("DeviceCode")
    private String deviceCode;

    @Body
    @NameInMap("IsPage")
    private Long isPage;

    @Body
    @NameInMap("PageNum")
    private Long pageNum;

    @Body
    @NameInMap("PageSize")
    private Long pageSize;

    private ListNVRDeviceRequest(Builder builder) {
        super(builder);
        this.corpIdList = builder.corpIdList;
        this.deviceCode = builder.deviceCode;
        this.isPage = builder.isPage;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNVRDeviceRequest create() {
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
     * @return deviceCode
     */
    public String getDeviceCode() {
        return this.deviceCode;
    }

    /**
     * @return isPage
     */
    public Long getIsPage() {
        return this.isPage;
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

    public static final class Builder extends Request.Builder<ListNVRDeviceRequest, Builder> {
        private String corpIdList; 
        private String deviceCode; 
        private Long isPage; 
        private Long pageNum; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListNVRDeviceRequest response) {
            super(response);
            this.corpIdList = response.corpIdList;
            this.deviceCode = response.deviceCode;
            this.isPage = response.isPage;
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
        public Builder isPage(Long isPage) {
            this.putBodyParameter("IsPage", isPage);
            this.isPage = isPage;
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
        public ListNVRDeviceRequest build() {
            return new ListNVRDeviceRequest(this);
        } 

    } 

}
