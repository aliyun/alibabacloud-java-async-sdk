// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAlertMessagesRequest} extends {@link RequestModel}
 *
 * <p>ListAlertMessagesRequest</p>
 */
public class ListAlertMessagesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertMethods")
    private String alertMethods;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertRuleTypes")
    private String alertRuleTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertUser")
    private String alertUser;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaselineId")
    private Long baselineId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String beginTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemindId")
    private Long remindId;

    private ListAlertMessagesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alertMethods = builder.alertMethods;
        this.alertRuleTypes = builder.alertRuleTypes;
        this.alertUser = builder.alertUser;
        this.baselineId = builder.baselineId;
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return baselineId
     */
    public Long getBaselineId() {
        return this.baselineId;
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
     * @return remindId
     */
    public Long getRemindId() {
        return this.remindId;
    }

    public static final class Builder extends Request.Builder<ListAlertMessagesRequest, Builder> {
        private String regionId; 
        private String alertMethods; 
        private String alertRuleTypes; 
        private String alertUser; 
        private Long baselineId; 
        private String beginTime; 
        private String endTime; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long remindId; 

        private Builder() {
            super();
        } 

        private Builder(ListAlertMessagesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alertMethods = request.alertMethods;
            this.alertRuleTypes = request.alertRuleTypes;
            this.alertUser = request.alertUser;
            this.baselineId = request.baselineId;
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.remindId = request.remindId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The notification method. Valid values:</p>
         * <ul>
         * <li>MAIL</li>
         * <li>SMS Alert notifications can be sent by text message only in the Singapore, Malaysia (Kuala Lumpur), and Germany (Frankfurt) regions.</li>
         * </ul>
         * <p>You can specify multiple notification methods. Separate them with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>SMS,MAIL,PHONE</p>
         */
        public Builder alertMethods(String alertMethods) {
            this.putBodyParameter("AlertMethods", alertMethods);
            this.alertMethods = alertMethods;
            return this;
        }

        /**
         * <p>The type of the alert rule. Valid values: GLOBAL, USER_DEFINE, and OTHER. The value GLOBAL indicates that the alert rule is a global alert rule. The value USER_DEFINE indicates that the alert rule is customized by a user. The value OTHER indicates that the alert rule is a rule of another type. You can specify multiple types. Separate them with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>GLOBAL,USER_DEFINE,OTHER</p>
         */
        public Builder alertRuleTypes(String alertRuleTypes) {
            this.putBodyParameter("AlertRuleTypes", alertRuleTypes);
            this.alertRuleTypes = alertRuleTypes;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account used by the alert recipient.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder alertUser(String alertUser) {
            this.putBodyParameter("AlertUser", alertUser);
            this.alertUser = alertUser;
            return this;
        }

        /**
         * <p>The baseline ID. This parameter takes effect if the AlertRuleTypes parameter is set to GLOBAL. You can configure either this parameter or the RemindId parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder baselineId(Long baselineId) {
            this.putBodyParameter("BaselineId", baselineId);
            this.baselineId = baselineId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-dd&quot;T&quot;HH:mm:ssZ format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-04-02T00:00:00+0800</p>
         */
        public Builder beginTime(String beginTime) {
            this.putBodyParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-dd&quot;T&quot;HH:mm:ssZ format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-04-04T00:00:00+0800</p>
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The page number. Default value: 1. Minimum value: 1. Maximum value: 30.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The custom alert rule ID. This parameter takes effect if the AlertRuleTypes parameter is set to USER_DEFINE. You can configure either this parameter or the BaselineId parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>9527</p>
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
