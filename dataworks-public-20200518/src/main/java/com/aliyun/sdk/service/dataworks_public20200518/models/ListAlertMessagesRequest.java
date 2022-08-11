// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlertMessagesRequest} extends {@link RequestModel}
 *
 * <p>ListAlertMessagesRequest</p>
 */
public class ListAlertMessagesRequest extends Request {
    @Body
    @NameInMap("AlertMethods")
    private String alertMethods;

    @Body
    @NameInMap("AlertRuleTypes")
    private String alertRuleTypes;

    @Body
    @NameInMap("AlertUser")
    private String alertUser;

    @Body
    @NameInMap("BeginTime")
    @Validation(required = true)
    private String beginTime;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("RemindId")
    private Long remindId;

    private ListAlertMessagesRequest(Builder builder) {
        super(builder);
        this.alertMethods = builder.alertMethods;
        this.alertRuleTypes = builder.alertRuleTypes;
        this.alertUser = builder.alertUser;
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.remindId = builder.remindId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertMessagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertMethods
     */
    public String getAlertMethods() {
        return this.alertMethods;
    }

    /**
     * @return alertRuleTypes
     */
    public String getAlertRuleTypes() {
        return this.alertRuleTypes;
    }

    /**
     * @return alertUser
     */
    public String getAlertUser() {
        return this.alertUser;
    }

    /**
     * @return beginTime
     */
    public String getBeginTime() {
        return this.beginTime;
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
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remindId
     */
    public Long getRemindId() {
        return this.remindId;
    }

    public static final class Builder extends Request.Builder<ListAlertMessagesRequest, Builder> {
        private String alertMethods; 
        private String alertRuleTypes; 
        private String alertUser; 
        private String beginTime; 
        private String endTime; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Long remindId; 

        private Builder() {
            super();
        } 

        private Builder(ListAlertMessagesRequest request) {
            super(request);
            this.alertMethods = request.alertMethods;
            this.alertRuleTypes = request.alertRuleTypes;
            this.alertUser = request.alertUser;
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.remindId = request.remindId;
        } 

        /**
         * AlertMethods.
         */
        public Builder alertMethods(String alertMethods) {
            this.putBodyParameter("AlertMethods", alertMethods);
            this.alertMethods = alertMethods;
            return this;
        }

        /**
         * AlertRuleTypes.
         */
        public Builder alertRuleTypes(String alertRuleTypes) {
            this.putBodyParameter("AlertRuleTypes", alertRuleTypes);
            this.alertRuleTypes = alertRuleTypes;
            return this;
        }

        /**
         * AlertUser.
         */
        public Builder alertUser(String alertUser) {
            this.putBodyParameter("AlertUser", alertUser);
            this.alertUser = alertUser;
            return this;
        }

        /**
         * BeginTime.
         */
        public Builder beginTime(String beginTime) {
            this.putBodyParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
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
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RemindId.
         */
        public Builder remindId(Long remindId) {
            this.putBodyParameter("RemindId", remindId);
            this.remindId = remindId;
            return this;
        }

        @Override
        public ListAlertMessagesRequest build() {
            return new ListAlertMessagesRequest(this);
        } 

    } 

}
