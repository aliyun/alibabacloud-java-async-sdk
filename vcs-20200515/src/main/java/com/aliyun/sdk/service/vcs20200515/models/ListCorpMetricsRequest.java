// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCorpMetricsRequest} extends {@link RequestModel}
 *
 * <p>ListCorpMetricsRequest</p>
 */
public class ListCorpMetricsRequest extends Request {
    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("DeviceGroupList")
    private String deviceGroupList;

    @Body
    @NameInMap("DeviceIdList")
    private String deviceIdList;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true)
    private String pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private String pageSize;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Body
    @NameInMap("TagCode")
    @Validation(required = true)
    private String tagCode;

    @Body
    @NameInMap("UserGroupList")
    private String userGroupList;

    private ListCorpMetricsRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.deviceGroupList = builder.deviceGroupList;
        this.deviceIdList = builder.deviceIdList;
        this.endTime = builder.endTime;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.tagCode = builder.tagCode;
        this.userGroupList = builder.userGroupList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCorpMetricsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return deviceGroupList
     */
    public String getDeviceGroupList() {
        return this.deviceGroupList;
    }

    /**
     * @return deviceIdList
     */
    public String getDeviceIdList() {
        return this.deviceIdList;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return tagCode
     */
    public String getTagCode() {
        return this.tagCode;
    }

    /**
     * @return userGroupList
     */
    public String getUserGroupList() {
        return this.userGroupList;
    }

    public static final class Builder extends Request.Builder<ListCorpMetricsRequest, Builder> {
        private String corpId; 
        private String deviceGroupList; 
        private String deviceIdList; 
        private String endTime; 
        private String pageNumber; 
        private String pageSize; 
        private String startTime; 
        private String tagCode; 
        private String userGroupList; 

        private Builder() {
            super();
        } 

        private Builder(ListCorpMetricsRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.deviceGroupList = response.deviceGroupList;
            this.deviceIdList = response.deviceIdList;
            this.endTime = response.endTime;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.startTime = response.startTime;
            this.tagCode = response.tagCode;
            this.userGroupList = response.userGroupList;
        } 

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * DeviceGroupList.
         */
        public Builder deviceGroupList(String deviceGroupList) {
            this.putBodyParameter("DeviceGroupList", deviceGroupList);
            this.deviceGroupList = deviceGroupList;
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
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TagCode.
         */
        public Builder tagCode(String tagCode) {
            this.putBodyParameter("TagCode", tagCode);
            this.tagCode = tagCode;
            return this;
        }

        /**
         * UserGroupList.
         */
        public Builder userGroupList(String userGroupList) {
            this.putBodyParameter("UserGroupList", userGroupList);
            this.userGroupList = userGroupList;
            return this;
        }

        @Override
        public ListCorpMetricsRequest build() {
            return new ListCorpMetricsRequest(this);
        } 

    } 

}
