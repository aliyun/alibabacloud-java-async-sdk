// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListShiftPersonnelsRequest} extends {@link RequestModel}
 *
 * <p>ListShiftPersonnelsRequest</p>
 */
public class ListShiftPersonnelsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beginTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShiftPersonUID")
    private String shiftPersonUID;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShiftScheduleIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shiftScheduleIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserType")
    private String userType;

    private ListShiftPersonnelsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.shiftPersonUID = builder.shiftPersonUID;
        this.shiftScheduleIdentifier = builder.shiftScheduleIdentifier;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListShiftPersonnelsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return shiftPersonUID
     */
    public String getShiftPersonUID() {
        return this.shiftPersonUID;
    }

    /**
     * @return shiftScheduleIdentifier
     */
    public String getShiftScheduleIdentifier() {
        return this.shiftScheduleIdentifier;
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<ListShiftPersonnelsRequest, Builder> {
        private String regionId; 
        private Long beginTime; 
        private Long endTime; 
        private String shiftPersonUID; 
        private String shiftScheduleIdentifier; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(ListShiftPersonnelsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.shiftPersonUID = request.shiftPersonUID;
            this.shiftScheduleIdentifier = request.shiftScheduleIdentifier;
            this.userType = request.userType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The time when the on-duty engineer starts a shift. Set the value to a UNIX timestamp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1593950832000</p>
         */
        public Builder beginTime(Long beginTime) {
            this.putBodyParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The time when the on-duty engineer ends a shift. Set the value to a UNIX timestamp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1593950832000</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account. You can log on to the DataWorks console and move the pointer over the profile picture in the upper-right corner to view the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1933790****551</p>
         */
        public Builder shiftPersonUID(String shiftPersonUID) {
            this.putBodyParameter("ShiftPersonUID", shiftPersonUID);
            this.shiftPersonUID = shiftPersonUID;
            return this;
        }

        /**
         * <p>The unique identifier of the shift schedule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2ab6456ada634b2f938ee******9b45b</p>
         */
        public Builder shiftScheduleIdentifier(String shiftScheduleIdentifier) {
            this.putBodyParameter("ShiftScheduleIdentifier", shiftScheduleIdentifier);
            this.shiftScheduleIdentifier = shiftScheduleIdentifier;
            return this;
        }

        /**
         * <p>The type of the on-duty engineer that you want to query. Valid values: ALL, PRIMARY, BACKUP, and DESIGNATED_USER.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder userType(String userType) {
            this.putBodyParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public ListShiftPersonnelsRequest build() {
            return new ListShiftPersonnelsRequest(this);
        } 

    } 

}
