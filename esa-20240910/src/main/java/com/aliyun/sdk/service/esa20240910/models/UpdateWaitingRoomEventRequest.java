// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateWaitingRoomEventRequest} extends {@link RequestModel}
 *
 * <p>UpdateWaitingRoomEventRequest</p>
 */
public class UpdateWaitingRoomEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomPageHtml")
    private String customPageHtml;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisableSessionRenewalEnable")
    private String disableSessionRenewalEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private String enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JsonResponseEnable")
    private String jsonResponseEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewUsersPerMinute")
    private String newUsersPerMinute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreQueueEnable")
    private String preQueueEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreQueueStartTime")
    private String preQueueStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueuingMethod")
    private String queuingMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueuingStatusCode")
    private String queuingStatusCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RandomPreQueueEnable")
    private String randomPreQueueEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionDuration")
    private String sessionDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalActiveUsers")
    private String totalActiveUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitingRoomEventId")
    private Long waitingRoomEventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitingRoomType")
    private String waitingRoomType;

    private UpdateWaitingRoomEventRequest(Builder builder) {
        super(builder);
        this.customPageHtml = builder.customPageHtml;
        this.description = builder.description;
        this.disableSessionRenewalEnable = builder.disableSessionRenewalEnable;
        this.enable = builder.enable;
        this.endTime = builder.endTime;
        this.jsonResponseEnable = builder.jsonResponseEnable;
        this.language = builder.language;
        this.name = builder.name;
        this.newUsersPerMinute = builder.newUsersPerMinute;
        this.preQueueEnable = builder.preQueueEnable;
        this.preQueueStartTime = builder.preQueueStartTime;
        this.queuingMethod = builder.queuingMethod;
        this.queuingStatusCode = builder.queuingStatusCode;
        this.randomPreQueueEnable = builder.randomPreQueueEnable;
        this.sessionDuration = builder.sessionDuration;
        this.siteId = builder.siteId;
        this.startTime = builder.startTime;
        this.totalActiveUsers = builder.totalActiveUsers;
        this.waitingRoomEventId = builder.waitingRoomEventId;
        this.waitingRoomType = builder.waitingRoomType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWaitingRoomEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customPageHtml
     */
    public String getCustomPageHtml() {
        return this.customPageHtml;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return disableSessionRenewalEnable
     */
    public String getDisableSessionRenewalEnable() {
        return this.disableSessionRenewalEnable;
    }

    /**
     * @return enable
     */
    public String getEnable() {
        return this.enable;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return jsonResponseEnable
     */
    public String getJsonResponseEnable() {
        return this.jsonResponseEnable;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return newUsersPerMinute
     */
    public String getNewUsersPerMinute() {
        return this.newUsersPerMinute;
    }

    /**
     * @return preQueueEnable
     */
    public String getPreQueueEnable() {
        return this.preQueueEnable;
    }

    /**
     * @return preQueueStartTime
     */
    public String getPreQueueStartTime() {
        return this.preQueueStartTime;
    }

    /**
     * @return queuingMethod
     */
    public String getQueuingMethod() {
        return this.queuingMethod;
    }

    /**
     * @return queuingStatusCode
     */
    public String getQueuingStatusCode() {
        return this.queuingStatusCode;
    }

    /**
     * @return randomPreQueueEnable
     */
    public String getRandomPreQueueEnable() {
        return this.randomPreQueueEnable;
    }

    /**
     * @return sessionDuration
     */
    public String getSessionDuration() {
        return this.sessionDuration;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return totalActiveUsers
     */
    public String getTotalActiveUsers() {
        return this.totalActiveUsers;
    }

    /**
     * @return waitingRoomEventId
     */
    public Long getWaitingRoomEventId() {
        return this.waitingRoomEventId;
    }

    /**
     * @return waitingRoomType
     */
    public String getWaitingRoomType() {
        return this.waitingRoomType;
    }

    public static final class Builder extends Request.Builder<UpdateWaitingRoomEventRequest, Builder> {
        private String customPageHtml; 
        private String description; 
        private String disableSessionRenewalEnable; 
        private String enable; 
        private String endTime; 
        private String jsonResponseEnable; 
        private String language; 
        private String name; 
        private String newUsersPerMinute; 
        private String preQueueEnable; 
        private String preQueueStartTime; 
        private String queuingMethod; 
        private String queuingStatusCode; 
        private String randomPreQueueEnable; 
        private String sessionDuration; 
        private Long siteId; 
        private String startTime; 
        private String totalActiveUsers; 
        private Long waitingRoomEventId; 
        private String waitingRoomType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWaitingRoomEventRequest request) {
            super(request);
            this.customPageHtml = request.customPageHtml;
            this.description = request.description;
            this.disableSessionRenewalEnable = request.disableSessionRenewalEnable;
            this.enable = request.enable;
            this.endTime = request.endTime;
            this.jsonResponseEnable = request.jsonResponseEnable;
            this.language = request.language;
            this.name = request.name;
            this.newUsersPerMinute = request.newUsersPerMinute;
            this.preQueueEnable = request.preQueueEnable;
            this.preQueueStartTime = request.preQueueStartTime;
            this.queuingMethod = request.queuingMethod;
            this.queuingStatusCode = request.queuingStatusCode;
            this.randomPreQueueEnable = request.randomPreQueueEnable;
            this.sessionDuration = request.sessionDuration;
            this.siteId = request.siteId;
            this.startTime = request.startTime;
            this.totalActiveUsers = request.totalActiveUsers;
            this.waitingRoomEventId = request.waitingRoomEventId;
            this.waitingRoomType = request.waitingRoomType;
        } 

        /**
         * CustomPageHtml.
         */
        public Builder customPageHtml(String customPageHtml) {
            this.putQueryParameter("CustomPageHtml", customPageHtml);
            this.customPageHtml = customPageHtml;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DisableSessionRenewalEnable.
         */
        public Builder disableSessionRenewalEnable(String disableSessionRenewalEnable) {
            this.putQueryParameter("DisableSessionRenewalEnable", disableSessionRenewalEnable);
            this.disableSessionRenewalEnable = disableSessionRenewalEnable;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(String enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * JsonResponseEnable.
         */
        public Builder jsonResponseEnable(String jsonResponseEnable) {
            this.putQueryParameter("JsonResponseEnable", jsonResponseEnable);
            this.jsonResponseEnable = jsonResponseEnable;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NewUsersPerMinute.
         */
        public Builder newUsersPerMinute(String newUsersPerMinute) {
            this.putQueryParameter("NewUsersPerMinute", newUsersPerMinute);
            this.newUsersPerMinute = newUsersPerMinute;
            return this;
        }

        /**
         * PreQueueEnable.
         */
        public Builder preQueueEnable(String preQueueEnable) {
            this.putQueryParameter("PreQueueEnable", preQueueEnable);
            this.preQueueEnable = preQueueEnable;
            return this;
        }

        /**
         * PreQueueStartTime.
         */
        public Builder preQueueStartTime(String preQueueStartTime) {
            this.putQueryParameter("PreQueueStartTime", preQueueStartTime);
            this.preQueueStartTime = preQueueStartTime;
            return this;
        }

        /**
         * QueuingMethod.
         */
        public Builder queuingMethod(String queuingMethod) {
            this.putQueryParameter("QueuingMethod", queuingMethod);
            this.queuingMethod = queuingMethod;
            return this;
        }

        /**
         * QueuingStatusCode.
         */
        public Builder queuingStatusCode(String queuingStatusCode) {
            this.putQueryParameter("QueuingStatusCode", queuingStatusCode);
            this.queuingStatusCode = queuingStatusCode;
            return this;
        }

        /**
         * RandomPreQueueEnable.
         */
        public Builder randomPreQueueEnable(String randomPreQueueEnable) {
            this.putQueryParameter("RandomPreQueueEnable", randomPreQueueEnable);
            this.randomPreQueueEnable = randomPreQueueEnable;
            return this;
        }

        /**
         * SessionDuration.
         */
        public Builder sessionDuration(String sessionDuration) {
            this.putQueryParameter("SessionDuration", sessionDuration);
            this.sessionDuration = sessionDuration;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TotalActiveUsers.
         */
        public Builder totalActiveUsers(String totalActiveUsers) {
            this.putQueryParameter("TotalActiveUsers", totalActiveUsers);
            this.totalActiveUsers = totalActiveUsers;
            return this;
        }

        /**
         * WaitingRoomEventId.
         */
        public Builder waitingRoomEventId(Long waitingRoomEventId) {
            this.putQueryParameter("WaitingRoomEventId", waitingRoomEventId);
            this.waitingRoomEventId = waitingRoomEventId;
            return this;
        }

        /**
         * WaitingRoomType.
         */
        public Builder waitingRoomType(String waitingRoomType) {
            this.putQueryParameter("WaitingRoomType", waitingRoomType);
            this.waitingRoomType = waitingRoomType;
            return this;
        }

        @Override
        public UpdateWaitingRoomEventRequest build() {
            return new UpdateWaitingRoomEventRequest(this);
        } 

    } 

}
