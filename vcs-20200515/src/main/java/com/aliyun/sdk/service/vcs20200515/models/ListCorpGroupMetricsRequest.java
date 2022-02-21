// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCorpGroupMetricsRequest} extends {@link RequestModel}
 *
 * <p>ListCorpGroupMetricsRequest</p>
 */
public class ListCorpGroupMetricsRequest extends Request {
    @Body
    @NameInMap("CorpId")
    private String corpId;

    @Body
    @NameInMap("DeviceGroup")
    private String deviceGroup;

    @Body
    @NameInMap("DeviceId")
    private String deviceId;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Body
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

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
    @NameInMap("UserGroup")
    private String userGroup;

    private ListCorpGroupMetricsRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.deviceGroup = builder.deviceGroup;
        this.deviceId = builder.deviceId;
        this.endTime = builder.endTime;
        this.groupId = builder.groupId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.tagCode = builder.tagCode;
        this.userGroup = builder.userGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCorpGroupMetricsRequest create() {
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
     * @return deviceGroup
     */
    public String getDeviceGroup() {
        return this.deviceGroup;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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
     * @return userGroup
     */
    public String getUserGroup() {
        return this.userGroup;
    }

    public static final class Builder extends Request.Builder<ListCorpGroupMetricsRequest, Builder> {
        private String corpId; 
        private String deviceGroup; 
        private String deviceId; 
        private String endTime; 
        private String groupId; 
        private String pageNumber; 
        private String pageSize; 
        private String startTime; 
        private String tagCode; 
        private String userGroup; 

        private Builder() {
            super();
        } 

        private Builder(ListCorpGroupMetricsRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.deviceGroup = response.deviceGroup;
            this.deviceId = response.deviceId;
            this.endTime = response.endTime;
            this.groupId = response.groupId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.startTime = response.startTime;
            this.tagCode = response.tagCode;
            this.userGroup = response.userGroup;
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
         * DeviceGroup.
         */
        public Builder deviceGroup(String deviceGroup) {
            this.putBodyParameter("DeviceGroup", deviceGroup);
            this.deviceGroup = deviceGroup;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putBodyParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
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
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
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
         * UserGroup.
         */
        public Builder userGroup(String userGroup) {
            this.putBodyParameter("UserGroup", userGroup);
            this.userGroup = userGroup;
            return this;
        }

        @Override
        public ListCorpGroupMetricsRequest build() {
            return new ListCorpGroupMetricsRequest(this);
        } 

    } 

}
